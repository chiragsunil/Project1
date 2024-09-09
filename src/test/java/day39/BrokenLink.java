package day39;

import io.opentelemetry.semconv.SemanticAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLink {
    public static void main(String[] args) throws IOException {

        //1)Link href = "https://xyz.com"
        //2)https://xyz.com---> server --->status code
        //3)status code >=400 broken link
        // status code <400 not a broken link

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List <WebElement> links = driver.findElements(By.tagName("a"));
        int noOfBrokenLink = 0;
        System.out.println("Total number of links"+links.size());

        for(WebElement linkElement:links) {
            String hrefatValue = linkElement.getAttribute("href");

            if (hrefatValue == null || hrefatValue.isEmpty()) {
                System.out.println("href attribute value is null or empty so Not possible to check"+hrefatValue);
                continue;
            }

            //hit url in to the server
            try {
                URL linkUrl = new URL(hrefatValue);
                HttpURLConnection connectionLinkUrl = (HttpURLConnection) linkUrl.openConnection();
                connectionLinkUrl.connect();//connect to server and sent request the server
                if (connectionLinkUrl.getResponseCode() >= 400) {
                    System.out.println("BrokenLink"+hrefatValue);
                    noOfBrokenLink++;
                } else {
                    System.out.println("Not a broken link"+hrefatValue);
                }
            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
        System.out.println("No of Broken Links"+noOfBrokenLink);

    }
}

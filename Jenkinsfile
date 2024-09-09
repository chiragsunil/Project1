pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/chiragsunil/Project1.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Archive Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
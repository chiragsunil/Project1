pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Run the specific test file
                    sh 'mvn clean test -Dtest=naukrilogin.NaukriLogin'
                }
            }
        }
    }
}

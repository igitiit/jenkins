pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
        jdk 'JDK 8'
    }
    stages {
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
    }
    post {
        success {
            echo 'Build and Tests Successful!'
        }
        failure {
            echo 'Build or Tests Failed!'
        }
    }
}

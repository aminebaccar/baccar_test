pipeline {
    agent any
    stages {
        stage("build") {
            steps{
                sh 'mvn clean install'
            }
        }
        stage("test") {
            steps{
                sh 'mvn clean test'
            }
        }
        stage("run") {
            steps{
                sh 'mvn compile exec:java'
            }
        }
    }
 }

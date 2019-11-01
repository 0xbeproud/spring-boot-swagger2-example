pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        echo 'test'
        sh ' ./gradlew clean test'
      }
    }
    stage('build') {
      steps {
        echo 'build'
        sh './gradlew clean build'
      }
    }
  }
  environment {
    AWS_ACCESS_KEY = 'aws access key'
  }
}
pipeline {
  agent {
    docker {
      image 'python:3.6'
    }

  }
  stages {
    stage('test') {
      steps {
        echo 'test'
        sh 'python --version'
      }
    }
    stage('build') {
      steps {
        echo 'build'
        sh 'echo \'python run\''
      }
    }
    stage('request-spot-instance') {
      steps {
        echo 'request spot instance'
      }
    }
  }
  environment {
    AWS_ACCESS_KEY = 'aws access key'
  }
}
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
        sh 'python -V'
      }
    }
    stage('build') {
      steps {
        echo 'build'
        sh 'echo \'python run\''
      }
    }
  }
  environment {
    AWS_ACCESS_KEY = 'aws access key'
  }
}
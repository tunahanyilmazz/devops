pipeline {
  agent any
  stages {
    stage ('Build') {
      steps {
        sh 'go build server.go'
      }
    }
    stage ('Run') {
      steps {
        echo 'server'
      }
    }
  }
}
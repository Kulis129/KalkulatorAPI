pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile'
      args '-u root:sudo'
    }
  }
  stages {
    stage('Test with juint'){
      steps {
        script {
            sh """
              mvn test
            """
        }
      }
    }
    
    stage('Deploy') {
      steps {
        echo 'Deploy stage'
      }
    }
  }
}

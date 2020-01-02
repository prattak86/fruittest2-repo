pipeline {
  agent {
    dockerfile true
  }
  stages {
    stage('Example') {
      steps {
        echo 'Hello World from inside a container!'
        sh 'echo envVar1 = $envVar1'
      }
    }
  }
}
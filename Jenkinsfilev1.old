pipeline {
    agent any
    stages {
  //      stage('Init') {
  //          steps {
  //              echo "Stage d'Init  - jenkinsfile"
  //          }
  //      }
        stage('Build') {
            steps {
                echo "Stage de Build  - jenkinsfile - lancement de mvn clean package "
                bat 'mvn clean package'                
            }
            post {
                success {
                    echo "Stage Build  - post success - archivage des artifacts..."
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
 //       stage('Deploy') {
 //         steps {
 //             echo "Stage Deploy  - jenkinsfile"
 //         }
        }
        
    }
}
pipeline {
    agent any
    tools {
        maven 'JenkinsMaven'
    }
    stages {
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
        stage('Deploy to test') {
              steps {
                  echo "Stage de Deploy to test  - jenkinsfile"
                  build job : 'DeploiCont-MiseAJour'                
              }
              post {
                  success {
                      echo "Stage Build  - post success - DeploiCont-MiseAJour."
                  }
              }
          }
      }
  }
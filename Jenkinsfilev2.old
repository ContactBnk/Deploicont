pipeline {
    agent any
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
    }
}
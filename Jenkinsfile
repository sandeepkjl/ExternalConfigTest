pipeline {
    agent any



    stages{

        stage('init'){
            steps {
                echo 'intializing.....'

            }

        }

        stage('Build'){
            steps {
                bat 'mvn clean install'

            }

        }
		
		stage('deploy'){
            steps {
                bat 'xcopy ./target/*.jar D:\\jar'

            }

        }
        
    }
}
pipeline {
    agent any
	
	parameters{
		choice(
			name: 'branch',
			choices: 'master\nbugfix\nfeature',
			description: 'choose a branch'
		)
		string(
			name:'UserID',
			defaultValue:'sk6785',
			description: 'this is username'
		)
	}



    stages{

        stage('init'){
            steps {
                echo 'intializing.....'

            }
		}
		stage('print paramtername'){
			steps{
				echo "branchName: ${params.branch}"
				echo "user name: ${params.UserID}"
				}

        }

        stage('build'){
            steps {
               bat 'mvn clean package'

            }
		}
		
		
        
    }
}

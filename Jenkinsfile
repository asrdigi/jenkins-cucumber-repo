pipeline{

    agent any

    stages {

        stage('Clean and Compile') { 
            steps {

                bat "mvn clean compile"
            }
        }
       
		stage('Junit5 Test') { 
            steps {

                bat "mvn test"
            }
        }
        
        stage('Maven Build') { 
            steps {
                bat "mvn install"
            }
        }

        stage('Generate Cucumber report') {
            steps{
        			cucumber buildStatus: 'UNSTABLE',
                		reportTitle: 'My Hello Cucumber Report',
                		fileIncludePattern: '**/*.json',
               			trendsLimit: 10,
                		classifications: [
                    		[
                        		'key': 'Browser',
                        		'value': 'Chrome'
                    		]
                		]
                  }
			}

    }

}
pipeline {
    agent any


    stages {
        stage('Get code') {

		git 'https://github.com/praleen12/JavaCucumber.git'	
        }
        stage('Run tests') {
            steps {
                sh 'mvn verify'
            }
        }
    }
    post {
        always {
            cucumber '**/cucumber.json'
        }
    }
  
    	
}
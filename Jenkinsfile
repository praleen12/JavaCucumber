pipeline {
    agent any


    stages {
        stage('Get code') {

		git 'https://github.com/praleen12/JavaCucumber'	
        }
        stage('Run tests') {
            steps {
                sh 'mvn verify'
            }
        }
    }
 
    	
}
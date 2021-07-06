pipeline {
    agent any
    
    environment {
        PATH = "/Applications/apache-maven-3.6.1/bin:$PATH"
    }
 
    stages {
    

        stage ('git clone') {
            steps {
                git branch: 'main', url: 'https://github.com/praleen12/JavaCucumber.git'
            }
        }
          stage ('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        
        
    }
}
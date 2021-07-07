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
          stage ('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        

      stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }
        
        
    }
}
// Jenkinsfile
@Library('your-shared-library') _

import myFunctions

pipeline {
    agent any

    stages {
        stage('Example Stage') {
            steps {
                script {
                    myFunctions.callPythonScript()
                }
            }
        }
    }
}

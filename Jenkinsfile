// Jenkinsfile
@Library('test-python-lib') _

import myFunctions

pipeline {
    agent any

    stages {
        stage('Example Stage') {
            steps {
                script {
                 //   myFunctions.callPythonScript()
                    myPythonScript.runPythonScript()
                }
            }
        }
    }
}

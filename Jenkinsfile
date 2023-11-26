// Jenkinsfile
// @Library('test-python-lib') _

// import myFunctions

// pipeline {
//     agent any

//     stages {
//         stage('Example Stage') {
//             steps {
//                 script {
//                  //   myFunctions.callPythonScript()
//                     myPythonScript.runPythonScript()
//                 }
//             }
//         }
//     }
// }


@Library('test-python-lib') _
import org.example.PythonScriptExecutor

pipeline {
    agent any

    stages {
        stage('Run Python Script') {
            steps {
                PythonScriptExecutor {
                    runPythonScript()
                }
            }
        }
    }
}

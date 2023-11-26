// runPythonScript.groovy
// def call() {
//     script {
//         // Use the sh step to execute Python scripts
//      //   sh 'python scripts/hello.py'
//         sh 'python ${libraryResource("scripts/hello.py")}'
//     }
// }

// def runPythonScript() {
//     sh 'python ${libraryResource("scripts/hello.py")}'
// }


// runPythonScript.groovy
def call() {
    script {
        def pythonScript = libraryResource('org/example/scripts/hello.py')
        sh "python3 $pythonScript"
    }
}
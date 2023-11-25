// runPythonScript.groovy
def call() {
    script {
        // Use the sh step to execute Python scripts
        sh 'python scripts/hello.py'
    }
}

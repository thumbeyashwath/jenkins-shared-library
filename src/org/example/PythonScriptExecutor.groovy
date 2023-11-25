// PythonScriptExecutor.groovy
package org.example

def call(script) {
    script.steps {
        runPythonScript()
    }
}

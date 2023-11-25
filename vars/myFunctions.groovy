def callPythonScript() {
    // Call Python script using sh or bat step
    sh """
    ls -la 
    python3 ../src/hello.py
    """
}
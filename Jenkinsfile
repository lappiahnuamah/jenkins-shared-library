@Library("jenkins-shared-library@master") _

pipeline {
    agent any
    stages {
        stage('Code Checkout') {
            steps {
                script {
                  def workingDir = checkoutCode("https://github.com/tejashreeSalvi/django-todo-cicd.git", "develop")
                  echo "Working Directory: ${workingDir}"
                }
            }
        }
    }
}
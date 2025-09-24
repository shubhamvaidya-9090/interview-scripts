pipeline {
    agent any   // Runs on any available agent

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/org/repo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'   // or 'npm install', 'python setup.py'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'            // run unit tests
            }
        }

        stage('Deploy') {
            steps {
                sh './deploy.sh'         // custom deploy script
            }
        }
    }

    post {
        always {
            echo "Pipeline finished!"    // always runs
        }
        success {
            echo "✅ Build succeeded"
        }
        failure {
            echo "❌ Build failed"
        }
    }
}

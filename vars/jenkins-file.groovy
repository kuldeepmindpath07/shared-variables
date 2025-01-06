@Library('Shared')_
pipeline{
    agent any
    stages{
        stage("hello"){
            steps{
                script{
                    echo "shared variables done"
                    hello()
                }
            }
        }
        stage("code"){
            steps{
                script{
                    clone("https://github.com/kuldeepmindpath07/jenkins-demo.git","kuldeep")
                }
            }
        }
        stage("deploy"){
            steps{
                echo "this is deploying the code"
                sh "docker-compose up -d"    
            }
        }
    }
}

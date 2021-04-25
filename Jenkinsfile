pipeline {
        agent any
        stages {
                stage('Build'){
                        steps{
                            timeout(time: 5, unit: 'SECONDS'){
                                retry(3){
                                   echo 'Hola Adidas (max 3 intentos)'
                                }
                            }
                        }
                }
                stage('Test'){
                        steps{
                            echo 'Testing....'
                        }
                }
                stage('Deploy'){
                        steps{
                            echo 'Deploying...'
                        }
                }
        }
}

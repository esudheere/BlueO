pipeline{
    agent any

    stages{

        stage{

            steps{
                sh 'echo Hello'
            }

            steps{
                sh 'sh Groovy'
            }
        }
    }
}
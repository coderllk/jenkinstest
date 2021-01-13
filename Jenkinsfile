pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') {
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
                sshPublisher(publishers: [sshPublisherDesc(configName: 'my_aliyun', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: 'touch /usr/local/jenkinstest/test0002.txt', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '/usr/local/jenkinstest', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: 'target/*.jar')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
                sshPublisher(publishers: [sshPublisherDesc(configName: 'my_aliyun', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '''cd /usr/local/jenkinstest
touch test0003.txt
chmod +x Jenkinstest-1.0-SNAPSHOT.jar
nohup java -jar /usr/local/jenkinstest/Jenkinstest-1.0-SNAPSHOT.jar > test0003.txt &
touch test04.doc''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
            }
        }
    }
}

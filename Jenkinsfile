pipeline {
    agent any
    stages {
        stage('Deliver') {
            steps {
        
                sshPublisher(publishers: [sshPublisherDesc(configName: '192.168.0.122', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '''sudo docker login --username=llkdocker -p mima1dao8 registry.cn-shanghai.aliyuncs.com
sudo docker pull registry.cn-shanghai.aliyuncs.com/llkjenkins/myapp:1.0
docker run -d -p 8088:8080 myapp:1.0''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '/usr/local/jenkinstest', remoteDirectorySDF: false, removePrefix: 'target', sourceFiles: 'target/*.jar')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
            }
        }
    }
}

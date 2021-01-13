pipeline {
    
    stages {
        stage('Deliver') {
            steps {
        
                sshPublisher(publishers: [sshPublisherDesc(configName: 'my_aliyun', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '''cd /usr/local/jenkinstest/script
                pwd
                sh start.sh > log.txt''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '', remoteDirectorySDF: false, removePrefix: '', sourceFiles: '')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
            }
        }
    }
}

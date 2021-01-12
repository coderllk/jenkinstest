!groovy
def getHost(){
    def remote = [:]
    remote.name = 'mysql'
    remote.host = '192.168.4.100'
    remote.user = 'root'
    remote.port = 22
    remote.password = 'QunyiC2~T'
    remote.allowAnyHosts = true
    return remote
}
pipeline {
    agent {label 'master'}
    environment{
        def server = ''
    }   
    stages {
        stage('init-server'){
            steps {
                script {                 
                   server = getHost()                                   
                }
            }
        }
        stage('use'){
            steps {
                script {
                  sshCommand remote: server, command: """                 
                  if test ! -d aaa/ccc ;then mkdir -p aaa/ccc;fi;cd aaa/ccc;rm -rf ./*;echo 'aa' > aa.log
                  """
                }
            }
        }
    }
}

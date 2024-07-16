def call(){
          def pom = readMavenPom file: 'pom.xml'
          def version = pom.version
          def artifactId = pom.artifactId
          def groupId = pom.groupId
          def repoName = artifactId
          if(version.endsWith("SNAPSHOT")){
                    repoName = "${repoName}-snapshot"
                }
  nexusArtifactUploader artifacts: [[artifactId: artifactId , classifier: '', file: 'target/${artifactId}.war', type: 'war']], credentialsId: 'nexus', groupId: groupId , nexusUrl: '23.20.166.185:8081', nexusVersion: 'nexus3', protocol: 'http', repository: "${repoName}", version: version      
}

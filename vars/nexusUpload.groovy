def call(){
          def pom = readMavenPom file: 'pom.xml'
          def version = pom.version
         def repoName = artifactId
          if(version.endsWith("SNAPSHOT")){
                    repoName = "${repoName}-snapshot"
                }
  nexusArtifactUploader artifacts: [[artifactId: 'ai-leads', classifier: '', file: 'target/ai-leads.war', type: 'war']], credentialsId: 'nexus', groupId: 'in.javahome' , nexusUrl: '23.20.166.185:8081', nexusVersion: 'nexus3', protocol: 'http', repository: "${repoName}", version: version      
}

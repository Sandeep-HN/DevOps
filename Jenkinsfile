pipeline{
  agent any
  stages{
    stage("SCM Checkout"){
      steps{
      echo "Checking out from Git"
    }
    }
    stage("Deploy-dev"){
      when{
        branch 'develop'
      }
      steps{
      echo "Deployed to dev server"
    }
    }
     stage("Deploy-prod"){
      when{
        branch 'main'
      }
      steps{
      echo "Deployed to prod server"
    }
    }
  }
}

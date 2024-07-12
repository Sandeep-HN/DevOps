pipeline{
  agent any
  stages{
    stage("SCM Checkout"){
      steps{
      echo "Checking out from Git"
    }
    }
    stage("Deploy"){
      when{
        branch 'develop'
      }
      steps{
      echo "Deployed to dev server"
    }
    }
     stage("Deploy"){
      when{
        branch 'main'
      }
      steps{
      echo "Deployed to prod server"
    }
    }
  }
}

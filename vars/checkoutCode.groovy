def call(String repoUrl, String branch){
   def workingDir = "${env.WORKSPACE}/repo"
   sh "rm -rf ${workingDir}"
   sh "git clone ${repoUrl} ${workingDir}"

   dir(workingDir){
      sh "git checkout ${branch}"
   }
   
   return workingDir
}
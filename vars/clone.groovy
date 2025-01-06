def call(String url, String branch){
  echo "this is clonning the code"
  git url: url, branch: branch
  echo "clone done successfully"
}

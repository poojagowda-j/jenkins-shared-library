def call() {
  echo "this will build the artifact"
  sh  "mvn clean package"
}

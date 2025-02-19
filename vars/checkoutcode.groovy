def call(cmd) {
  echo "This stage will checkout source code ${cmd}"
  checkout scm
}

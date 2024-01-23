def call() {
       // Your SonarQube scan steps go here
       sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://51.20.6.88:9000 -Dsonar.java.binaries=target/classes'
   }
return this

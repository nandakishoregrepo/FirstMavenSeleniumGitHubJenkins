pipeline{
	agent any
	
		stages {
			stage ('Compile Stage'){
				
				steps{
					withMaven(maven : 'apache-maven-3.6.3') {
						bat 'clean compile'
						}
					}
				}
				
		stage ('Test Stage'){
				
				steps{
					withMaven(maven : 'apache-maven-3.6.3') {
						bat 'clean test'
						}
					}
				}
			


	}
}
				
				
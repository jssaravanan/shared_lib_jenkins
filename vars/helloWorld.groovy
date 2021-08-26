/*def call()
{
	echo "welcome to Groovy"
}

def call(String name){
	sh "echo Welcome $name to Groovy"
}*/

def call(Map config = [:]){
	sh "echo Welcome ${config.name} to ${config.subject}"
}

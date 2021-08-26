def call()
{
	echo "welcome to Groovy"
}

def call(String name){
	sh "echo Welcome $name to Groovy"
}

def call(Map config = [:]){
	def loadResource = libraryResource "com/bow/${config.name}"
	writeFile file:"${config.name}", text :loadResource
	sh "chmod a+x ./${config.name}.sh"
}
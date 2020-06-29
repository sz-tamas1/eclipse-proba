fun main(args: Array<String>){
	println("Hello World!")
	
	val valami = "Valami"
	//valami = "rte"
	println("length: ${valami.length}")
	
	var a: String = "abc"
	
	printMessage(a)
	
}

fun printMessage(message: String): Unit {
	println(message)
}

fun sum(x: Int, y: Int): Int{
	return x+y
}
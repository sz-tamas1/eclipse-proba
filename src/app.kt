fun main(args: Array<String>){
	println("Hello World!")
	
	val cakes = listOf("Valami","carrot","chocolate")

	for (cake in cakes){
		printMessage("It is a $cake cake.")
	}

	
	var a: String = "abc"
	
	printMessage(a)
	
}

fun printMessage(message: String): Unit {
	println(message)
}

fun sum(x: Int, y: Int): Int{
	return x+y
}
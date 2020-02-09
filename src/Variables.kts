fun main() {
    var thisByte: Byte = 127
    println("A byte can handle 8 bits, up to this max number: $thisByte")

    val thisShort: Short = 31000
    println("A short is 16 bits, so: $thisShort is near the max value allowed")

    var myInt = 82442824
    println("I assigned this variable without declaring, just letting Kotlin infer: $myInt")

    val thisLong = 10000000001303014L
    println("$thisLong is a long number")

    val myFloat = 1.204f
    println("Assign a float with a lowercase 'f' after the value: $myFloat")

    var thisDouble = 134.35356
    println("My double is: $thisDouble, it can handle decimal places")

    val myBoolean = true
    println("I set myBoolean using val, it cannot change and the value is: $myBoolean")

    var myLetter:  Char
    myLetter = 'D'
    println("$myLetter")

}
main()
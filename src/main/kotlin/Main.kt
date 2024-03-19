fun main(){
    println(sum(23,12))
     greet("Naserian")
    calculateArea(54,3.142)



}

//question1//Create a function sum that takes two parameters and returns their sum.

fun sum(num1: Int,num2: Int):Int{
    return (num1+num2)

}
//Define a function greet that takes a name as a parameter and prints a personalized greeting
fun greet(name: String){
    println("Hello Everyone $name")
}
//Implement a function calculateArea that calculates the area of a circle given its radius.
fun calculateArea(num3: Int,pii:Double){
    var area=num3*pii
    println(area)
}




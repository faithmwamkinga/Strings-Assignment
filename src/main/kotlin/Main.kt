
fun main(){
nameOfInstitution()

 println(sentence("Angel", 45, "Hi"
 ))
 println(schoolsubject("Geography"))
 println()
 sentence1()

}
fun nameOfInstitution() {
var nameOfInstitution = "akirachix"
println(nameOfInstitution[1])
 println(nameOfInstitution[3])
 println(nameOfInstitution[5])}

fun sentence(name:String, Age:Int, Greeting:String):String {

 val sentence = "Hi my name is $name and I am $Age"
 return sentence}

 //Write a function that takes in a String and returns its length

 fun schoolsubject(subject:String):Int {

  return 8
 }


 fun sentence1() {
  val name = "Joune"
  val sentence1 = "That's me!"
  if (name == sentence1) {
   println("That's me!")
  } else {
   println("I don't know who that is.")
  }
 }





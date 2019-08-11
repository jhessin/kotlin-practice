package one

val data: Int = 10

fun someFun() {
  println("someFun...$data")
}

class SomeClass {
  val data: Int = 20

  fun someFun(){
    println("class some fun...$data")
  }
}

fun main(args: Array<String>) {
  someFun()
}

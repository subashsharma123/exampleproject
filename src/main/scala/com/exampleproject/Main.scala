package com.exampleproject

object Main {
  def main(args: Array[String]): Unit = {
    val hello = new HelloWorld("Subash", 17)
    hello.show()
    print(hello.name+" "+hello.age)
  }

}

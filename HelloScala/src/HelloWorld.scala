/**
  * chouchan
  */
object HelloWorld {
  def main(args: Array[String]) {
    //println("Hello, world!")
   // println(max(3,2))
   // println(isEqual(1,2))
    //val x = "abcd".substring(2)
    //println(x)
    //val x1 =new String("abc")
    //println(x1)
    val y=  new Rational(66,42)
    println(y)
  }

  def max(x:Int,y:Int) : Int = { if(x>y) x else y}

  def isEqual(x:Int,y:Int) = x == y


}

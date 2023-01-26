class NilakanthaSeries{
  var pi:Double = 3.0
  var a :Double = 2.0
  var s :Double = 1.0
  fun iterate() {
    pi += s*(4/(a*(a*(a+3)+2)))
    a += 2
    s = -s
  }
}

fun main(){
  //println("helloworld")
  var approximator= NilakanthaSeries()
  for(i in 0..150000){
    approximator.iterate()
  }
  println("pi= ${approximator.pi}")
}
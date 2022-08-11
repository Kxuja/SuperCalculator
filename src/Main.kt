import java.util.*

fun main(args: Array<String>) {
    val cal=Cal()
    var scanner = Scanner(System.`in`)
    print(" 1 =")
     val a=scanner.nextDouble()
    scanner= Scanner(System.`in`)
    val sign:String=scanner.next()
    print(" 2 =")
    val b=scanner.nextDouble()
    when(sign){
        "+"->{
          cal.plus(a,sign,b)
        }
        "-"->{
          cal.minus(a,sign,b)
        }
        "*"->{
           cal.multi(a,sign,b)
        }
        "/"->{
            cal.division(a,sign,b)
        }
        "%"->{
            cal.percent(a,b)
        }
        "^"->{
           cal.degree(a,b)
        }
    }
}
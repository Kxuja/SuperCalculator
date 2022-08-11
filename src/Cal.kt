class Cal:Calculator {
    private var res:Double=0.0
    private var sum:Double=1.0


    override fun plus(a: Double, sign: String, b: Double) {
        res=a+b
        println("$a + $b = $res")
    }

    override fun minus(a: Double, sign: String, b: Double) {
        res=a-b
        println("$a - $b = $res")
    }

    override fun multi(a: Double, sign: String, b: Double) {
        res=a*b
        println("$a * $b = $res")
    }

    override fun division(a: Double, sign: String, b: Double) {
        res=a/b
        println("$a / $b = $res")
    }

    override fun percent(a: Double, b: Double) {
        res=(a/100)*b
        println("$a % $b = $res")
    }

    override fun degree(a: Double, b: Double) {
        for (i in 0 until b.toInt()) {
            sum *= a
        }
        println("$a ^ $b = $sum")
    }

}
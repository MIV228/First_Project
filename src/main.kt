import kotlin.random.Random

fun main() {
    val n = 0
    while (n == 0) {
        amogus()
    }
}

fun amogus() {

    println("Режим: 1 - 1-5, 2 - 1-10, 3 - 1-25, 4 - 1-50, 5 - 1-100")
    var answer = readLine().toString()
    when (answer) {
        "1" -> fun1()
        "2" -> fun2()
        "3" -> fun3()
        "4" -> fun4()
        "5" -> fun5()
    }
}

fun fun1() {
    try {
        val int = Random.nextInt(1, 5)
        println("Ставка (Int):")
        var stavka = readLine()!!.toInt()
        println("Число (Int):")
        var plan = readLine()!!.toInt()
        if (plan == int) {
            println("Победа!")
            stavka *= 2
        } else {
            println("Поражение.")
            stavka /= 2
        }
        println("Ставка: $stavka")
    } catch (e:Exception) {
        println("Что-то пошло не так.")
    }
}

fun fun2() {
    try {
        val int1 = Random.nextInt(1, 10)
        val int2 = Random.nextInt(1, 10)
        println("Ставка (Int):")
        var stavka = readLine()!!.toInt()
        println("Число (Int):")
        var plan = readLine()!!.toInt()
        if (plan == int1 || plan == int2) {
            println("Победа!")
            stavka *= 5
        } else {
            println("Поражение.")
            stavka /= 2
        }
        println("Ставка: $stavka")
    } catch (e:Exception) {
        println("Что-то пошло не так.")
    }
}

fun fun3() {
    try {
        val int1 = Random.nextInt(1, 25)
        val int2 = Random.nextInt(1, 25)
        val int3 = Random.nextInt(1, 25)
        println("Ставка (Int):")
        var stavka = readLine()!!.toInt()
        println("Число (Int):")
        var plan = readLine()!!.toInt()
        if (plan == int1 || plan == int2 || plan == int3) {
            println("Победа!")
            stavka *= 10
        } else {
            println("Поражение.")
            stavka /= 2
        }
        println("Ставка: $stavka")
    } catch (e:Exception) {
        println("Что-то пошло не так.")
    }
}

fun fun4() {
    try {
        val int1 = Random.nextInt(1, 50)
        val int2 = Random.nextInt(1, 50)
        val int3 = Random.nextInt(1, 50)
        val int4 = Random.nextInt(1, 50)
        val int5 = Random.nextInt(1, 50)
        println("Ставка (Int):")
        var stavka = readLine()!!.toInt()
        println("Число (Int):")
        var plan = readLine()!!.toInt()
        if (plan == int1 || plan == int2 || plan == int3 || plan == int4 || plan == int5) {
            println("Победа!")
            stavka *= 25
        } else {
            println("Поражение.")
            stavka /= 2
        }
        println("Ставка: $stavka")
    } catch (e:Exception) {
        println("Что-то пошло не так.")
    }
}

fun fun5() {
    try {
        val int1 = Random.nextInt(1, 100)
        val int2 = Random.nextInt(1, 100)
        val int3 = Random.nextInt(1, 100)
        val int4 = Random.nextInt(1, 100)
        val int5 = Random.nextInt(1, 100)
        val int6 = Random.nextInt(1, 100)
        val int7 = Random.nextInt(1, 100)
        val int8 = Random.nextInt(1, 100)
        val int9 = Random.nextInt(1, 100)
        val int10 = Random.nextInt(1, 100)
        println("Ставка (Int):")
        var stavka = readLine()!!.toInt()
        println("Число (Int):")
        var plan = readLine()!!.toInt()
        if (plan == int1 || plan == int2 || plan == int3 || plan == int4 || plan == int5 || plan == int6 || plan == int7 || plan == int8 || plan == int9 || plan == int10 ) {
            println("Победа!")
            stavka *= 50
        } else {
            println("Поражение.")
            stavka /= 2
        }
        println("Ставка: $stavka")
    } catch (e:Exception) {
        println("Что-то пошло не так.")
    }
}
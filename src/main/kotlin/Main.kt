fun main(args: Array<String>) {
    // задание 1
    val exercises: Int = 13
    var exercisesSolved: Int = 0

        // задание 2
    val myAge: Int =  18

    //задание 3
    var myyAge: Double = 18.0
    var otherPersonAge: Double = 30.0
    myyAge =(myAge + otherPersonAge) / 2
    println("Новое значение myAge: $myyAge")

    //задание 4
    val testNumber = 11
    val evenOdd = testNumber % 2
    println("Значение evenOdd: $evenOdd")
    //% делит константу на 2, оставляя остаток 1

    //задание 5
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3

    println("Конечный результат: $answer")

    //задание 6
    val aage: Int = 18
    println(aage)
    val age: Int = 30
    println(age)
    // Переменная не изменяется, поэтому её можно объявить как val

    //задание 7
    val a: Int = 2
    val b: Int = 3
    //1
    val answer1: Int = (a * 100) + b
    println("=$answer1")
    //2
    val answer2: Int = (a * 100) + (b * 100)
    println("=$answer2")
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println("=$answer3")

    //задание 8
    var primerSoSkobkami: Int = (5 * 3 )- (4 / 2) * 2
println(primerSoSkobkami)

    //задание 9
    val v: Double = 5.7
    val k: Double = 8.1
    val average: Double = (v + k) / 2
    println("Среднее арифметическое v и k: $average")

    //задание 10
    val fahrenheit: Double = 77.0
    val celsius: Double = (fahrenheit - 32) / 1.8
    println("температура в градусах цельсия: $celsius")

}
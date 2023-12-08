fun main() {
    val listNumbers = (1..100).toList().reversed()

    for (i in listNumbers) {
        when {
            isPrimeNumber(i) -> continue
            i % 3 == 0 && i % 5 == 0 -> print(" FooBar,")
            i % 3 == 0 -> print(" Foo,")
            i % 5 == 0 -> print(" Bar,")
            else -> print(" $i, ")
        }
    }
}

fun isPrimeNumber(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..<num) {
        if (num % i == 0) return false
    }
    return true
}
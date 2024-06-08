import java.util.*
import kotlin.math.sqrt

fun main(){
    val scanner = Scanner(System.`in`)
    print("Enter a positive number: ")
    val num = scanner.nextInt()
    var result = ""
    result+= if (isEven(num)) "Number is Even\n" else "Number is Odd\n"
    result+= "Number of digits is ${digitCount(num)}\n"
    result+= "Sum of digits is ${digitSum(num)}\n"
    result+= "Reverse of number is ${reverse(num)}\n"
    result+= "Prime factorization is ${primeFactorization(num)}\n"
    result+= "Prime factors are ${primeFactors(num).toSet().joinToString(separator = ", ")}\n"
    result+= "Number of prime factors is ${primeFactors(num).toSet().size}\n"
    result+= "Sum of prime factors is ${primeFactors(num).toSet().sum()}\n"
    result += "Factors of $num are ${factors(num).toSet().joinToString(separator = ", ")}\n"
    result += "Number of factors is ${factors(num).toSet().size}\n"
    result += "Sum of factors is ${factors(num).toSet().sum()}\n"
    result += "$num is ${if(!isPrimeNumber(num)) "a Composite" else "not a Composite"} number\n"
    result += "Binary representation is ${decimalToBin(num)}\n"
    result += "Octal representation is ${decimalToOct(num)}\n"
    result += "Hexadecimal representation is ${decimalToHex(num)}\n"
    result += "$num is ${if(isPalindrome(num)) "a Palindrome" else "not a Palindrome"} number\n"
    result += "$num is ${if(isNivenNumber(num)) "a Niven"  else "not a Niven"} number\n"
    result += "$num is ${if(isEmirpNumber(num)) "an Emirp"  else "not an Emirp"} Number\n"
    result += "$num is ${if(isAbundantNumber(num)<=0) "not an Abundant number " else "an Abundant number with Abundance ${isAbundantNumber(num)}"} \n"
    result += "$num is ${if(isTechNumber(num)) "a Tech"  else "not a Tech"} number\n"
    result += "$num is ${if(isDisariumNumber(num)) "a Disarium"  else "not a Disarium"} number\n"
    result += "$num is ${if(isPronicNumber(num)) "a Pronic"  else "not a Pronic"} number\n"
    result += "$num is ${if(isAutomorphicNumber(num)) "an Automorphic"  else "not an Automorphic"} number\n"
    result += "$num is ${if(isKaprekarNumber(num)) "a Kaprekar"  else "not a Kaprekar"} number\n"
    result += "$num is ${if(isSpecialNumber(num)) "a Special"  else "not a Special"} number\n"
    result += "$num is ${if(isLucasNumber(num)) "a Lucas"  else "not a Lucas"} number\n"
    result += "$num is ${if(isSmithNumber(num)) "a Smith"  else "not a Smith"} number\n"
    result += "$num is ${if(isArmstrongNumber(num)) "an Armstrong"  else "not an Armstrong"} number.\n"
    result += "$num is ${if(isFibonacciNumber(num)) "a Fibonacci"  else "not a Fibonacci"} number\n"
    result += "$num is ${if(isCircularPrimeNumber(num)) "a Circular Prime"  else "not a Circular Prime"} number\n"
    result += "$num is ${if(isPalindrome(num) && isPrimeNumber(num)) "a Prime Palindrome" else "not a Prime Palindrome"} number\n"
    result += "$num is ${if(isFermatNumber(num)) "a Fermat" else "not a Fermat"} number\n"
    result += "$num is ${if(isUglyNumber(num)) "an Ugly" else "not an Ugly"} number\n"
    result += "$num is ${if(isNeonNumber(num)) "a Neon" else "not a Neon"} number\n"
    result += "$num is ${if(isSpyNumber(num)) "a Spy" else "not a Spy"} number\n"
    result += "$num is ${if(isHappyNumber(num)) "a Happy" else "not a Happy"} number\n"
    result += "$num is ${if(isDuckNumber(num)) "a Duck" else "not a Duck"} number\n"
    println(result)
}

fun isEven(number : Int) = number % 2 == 0

fun digitCount(number : Int) = number.toString().length

fun digitSum(number: Int): Int = number.toString().map { it - '0' }.sum()

fun digitProduct(number: Int): Int {
    var product = 1
    var num = number
    while (num != 0) {
        val digit = num % 10
        product *= digit
        num /= 10
    }
    return product
}

fun reverse(number : Int) = number.toString().reversed().toInt()

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    var result = 1
    for (i in 2..n) {
        result *= i
    }
    return result
}

fun isPerfectSquare(number: Int): Boolean {
    val sqrt = sqrt(number.toDouble()).toInt()
    return sqrt * sqrt == number
}

fun isPalindrome(number:Int) = number==reverse(number)

fun decimalToBin(n: Int): String = n.toString(2)

fun decimalToOct(n: Int): String = n.toString(8)

fun decimalToHex(n: Int): String = n.toString(16).uppercase(Locale.getDefault())

fun isPrimeNumber(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false
    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun primeFactors(n: Int): List<Int> {
    var num = n
    val factors = mutableListOf<Int>()
    for (i in 2..num) {
        if (isPrimeNumber(i)) {
            while (num % i == 0) {
                factors.add(i)
                num /= i
            }
        }
    }
    return factors
}

fun primeFactorization(n: Int): String {
    val factors = primeFactors(n)
    if (factors.isEmpty()) return "$n has no prime factors"
    val factorCount = mutableMapOf<Int, Int>()
    for (factor in factors) {
        factorCount[factor] = factorCount.getOrDefault(factor, 0) + 1
    }
    return factorCount.entries.joinToString(separator = " \u00D7 ") { "${it.key}^${it.value}" }
}

fun factors(n: Int): List<Int> {
    val factors = mutableListOf<Int>()
    for (i in 1..n) {
        if (n % i == 0) {
            factors.add(i)
        }
    }
    return factors
}

fun isNivenNumber(number: Int): Boolean = if(number % digitSum(number) == 0) true else false

fun isEmirpNumber(number: Int): Boolean = if(isPrimeNumber(number)) (if(isPrimeNumber(reverse(number))) true else false) else false

fun isAbundantNumber(number : Int): Int = (factors(number).toSet().sum()-number) - number

fun isTechNumber(number: Int) : Boolean {
    if (digitCount(number)%2!=0)
        return false
    val numberString = number.toString()
    val halfLength = numberString.length / 2
    val firstHalf = numberString.substring(0, halfLength)
    val secondHalf = numberString.substring(halfLength)
    val sumOfHalves = firstHalf.toInt() + secondHalf.toInt()
    val squareOfSum = sumOfHalves * sumOfHalves
    return squareOfSum == number
}

fun isDisariumNumber(number: Int): Boolean {
    var num = number
    var sum = 0
    var position = 1
    while (num > 0) {
        val digit = num % 10
        sum += Math.pow(digit.toDouble(), position.toDouble()).toInt()
        position++
        num /= 10
    }
    return sum == number
}

fun isPronicNumber(number: Int): Boolean {
    var x = 0
    while (x * (x + 1) <= number) {
        if (x * (x + 1) == number) {
            return true
        }
        x++
    }
    return false
}

fun isAutomorphicNumber(number: Int): Boolean {
    val square = number.toLong() * number.toLong() // Calculate the square of the number
    val numberString = number.toString()
    val squareString = square.toString()

    // Check if the square ends with the digits of the original number
    return squareString.endsWith(numberString)
}

fun isKaprekarNumber(number: Int): Boolean {
    val square = number.toLong() * number.toLong()
    val squareStr = square.toString()
    for (i in 1..<squareStr.length) {
        val firstPartStr = squareStr.substring(0, i)
        val secondPartStr = squareStr.substring(i)
        if (firstPartStr.isNotEmpty() && secondPartStr.isNotEmpty()) {
            val firstPart = firstPartStr.toLong()
            val secondPart = secondPartStr.toLong()
            if (firstPart + secondPart == number.toLong()) {
                return true
            }
        }
    }
    return false
}

fun isSpecialNumber(number: Int): Boolean {
    var num = number
    var sum = 0
    while (num > 0) {
        val digit = num % 10
        sum += factorial(digit)
        num /= 10
    }
    return sum == number
}

fun isLucasNumber(number: Int): Boolean {
    var a = 2
    var b = 1
    if (number == a || number == b) {
        return true
    }
    while (b <= number) {
        val nextNumber = a + b
        if (nextNumber == number) {
            return true
        }
        a = b
        b = nextNumber
    }
    return false
}

fun isSmithNumber(number: Int): Boolean {
    if(isPrimeNumber(number)) return false
    var sum = 0
    for (primeFactor in primeFactors(number)) {
        sum += if (primeFactor >= 10) {
            primeFactor.toString().map { it.toString().toInt() }.sum()
        } else {
            primeFactor
        }
    }
    return digitSum(number)==sum
}

fun isArmstrongNumber(number: Int): Boolean {
    var num = number
    val numberOfDigits = num.toString().length
    var sum = 0
    while (num > 0) {
        val digit = num % 10
        sum += Math.pow(digit.toDouble(), numberOfDigits.toDouble()).toInt()
        num /= 10
    }
    return sum == number
}

fun isFibonacciNumber(number: Int): Boolean {
    return isPerfectSquare(5 * number * number + 4) || isPerfectSquare(5 * number * number - 4)
}

fun rotateNumber(number: Int): Int {
    val numberStr = number.toString()
    return (numberStr.substring(1) + numberStr[0]).toInt()
}

fun isCircularPrimeNumber(number: Int): Boolean {
    var rotatedNumber = number
    repeat(number.toString().length) {
        if (!isPrimeNumber(rotatedNumber)) {
            return false
        }
        rotatedNumber = rotateNumber(rotatedNumber)
    }
    return true
}

fun isFermatNumber(number: Int): Boolean {
    if (number <= 0) return false
    if (number == 3 || number == 5) return true

    var s = 4
    val m = (1 shl number) - 1 // Equivalent to 2^number - 1
    repeat(number - 2) {
        s = (s * s - 2) % m
    }
    return s == 0
}

fun isUglyNumber(number: Int): Boolean {
    if (number <= 0) return false
    val primeFactors = primeFactors(number)
    for (factor in primeFactors) {
        if (factor != 2 && factor != 3 && factor != 5) {
            return false
        }
    }
    return true
}

fun isNeonNumber(number: Int) = number==digitSum(number*number)

fun isSpyNumber(number: Int) = digitSum(number)==digitProduct(number)

fun isHappyNumber(number: Int): Boolean {
    var num = number
    val seen = HashSet<Int>()
    while (num != 1 && !seen.contains(num)) {
        seen.add(num)
        var sum = 0
        while (num > 0) {
            val digit = num % 10
            sum += digit * digit
            num /= 10
        }
        num = sum
    }
    return num == 1
}

fun isDuckNumber(number: Int): Boolean {
    var num = number
    var hasZero = false
    while (num != 0) {
        val digit = num % 10
        if (digit == 0 && hasZero) {
            return true
        }
        if (digit == 0) {
            hasZero = true
        }
        num /= 10
    }
    return false
}
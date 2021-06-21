
//WEEK 3 ASSIGNMENT

//METHOD 1

fun main() {
    for (i in 1..100) {
        if (i % 15 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else {
            println(i)
        }
    }


//METHOD 2

    for (i in 1..100) {
        when {
            (i % 3 == 0 && i % 5 == 0) -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println("$i")
        }
    }


//2)

    fun main(args: Array<String>) {
        var sentence = "School is boring"
        //var reversed = reverse(sentence)
        //println("The reversed sentence is: $reversed")
    }

    fun reverse(sentence: String): String {
        if (sentence.isEmpty())
            return sentence

        return reverse(sentence.substring(1)) + sentence[0]


    }
}







//fun main(){
//    var number = 1..100
//    for (i in number) {
//        println(i)
//    }
//}
import java.util.*

fun main(args: Array<String>) {
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    mainGame()
}

fun mainGame() {
    print("Masukan Pemain 1: ")
    val playerOne = readLine()!!.lowercase(Locale.getDefault())
    print("Masukan pemain 2: ")
    val playerTwo = readLine()!!.lowercase(Locale.getDefault())
    println("hasil: ")
    GameSuit(playerOne, playerTwo)
}

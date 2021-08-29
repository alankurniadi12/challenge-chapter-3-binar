import java.util.*

class GameSuit(playerOne: String, playerTwo: String) {
    init {
        cekInpuPlayer(playerOne, playerTwo)
    }
    fun cekInpuPlayer(pOne: String, pTwo: String) {
        val gunting = "gunting"
        val batu = "batu"
        val kertas = "kertas"

        if (pOne == gunting && pTwo == gunting ||
            pOne == batu && pTwo == batu ||
            pOne == kertas && pTwo == kertas) {
            PrintResult.print("DRAW!")
            PrintResult.print("Coba lagi?(Y/N)")
            PlayAgain.playAgain()
        } else if (pOne == gunting && pTwo == batu ||
            pOne == batu && pTwo == kertas ||
            pOne == kertas && pTwo == gunting) {
            PrintResult.print("Pemain 2 Menang")
            PrintResult.print("Coba lagi?(Y/N)")
            PlayAgain.playAgain()
        } else if (pOne == gunting && pTwo == kertas ||
            pOne == kertas && pTwo == batu ||
            pOne == batu && pTwo == gunting) {
            PrintResult.print("Pemain 1 Menang")
            PrintResult.print("Coba lagi?(Y/N)")
            PlayAgain.playAgain()
        } else {
            PrintResult.print("INPUT ANDA SALAH")
            PrintResult.print("Coba lagi?(Y/N)")
            PlayAgain.playAgain()
        }
    }
}
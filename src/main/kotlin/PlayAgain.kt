import java.util.*

class PlayAgain {
    companion object {
        fun playAgain() {
            when(readLine()!!.toString().uppercase(Locale.getDefault())) {
                "Y" -> mainGame()
                "N" -> PrintResult.print("Permainan Selesai!")
                else -> PrintResult.print("Hanya boleh memasukan Y / N\nJalankan Ulang!!")
            }
        }

    }
}
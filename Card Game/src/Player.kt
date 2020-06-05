import java.lang.Thread.sleep

class Player (){
    init {
        print("Enter Name:")
        val name= readLine()
        sleep(1000)
        println("Welcome To The JoJo's Bizarre Adventure Card Game $name!")
        sleep(2000)
        println()
        print("Press ENTER to start game")
        val enter= readLine()
    }
}

fun main(){
    val obj=Player()

    val objbat=Battle()
    objbat.give_cards()
    objbat.show_cards()
    objbat.round_1()
    sleep(2500)
    objbat.show_cards()
    objbat.round_2()
    sleep(2500)
    objbat.show_cards()
    objbat.round_3()
    sleep(2500)
    objbat.show_cards()
    objbat.round_4()
    sleep(2500)
    objbat.show_cards()
    objbat.round_5()
    sleep(3000)
    objbat.result()
}
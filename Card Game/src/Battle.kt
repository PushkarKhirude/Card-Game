import java.lang.Thread.sleep
import java.util.*

class Battle{
    //List of objects of cards
    val obj_pl_cards = MutableList(5) { Cards()}
    val obj_com_cards = MutableList(5) { Cards()}
    var i = 0
    var j=0
    var index_pl=0
    var index_com=0
    var cur_qual_pl=0
    var cur_qual_com=0
    var pl_win_count=0
    var com_win_count=0
    var len=5

    //Function to assign a card to an object
    fun give_cards() {
        repeat(len) {
            obj_pl_cards[i].drop_pl_cards()
            i++
        }
        repeat(len) {
            obj_com_cards[j].drop_pl_cards()
            j++
        }
    }

    //Function to show which cards you/computer has
    fun show_cards(){
        i=0
        j=0
        println("\nThese Are Your Cards:")
        repeat(len) {
            index_pl=i+1
            print("$index_pl.")
            obj_pl_cards[i].printlist()
            i++
        }
        println()
        println("These Are Computer's Cards:")
        repeat(len) {
            index_com=j+1
            print("$index_com.")
            obj_com_cards[j].printlist()
            j++
        }
        len--
    }

    //In this function user will select a card and computer will randomly select a card for round 1 battle
    fun round_1(){
        println("\n-----------------ROUND 1--------------------")
        fun chose_cd_r1() {
        println()
        print("Enter a number of card which you want to select for round 1:")
        val index_pl_1= readLine()

            when (index_pl_1) {
                "1" -> {
                    print("You have chosen ")
                    obj_pl_cards[0].printlist()
                    i = 0
                }
                "2" -> {
                    print("You have chosen ")
                    obj_pl_cards[1].printlist()
                    i = 1
                }
                "3" -> {
                    print("You have chosen ")
                    obj_pl_cards[2].printlist()
                    i = 2
                }
                "4" -> {
                    print("You have chosen ")
                    obj_pl_cards[3].printlist()
                    i = 3
                }
                "5" -> {
                    print("You have chosen ")
                    obj_pl_cards[4].printlist()
                    i = 4
                }
                 else->{
                     println("-----------Entered Number is Invalid----------")
                     chose_cd_r1()
                }
            }
        }
        chose_cd_r1()
        j= Random().nextInt(len)
        j= Random().nextInt(len)
        println()
        print("Computer Picked ")
        obj_com_cards[j].printlist()
        comparison(i,j)
        println("-----------------ROUND 1--------------------")
    }

    //In this function user will select a card and computer will randomly select a card for round 2 battle
    fun round_2(){
        println("\n-----------------ROUND 2--------------------")
        fun chose_cd_r2() {
            println()
            print("Enter a number of card which you want to select for round 2:")
            val index_pl_1= readLine()

            when (index_pl_1) {
                "1" -> {
                    print("You have chosen ")
                    obj_pl_cards[0].printlist()
                    i = 0
                }
                "2" -> {
                    print("You have chosen ")
                    obj_pl_cards[1].printlist()
                    i = 1
                }
                "3" -> {
                    print("You have chosen ")
                    obj_pl_cards[2].printlist()
                    i = 2
                }
                "4" -> {
                    print("You have chosen ")
                    obj_pl_cards[3].printlist()
                    i = 3
                }
                else->{
                    println("-----------Entered Number is Invalid----------")
                    chose_cd_r2()
                }
            }
        }
        chose_cd_r2()

        j= Random().nextInt(len)
        j= Random().nextInt(len)
        println()
        print("Computer Picked ")
        obj_com_cards[j].printlist()
        comparison(i,j)
        println("-----------------ROUND 2--------------------")
    }

    //In this function user will select a card and computer will randomly select a card for round 3 battle
    fun round_3(){
        println("\n-----------------ROUND 3--------------------")
        fun chose_cd_r3() {
            println()
            print("Enter a number of card which you want to select for round 3:")
            val index_pl_1= readLine()

            when (index_pl_1) {
                "1" -> {
                    print("You have chosen ")
                    obj_pl_cards[0].printlist()
                    i = 0
                }
                "2" -> {
                    print("You have chosen ")
                    obj_pl_cards[1].printlist()
                    i = 1
                }
                "3" -> {
                    print("You have chosen ")
                    obj_pl_cards[2].printlist()
                    i = 2
                }
                else->{
                    println("-----------Entered Number is Invalid----------")
                    chose_cd_r3()
                }
            }
        }
        chose_cd_r3()

        j= Random().nextInt(len)
        j= Random().nextInt(len)
        println()
        print("Computer Picked ")
        obj_com_cards[j].printlist()
        comparison(i,j)
        println("-----------------ROUND 3--------------------")
    }

    //In this function user will select a card and computer will randomly select a card for round 4 battle
    fun round_4(){
        println("\n-----------------ROUND 4--------------------")
        fun chose_cd_r4() {
            println()
            print("Enter a number of card which you want to select for round 4:")
            val index_pl_1= readLine()

            when (index_pl_1) {
                "1" -> {
                    print("You have chosen ")
                    obj_pl_cards[0].printlist()
                    i = 0
                }
                "2" -> {
                    print("You have chosen ")
                    obj_pl_cards[1].printlist()
                    i = 1
                }
                else->{
                    println("-----------Entered Number is Invalid----------")
                    chose_cd_r4()
                }
            }
        }
        chose_cd_r4()

        j= Random().nextInt(len)
        j= Random().nextInt(len)
        println()
        print("Computer Picked ")
        obj_com_cards[j].printlist()
        comparison(i,j)
        println("-----------------ROUND 4--------------------")
    }

    //In this function player's and computer's last cards are used for 5th round
    fun round_5(){
        println("\n-----------------ROUND 5--------------------")
        println()
        print("Your last card:")
        obj_pl_cards[0].printlist()
        i = 0
        print("Computer's last card:")
        obj_com_cards[0].printlist()
        j=0
        comparison(i,j)
        println("-----------------ROUND 5--------------------")
    }

    //Comparison of cards happens in this function
    //cards are compared on the basis of their quality
    fun comparison(i:Int,j:Int){
        sleep(1000)
        cur_qual_pl=obj_pl_cards[i].ret()
        cur_qual_com=obj_com_cards[j].ret()
        if(cur_qual_pl>cur_qual_com){
            pl_win_count++
            println("Your Card's Quality is Better")
            println("You Won This Round!")
        }
        else if (cur_qual_pl<cur_qual_com){
            com_win_count++
            println("Computer's Card's Quality is Better")
            println("Computer Won This Round!")
        }
        else if(cur_qual_pl==cur_qual_com){
            println("Both Card's Quality Are Same")
            println("The Round Was a Tie!")
        }
        obj_pl_cards.removeAt(i)
        obj_com_cards.removeAt(j)
    }

    //Final result is displayed using this function
    //One who wins most rounds wins the game
    fun result(){
        println()
        if(pl_win_count>com_win_count){
            println("--------------You Won Most Rounds------------")
            println("----------------YOU WON THE GAME-------------")
        }
        else if(pl_win_count<com_win_count){
            println("-----------Computer Won Most Rounds------------")
            println("---------------YOU LOST THE GAME---------------")
        }
        else if(pl_win_count==com_win_count){
            println("------------GAME WAS A TIE-------------")
        }
    }
}

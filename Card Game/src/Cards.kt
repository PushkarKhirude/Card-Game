class Cards {
    var crd:String=""
    //These are the lists of cards quality wise
    val poor = listOf("Iggy (Poor)", "Abbacchio (Poor)", "Narancia (Poor)","Fugo (Poor)","AC/DC (Poor)")
    val good = listOf("Muhammad Avdol (Good)", "Wamuu (Good)", "Koichi (Good)","Kars (Good)","Trish (Good)")
    val excellent = listOf("Caesar Zeppeli (Excellent)", "Mista (Excellent)", "Jonathan Joestar (Excellent)","Rohan Kishibe (Excellent)","Lisa Lisa (Excellent)")
    val mint = listOf("Noriaki Kakyoin (Mint)", "Jean Pierre Polnareff (Mint)", "Bruno Buciarati (Mint)","Kira Yoshikage (Mint)","Giorno Giovanna (Mint)")
    val legendary= listOf("Joseph Joestar (Legendary)", "Jotaro Kujo (Legendary)", "Speedwagon (Legendary)","Dio (Legendary)","Josuke (Legendary)")
    val quality = listOf(poor, good, excellent, mint,legendary)
    var qual_n=0

    //this function drops cards for player and computer randomly
    fun drop_pl_cards() {
        val ran_qual_pl = quality.random()
        qual_n=quality.indexOf(ran_qual_pl)
        crd =ran_qual_pl.random()
    }

    //This function is used to print the cards
    fun printlist(){
        println(crd)
    }

    //Function to return quality of a card which is used while comparing two cards
    fun ret():Int{
        return qual_n
    }
}

//3.3.1
fun main(){
    val songArtists = mutableMapOf(
        "Switch" to "Fabvl",
        "Evolution" to "Fabvl",
        "The King (King Arthur)" to "Rustage",
        "Gojira Glow" to "Nerdout",
        "This is the Kingdom" to "Skillet",
        "Cold Blooded" to "Zayde Wolfe"
    );

    songArtists["I Feel Good"] = "Fred Hammond"
    songArtists["Switch"] = "Daddyphatsnaps"
    songArtists.remove("Gojira Glow")
    println(songArtists)

    //3.3.2
    val vidjaGames = mutableListOf(
        "Super Mario Bros.",
        "Sonic the Hedgehog",
        "The Legend of Zelda",
        "Fire Emblem",
        "God of War",
        "Splatoon",
        "Persona",
        "Pikmin",
        "Pokemon"
    )
    vidjaGames.add("Mario Kart")
    vidjaGames.remove("Splatoon")
    vidjaGames[7] = "Super Smash Bros"
    println(vidjaGames)
}
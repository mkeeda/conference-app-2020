package io.github.droidkaigi.confsched2020.model

data class Kojima(
    val name: String,
    val isTechLead: Boolean = false,
    var friend: Matsumoto? = null
)

data class Matsumoto(
    val name: String,
    val isMSOL: Boolean = true,
    var friend: Kojima? = null
)

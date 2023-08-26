package com.tomik.roflohltv

data class ValorantPlayer(
    val id: Long,
    val name: String,
    val kills: Int,
    val deaths: Int,
    val acs: Int, //raiting
    val adr: Int,
    val kast: Int,
    val hs: Int,
    val assists: Int,
    val fk: Int,
    val fd: Int,
    val team: String,
    val playerId: Int
)
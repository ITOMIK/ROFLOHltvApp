package com.tomik.roflohltv.models

data class ValorantStatOfPlayer(
    val id: Long,
    val name: String,
    val kills: Int,
    val deaths: Int,
    val acs: Int, // rating
    val adr: Int,
    val kast: Int,
    val hs: Int,
    val assists: Int,
    val fk: Int,
    val fd: Int,
    val curentTeamId: Int,
    val playerId: Int
)

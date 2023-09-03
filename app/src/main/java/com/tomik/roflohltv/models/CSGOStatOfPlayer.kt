package com.tomik.roflohltv.models

data class CSGOStatOfPlayer(
    val id: Long,
    val name: String,
    val kills: Int,
    val deaths: Int,
    val raiting: Int, // rating
    val adr: Int,
    val kast: Int,
    val hs: Int,
    val assists: Int,
    val fk: Int,
    val fd: Int,
    val curentTeamId: Int,
    val maps: Int,
    val rounds: Int,
    val playerId: Int
)

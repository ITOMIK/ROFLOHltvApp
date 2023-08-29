package com.tomik.roflohltv.models

data class FortnitePlayer(
    val id: Long,
    val name: String,
    val pr: Int,
    val matches: Int,
    val events: Int,
    val avgPlace: Double,
    val playerId: Int
)

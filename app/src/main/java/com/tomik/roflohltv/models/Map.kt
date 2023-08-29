package com.tomik.roflohltv.models

data class Map(
    val id: Long,
    val name: String,
    val score: String,
    val winnerId: Int,
    val loserId: Int
)

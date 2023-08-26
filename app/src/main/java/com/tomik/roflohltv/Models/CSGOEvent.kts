package com.tomik.roflohltv

data class CSGOEvent(
    val id: Long,
    val name: String,
    val type: String,
    val maps: List<Map>,
    val winner: Team,
    val looser: Team,
    val score: String,
)
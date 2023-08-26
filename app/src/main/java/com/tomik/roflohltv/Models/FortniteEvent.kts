package com.tomik.roflohltv

data class FortniteEvent(
    val id: Long,
    val name: String,
    val logo: String,
    val place: Int,
    val pr: Int,
    val date: String,
    val points: Int,
    val kills: Int,
    val wins: Int,
    val matches: Int,
    val members: List<Int>
)
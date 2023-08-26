package com.tomik.roflohltv

data class Player(
    val id: Long,
    val name: String,
    val avatar: String,
    val country: String,
    val realName: String,
    val csgoProfile: CSGOPlayer,
    val valorantProfile: ValorantPlayer,
    val FortniteProfile: FortnitePlayer,
    val steamLink: String,
    val fortTLink: String,
    val valTLink: String,
    val mvps: List<Mvp>
)
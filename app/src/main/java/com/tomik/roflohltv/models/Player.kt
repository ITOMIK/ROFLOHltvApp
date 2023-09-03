package com.tomik.roflohltv.models

data class Player(
    val id: Long,
    val name: String,
    val avatar: String,
    val country: String,
    val realName: String,
    val csgoProfile: CSGOStatOfPlayer,
    val valorantProfile: ValorantStatOfPlayer,
    val fortniteProfile: FortniteStatOfPlayer,
    val steamLink: String,
    val fortTLink: String,
    val valTLink: String,
    val mvps: List<Mvp>
)

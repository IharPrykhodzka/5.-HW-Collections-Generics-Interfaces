package com.example.a5hwcollectionsgenericsinterfaces.model

data class EventPost(
    val id: Int,
    val icon: Int,
    val dateForPost: String,
    val author: String,
    val content: String,
    val locationLink: String,
    var likedByMe: Boolean = false,
    var registeredLikes: Int = 0,
    var commentedByMe: Boolean = false,
    var registeredComments: Int = 0,
    var sharedByMe: Boolean = false,
    var registeredShares: Int = 0
) : ItemList {
}
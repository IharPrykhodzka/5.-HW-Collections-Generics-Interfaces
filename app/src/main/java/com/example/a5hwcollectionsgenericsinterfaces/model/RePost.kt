package com.example.a5hwcollectionsgenericsinterfaces.model

data class RePost(
    val id: Int,
    val icon: Int,
    val dateForPost: String,
    val author: String,
    val rePostId: Int,
    val rePostIcon: Int,
    val rePostDateForPost: String,
    val rePostAuthor: String,
    val rePostText: String,
    var likedByMe: Boolean = false,
    var registeredLikes: Int = 0,
    var commentedByMe: Boolean = false,
    var registeredComments: Int = 0,
    var sharedByMe: Boolean = false,
    var registeredShares: Int = 0
) : ItemList {
}
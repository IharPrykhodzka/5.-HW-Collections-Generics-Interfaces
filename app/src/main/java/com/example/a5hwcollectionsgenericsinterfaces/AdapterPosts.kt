package com.example.a5hwcollectionsgenericsinterfaces

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.IllegalArgumentException

class AdapterPosts : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class StandardPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icon: ImageView = itemView.findViewById(R.id.icon)
        var data: TextView = itemView.findViewById(R.id.date)
        var author: TextView = itemView.findViewById(R.id.author)
        var text: TextView = itemView.findViewById(R.id.text)
        var textForLikes: TextView = itemView.findViewById(R.id.forBtnLike)
        var textForComments: TextView = itemView.findViewById(R.id.forBtnComment)
        var textForShares: TextView = itemView.findViewById(R.id.forBtnShare)
        var btnLikes: Button = itemView.findViewById(R.id.btnLike)
        var btnComments: Button = itemView.findViewById(R.id.btnComment)
        var btnShares: Button = itemView.findViewById(R.id.btnShare)

    }

    class EventPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val icon: ImageView = itemView.findViewById(R.id.iconEventPost)
        var data: TextView = itemView.findViewById(R.id.dateEventPost)
        var author: TextView = itemView.findViewById(R.id.authorEventPost)
        var text: TextView = itemView.findViewById(R.id.textEventPost)
        var textForLikes: TextView = itemView.findViewById(R.id.forBtnLikeEventPost)
        var textForComments: TextView = itemView.findViewById(R.id.forBtnCommentEventPost)
        var textForShares: TextView = itemView.findViewById(R.id.forBtnShareEventPost)
        var btnLikes: Button = itemView.findViewById(R.id.btnLikeEventPost)
        var btnComments: Button = itemView.findViewById(R.id.btnCommentEventPost)
        var btnShares: Button = itemView.findViewById(R.id.btnShareEventPost)
        var textAddress: TextView = itemView.findViewById(R.id.theAddressEventPost)
        var btnLocation: Button = itemView.findViewById(R.id.btnMapEventPost)
    }

    class PromotionPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.iconPromoPost)

    }

    class RePostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.iconRePost)
    }

    class VideoPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.iconPostWithVideo)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            Types.STANDARD_TYPE.number -> StandardPostUI(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_standard_post, parent, false)
            )
            Types.EVENT_TYPE.number -> EventPostUI(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_event_post, parent, false)
            )
            Types.PROMOTION_TYPE.number -> PromotionPostUI(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_promotion_post, parent, false)
            )
            Types.RE_POST_TYPE.number -> RePostUI(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_repost, parent, false)
            )
            Types.POST_WITH_VIDEO_TYPE.number -> VideoPostUI(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_post_with_video, parent, false)
            )
            else -> throw IllegalArgumentException()
        }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder.itemViewType) {
            Types.STANDARD_TYPE.number -> onBindStandard(holder, position)
        }

    private fun onBindStandard(holder: RecyclerView.ViewHolder, position: Int) {
        val standPost = holder as StandardPostUI

        standPost.icon.setBackgroundResource(R.drawable.ic_baseline_fingerprint_24)
    }




    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
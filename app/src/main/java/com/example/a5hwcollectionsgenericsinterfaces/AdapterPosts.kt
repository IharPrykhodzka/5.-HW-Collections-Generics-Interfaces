package com.example.a5hwcollectionsgenericsinterfaces

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a5hwcollectionsgenericsinterfaces.model.*
import java.lang.IllegalArgumentException

class AdapterPosts(private val items: List<ItemList>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class StandardPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icon: ImageView = itemView.findViewById(R.id.icon)
        var date: TextView = itemView.findViewById(R.id.date)
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

        var icon: ImageView = itemView.findViewById(R.id.iconEventPost)
        var date: TextView = itemView.findViewById(R.id.dateEventPost)
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
        var icon: ImageView = itemView.findViewById(R.id.iconPromoPost)
        var date: TextView = itemView.findViewById(R.id.datePromoPost)
        var author: TextView = itemView.findViewById(R.id.authorPromoPost)
        var text: TextView = itemView.findViewById(R.id.textPromoPost)
        var textForLikes: TextView = itemView.findViewById(R.id.forBtnLikePromoPost)
        var textForComments: TextView = itemView.findViewById(R.id.forBtnCommentPromoPost)
        var textForShares: TextView = itemView.findViewById(R.id.forBtnSharePromoPost)
        var btnLikes: Button = itemView.findViewById(R.id.btnLikePromoPost)
        var btnComments: Button = itemView.findViewById(R.id.btnCommentPromoPost)
        var btnShares: Button = itemView.findViewById(R.id.btnSharePromoPost)
        var imageBtnLinks: ImageButton = itemView.findViewById(R.id.linkPromoPost)

    }

    class RePostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.iconRePostUser)
        var date: TextView = itemView.findViewById(R.id.dateRePostUser)
        var author: TextView = itemView.findViewById(R.id.authorRePostUser)
        var textForLikes: TextView = itemView.findViewById(R.id.forBtnLikeRePostUser)
        var textForComments: TextView = itemView.findViewById(R.id.forBtnCommentRePostUser)
        var textForShares: TextView = itemView.findViewById(R.id.forBtnShareRePostUser)
        var btnLikes: Button = itemView.findViewById(R.id.btnLikeRePostUser)
        var btnComments: Button = itemView.findViewById(R.id.btnCommentRePostUser)
        var btnShares: Button = itemView.findViewById(R.id.btnShareRePostUser)

        val iconRePost: ImageView = itemView.findViewById(R.id.iconRePost)
        var dateRePost: TextView = itemView.findViewById(R.id.dateRePost)
        var authorRePost: TextView = itemView.findViewById(R.id.authorRePost)
        var textRePost: TextView = itemView.findViewById(R.id.textRePost)
        var imageBtnLinksRePost: ImageButton = itemView.findViewById(R.id.linkRePost)
    }

    class VideoPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon: ImageView = itemView.findViewById(R.id.iconPostWithVideo)
        var date: TextView = itemView.findViewById(R.id.datePostWithVideo)
        var author: TextView = itemView.findViewById(R.id.authorPostWithVideo)
        var text: TextView = itemView.findViewById(R.id.textPostWithVideo)
        var textForLikes: TextView = itemView.findViewById(R.id.forBtnLikePostWithVideo)
        var textForComments: TextView = itemView.findViewById(R.id.forBtnCommentPostWithVideo)
        var textForShares: TextView = itemView.findViewById(R.id.forBtnSharePostWithVideo)
        var btnLikes: Button = itemView.findViewById(R.id.btnLikePostWithVideo)
        var btnComments: Button = itemView.findViewById(R.id.btnCommentPostWithVideo)
        var btnShares: Button = itemView.findViewById(R.id.btnSharePostWithVideo)
        var imageBtnLinks: ImageButton = itemView.findViewById(R.id.videoLinkPostWithVideo)
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
            Types.PROMOTION_TYPE.number -> onBindPromo(holder, position)
            Types.EVENT_TYPE.number -> onBindEvent(holder, position)
            Types.POST_WITH_VIDEO_TYPE.number -> onBindVideo(holder, position)
            Types.RE_POST_TYPE.number -> onBindRePost(holder, position)
            else -> throw IllegalArgumentException()
        }


    private fun onBindStandard(holder: RecyclerView.ViewHolder, position: Int) {
        val standPost = holder as StandardPostUI

        val post = items[position]

        standPost.icon.setBackgroundResource(R.drawable.ic_baseline_fingerprint_24)
        standPost.date.text = "20.10.2020"
        standPost.author.text = "Приходько Игорь"
        standPost.text = post.
    }


    private fun onBindEvent(holder: RecyclerView.ViewHolder, position: Int) {
        val eventPost = holder as EventPostUI

        eventPost.icon.setBackgroundResource(R.drawable.ic_baseline_fingerprint_24)
        eventPost.date.text = "20.10.2020"
        eventPost.author.text = "Приходько Игорь"
    }


    private fun onBindPromo(holder: RecyclerView.ViewHolder, position: Int) {
        val promoPost = holder as PromotionPostUI

        promoPost.icon.setBackgroundResource(R.drawable.ic_baseline_fingerprint_24)
        promoPost.date.text = "20.10.2020"
        promoPost.author.text = "Приходько Игорь"
    }


    private fun onBindVideo(holder: RecyclerView.ViewHolder, position: Int) {
        val vidioPost = holder as VideoPostUI

        vidioPost.icon.setBackgroundResource(R.drawable.ic_baseline_fingerprint_24)
        vidioPost.date.text = "20.10.2020"
        vidioPost.author.text = "Приходько Игорь"
    }


    private fun onBindRePost(holder: RecyclerView.ViewHolder, position: Int) {
        val rePostPost = holder as RePostUI

        rePostPost.icon.setBackgroundResource(R.drawable.ic_baseline_fingerprint_24)
        rePostPost.date.text = "20.10.2020"
        rePostPost.author.text = "Приходько Игорь"
    }

    override fun getItemViewType(position: Int): Int =
        when(items[position]) {
            is StandardPost -> Types.STANDARD_TYPE.number
            is EventPost -> Types.EVENT_TYPE.number
            is RePost -> Types.RE_POST_TYPE.number
            is VideoPost -> Types.POST_WITH_VIDEO_TYPE.number
            is PromotionPost -> Types.PROMOTION_TYPE.number
            else -> throw IllegalArgumentException()
        }



    override fun getItemCount(): Int =
        items.count()
}
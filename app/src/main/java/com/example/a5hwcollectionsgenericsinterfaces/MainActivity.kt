package com.example.a5hwcollectionsgenericsinterfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a5hwcollectionsgenericsinterfaces.model.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvItemPost.adapter = AdapterPosts(getSimpleListData())
        rvItemPost.layoutManager = LinearLayoutManager(this)
    }

    private fun getSimpleListData(): List<ItemList> {
        val list = mutableListOf<ItemList>()

        list.add(
            StandardPost(
                1,
                R.drawable.ic_baseline_fingerprint_24,
                "20.10.2020",
                "Игорь Приходько",
                "Вы решили написать функцию, которая из количества секунд генерирует человекопонятное представление времени публикации.",
                false,
                0,
                true,
                11,
                true,
                2
            )
        )
        list.add(
            EventPost(
                2,
                R.drawable.ic_baseline_fingerprint_24,
                "19.10.2020",
                "Игорь Приходько",
                "Вы решили написать функцию, которая из количества секунд генерирует человекопонятное представление времени публикации.",
                "geo:55.754283,37.62002?z=15",
                false,
                0,
                true,
                11,
                true,
                2
            )
        )
        list.add(
            VideoPost(
                3,
                R.drawable.ic_baseline_fingerprint_24,
                "18.10.2020",
                "Игорь Приходько",
                "Вы решили написать функцию, которая из количества секунд генерирует человекопонятное представление времени публикации.",
                "https://youtu.be/HyHNuVaZJ-k",
                false,
                0,
                true,
                11,
                true,
                2
            )
        )
        list.add(
            PromotionPost(
                4,
                R.drawable.ic_baseline_fingerprint_24,
                "17.10.2020",
                "Игорь Приходько",
                "Вы решили написать функцию, которая из количества секунд генерирует человекопонятное представление времени публикации.",
                "https://youtu.be/HyHNuVaZJ-k",
                false,
                0,
                true,
                11,
                true,
                2
            )
        )
        list.add(
            RePost(
                5,
                R.drawable.ic_baseline_fingerprint_24,
                "16.10.2020",
                "Игорь Приходько",
                1,
                R.drawable.ic_baseline_fingerprint_24,
                "20.10.2020",
                "Игорь Приходько",
                "Вы решили написать функцию, которая из количества секунд генерирует человекопонятное представление времени публикации.",
                false,
                0,
                true,
                11,
                true,
                2
            )
        )
        return list
    }

}
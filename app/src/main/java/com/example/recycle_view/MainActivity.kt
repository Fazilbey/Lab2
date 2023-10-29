package com.example.recycle_view

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecycleview : RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageId = arrayOf(
            R.drawable.g,
            R.drawable.f,
            R.drawable.c,
            R.drawable.a,
            R.drawable.e,
            R.drawable.b,
            R.drawable.x,
            R.drawable.z,
            R.drawable.usyk,
            R.drawable.d,
            R.drawable.d,


        )

        heading = arrayOf(
            "Стрельбу открыли на праздновании Хэллоуина в США (видео)",
            "Окжетпес вылетает: итоги последнего тура чемпионата Казахстана по футболу ",
            "Взрыв был такой силы, что летали вагонетки: очевидцы о трагедии на шахте им. Костенко ",
            "Токаев обсудил с Эрдоганом по телефону инцидент на шахте в Караганде ",
            "Должны понести серьезное наказание: экс-премьер Серик Ахметов высказался о трагедии на шахте",
            "Матч Барыса в КХЛ начался с минуты молчания в память о погибших шахтерах ",
            "Часть Астаны осталась без электричества и воды (фото, видео)",
            "Определился первый финалист The International 2023",
            "Фьюри провел дуэль взглядов с Усиком после победы над Нганну (видео)",
            "Должны понести серьезное наказание: экс-премьер Серик Ахметов высказался о трагедии на шахте",
            "Должны понести серьезное наказание: экс-премьер Серик Ахметов высказался о трагедии на шахте"
        )

        newRecycleview = findViewById(R.id.recycleview)
        newRecycleview.layoutManager = LinearLayoutManager(this)
        newRecycleview.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for (i in imageId.indices){
            val news = News(imageId[i], heading[i])
            newArrayList.add(news)
        }

        newRecycleview.adapter = MyAdapter(newArrayList)
    }
}
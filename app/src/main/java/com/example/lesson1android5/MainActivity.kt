package com.example.lesson1android5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson1android5.Presenter.Presenter
import com.example.lesson1android5.View.View
import com.example.lesson1android5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() , View {
    var presenter= Presenter()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClick()
        presenter.attachView(this)
    }
    private fun initClick(){
        with(binding){
            btnPlus.setOnClickListener{
                presenter.increment()
            }
        }
    }

    override fun updateCount(int: Int) {
     binding.tvResult.text = int.toString()
    }

    override fun showToastCount() {
        this.showToast("Поздравляю")
    }

    override fun setColorCount() {
       binding.tvResult.setTextColor(getColor(R.color.purple_200))
    }
}

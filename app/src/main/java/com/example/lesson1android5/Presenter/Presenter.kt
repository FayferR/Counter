package com.example.lesson1android5.Presenter


import com.example.lesson1android5.Model.Model
import com.example.lesson1android5.View.View

class Presenter {
    private val model = Model()
    lateinit var view: View


    fun increment(){
        model.increment()
        view.updateCount(model.count)
        when{
            model.condition() == 10-> {
                view.showToastCount()
            }
            model.condition() == 15-> {
                view.setColorCount()
            }

        }
    }
    fun attachView(view: View){
        this.view = view
    }

}
package com.otetcode.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import com.otetcode.databinding.databinding.ActivityMainBinding
import com.otetcode.databinding.viewmodel.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityBinding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = User("Bima", "Agung")
        activityBinding.setVariable(BR.usermodel, user)
        activityBinding.executePendingBindings()

    }
}

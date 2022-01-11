package com.android.fairlyandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivityProfile2Binding

class ProfileActivity2 : BaseActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityProfile2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile2)
        mBinding.btnNext.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnNext -> {
                // do some work here
                intent = Intent(this, ProfileActivity3::class.java)
                startActivity(intent)
            }
        }
    }
}
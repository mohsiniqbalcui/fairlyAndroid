package com.android.fairlyandroid

import android.content.Intent
import android.net.wifi.hotspot2.pps.HomeSp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivityProfile2Binding
import com.android.fairlyandroid.databinding.ActivityProfile3Binding
import kotlinx.android.synthetic.main.invited_item.*


class ProfileActivity3 : BaseActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityProfile3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile3)
        mBinding.btnNext.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnNext -> {

                // do some work here
                intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
            }
        }
    }
}
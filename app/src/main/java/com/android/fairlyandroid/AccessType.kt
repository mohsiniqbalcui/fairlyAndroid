package com.android.fairlyandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivityAccessTypeBinding

class AccessType : BaseActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityAccessTypeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_access_type)

        mBinding.btnlogin.setOnClickListener(this)
        mBinding.btnsignup.setOnClickListener(this)


//        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_access_type)
        // setContentView(R.layout.activity_access_type)
//        changeColor(R.color.white)


    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnlogin -> {
                // do some work here
                intent = Intent(this, Loginscreen::class.java)
                startActivity(intent)
            }
            R.id.btnsignup -> {
                // do some work here
                intent = Intent(this, SignUp::class.java)
                startActivity(intent)
            }
        }
    }
}

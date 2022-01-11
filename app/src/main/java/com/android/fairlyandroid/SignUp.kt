package com.android.fairlyandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivitySignUpBinding

class SignUp : BaseActivity(), View.OnClickListener {
    private lateinit var mBinding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up)
        mBinding.btnForgetpassword.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnForgetpassword -> {

                // do some work here
                intent = Intent(this, ProfileActivity1::class.java)
                startActivity(intent)
                Toast.makeText(this, "sign Up screen", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
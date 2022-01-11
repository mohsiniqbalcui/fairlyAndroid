package com.android.fairlyandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivityForgetpasswordBinding
import com.android.fairlyandroid.databinding.ActivityLoginscreenBinding

class Loginscreen : BaseActivity(), View.OnClickListener {
    private lateinit var mBinding: ActivityLoginscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_loginscreen)
        mBinding.btnLogin.setOnClickListener(this);
        mBinding.tvForgetPassword.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnLogin -> {
                // do some work here
                intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
            }
            R.id.tv_forgetPassword -> {
                // do some work here
                intent = Intent(this, forgetpassword::class.java)
                startActivity(intent)
            }
        }
    }
}
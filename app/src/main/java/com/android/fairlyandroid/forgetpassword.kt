package com.android.fairlyandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivityForgetpasswordBinding
import com.android.fairlyandroid.databinding.ActivityLoginscreenBinding

class forgetpassword : BaseActivity() , View.OnClickListener {

    private lateinit var mBinding: ActivityForgetpasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_forgetpassword)
        mBinding.btnForgetpassword.setOnClickListener(this);
        mBinding.btnBack.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnForgetpassword -> {
                // do some work here
                intent = Intent(this, ChangePassword::class.java)
                startActivity(intent)
            }
            R.id.btnBack -> {
                // do some work here
                onBackPressed()
            }
        }
    }
}
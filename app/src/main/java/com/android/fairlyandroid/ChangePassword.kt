package com.android.fairlyandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivityChangePasswordBinding
import com.android.fairlyandroid.databinding.ActivityLoginscreenBinding

class ChangePassword : BaseActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_change_password)
        mBinding.btnchangePassword.setOnClickListener(this);
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnchangePassword -> {
                // do some work here
                intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
            }
        }
    }
}
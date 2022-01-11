package com.android.fairlyandroid

import android.Manifest
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.app.Activity
import android.app.DatePickerDialog
import android.app.ProgressDialog
import android.content.*
import android.content.pm.PackageManager
import android.graphics.Typeface
import android.net.ConnectivityManager
import android.net.Uri
import android.os.*
import android.text.Spanned
import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.webkit.URLUtil
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.android.fairlyandroid.helper.AppProgressDialog
import com.jeevandeshmukh.glidetoastlib.GlideToast
import java.util.*
import kotlin.collections.ArrayList

open class BaseActivity : AppCompatActivity() {
/*
    override fun onStart() {
        super.onStart()
        if (cacheFile == null) {
            cacheFile = CacheDataSourceFactory(
                this@BaseActivity,
                1000 * 1024 * 1024,
                1024 * 1024 * 1024
            )
        }
        if (arvConfig == null) {
            arvConfig =
                Config.Builder().cache(ExoPlayerUtils.getCache(this@BaseActivity)).build()
        }
    }
*/

//    public var sharedSocket = IOSocketManager()
//
//    private val bullet = "&#8226"
//
//    var jp: JProgressDialog? = null
//
//    var processing: Boolean = false
//
//    lateinit var dataClass: ModelAuthData
//
//    lateinit var sp: SharedPreference
//    fun getCommand(
//        path: String,
//        label: String,
//        positionX: String,
//        positionY: String,
//        file:File
//    ): Array<String> {
//
////        val typedText = ""
////        val positionX = "(w-text_w)/2"
////        val positionY = "(h-text_h)/2"
//
////        fontfile=${Environment.getExternalStorageDirectory()}/font.ttf:text
//        val textFilterCommand = arrayOf(
//            "-i",
//            "${path}",
//            "-vf",
////            "drawtext=fontsize=64:fontcolor=white@0.9:box=1:boxcolor=black@0.75:boxborderw=16:fontfile=OCRA.ttf:text='$label':x=$positionX:y=$positionY",
////            "@ffplay -loop 0 -i \"%1\" -vf drawtext='fontsize=64:fontcolor=white@0.8:box=1:boxcolor=black@0.75:boxborderw=16:fontfile=OCRA.ttf:text='my_video':x=(w-tw)/2:y=th'\n"
////            "drawtext=text='@${label}':x=$positionX:y=$positionY",
////            "drawtext=fontsize=20:=text='$label':x=10:y=100",
//            "drawtext=fontcolor=white@0.9:box=1:boxcolor=black@0.50:boxborderw=16:fontfile=${Environment.getExternalStorageDirectory()}/font.ttf:text='$label':x=$positionX:y=$positionY:fontsize=20",
////        "drawtext=text='${label}':x=10:y=10:fontsize=14:fontcolor=white",
//            "-c:a",
//            "copy",
//            "${file.absolutePath}"
//        )
//        return textFilterCommand
//    }
//
//    companion object {
//
//        @Volatile
//        private var INSTANCE: BaseActivity? = null
//
//        fun getInstance(context: Context): BaseActivity {
//            if (INSTANCE == null) {
//                INSTANCE = BaseActivity()
//            }
//            return INSTANCE as BaseActivity
//        }
//
//
////        fun showAlert(activity: Activity){
////            Alerter.create(activity)
////                .setTitle("From Base")
////                .setText("Base Text")
////                .show()
////        }
//
//    }


//    fun showAlert() {
//
//        Log.i("JuniBaseActivity", "ckjdsnilcns")
//        Alerter.create(INSTANCE)
//            .setTitle("From Base")
//            .setText("Base Text")
//            .show()
//
//    }

    private lateinit var pd: ProgressDialog

//    fun loadMediaSliderView(
//        mediaUrlList: ArrayList<MediaSliderActivity.MediaModel>,
//        startPosition: Int,
//        title: String = "Gallery",
//        isTitleVisible: Boolean = false,
//        isMediaCountVisible: Boolean = false,
//        isNavigationVisible: Boolean = true,
//        titleBackgroundColor: String? = "",
//        titleTextColor: String = "",
//        HIDE_DOTS: Boolean = false
//    ) {
//        val intent = Intent(this@BaseActivity, MediaSliderActivity::class.java)
//        intent.putExtra("MEDIA_LIST", mediaUrlList)
//        intent.putExtra("TITLE_VISIBLE", isTitleVisible)
//        intent.putExtra("MEDIA_COUNT_VISIBLE", isMediaCountVisible)
//        intent.putExtra("NAVIGATION_VISIBLE", isNavigationVisible)
//        intent.putExtra("TITLE", title)
//        intent.putExtra("TITLE_BG", titleBackgroundColor)
//        intent.putExtra("TITLE_CLR", titleTextColor)
//        intent.putExtra("POSITION", startPosition)
//        intent.putExtra("HIDE_DOTS", HIDE_DOTS)
//
//        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
//        startActivity(intent)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

//        MobileAds.initialize(this) {}
//
//        Places.initialize(this, Utils.KEY_GOOGLE)
//
//        pd = ProgressDialog(this)
//
//        sp = SharedPreference(this, Utils.USER_CREDENTIALS)
//        jp = JProgressDialog.getInstance("")
//
//        if (sp.containKey(Utils.USER_DATA_CLASS)) {
//            dataClass = Gson().fromJson<ModelAuthData>(
//                sp.getStringValue(Utils.USER_DATA_CLASS).toString(),
//                ModelAuthData::class.java
//            )
//        }


//        stripeTest()
//
//        registerReceiver(broadcastReceiver, IntentFilter("INTERNET_LOST"));

//        initWakeLook()

//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

//    fun oneTimeShow(i: Int) {
//        val sp = SharedPreference(this@BaseActivity, "OneTimeShowed")
//        sp.saveIntValue("OneTimeShowed", i)
//    }
//
//    fun getOneTimeShow(): Int {
//        val sp = SharedPreference(this@BaseActivity, "OneTimeShowed")
//        if (sp.containKey("OneTimeShowed")) {
//            return sp.getIntValue("OneTimeShowed")
//        }
//        return 0
//    }
//
//    var broadcastReceiver: BroadcastReceiver = object : BroadcastReceiver() {
//        override fun onReceive(
//            context: Context?,
//            intent: Intent?
//        ) {
//
//
//            val item = intent?.getSerializableExtra("data") as ModelNotifcation
//
//            var alerter = Alerter.create(this@BaseActivity)
//                .setIcon(R.drawable.ic_main)
//                .showIcon(true)
//                .setIconColorFilter(0)
//                .setTitle("A2I")
//                .setBackgroundColorRes(R.color.bright_green)
//                .setText(item.senderName + " " + item.notificationText)
//                .setOnClickListener(View.OnClickListener {
////                        Toast.makeText(this@BaseActivity, "OnClick Called", Toast.LENGTH_LONG).show();
//                })
////                .addButton("Okay", R.style.AlertButton, View.OnClickListener {
//////                        Toast.makeText(this@BaseActivity, "Okay Clicked", Toast.LENGTH_LONG).show()
////                })
//                .setOnShowListener(object : OnShowAlertListener {
//
//                    override fun onShow() {
////                        oneTimeShow(item.id)
//
//                    }
//                })
//            //.show()
//
//            if (getOneTimeShow() != item.id) {
////                Log.i("jShowing","Show here ${getOneTimeShow()} :  ${item.id}")
//                alerter.show()
////                oneTimeShow(item.id)
//            }
//
//
////            Log.i("jCalled","Called On Each ${getOneTimeShow()}")
////
////            if(getOneTimeShow()==0 || getOneTimeShow()!=item.id){
////
////
////            }
////
////            oneTimeShow(item.id)
//
//        }
//    }

//    override fun onDestroy() {
//        super.onDestroy()
//        unregisterReceiver(broadcastReceiver);
//    }

    var wakeLock: PowerManager.WakeLock? = null

    @SuppressLint("InvalidWakeLockTag")
    private fun initWakeLook() {
        val powerManager: PowerManager =
            getSystemService(Context.POWER_SERVICE) as PowerManager
        wakeLock = powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "My Lock")

        // on Resume
//        wakeLock?.acquire()

        //on Pause
//        wakeLock?.release()
    }

//    fun initiWakeLock1(){
//        var mWakeLock =
//            (getSystemService(Context.POWER_SERVICE) as PowerManager)
//                .newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK, javaClass.name)
//        mWakeLock.acquire()
//// screen stays on in this section
//// screen stays on in this section
//        mWakeLock.release()
//    }

//    fun showJProgress(
//        message: String = "Please Wait...",
//        fragmentManager: FragmentManager = supportFragmentManager
//    ) {
//
//        jp = JProgressDialog.getInstance(message)
//        jp?.show(fragmentManager, "")
//
//    }
//
//    fun sendNotifications(my_id: Int, on_user_id: Int) {
//
//        if (on_user_id != my_id) {
//
//            try {
//                sharedSocket = IOSocketManager()
//
//                var obj = JSONObject()
//                obj.put("user_id", my_id)
//                obj.put("on_user", on_user_id)
//                sharedSocket?.send(Sockets.get_notification, obj)
//
//                Log.i("get_notification", "sent")
//
//            } catch (e: java.lang.Exception) {
//                e.printStackTrace()
//                Log.i("get_notification", e.printStackTrace().toString())
//            }
//
//        }
//
//    }
//
//    fun onFailed(t: Throwable) {
//
//
//        if (t is IOException) {
////            showErrorToast(
////                this,
////                "Network failure."
////            )
//
//        } else {
////            showErrorToast(this, "Conversion Problem")
//            // todo log to some central bug tracking service
//        }
//
//    }

    //    fun String.capitalized(): String {
//        return this.substring(0, 1).toUpperCase(Locale.getDefault()) + this.substring(1)
//    }
//
//
//    fun showSuccessDialog(message: String, head: String = "") {
//
//
//        val jSuccessPopup = JSuccessPopup.getInstance("", "Password Updated!!!", "", "")
//        jSuccessPopup.isCancelable = false
//        jSuccessPopup.setListener(object : JSuccessPopup.ItemClickListener {
//            override fun actionOK() {
//                jSuccessPopup.dismiss()
//            }
//        })
//
//        jSuccessPopup.show(supportFragmentManager, "")
//
//    }
//
//    fun optionDialog() {
//        val alert =
//            AlertView("Logout?", "Are you sure you want to logout?", AlertStyle.DIALOG)
//        alert.addAction(AlertAction("Yes", AlertActionStyle.NEGATIVE) {
//
//        })
//        alert.addAction(AlertAction("No", AlertActionStyle.DEFAULT) {
//        })
//        alert.show(this)
//    }
//
//    fun onErrorResponse(call: Any?, response: Any, responseType: String) {
//
//        try {
//            val jObjError =
//                JSONObject((response as Response<*>).errorBody()!!.string())
//            showErrorToast(this, jObjError.get("message").toString())
//
//        } catch (e: Exception) {
//            showErrorToast(this, e.message!!)
//        }
//
//    }
//
//    fun stripeTest() {
//        PaymentConfiguration.init(
//            applicationContext,
//            NetworkURLs.stripe_publishKey
//        )
//
//        Log.i("stripetest", "ok")
//
//    }
//
    open fun isNetworkConnected(): Boolean {
        val cm = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null && cm.activeNetworkInfo!!.isConnected
    }

//    fun showFalseResponseSimpleToast(errorBody: String) {
//
//        try {
//            val jObjError = JSONObject(errorBody)
//            showErrorToast(this, jObjError.get("message").toString())
//
//        } catch (e: Exception) {
//            showErrorToast(this, e.message!!)
//        }
//
//    }

    fun hideKeyboardFrom(view: View) {
        val imm = this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    open fun hideKeyboard() {
        val imm: InputMethodManager =
            getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view: View? = currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(this)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun <T> List<T>.toArrayList(): ArrayList<T> {
        return ArrayList(this)
    }

    public fun hideStatusBar() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
    }

    fun MyToast(message: String, length: Int = 0) {

        Toast.makeText(this, message, length).show()

    }

    fun openNewActivity(javaClass: Any, bundle: Bundle = Bundle()) {

        var intent = Intent(this, javaClass as Class<*>)
        intent.putExtra("jbundle", bundle)
        startActivity(intent)

    }

    fun openFragment(fragment: Fragment?, containter: Int) {
        val transaction =
            supportFragmentManager.beginTransaction()
        transaction.replace(containter, fragment!!)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    @SuppressLint("ObjectAnimatorBinding")
    fun hoverEffect1(customView: Any) {
        var animatorSet = AnimatorSet();
        var fadeOut: ObjectAnimator = ObjectAnimator.ofFloat(customView, "alpha", 1.0f, 0.1f)
        fadeOut.duration = 100
        var fadeIn: ObjectAnimator = ObjectAnimator.ofFloat(customView, "alpha", 0.1f, 1.0f)
        fadeIn.duration = 100
        animatorSet.play(fadeIn).after(fadeOut)
        animatorSet.start()

    }

    @SuppressLint("ObjectAnimatorBinding")
    fun hoverEffect2(customView: Any) {

        var animatorSet = AnimatorSet()
        var fadeOut: ObjectAnimator = ObjectAnimator.ofFloat(customView, "alpha", 1.0f, 0.1f)
        fadeOut.duration = 100
        var fadeIn: ObjectAnimator = ObjectAnimator.ofFloat(customView, "alpha", 0.1f, 1.0f)
        fadeIn.duration = 100
        animatorSet.play(fadeOut)
        animatorSet.start()

    }

//    fun openActivity(javaClass: Any){
//        startActivity(Intent(this,javaClass as Class<*>));
//    }

    fun htmlText(text: String): Spanned {

        return HtmlCompat.fromHtml(text, HtmlCompat.FROM_HTML_MODE_COMPACT)
    }

    @SuppressLint("InlinedApi")
    fun changeColor(resourseColor: Int) {

        val window: Window = window

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(applicationContext, resourseColor)
        }

    }

    fun test() {

    }

    fun checkStoragePermissions(): Boolean {

        if (checkAllowance(Manifest.permission.WRITE_EXTERNAL_STORAGE) && checkAllowance(Manifest.permission.READ_EXTERNAL_STORAGE)) {
            ActivityCompat.requestPermissions(
                this, arrayOf(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
                ), Utils.READ_WRITE_EXTERNAL_STORAGE
            )
            return false
        } else return true

    }

    private fun checkAllowance(permission: String): Boolean {
        return ContextCompat.checkSelfPermission(
            this,
            permission
        ) != PackageManager.PERMISSION_GRANTED
    }

    fun openTermsAndConditions() {
        openLink("https://dev.codingpixel.com/a2i-phase2/terms&condition")
    }

    fun openLink(mUrl: String) {
        Log.e("Path", mUrl)
        var url = mUrl
        try {
            if (!url.startsWith("www.") && !url.startsWith("http://")) {
                url = "www.$url";
            }
            if (!url.startsWith("http://")) {
                url = "http://$url";
            }
            Log.e("Path", mUrl)
            if (!URLUtil.isValidUrl(url)) {
                Toast.makeText(this, " This is not a valid link", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)
            }
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(
                this,
                " You don't have any browser to open web page",
                Toast.LENGTH_LONG
            ).show()
        }
    }

//    open class PlayerVUtil {
//        companion object {
//            public var cacheFile: CacheDataSourceFactory? = null
//            public var arvConfig: Config? = null
//            public var isMuteVideo = true
//        }
//    }

//    fun showLoading(text: String = "Please wait...", cancelable: Boolean = false) {
//
//        runOnUiThread {
//
//            if (!pd.isAdded) {
//                try {
//                    if (!pd.isVisible && !pd.isAdded) {
//                        pd.show(supportFragmentManager, "pd")
//                    }
//                    Handler().postDelayed({
//                        pd.txtProgress.text = text
//                        pd.isCancelable = cancelable
//                    }, 200)
//                } catch (e: java.lang.Exception) {
//                    e.printStackTrace()
//                }
//            }
//        }
//    }
//
//    @SuppressLint("SetTextI18n")
//    fun updatedLoadingText(txtProgress: String) {
//        runOnUiThread {
//            try {
//                Handler().postDelayed({
//                    if (txtProgress.isNotEmpty()) {
//                        pd.txtProgress.text = txtProgress
//                    } else {
//                        pd.txtProgress.text = "Please wait..."
//                    }
//                }, 200)
//            } catch (e: IllegalStateException) {
//                e.printStackTrace()
//            }
//        }
//    }
//
//    fun hideLoading() {
//        runOnUiThread {
//            try {
//                if (pd.isAdded) pd.dismiss()
//            } catch (e: IllegalStateException) {
//                e.printStackTrace()
//            }
//        }
//    }

    open fun onClick(view: View?) {}

    //---------------------------


    var emptyDataContainer: ConstraintLayout? = null
    var emptyDataImage: ImageView? = null
    var emptyDataTitle: TextView? = null
    var emptyDataAddLabel: TextView? = null



    fun showLoading() {
        AppProgressDialog.showProgressDialog(this)
    }

    fun hideLoading() {
        AppProgressDialog.dismissProgressDialog()
    }

    fun changeStatusBarColor(statusBarColor: Int) {
        val window: Window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = statusBarColor
    }

    fun makeVibrate(){
        try {
            val v = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
// Vibrate for 500 milliseconds
// Vibrate for 500 milliseconds
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                v.vibrate(VibrationEffect.createOneShot(300, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                //deprecated in API 26
                v.vibrate(300)
            }
        }catch ( e: Exception){
        }catch ( e: Exception){
            e.printStackTrace()
        }
    }

    fun showLongToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }


    fun isEmail(text: EditText): Boolean {
        val email: CharSequence = text.text.toString()
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email)
            .matches()
    }

    fun showWarningToast(
        message: String
    ) {
        GlideToast.makeToast(
            this,
            message,
            GlideToast.LENGTHLONG,
            GlideToast.WARNINGTOAST,
            GlideToast.TOP
        ).show()
//        Handler().postDelayed(Runnable {
//
//        }, 5000)
//        GlideToast.makeToast(
//            this,
//            message,
//            GlideToast.LENGTHLONG,
//            GlideToast.WARNINGTOAST,
//            GlideToast.TOP
//        ).show()

    }

    fun isPasswordValid(password: EditText): Boolean {
        val pwd = password.text.toString()
        return pwd.length > 5
    }

    fun isPasswordMatch(confirmPassword: EditText, password: EditText): Boolean {
        return password.text.toString() == confirmPassword.text.toString()
    }

    fun isEmpty(text: EditText): Boolean {
        val str: CharSequence = text.text.toString().trim()
        return TextUtils.isEmpty(str)
    }

    fun showShortToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    fun showView(view: View) {
        view.visibility = View.VISIBLE
    }

    fun hideView(view: View) {
        view.visibility = View.GONE
    }

    fun invisibleView(view: View) {
        view.visibility = View.INVISIBLE
    }

    fun isViewVisiblle(view: View): Boolean {
        return view.isShown
    }

    fun setTextViewColor(tv: TextView, color: Int) {
        tv.setTextColor(color)
    }

    fun setTextViewTypeface(tv: TextView, typeface: Typeface?) {
        if (typeface != null)
            tv.typeface = typeface
    }


    fun showEmptyContainer() {
        emptyDataContainer?.visibility = View.VISIBLE
    }

    fun hideEmptyContainer() {
        emptyDataContainer?.visibility = View.GONE
    }



}
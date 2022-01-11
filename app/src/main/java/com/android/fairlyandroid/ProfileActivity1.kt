package com.android.fairlyandroid

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.android.fairlyandroid.databinding.ActivityProfile1Binding


class ProfileActivity1 : BaseActivity(), View.OnClickListener {
    private lateinit var mBinding: ActivityProfile1Binding
    var progreeesBar: Int = 0

    val dayName = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        '8',
        '9',
        "10",
        "11",
        "12",
        "13",
        "14",
        "15",
        "16",
        "17",
        "18",
        "19",
        "20",
        "21",
        "22",
        "23",
        "24",
        "25",
        "26",
        "27",
        "28",
        "29",
        "30",
        "31"
    )

    val monthName = arrayOf(
        "January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December"
    )

    val yearName = arrayOf(
        "2021",
        "2020",
        "2019",
        "2018",
        "2017",
        "2016",
        "2015",
        "2014",
        "2013",
        "2012",
        "2011",
        "2010",
        "2009",
        "2008",
        "2007",
        "2006",
        "2005",
        "2004",
        "2003",
        "2002",
        "2001",
        "2000",
        "1999",
        "1998",
        "1997",
        "1996",
        "1995",
        "1994",
        "1993",
        "1992",
        "1991",
        "1990",
        "1989",
        "1988",
        "1987",
        "1986",
        "1985",
        "1984",
        "1983",
        "1982",
        "1981",
        "1980",
        "1979",
        "1978",
        "1977",
        "1976",
        "1975",
        "1974",
        "1973",
        "1972",
        "1971",
        "1970"
    )
    var pressedTime = 1;

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile1)
        mBinding.btnNext.setOnClickListener(this)

        mBinding.tvDay.setOnClickListener(this)
        mBinding.tvMonth.setOnClickListener(this)
        mBinding.tvYears.setOnClickListener(this)

/*

        mBinding.tvDay.visibility =View.GONE
        mBinding.tvYears.visibility =View.GONE
        mBinding.tvMonth.visibility =View.GONE

        mBinding.dayspinner.visibility = View.GONE
        mBinding.monthspinner.visibility = View.GONE
        mBinding.yearspinner.visibility = View.GONE

*/

        profileFirstLayoutVisible();

        val monthAdapter = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout
            monthName // Array
        )

        val dayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            dayName
        )

        val yearAdapter = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout
            yearName // Array
        )

        monthAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        mBinding.monthspinner.adapter = monthAdapter;

        dayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        mBinding.dayspinner.adapter = dayAdapter;

        yearAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        mBinding.yearspinner.adapter = yearAdapter;

        mBinding.monthspinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                    // Display the selected item text on text view
                    mBinding.tvMonth.text = "${parent.getItemAtPosition(position)}"
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Another interface callback

                }
            }


        mBinding.dayspinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                    mBinding.tvDay.text = parent.getItemAtPosition(position).toString()
                    // Display the selected item text on text view
//                text_view.text = "Spinner selected : ${parent.getItemAtPosition(position).toString()}"
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Another interface callback
                }
            }

        mBinding.yearspinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                    mBinding.tvYears.text = parent.getItemAtPosition(position).toString()

                    // Display the selected item text on text view
//                text_view.text = "Spinner selected : ${parent.getItemAtPosition(position).toString()}"
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // Another interface callback

                }
            }
    }

    private fun profileFirstLayoutVisible() {

        mBinding.tvtitle2.text = getString(R.string.profile1_title)
        mBinding.tvTitleDetails.text = getString(R.string.profile1_details)

        mBinding.groupProfileFirst.visibility = View.VISIBLE
        mBinding.groupProfileFirstSpinner.visibility = View.INVISIBLE
    }

    private fun profileFirstLayoutHide() {
        mBinding.groupProfileFirst.visibility = View.GONE
        mBinding.groupProfileFirstSpinner.visibility = View.GONE
    }


    private fun profileSecondLayoutVisible() {

        profileFirstLayoutHide();
        mBinding.tvtitle2.text = getString(R.string.profile2_title)
        mBinding.tvTitleDetails.text = getString(R.string.profile2_title_details)
        mBinding.groupProfileSecond.visibility = View.VISIBLE
    }

    private fun profileSecondLayoutHide() {

        mBinding.groupProfileSecond.visibility = View.GONE
    }


    private fun profileThirdLayoutVisible() {

        profileFirstLayoutHide()
        profileSecondLayoutHide()
        mBinding.tvtitle2.text = getString(R.string.profile3_title)
        mBinding.tvTitleDetails.text = getString(R.string.profile3_details)
        mBinding.groupProfileThird.visibility = View.VISIBLE
    }

    private fun profileThirdLayoutHide() {

        mBinding.groupProfileThird.visibility = View.GONE
    }

    private fun firstProfileDarkColor() {

        mBinding.tvlabelcalender.setBackgroundResource(R.drawable.circle_bg)
        mBinding.tvlabelwork.setBackgroundResource(R.drawable.circle_bg_gray)
        mBinding.tvlabelcard.setBackgroundResource(R.drawable.circle_bg_gray)

        mBinding.viewSeprateor1.setBackgroundResource(R.color.black)
        mBinding.viewSeprateor2.setBackgroundResource(R.color.hintColorGray)
        mBinding.viewSeprateor3.setBackgroundResource(R.color.hintColorGray)

        mBinding.iconCalender.setBackgroundResource(R.drawable.calender)
        mBinding.iconWorkCard.setBackgroundResource(R.drawable.combinedshape)
        mBinding.iconNumberCard.setBackgroundResource(R.drawable.shape)

    }

    private fun secondProfileDarkColor() {
        mBinding.tvlabelcalender.setBackgroundResource(R.drawable.circle_bg)
        mBinding.tvlabelwork.setBackgroundResource(R.drawable.circle_bg)
        mBinding.tvlabelcard.setBackgroundResource(R.drawable.circle_bg_gray)

        mBinding.viewSeprateor1.setBackgroundResource(R.color.black)
        mBinding.viewSeprateor2.setBackgroundResource(R.color.black)
        mBinding.viewSeprateor3.setBackgroundResource(R.color.hintColorGray)

        mBinding.iconWorkCard.setBackgroundResource(R.drawable.work_enabled)
        mBinding.iconCalender.setBackgroundResource(R.drawable.calender)
        mBinding.iconNumberCard.setBackgroundResource(R.drawable.shape)

    }

    private fun thirdProfileDarkColor() {
        mBinding.tvlabelcalender.setBackgroundResource(R.drawable.circle_bg)
        mBinding.tvlabelwork.setBackgroundResource(R.drawable.circle_bg)
        mBinding.tvlabelcard.setBackgroundResource(R.drawable.circle_bg)

        mBinding.viewSeprateor1.setBackgroundResource(R.color.black)
        mBinding.viewSeprateor2.setBackgroundResource(R.color.black)
        mBinding.viewSeprateor3.setBackgroundResource(R.color.black)

        mBinding.iconWorkCard.setBackgroundResource(R.drawable.work_enabled)
        mBinding.iconCalender.setBackgroundResource(R.drawable.calender)
        mBinding.iconNumberCard.setBackgroundResource(R.drawable.name_card_enablked)

    }

    private fun firstProfileSection() {

        profileFirstLayoutVisible()
        profileSecondLayoutHide()
        profileThirdLayoutHide()
        firstProfileDarkColor()
    }

    private fun secondProfileSection() {
        profileSecondLayoutVisible()
        profileFirstLayoutHide()
        profileThirdLayoutHide()
        secondProfileDarkColor()
    }

    private fun thirdProfileSection() {
        profileThirdLayoutVisible()
        profileFirstLayoutHide()
        profileSecondLayoutHide()
        thirdProfileDarkColor()
    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnNext -> {

                if (pressedTime == 0) {
                    pressedTime = 1
                    profileFirstLayoutVisible()
                    firstProfileSection()

                } else if (pressedTime == 1) {
                    pressedTime = 2
                    secondProfileSection()

                } else if (pressedTime == 2) {
                    pressedTime = 3
                    thirdProfileSection()
                }else if (pressedTime == 3) {

                    intent = Intent(this, inviteprofessional::class.java)
                    startActivity(intent)
                }
            }

            R.id.tvMonth -> {

                mBinding.monthspinner.performClick();
            }
            R.id.tvDay -> {

                mBinding.dayspinner.performClick();
            }
            R.id.tvYears -> {

                mBinding.yearspinner.performClick();
            }
        }
    }


    private fun showFirstLayout() {

        mBinding.btnNext.visibility = View.VISIBLE
    }
}

/* val builder: AlertDialog.Builder = AlertDialog.Builder(this)
 builder.setTitle("Choose item")

 builder.setItems(monthName,
     DialogInterface.OnClickListener { dialog, which ->
         Toast.makeText(
             this,
             "Position: " + which + " Value: " + monthName[which],
             Toast.LENGTH_LONG
         ).show()
     })

 val dialog: AlertDialog = builder.create()
 dialog.show()
*/
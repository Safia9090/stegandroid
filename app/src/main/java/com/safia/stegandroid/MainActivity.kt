package com.safia.stegandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.safia.stegandroid.fragment.DecodeFragment
import com.safia.stegandroid.fragment.EncodeFragment
import kotlinx.android.synthetic.main.activity_main.*

// MainActivity class responsible for managing the main activity of the application
class MainActivity : AppCompatActivity() {

    // Function called when the activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the layout for this activity
        setSupportActionBar(toolbar) // Set the toolbar as the action bar
        supportActionBar!!.title = "Stegandroid" // Set the title for the action bar
        setuptab() // Setup tabs using ViewPager
    }

    // Function to setup tabs using ViewPager
    private fun setuptab() {
        val adapter =
            ViewPagerAdapter(supportFragmentManager) // Create an instance of ViewPagerAdapter
        adapter.addFragment(
            EncodeFragment(), "Encode"
        ) // Add EncodeFragment to the adapter with title "Encode"
        adapter.addFragment(
            DecodeFragment(), "Decode"
        ) // Add DecodeFragment to the adapter with title "Decode"

        viewpager.adapter = adapter // Set the adapter for the ViewPager
        tabs.setupWithViewPager(viewpager) // Connect the tabs with the ViewPager
    }
}

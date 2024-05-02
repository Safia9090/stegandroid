package com.safia.stegandroid

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(supportFragmentManager: FragmentManager) :
    FragmentPagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    // List to store fragments
    private val mFragmentlist = ArrayList<Fragment>()

    // List to store fragment titles
    private val mFragmentTitleList = ArrayList<String>()

    // Return the fragment at the specified position
    override fun getItem(position: Int): Fragment {
        return mFragmentlist[position]
    }

    // Return the total number of fragments
    override fun getCount(): Int {
        return mFragmentlist.size
    }

    // Return the title of the fragment at the specified position
    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }

    // Add a fragment to the adapter with a title
    fun addFragment(fragment: Fragment, title: String) {
        mFragmentlist.add(fragment)
        mFragmentTitleList.add(title)
    }
}

package com.example.volunteers_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.volunteers_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        replaceFragment1(HomeFragment())
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drawerLayout = findViewById(R.id.drawerLayout)
        binding.apply {
            toggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {

                it.isChecked = true
                when (it.itemId) {
                    R.id.firstItem -> {
                        replaceFragment(HomeFragment(),it.title.toString())
                    }
                    R.id.secondItem -> {
                        replaceFragment(RegisterFragment(),it.title.toString())
                    }
                    R.id.thirdItem -> {
                        replaceFragment(RewardFragment(),it.title.toString())
                    }
                    R.id.fourthItem -> {
                        replaceFragment(DonateFragment(),it.title.toString())
                    }
                    R.id.nav_logout -> {
                        moveTaskToBack(true)
                        //System.exit(-1)
                    }
                }
                true
            }
        }
    }
    private fun replaceFragment1(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()

    }
    private fun replaceFragment(fragment: Fragment,string: String){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}
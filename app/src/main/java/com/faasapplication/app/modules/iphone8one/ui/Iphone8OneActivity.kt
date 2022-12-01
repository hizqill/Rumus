package com.faasapplication.app.modules.iphone8one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.base.BaseActivity
import com.faasapplication.app.databinding.ActivityIphone8OneBinding
import com.faasapplication.app.modules.iphone8one.`data`.viewmodel.Iphone8OneVM
import com.faasapplication.app.modules.tampilan.ui.TampilanActivity
import com.faasapplication.app.modules.tampilanone.ui.TampilanOneActivity
import kotlin.String
import kotlin.Unit

class Iphone8OneActivity : BaseActivity<ActivityIphone8OneBinding>(R.layout.activity_iphone_8_one) {
  private val viewModel: Iphone8OneVM by viewModels<Iphone8OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone8OneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnRumusBalok.setOnClickListener {
      val destIntent = TampilanOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnRumusKubus.setOnClickListener {
      val destIntent = TampilanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE8ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone8OneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

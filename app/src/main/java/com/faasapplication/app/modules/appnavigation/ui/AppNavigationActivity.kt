package com.faasapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.base.BaseActivity
import com.faasapplication.app.databinding.ActivityAppNavigationBinding
import com.faasapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.faasapplication.app.modules.iphone8one.ui.Iphone8OneActivity
import com.faasapplication.app.modules.tampilan.ui.TampilanActivity
import com.faasapplication.app.modules.tampilanone.ui.TampilanOneActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearTampilanOne.setOnClickListener {
      val destIntent = TampilanOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearIPhone8One.setOnClickListener {
      val destIntent = Iphone8OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTampilan.setOnClickListener {
      val destIntent = TampilanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}

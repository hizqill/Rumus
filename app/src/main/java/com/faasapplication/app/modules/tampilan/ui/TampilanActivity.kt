package com.faasapplication.app.modules.tampilan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.base.BaseActivity
import com.faasapplication.app.databinding.ActivityTampilanBinding
import com.faasapplication.app.modules.tampilan.`data`.viewmodel.TampilanVM
import kotlin.String
import kotlin.Unit

class TampilanActivity : BaseActivity<ActivityTampilanBinding>(R.layout.activity_tampilan) {
  private val viewModel: TampilanVM by viewModels<TampilanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TAMPILAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.faasapplication.app.modules.tampilanone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.base.BaseActivity
import com.faasapplication.app.databinding.ActivityTampilanOneBinding
import com.faasapplication.app.modules.tampilanone.`data`.viewmodel.TampilanOneVM
import kotlin.String
import kotlin.Unit

class TampilanOneActivity : BaseActivity<ActivityTampilanOneBinding>(R.layout.activity_tampilan_one)
    {
  private val viewModel: TampilanOneVM by viewModels<TampilanOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tampilanOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TAMPILAN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TampilanOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

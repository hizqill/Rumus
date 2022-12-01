package com.faasapplication.app.modules.iphone8one.`data`.model

import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone8OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMenghitungrumu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_menghitung_rumu)

)

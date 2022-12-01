package com.faasapplication.app.modules.appnavigation.`data`.model

import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTampilan: String? = MyApp.getInstance().resources.getString(R.string.lbl_tampilan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIPhone8One: String? = MyApp.getInstance().resources.getString(R.string.lbl_iphone_8_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTampilanOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tampilan_one)

)

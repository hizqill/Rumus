package com.faasapplication.app.modules.tampilan.`data`.model

import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TampilanModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_rumus_kubus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_panjang_rusuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVOLUME: String? = MyApp.getInstance().resources.getString(R.string.lbl_volume)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLUAS: String? = MyApp.getInstance().resources.getString(R.string.lbl_luas)

)

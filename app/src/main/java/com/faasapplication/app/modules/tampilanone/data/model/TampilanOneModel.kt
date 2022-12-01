package com.faasapplication.app.modules.tampilanone.`data`.model

import com.faasapplication.app.R
import com.faasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TampilanOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_rumus_balok)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_panjang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLEBAR: String? = MyApp.getInstance().resources.getString(R.string.lbl_lebar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTINGGI: String? = MyApp.getInstance().resources.getString(R.string.lbl_tinggi)
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

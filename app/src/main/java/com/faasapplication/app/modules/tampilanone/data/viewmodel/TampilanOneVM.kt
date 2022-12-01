package com.faasapplication.app.modules.tampilanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.faasapplication.app.modules.tampilanone.`data`.model.TampilanOneModel
import org.koin.core.KoinComponent

class TampilanOneVM : ViewModel(), KoinComponent {
  val tampilanOneModel: MutableLiveData<TampilanOneModel> = MutableLiveData(TampilanOneModel())

  var navArguments: Bundle? = null
}

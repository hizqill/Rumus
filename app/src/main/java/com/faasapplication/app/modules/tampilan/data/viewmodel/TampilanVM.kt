package com.faasapplication.app.modules.tampilan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.faasapplication.app.modules.tampilan.`data`.model.TampilanModel
import org.koin.core.KoinComponent

class TampilanVM : ViewModel(), KoinComponent {
  val tampilanModel: MutableLiveData<TampilanModel> = MutableLiveData(TampilanModel())

  var navArguments: Bundle? = null
}

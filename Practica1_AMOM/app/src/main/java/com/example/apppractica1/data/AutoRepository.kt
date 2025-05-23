package com.example.apppractica1.data

import com.example.apppractica1.data.db.AutoDao
import com.example.apppractica1.data.db.model.AutoEntity

class AutoRepository(
    private val autoDao: AutoDao
) {

    suspend fun insertAuto(auto: AutoEntity){
        autoDao.insertAuto(auto)
    }

    suspend fun getAllAutos(): MutableList<AutoEntity> =
        autoDao.getAllAutos()

    suspend fun updateAuto(auto: AutoEntity){
        autoDao.updateAuto(auto)
    }

    suspend fun deleteAuto(auto: AutoEntity){
        autoDao.deleteAuto(auto)
    }

}
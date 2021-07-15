package com.example.conecta2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.conecta2.commons.DataResource
import com.example.conecta2.model.LoginUser
import kotlinx.coroutines.runBlocking

class LoginViewModel : ViewModel() {


    private val _loginUser = MutableLiveData<DataResource<LoginUser>> ()
    val loginUser: LiveData<DataResource<LoginUser>> get() = _loginUser

    fun loginUser(){
        runBlocking {
            // Todo Add wait for 2 seconds
            _loginUser.postValue(DataResource.success(LoginUser("1")))
        }
    }


}
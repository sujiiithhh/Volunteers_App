package com.example.volunteers_app.Models

import androidx.lifecycle.LiveData
import com.example.volunteers_app.Repository.UserRepository
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class UserViewModel : ViewModel() {

    private val repository : UserRepository
    private val _allUsers = MutableLiveData<List<User>>()
    val allUsers : LiveData<List<User>> = _allUsers


    init {

        repository = UserRepository().getInstance()
        repository.loadUsers(_allUsers)

    }

}
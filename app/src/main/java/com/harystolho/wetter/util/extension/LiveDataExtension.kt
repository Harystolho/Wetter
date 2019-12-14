package com.harystolho.wetter.util.extension

import androidx.lifecycle.MutableLiveData

fun <T : Any> mutableLiveData(initialValue: T? = null): MutableLiveData<T> {
    return MutableLiveData<T>().apply { value = initialValue }
}
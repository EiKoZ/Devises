package com.novigotech.devises.Metadata

import android.app.Application
import android.content.Context
import android.support.v4.app.FragmentManager

class App : Application() {

    private val mContext: Context = this

    fun getContext(): Context {
        return this.mContext;
    }
}
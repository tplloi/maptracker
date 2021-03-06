package com.loitp.app

import androidx.multidex.MultiDexApplication
import com.core.common.Constants
import com.core.utilities.LUIUtil
import com.data.ActivityData
import com.github.piasy.biv.BigImageViewer
import com.github.piasy.biv.loader.glide.GlideImageLoader
import com.google.gson.Gson
import com.loitp.db.AppDatabase
import com.utils.util.Utils

class LApplication : MultiDexApplication() {
    private val logTag = LApplication::class.java.simpleName

    companion object {
        val gson: Gson = Gson()
    }

    override fun onCreate() {
        super.onCreate()

        Constants.setIsDebug(false)
        Utils.init(this)

        ActivityData.instance.type = Constants.TYPE_ACTIVITY_TRANSITION_SLIDELEFT

        //config font
        LUIUtil.fontForAll = Constants.FONT_PATH

        //big imageview
        BigImageViewer.initialize(GlideImageLoader.with(applicationContext))

        //room database
        AppDatabase.getInstance(this)
    }
}
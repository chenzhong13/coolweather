package com.coolweather.android.gson

import com.google.gson.annotations.SerializedName

class Now {
    @SerializedName("tmp")  //via annotation to fix temperature--tmp
    var temperature: String? = null

    @SerializedName("cond")
    var more: More? = null

    inner class More {
        @SerializedName("txt")
        var info: String? = null
    }
}
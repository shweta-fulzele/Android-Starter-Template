package com.base.androidstartertemplate.domain.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Paging(

    @SerializedName("hasMore") var hasMore: Boolean? = null,
    @SerializedName("page") var page: Int? = null,
    @SerializedName("pageSize") var pageSize: Int? = null,
    @SerializedName("totalCount") var totalCount: Int? = null

): Parcelable
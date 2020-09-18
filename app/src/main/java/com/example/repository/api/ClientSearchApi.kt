package com.example.repository.api

import com.example.repository.bean.SearchDefaultJson
import com.example.repository.bean.SearchSongJson
import com.example.repository.callback.RequestCallBack

interface ClientSearchApi {
    fun getSearchSongs(
        limit: Int,
        offset: Int,
        type: Int,
        keyword: String,
        callBack: RequestCallBack<SearchSongJson>
    )
    
    fun getDefaultKeywords(callBack: RequestCallBack<SearchDefaultJson>)
}
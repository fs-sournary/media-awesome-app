package com.example.mediaawesomeapp.model.response

import com.example.mediaawesomeapp.model.*

open class BaseResponse<T>(
    val err: Int? = null,
    val msg: String? = null,
    val data: T? = null
)

class HomeResponse: BaseResponse<Home>()

class RecommendSongResponse : BaseResponse<BaseResponse<Song>>()

class SongInfoResponse : BaseResponse<Song>()

class StreamingResponse : BaseResponse<Streaming>()

class MultipleSearchResponse: BaseResponse<MultipleSearch>()

class SearchSongResponse: BaseResponse<SearchSong>()

class HotKeyResponse: BaseResponse<List<String>>()

class Top1Response: BaseResponse<Song>()
package com.team.halae

import java.sql.ClientInfoStatus
import java.util.*

data class FilteringPostResponse (
        var status: Int,
        var message : String,
        var result : Objects
)
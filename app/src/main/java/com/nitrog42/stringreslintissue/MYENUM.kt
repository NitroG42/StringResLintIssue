package com.nitrog42.stringreslintissue

import androidx.annotation.StringRes

enum class MYENUM(@StringRes val title: Int) {
    FIRST(R.string.first_title)
}
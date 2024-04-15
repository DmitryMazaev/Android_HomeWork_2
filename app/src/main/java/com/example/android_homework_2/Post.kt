package com.example.android_homework_2

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

class Post @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null)
    : RelativeLayout(context, attrs) {
    init {
        inflate(context, R.layout.post_view, this)
    }
}

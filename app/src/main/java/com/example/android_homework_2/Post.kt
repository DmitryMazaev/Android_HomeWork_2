package com.example.android_homework_2

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout
import com.example.android_homework_2.databinding.ActivityMainBinding
import com.example.android_homework_2.databinding.PostViewBinding

class Post @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null)
    : RelativeLayout(context, attrs) {
        private var binding:PostViewBinding? = null

    init {
        inflate(context, R.layout.post_view, this)
    }

    fun upString(str: String) {
        binding?.upString?.text = str
    }
}

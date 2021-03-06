package com.perelandrax.coinspace.presentation.screenstack

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

open class AnimationConstraintLayout @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
  : ConstraintLayout(context, attrs, defStyleAttr) {

  fun getXFraction(): Float {
    return x / width
  }

  fun setXFraction(xFraction: Float) {
    val width = width
    x = if (width > 0) xFraction * width else (-9999).toFloat()
  }

  fun getYFraction(): Float {
    return y / height
  }

  fun setYFraction(yFraction: Float) {
    val height = height
    y = if (height > 0) yFraction * height else (-9999).toFloat()
  }
}
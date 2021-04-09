package com.clever.draw2bit

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable


class DrawableToBitmap private constructor() {

    private object HOLDER {
        val INSTANCE = DrawableToBitmap()
    }

    companion object {
        fun createInstance(): DrawableToBitmap {
            val instance: DrawableToBitmap by lazy { HOLDER.INSTANCE }
            return instance
        }
    }



    fun convertDrawableToBitmap(drawable: Drawable): Bitmap? {

        if (drawable is BitmapDrawable) {
            val bitmapDrawable = drawable
            if (bitmapDrawable.bitmap != null) {
                return bitmapDrawable.bitmap
            }
        }

        var bitmap: Bitmap? = if (drawable.intrinsicWidth <= 0 || drawable.intrinsicHeight <= 0) {
            Bitmap.createBitmap(
                1,
                1,
                Bitmap.Config.ARGB_8888
            )
        } else {
            Bitmap.createBitmap(
                drawable.intrinsicWidth,
                drawable.intrinsicHeight,
                Bitmap.Config.ARGB_8888
            )
        }

        val canvas = bitmap?.let { Canvas(it) }
        canvas?.let { drawable.setBounds(0, 0, it.width, canvas.height) }
        canvas?.let { drawable.draw(it) }
        return bitmap
    }


}
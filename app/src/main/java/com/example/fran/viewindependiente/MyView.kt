package com.example.fran.viewindependiente

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.ShapeDrawable
import android.util.AttributeSet
import android.view.View
/**
 * Created by Fran on 22/11/2017.
 */
class MyView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val figura: ShapeDrawable

    init {
        figura = ShapeDrawable(OvalShape())
        figura.paint.color = -0xffff01
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        figura.setBounds(0, 0, w, h)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        figura.draw(canvas)
    }
}

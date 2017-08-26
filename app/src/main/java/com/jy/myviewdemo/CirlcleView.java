package com.jy.myviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/*
 *   author RichardJay
 *    email jiangfengfn12@163.com
 *  created 2017/8/26 15:56
 *  version v1.0
 * modified 2017/8/26
 *     note xxx
 */

public class CirlcleView extends View {
    private Context mContext;
    private int mColor = Color.RED;
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public CirlcleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        init();
    }

    private void init() {
        mPaint.setColor(mColor);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 获取尺寸
        int width = getWidth();
        int height = getHeight();
        // 将最小者作为直径，进而求得半径
        int radius = Math.min(width, height) >> 1;
        // 画圆
        canvas.drawCircle(width >> 1, height >> 1, radius, mPaint);
    }
}

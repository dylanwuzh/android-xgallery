package com.xgallery.android.transformer;

import android.os.Build;
import android.view.View;

/**
 * @author wuzhen
 * @since 2017/07/24
 */
public class BottomScalePageTransformer extends BasePageTransformer {

    private static final float MAX_SCALE = 1.1f;
    private static final float MIN_SCALE = 1.0f;

    @Override
    public void transformPage(View page, float position) {
        if (position < -1) {
            position = -1;
        } else if (position > 1) {
            position = 1;
        }

        float tempScale = position < 0 ? 1 + position : 1 - position;
        float slope = (MAX_SCALE - MIN_SCALE) / 1;
        float scaleValue = MIN_SCALE + tempScale * slope;

        float pivotX = page.getWidth() * page.getScaleX() / 2.f;
        float pivotY = page.getHeight();
        page.setPivotX(pivotX);
        page.setPivotY(pivotY);
        page.setScaleX(scaleValue);
        page.setScaleY(scaleValue);

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            page.getParent().requestLayout();
        }
    }
}

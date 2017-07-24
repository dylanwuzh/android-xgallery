package com.xgallery.android.samples;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * @author wuzhen
 * @since 2017/07/24
 */
public class SampleAdapter extends PagerAdapter {

    private static final int[] DRAWABLES = {
            R.drawable.pic0,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
    };

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        int drawable = DRAWABLES[position % DRAWABLES.length];

        View view = View.inflate(container.getContext(), R.layout.adapter_sample, null);
        ImageView iv = (ImageView) view.findViewById(R.id.iv);
        iv.setImageResource(drawable);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if (object != null && object instanceof View) {
            container.removeView((View) object);
        }
    }
}

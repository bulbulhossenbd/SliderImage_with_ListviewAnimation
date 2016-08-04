package com.Bulbul.Slider;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by bulbulkhan on 10/25/2015.
 */
public class Bangla_Font extends TextView {
    public static Typeface m_typeFace = null;

    public Bangla_Font(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    public Bangla_Font(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    public Bangla_Font(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (isInEditMode()) {
            return;
        }
        loadTypeFace(context);
    }

    private void loadTypeFace(Context context) {
        if (m_typeFace == null)
            m_typeFace = Typeface.createFromAsset(context.getAssets(),
                    "SolaimanLipi.ttf");
        this.setTypeface(m_typeFace);
    }
}
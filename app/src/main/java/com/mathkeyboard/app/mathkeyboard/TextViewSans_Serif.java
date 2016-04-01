package com.mathkeyboard.app.mathkeyboard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by pc-18 on 1/11/2016.
 */
public class TextViewSans_Serif extends TextView {

    public TextViewSans_Serif(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "font/sans-serif.ttf");
        setTypeface(typeface, Typeface.NORMAL);


    }

    public TextViewSans_Serif(Context context) {
        super(context);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "font/sans-serif.ttf");
        setTypeface(typeface, Typeface.NORMAL);

    }

}

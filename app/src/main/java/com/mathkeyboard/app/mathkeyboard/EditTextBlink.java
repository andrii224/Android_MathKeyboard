package com.mathkeyboard.app.mathkeyboard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by PC_18 on 9/17/2015.
 */
public class EditTextBlink extends EditText {

    public EditTextBlink(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "font/sans-serif.ttf");
        setTypeface(typeface, Typeface.NORMAL);


    }

    public EditTextBlink(Context context) {
        super(context);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "font/sans-serif.ttf");
        setTypeface(typeface, Typeface.NORMAL);

    }


    @Override
    public boolean onCheckIsTextEditor() {

        return true; //for some reason False leads to cursor never blinking or being visible even if setCursorVisible(true) was called in code.
    }

    @Override
    public boolean isTextSelectable(){
        return true;
    }

}

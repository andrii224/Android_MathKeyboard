package com.mathkeyboard.app.mathkeyboard;

import android.graphics.Color;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by HardipSinh on 8/27/2015.
 */
public class Utils {

    public static void changetextbg(TextView t1,TextView t2,TextView t3,TextView t4,TextView t5,TextView t6,TextView t7,TextView t8) {

        t1.setBackgroundColor(Color.parseColor("#C2C4C2"));
        t2.setBackgroundColor(Color.parseColor("#EAEAEA"));
        t3.setBackgroundColor(Color.parseColor("#EAEAEA"));
        t4.setBackgroundColor(Color.parseColor("#EAEAEA"));
        t5.setBackgroundColor(Color.parseColor("#EAEAEA"));
        t6.setBackgroundColor(Color.parseColor("#EAEAEA"));
        t7.setBackgroundColor(Color.parseColor("#EAEAEA"));
        t8.setBackgroundColor(Color.parseColor("#EAEAEA"));

    }

    public static void setvisibility_basicmath_subeq(LinearLayout ll_1,LinearLayout ll_2,LinearLayout ll_3
    ){


        ll_1.setVisibility(View.VISIBLE);
        ll_2.setVisibility(View.GONE);
        ll_3.setVisibility(View.GONE);

    }

    public static void setvisibility_prealgebra_subeq(LinearLayout ll_1,LinearLayout ll_2,LinearLayout ll_3,LinearLayout ll_4
    ){

        ll_1.setVisibility(View.VISIBLE);
        ll_2.setVisibility(View.GONE);
        ll_3.setVisibility(View.GONE);
        ll_4.setVisibility(View.GONE);

    }

    public static void setvisibility_algebra_subeq(LinearLayout ll_1,LinearLayout ll_2,LinearLayout ll_3
            ,LinearLayout ll_4,LinearLayout ll_5
    ){

        ll_1.setVisibility(View.VISIBLE);
        ll_2.setVisibility(View.GONE);
        ll_3.setVisibility(View.GONE);
        ll_4.setVisibility(View.GONE);
        ll_5.setVisibility(View.GONE);

    }

    public static void setvisibility_eq_symbol(LinearLayout ll_1,LinearLayout ll_2,LinearLayout ll_3,LinearLayout ll_4
            ,LinearLayout ll_5,LinearLayout ll_6,LinearLayout ll_7,LinearLayout ll_8){


        ll_1.setVisibility(View.VISIBLE);
        ll_2.setVisibility(View.GONE);
        ll_3.setVisibility(View.GONE);
        ll_4.setVisibility(View.GONE);
        ll_5.setVisibility(View.GONE);
        ll_6.setVisibility(View.GONE);
        ll_7.setVisibility(View.GONE);
        ll_8.setVisibility(View.GONE);

    }

    public static void hideallviews(LinearLayout l1,LinearLayout l2,LinearLayout l3,LinearLayout l4,LinearLayout l5,
                                    LinearLayout l6,LinearLayout l7,LinearLayout l8,LinearLayout l9,LinearLayout l10,
                                    LinearLayout l11,LinearLayout l12,LinearLayout l13,LinearLayout l14,LinearLayout l15) {


    }


    public static void settextfromhtml(ImageView im1,ImageView im2,ImageView im3,ImageView im4,ImageView im5) {

        im1.setTag(Html.fromHtml("&#8805;"));
        im2.setTag(Html.fromHtml("&#8804;"));
        im3.setTag(Html.fromHtml("&#62;"));
        im4.setTag(Html.fromHtml("&#60;"));
        im5.setTag(Html.fromHtml("&#61;"));

    }

    public static void settextfromhtml2(ImageView im1,ImageView im2) {
        //division/percentage
        im1.setTag(Html.fromHtml("&#247;"));
        im2.setTag(Html.fromHtml("&#37;"));
    }

    public static void settextfromhtml3(Button b1,Button b2,Button b3,Button b4,Button b5) {

        b1.setTag(Html.fromHtml("&#43;"));
        b2.setTag(Html.fromHtml("&#8722;"));
        b3.setTag(Html.fromHtml("&#215;"));
        b4.setTag(Html.fromHtml("&#247;"));
        b5.setTag(Html.fromHtml("&#61;"));
    }

    public static void change_edittext_bg(boolean hasfocus, EditTextBlink ed) {

        if (!hasfocus) {
            if (ed.getText().toString().trim().length() != 0) {
                ed.setBackgroundColor(Color.parseColor("#00000000"));
            } else {
                ed.setBackgroundColor(Color.parseColor("#3300FF00"));
            }
        } else {
            ed.setBackgroundColor(Color.parseColor("#3300FF00"));
        }

    }

}

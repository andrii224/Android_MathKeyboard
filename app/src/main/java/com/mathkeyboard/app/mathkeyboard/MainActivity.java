package com.mathkeyboard.app.mathkeyboard;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout ll_visible_view = null,ll_ans_box_selected = null;
    private boolean is_keyboard_show = false;
    private LinearLayout ll_selected_view = null;
    protected Animation animation 	= null;
    public int dpwidth = 600;
    private EditText selectedTextView = null,selected_ed_2 = null;
    boolean is_on_calculate = false;
    private RelativeLayout keyboardLayout 	= null;
    private LinearLayout layout = null;

    protected boolean kwyboard_case_value = false;

    protected TextView kb_btn_abc_case=null;

    protected TextView kb_btn_abc_q = null;
    protected TextView kb_btn_abc_w = null;
    protected TextView kb_btn_abc_e = null;
    protected TextView kb_btn_abc_r = null;
    protected TextView kb_btn_abc_t = null;
    protected TextView kb_btn_abc_y = null;
    protected TextView kb_btn_abc_u = null;
    protected TextView kb_btn_abc_i = null;
    protected TextView kb_btn_abc_o = null;
    protected TextView kb_btn_abc_p = null;
    protected TextView kb_btn_abc_a = null;
    protected TextView kb_btn_abc_s = null;
    protected TextView kb_btn_abc_d = null;
    protected TextView kb_btn_abc_f = null;
    protected TextView kb_btn_abc_g = null;
    protected TextView kb_btn_abc_h = null;
    protected TextView kb_btn_abc_j = null;
    protected TextView kb_btn_abc_k = null;
    protected TextView kb_btn_abc_l = null;
    protected TextView kb_btn_abc_z = null;
    protected TextView kb_btn_abc_x = null;
    protected TextView kb_btn_abc_c = null;
    protected TextView kb_btn_abc_v = null;
    protected TextView kb_btn_abc_b = null;
    protected TextView kb_btn_abc_n = null;
    protected TextView kb_btn_abc_m = null;

    protected LinearLayout kb_ll_123,kb_ll_abc;

    protected TextView kb_tv_eq_name_basicmath,kb_tv_eq_name_prealgebra,kb_tv_eq_name_algebra,kb_tv_eq_name_trignometry,
            kb_tv_eq_name_precalculus,kb_tv_eq_name_calculus,kb_tv_eq_name_statistics,kb_tv_eq_name_finitemath;

    protected LinearLayout ll_kb_sub_sumbol_basicmath_sign1 = null,ll_kb_sub_sumbol_basicmath_sign2= null,ll_kb_sub_sumbol_basicmath_sign3= null
            ,ll_kb_sub_sumbol_basicmath_sign5= null;

    protected LinearLayout ll_kb_sub_sumbol_prealgebra_sign1 = null,ll_kb_sub_sumbol_prealgebra_sign2= null,
            ll_kb_sub_sumbol_prealgebra_sign3= null,ll_kb_sub_sumbol_prealgebra_sign4= null
            ,ll_kb_sub_sumbol_prealgebra_sign5= null;

    protected LinearLayout ll_kb_sub_sumbol_algebra_sign1 = null,ll_kb_sub_sumbol_algebra_sign2= null,
            ll_kb_sub_sumbol_algebra_sign3= null,ll_kb_sub_sumbol_algebra_sign4= null
            ,ll_kb_sub_sumbol_algebra_sign5= null,ll_kb_sub_sumbol_algebra_sign7= null,ll_kb_sub_sumbol_algebra_sign8= null;

    protected LinearLayout ll_kb_sub_sumbol_trignometry_sign1 = null,ll_kb_sub_sumbol_trignometry_sign2 = null,ll_kb_sub_sumbol_trignometry_sign4 = null,
            ll_kb_sub_sumbol_trignometry_sign5 = null,ll_kb_sub_sumbol_trignometry_sign7 = null,ll_kb_sub_sumbol_trignometry_sign8 = null,
            ll_kb_sub_sumbol_trignometry_sign9 = null,ll_kb_sub_sumbol_trignometry_sign10 = null,ll_kb_sub_sumbol_trignometry_sign11 = null,
            ll_kb_sub_sumbol_trignometry_sign12 = null,ll_kb_sub_sumbol_trignometry_sign13 = null;

    protected LinearLayout ll_kb_sub_sumbol_precalculus_sign1 = null,ll_kb_sub_sumbol_precalculus_sign2 = null,ll_kb_sub_sumbol_precalculus_sign4 = null,
            ll_kb_sub_sumbol_precalculus_sign5 = null,ll_kb_sub_sumbol_precalculus_sign9 = null,ll_kb_sub_sumbol_precalculus_sign10 = null,
            ll_kb_sub_sumbol_precalculus_sign11 = null,ll_kb_sub_sumbol_precalculus_sign12 = null,ll_kb_sub_sumbol_precalculus_sign13 = null,
            ll_kb_sub_sumbol_precalculus_sign14 = null,ll_kb_sub_sumbol_precalculus_sign15 = null;

    protected LinearLayout ll_kb_sub_sumbol_calculus_sign1 = null,ll_kb_sub_sumbol_calculus_sign2 = null,ll_kb_sub_sumbol_calculus_sign4 = null,
            ll_kb_sub_sumbol_calculus_sign5 = null,ll_kb_sub_sumbol_calculus_sign8 = null,ll_kb_sub_sumbol_calculus_sign10 = null,
            ll_kb_sub_sumbol_calculus_sign11 = null,ll_kb_sub_sumbol_calculus_sign12 = null,ll_kb_sub_sumbol_calculus_sign13 = null,
            ll_kb_sub_sumbol_calculus_sign14 = null,ll_kb_sub_sumbol_calculus_sign15 = null,ll_kb_sub_sumbol_calculus_sign16 = null;

    protected LinearLayout ll_kb_sub_sumbol_statistics_sign1 = null,ll_kb_sub_sumbol_statistics_sign3 = null,
            ll_kb_sub_sumbol_statistics_sign4 = null,ll_kb_sub_sumbol_statistics_sign6 = null,
            ll_kb_sub_sumbol_statistics_sign7 = null,ll_kb_sub_sumbol_statistics_sign8 = null;

    protected LinearLayout ll_kb_sub_sumbol_finitemath_sign1 = null,ll_kb_sub_sumbol_finitemath_sign2 = null,
            ll_kb_sub_sumbol_finitemath_sign4 = null,ll_kb_sub_sumbol_finitemath_sign5 = null,
            ll_kb_sub_sumbol_finitemath_sign6 = null,ll_kb_sub_sumbol_finitemath_sign8 = null;


    protected LinearLayout ll_main_eq_sub_symbol = null;

    protected LinearLayout kb_ll_eq_symbol_basicmath = null,kb_ll_eq_symbol_prealgebra = null,kb_ll_eq_symbol_algebra = null,kb_ll_eq_symbol_trignometry = null,
            kb_ll_eq_symbol_precalculus=null,kb_ll_eq_symbol_calculus=null,kb_ll_eq_symbol_statistics=null,kb_ll_eq_symbol_finitemath=null
            ;

    protected HorizontalScrollView hsv_keyboard_eq_name=null,hsv_keyboard_eq_symbol=null;

    protected TextView kb_eq_sub_symbol_trignometry_sign8_3,kb_eq_sub_symbol_trignometry_sign9_3,
            kb_eq_sub_symbol_trignometry_sign10_3,kb_eq_sub_symbol_trignometry_sign11_3
            ,kb_eq_sub_symbol_trignometry_sign12_3,kb_eq_sub_symbol_trignometry_sign13_3;

    protected TextView kb_eq_sub_symbol_precalculus_sign10_3,kb_eq_sub_symbol_precalculus_sign11_3,
            kb_eq_sub_symbol_precalculus_sign12_3,kb_eq_sub_symbol_precalculus_sign13_3
            ,kb_eq_sub_symbol_precalculus_sign14_3,kb_eq_sub_symbol_precalculus_sign15_3;

    protected TextView kb_eq_sub_symbol_calculus_sign11_3,kb_eq_sub_symbol_calculus_sign12_3,
            kb_eq_sub_symbol_calculus_sign13_3,kb_eq_sub_symbol_calculus_sign14_3
            ,kb_eq_sub_symbol_calculus_sign15_3,kb_eq_sub_symbol_calculus_sign16_3;

    protected ImageView btn_eq_symbol_pre_scroll,btn_eq_symbol_next_scroll;
    protected boolean is_touch_kb = false;
    protected TextView kb_btn_123_delete,kb_btn_abc_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        try {
            DisplayMetrics displayMetrics = MainActivity.this.getResources().getDisplayMetrics();
            float dpWidth2 = displayMetrics.widthPixels / displayMetrics.density;

            dpwidth = Math.round(dpWidth2);

            if (dpwidth<600){
                dpwidth = 600;
            }

        } catch (Exception e){
            dpwidth = 600;
        }

        initviews();

        setdata();

    }

    @Override
    public void onBackPressed() {
        if (is_keyboard_show){
            this.hideKeyboard();
        } else {
            super.onBackPressed();
        }
    }

    private void setdata() {
        layout.removeAllViews();
        for(int i = 0 ; i < 10 ; i ++){
            View view = null;
            view = this.getCheckFillInLayout(i);
            if(view != null) {
                layout.addView(view);
            }
        }
    }

    private View getCheckFillInLayout(final int index){

        View view = LayoutInflater.from(this).inflate(R.layout.kb_check_home_fill_in_blank_layout, null);
        RelativeLayout viewLayout = (RelativeLayout) view.findViewById(R.id.checkHomeLayout);
        Button   btnSeeAnswer = (Button) view.findViewById(R.id.btnSeeAnswer);
        TextView txtNumber = (TextView) view.findViewById(R.id.txtNumber);
        TextView txtLeftUnit = (TextView) view.findViewById(R.id.txtLeftUnit);
        // TextView ansBox = (TextView) view.findViewById(R.id.ansBox);  //siddhiinfosoft
        final Button btnRoughWork   = (Button) view.findViewById(R.id.btnRoughWork);
        final LinearLayout ll_ans_box = (LinearLayout) view.findViewById(R.id.ll_ans_box); //siddhiinfosoft

        ll_ans_box.setMinimumWidth(dpwidth - 50); // siddhiinfosoft
        ll_ans_box.setTag(R.id.first, "1");
        ll_ans_box.setTag(R.id.second, "main");
        this.setstudentansbox("", ll_ans_box, "");

        txtNumber.setText("" + (index + 1));


        ll_ans_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                callclickmethod((LinearLayout) v);

            }
        });

        return view;
    }

    private void initviews() {

        keyboardLayout = (RelativeLayout) findViewById(R.id.rl_math_keyboard);
        layout          = (LinearLayout) findViewById(R.id.checkHomeWorkListLayout);

        btn_eq_symbol_pre_scroll = (ImageView) findViewById(R.id.btn_eq_symbol_pre_scroll);
        btn_eq_symbol_next_scroll = (ImageView) findViewById(R.id.btn_eq_symbol_next_scroll);

        kb_ll_123 = (LinearLayout) findViewById(R.id.kb_ll_123);
        kb_ll_abc = (LinearLayout) findViewById(R.id.kb_ll_abc);

        kb_btn_123_delete = (TextView) findViewById(R.id.kb_btn_123_delete);
        kb_btn_abc_delete = (TextView) findViewById(R.id.kb_btn_abc_delete);

        kb_btn_123_delete.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        is_touch_kb = true;
                        Handler hnd = new Handler();
                        hnd.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ondeleteclick();
                            }
                        }, 200);
                        break;
                    case MotionEvent.ACTION_UP:
                        is_touch_kb = false;
                        break;
                }
                return true;
            }
        });

        kb_btn_abc_delete.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v,MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        is_touch_kb = true;
                        Handler hnd = new Handler();
                        hnd.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                ondeleteclick();
                            }
                        }, 200);
                        break;
                    case MotionEvent.ACTION_UP:
                        is_touch_kb = false;
                        break;
                }
                return true;
            }
        });

        kb_btn_abc_case = (TextView) findViewById(R.id.kb_btn_abc_case);

        hsv_keyboard_eq_name = (HorizontalScrollView) findViewById(R.id.hsv_keyboard_eq_name);
        hsv_keyboard_eq_symbol = (HorizontalScrollView) findViewById(R.id.hsv_keyboard_eq_symbol);

        kb_ll_eq_symbol_basicmath = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_basicmath);
        kb_ll_eq_symbol_prealgebra = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_prealgebra);
        kb_ll_eq_symbol_algebra = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_algebra);
        kb_ll_eq_symbol_trignometry = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_trignometry);
        kb_ll_eq_symbol_precalculus = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_precalculus);
        kb_ll_eq_symbol_calculus = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_calculus);
        kb_ll_eq_symbol_statistics = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_statistics);
        kb_ll_eq_symbol_finitemath = (LinearLayout) findViewById(R.id.kb_ll_eq_symbol_finitemath);

        ll_kb_sub_sumbol_basicmath_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_basicmath_sign1);
        ll_kb_sub_sumbol_basicmath_sign2 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_basicmath_sign2);
        ll_kb_sub_sumbol_basicmath_sign5 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_basicmath_sign5);

        ll_kb_sub_sumbol_prealgebra_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_prealgebra_sign1);
        ll_kb_sub_sumbol_prealgebra_sign2 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_prealgebra_sign2);
        ll_kb_sub_sumbol_prealgebra_sign4 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_prealgebra_sign4);
        ll_kb_sub_sumbol_prealgebra_sign5 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_prealgebra_sign5);

        ll_kb_sub_sumbol_algebra_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_algebra_sign1);
        ll_kb_sub_sumbol_algebra_sign2 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_algebra_sign2);
        ll_kb_sub_sumbol_algebra_sign4 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_algebra_sign4);
        ll_kb_sub_sumbol_algebra_sign5 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_algebra_sign5);
        ll_kb_sub_sumbol_algebra_sign8 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_algebra_sign8);

        ll_kb_sub_sumbol_trignometry_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign1);
        ll_kb_sub_sumbol_trignometry_sign2 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign2);
        ll_kb_sub_sumbol_trignometry_sign4 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign4);
        ll_kb_sub_sumbol_trignometry_sign5 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign5);
        ll_kb_sub_sumbol_trignometry_sign7 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign7);
        ll_kb_sub_sumbol_trignometry_sign8 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign8);
        ll_kb_sub_sumbol_trignometry_sign9 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign9);
        ll_kb_sub_sumbol_trignometry_sign10 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign10);
        ll_kb_sub_sumbol_trignometry_sign11= (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign11);
        ll_kb_sub_sumbol_trignometry_sign12 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign12);
        ll_kb_sub_sumbol_trignometry_sign13 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_trignometry_sign13);

        ll_kb_sub_sumbol_precalculus_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign1);
        ll_kb_sub_sumbol_precalculus_sign2 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign2);
        ll_kb_sub_sumbol_precalculus_sign4 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign4);
        ll_kb_sub_sumbol_precalculus_sign5 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign5);
        ll_kb_sub_sumbol_precalculus_sign9 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign9);
        ll_kb_sub_sumbol_precalculus_sign10 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign10);
        ll_kb_sub_sumbol_precalculus_sign11 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign11);
        ll_kb_sub_sumbol_precalculus_sign12 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign12);
        ll_kb_sub_sumbol_precalculus_sign13 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign13);
        ll_kb_sub_sumbol_precalculus_sign14 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign14);
        ll_kb_sub_sumbol_precalculus_sign15 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_precalculus_sign15);

        ll_kb_sub_sumbol_calculus_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign1);
        ll_kb_sub_sumbol_calculus_sign2 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign2);
        ll_kb_sub_sumbol_calculus_sign4 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign4);
        ll_kb_sub_sumbol_calculus_sign5 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign5);
        ll_kb_sub_sumbol_calculus_sign10 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign10);
        ll_kb_sub_sumbol_calculus_sign11 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign11);
        ll_kb_sub_sumbol_calculus_sign12 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign12);
        ll_kb_sub_sumbol_calculus_sign13 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign13);
        ll_kb_sub_sumbol_calculus_sign14 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign14);
        ll_kb_sub_sumbol_calculus_sign15 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign15);
        ll_kb_sub_sumbol_calculus_sign16 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_calculus_sign16);

        ll_kb_sub_sumbol_statistics_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_statistics_sign1);
        ll_kb_sub_sumbol_statistics_sign3 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_statistics_sign3);
        ll_kb_sub_sumbol_statistics_sign4 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_statistics_sign4);
        ll_kb_sub_sumbol_statistics_sign6 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_statistics_sign6);
        ll_kb_sub_sumbol_statistics_sign7 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_statistics_sign7);

        ll_kb_sub_sumbol_finitemath_sign1 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_finitemath_sign1);
        ll_kb_sub_sumbol_finitemath_sign2 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_finitemath_sign2);
        ll_kb_sub_sumbol_finitemath_sign4 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_finitemath_sign4);
        ll_kb_sub_sumbol_finitemath_sign5 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_finitemath_sign5);
        ll_kb_sub_sumbol_finitemath_sign8 = (LinearLayout) findViewById(R.id.ll_kb_sub_sumbol_finitemath_sign8);

        ll_main_eq_sub_symbol = (LinearLayout) findViewById(R.id.ll_main_eq_sub_symbol);

        kb_btn_abc_q = (TextView) findViewById(R.id.kb_btn_abc_q);
        kb_btn_abc_w = (TextView) findViewById(R.id.kb_btn_abc_w);
        kb_btn_abc_e = (TextView) findViewById(R.id.kb_btn_abc_e);
        kb_btn_abc_r = (TextView) findViewById(R.id.kb_btn_abc_r);
        kb_btn_abc_t = (TextView) findViewById(R.id.kb_btn_abc_t);
        kb_btn_abc_y = (TextView) findViewById(R.id.kb_btn_abc_y);
        kb_btn_abc_u = (TextView) findViewById(R.id.kb_btn_abc_u);
        kb_btn_abc_i = (TextView) findViewById(R.id.kb_btn_abc_i);
        kb_btn_abc_o = (TextView) findViewById(R.id.kb_btn_abc_o);
        kb_btn_abc_p = (TextView) findViewById(R.id.kb_btn_abc_p);
        kb_btn_abc_a = (TextView) findViewById(R.id.kb_btn_abc_a);
        kb_btn_abc_s = (TextView) findViewById(R.id.kb_btn_abc_s);
        kb_btn_abc_d = (TextView) findViewById(R.id.kb_btn_abc_d);
        kb_btn_abc_f = (TextView) findViewById(R.id.kb_btn_abc_f);
        kb_btn_abc_g = (TextView) findViewById(R.id.kb_btn_abc_g);
        kb_btn_abc_h = (TextView) findViewById(R.id.kb_btn_abc_h);
        kb_btn_abc_j = (TextView) findViewById(R.id.kb_btn_abc_j);
        kb_btn_abc_k = (TextView) findViewById(R.id.kb_btn_abc_k);
        kb_btn_abc_l = (TextView) findViewById(R.id.kb_btn_abc_l);
        kb_btn_abc_z = (TextView) findViewById(R.id.kb_btn_abc_z);
        kb_btn_abc_x = (TextView) findViewById(R.id.kb_btn_abc_x);
        kb_btn_abc_c = (TextView) findViewById(R.id.kb_btn_abc_c);
        kb_btn_abc_v = (TextView) findViewById(R.id.kb_btn_abc_v);
        kb_btn_abc_b = (TextView) findViewById(R.id.kb_btn_abc_b);
        kb_btn_abc_n = (TextView) findViewById(R.id.kb_btn_abc_n);
        kb_btn_abc_m = (TextView) findViewById(R.id.kb_btn_abc_m);

        kb_tv_eq_name_basicmath = (TextView) findViewById(R.id.kb_tv_eq_name_basicmath);
        kb_tv_eq_name_prealgebra = (TextView) findViewById(R.id.kb_tv_eq_name_prealgebra);
        kb_tv_eq_name_algebra = (TextView) findViewById(R.id.kb_tv_eq_name_algebra);
        kb_tv_eq_name_trignometry = (TextView) findViewById(R.id.kb_tv_eq_name_trignometry);
        kb_tv_eq_name_precalculus = (TextView) findViewById(R.id.kb_tv_eq_name_precalculus);
        kb_tv_eq_name_calculus = (TextView) findViewById(R.id.kb_tv_eq_name_calculus);
        kb_tv_eq_name_statistics = (TextView) findViewById(R.id.kb_tv_eq_name_statistics);
        kb_tv_eq_name_finitemath = (TextView) findViewById(R.id.kb_tv_eq_name_finitemath);

    }

    private void showKeyboard(){  // siddhiinfosoft
        try {
            if (!is_keyboard_show){
                    is_keyboard_show = true;
                    keyboardLayout.setVisibility(RelativeLayout.VISIBLE);
                    animation = AnimationUtils.loadAnimation(this, R.anim.keyboard_show_animation);
                    keyboardLayout.setAnimation(animation);
            }
        } catch (Exception e){

        }
    }


    private void hideKeyboard(){  // siddhiinfosoft
		/*if(keyboardLayout.getVisibility() == RelativeLayout.VISIBLE){
			animation = AnimationUtils.loadAnimation(this, R.anim.bottom_down_animation);*/
        try {
            if (is_keyboard_show){
                is_keyboard_show = false;
                animation = AnimationUtils.loadAnimation(this, R.anim.keyboard_hide_animation);
                keyboardLayout.setAnimation(animation);
                keyboardLayout.setVisibility(RelativeLayout.GONE);
                ll_main_eq_sub_symbol.setVisibility(View.VISIBLE);
                ll_main_eq_sub_symbol.setVisibility(View.GONE);
            }
        } catch (Exception e){

        }
		/*keyboardLayout.setAnimation(animation);
		}*/
    }

    public void onclkeqsmbl(View v){

        try {

            int id_view = v.getId();
            ll_main_eq_sub_symbol.setVisibility(View.VISIBLE);
            if (ll_visible_view != null){
                ll_visible_view.setVisibility(View.GONE);
            }

            switch (id_view) {

                case R.id.kb_eq_symbol_basicmath_sign1:
                case R.id.kb_eq_symbol_basicmath_sign1_arrow:
                    ll_visible_view = ll_kb_sub_sumbol_basicmath_sign1;
                    Utils.setvisibility_basicmath_subeq(ll_kb_sub_sumbol_basicmath_sign1, ll_kb_sub_sumbol_basicmath_sign2, ll_kb_sub_sumbol_basicmath_sign5);

                    break;

                case R.id.kb_eq_symbol_basicmath_sign2:
                case R.id.kb_eq_symbol_basicmath_sign2_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_basicmath_sign2;
                    Utils.setvisibility_basicmath_subeq(ll_kb_sub_sumbol_basicmath_sign2, ll_kb_sub_sumbol_basicmath_sign1, ll_kb_sub_sumbol_basicmath_sign5);

                    break;

                case R.id.kb_eq_symbol_basicmath_sign5:
                case R.id.kb_eq_symbol_basicmath_sign5_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_basicmath_sign5;
                    Utils.setvisibility_basicmath_subeq(ll_kb_sub_sumbol_basicmath_sign5, ll_kb_sub_sumbol_basicmath_sign1, ll_kb_sub_sumbol_basicmath_sign2);

                    break;

                case R.id.kb_eq_symbol_prealgebra_sign1:
                case R.id.kb_eq_symbol_prealgebra_sign1_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_prealgebra_sign1;
                    Utils.setvisibility_prealgebra_subeq(ll_kb_sub_sumbol_prealgebra_sign1,ll_kb_sub_sumbol_prealgebra_sign2,
                            ll_kb_sub_sumbol_prealgebra_sign4, ll_kb_sub_sumbol_prealgebra_sign5);

                    break;

                case R.id.kb_eq_symbol_prealgebra_sign2:
                case R.id.kb_eq_symbol_prealgebra_sign2_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_prealgebra_sign2;
                    Utils.setvisibility_prealgebra_subeq(ll_kb_sub_sumbol_prealgebra_sign2,ll_kb_sub_sumbol_prealgebra_sign1,
                            ll_kb_sub_sumbol_prealgebra_sign4,ll_kb_sub_sumbol_prealgebra_sign5);

                    break;

                case R.id.kb_eq_symbol_prealgebra_sign4:
                case R.id.kb_eq_symbol_prealgebra_sign4_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_prealgebra_sign4;
                    Utils.setvisibility_prealgebra_subeq(ll_kb_sub_sumbol_prealgebra_sign4, ll_kb_sub_sumbol_prealgebra_sign2,
                            ll_kb_sub_sumbol_prealgebra_sign1, ll_kb_sub_sumbol_prealgebra_sign5);


                    break;

                case R.id.kb_eq_symbol_prealgebra_sign5:
                case R.id.kb_eq_symbol_prealgebra_sign5_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_prealgebra_sign5;
                    Utils.setvisibility_prealgebra_subeq(ll_kb_sub_sumbol_prealgebra_sign5, ll_kb_sub_sumbol_prealgebra_sign1, ll_kb_sub_sumbol_prealgebra_sign2,
                            ll_kb_sub_sumbol_prealgebra_sign4);


                    break;

                case R.id.kb_eq_symbol_algebra_sign1:
                case R.id.kb_eq_symbol_algebra_sign1_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_algebra_sign1;
                    Utils.setvisibility_algebra_subeq(ll_kb_sub_sumbol_algebra_sign1, ll_kb_sub_sumbol_algebra_sign2,
                            ll_kb_sub_sumbol_algebra_sign4, ll_kb_sub_sumbol_algebra_sign5,
                            ll_kb_sub_sumbol_algebra_sign8);


                    break;

                case R.id.kb_eq_symbol_algebra_sign2:
                case R.id.kb_eq_symbol_algebra_sign2_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_algebra_sign2;
                    Utils.setvisibility_algebra_subeq(ll_kb_sub_sumbol_algebra_sign2,ll_kb_sub_sumbol_algebra_sign1,
                            ll_kb_sub_sumbol_algebra_sign4,ll_kb_sub_sumbol_algebra_sign5,
                            ll_kb_sub_sumbol_algebra_sign8);

                    break;

                case R.id.kb_eq_symbol_algebra_sign4:
                case R.id.kb_eq_symbol_algebra_sign4_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_algebra_sign4;
                    Utils.setvisibility_algebra_subeq(ll_kb_sub_sumbol_algebra_sign4,ll_kb_sub_sumbol_algebra_sign2,
                            ll_kb_sub_sumbol_algebra_sign1,
                            ll_kb_sub_sumbol_algebra_sign5,
                            ll_kb_sub_sumbol_algebra_sign8);

                    break;

                case R.id.kb_eq_symbol_algebra_sign5:
                case R.id.kb_eq_symbol_algebra_sign5_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_algebra_sign5;
                    Utils.setvisibility_algebra_subeq(ll_kb_sub_sumbol_algebra_sign5,ll_kb_sub_sumbol_algebra_sign4,
                            ll_kb_sub_sumbol_algebra_sign2,ll_kb_sub_sumbol_algebra_sign1,
                            ll_kb_sub_sumbol_algebra_sign8);

                    break;


                case R.id.kb_eq_symbol_algebra_sign8:
                case R.id.kb_eq_symbol_algebra_sign8_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_algebra_sign8;
                    Utils.setvisibility_algebra_subeq(ll_kb_sub_sumbol_algebra_sign8,ll_kb_sub_sumbol_algebra_sign5,ll_kb_sub_sumbol_algebra_sign4,
                            ll_kb_sub_sumbol_algebra_sign2,ll_kb_sub_sumbol_algebra_sign1
                    );

                    break;

                case R.id.kb_eq_symbol_trignometry_sign1:
                case R.id.kb_eq_symbol_trignometry_sign1_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign1;
                    ll_kb_sub_sumbol_trignometry_sign1.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign2:
                case R.id.kb_eq_symbol_trignometry_sign2_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign2;
                    ll_kb_sub_sumbol_trignometry_sign2.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign3:

                    break;

                case R.id.kb_eq_symbol_trignometry_sign4:
                case R.id.kb_eq_symbol_trignometry_sign4_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign4;
                    ll_kb_sub_sumbol_trignometry_sign4.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign5:
                case R.id.kb_eq_symbol_trignometry_sign5_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign5;
                    ll_kb_sub_sumbol_trignometry_sign5.setVisibility(View.VISIBLE);

                    break;


                case R.id.kb_eq_symbol_trignometry_sign7:
                case R.id.kb_eq_symbol_trignometry_sign7_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign7;
                    ll_kb_sub_sumbol_trignometry_sign7.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign8:
                case R.id.kb_eq_symbol_trignometry_sign8_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign8;
                    ll_kb_sub_sumbol_trignometry_sign8.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign9:
                case R.id.kb_eq_symbol_trignometry_sign9_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign9;
                    ll_kb_sub_sumbol_trignometry_sign9.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign10:
                case R.id.kb_eq_symbol_trignometry_sign10_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign10;
                    ll_kb_sub_sumbol_trignometry_sign10.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign11:
                case R.id.kb_eq_symbol_trignometry_sign11_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign11;
                    ll_kb_sub_sumbol_trignometry_sign11.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign12:
                case R.id.kb_eq_symbol_trignometry_sign12_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign12;
                    ll_kb_sub_sumbol_trignometry_sign12.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_trignometry_sign13:
                case R.id.kb_eq_symbol_trignometry_sign13_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_trignometry_sign13;
                    ll_kb_sub_sumbol_trignometry_sign13.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign1:
                case R.id.kb_eq_symbol_precalculus_sign1_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign1;
                    ll_kb_sub_sumbol_precalculus_sign1.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign2:
                case R.id.kb_eq_symbol_precalculus_sign2_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign2;
                    ll_kb_sub_sumbol_precalculus_sign2.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign3:

                    break;

                case R.id.kb_eq_symbol_precalculus_sign4:
                case R.id.kb_eq_symbol_precalculus_sign4_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign4;
                    ll_kb_sub_sumbol_precalculus_sign4.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign5:
                case R.id.kb_eq_symbol_precalculus_sign5_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign5;
                    ll_kb_sub_sumbol_precalculus_sign5.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign6:

                    break;

                case R.id.kb_eq_symbol_precalculus_sign7:

                    break;

                case R.id.kb_eq_symbol_precalculus_sign9:
                case R.id.kb_eq_symbol_precalculus_sign9_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign9;
                    ll_kb_sub_sumbol_precalculus_sign9.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign10:
                case R.id.kb_eq_symbol_precalculus_sign10_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign10;
                    ll_kb_sub_sumbol_precalculus_sign10.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign11:
                case R.id.kb_eq_symbol_precalculus_sign11_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign11;
                    ll_kb_sub_sumbol_precalculus_sign11.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign12:
                case R.id.kb_eq_symbol_precalculus_sign12_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign12;
                    ll_kb_sub_sumbol_precalculus_sign12.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign13:
                case R.id.kb_eq_symbol_precalculus_sign13_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign13;
                    ll_kb_sub_sumbol_precalculus_sign13.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign14:
                case R.id.kb_eq_symbol_precalculus_sign14_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign14;
                    ll_kb_sub_sumbol_precalculus_sign14.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_precalculus_sign15:
                case R.id.kb_eq_symbol_precalculus_sign15_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_precalculus_sign15;
                    ll_kb_sub_sumbol_precalculus_sign15.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign1:
                case R.id.kb_eq_symbol_calculus_sign1_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign1;
                    ll_kb_sub_sumbol_calculus_sign1.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign2:
                case R.id.kb_eq_symbol_calculus_sign2_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign2;
                    ll_kb_sub_sumbol_calculus_sign2.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign3:

                    break;

                case R.id.kb_eq_symbol_calculus_sign4:
                case R.id.kb_eq_symbol_calculus_sign4_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign4;
                    ll_kb_sub_sumbol_calculus_sign4.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign5:
                case R.id.kb_eq_symbol_calculus_sign5_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign5;
                    ll_kb_sub_sumbol_calculus_sign5.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign6:

                    break;

                case R.id.kb_eq_symbol_calculus_sign7:

                    break;

                case R.id.kb_eq_symbol_calculus_sign8:

                case R.id.kb_eq_symbol_calculus_sign10:
                case R.id.kb_eq_symbol_calculus_sign10_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign10;
                    ll_kb_sub_sumbol_calculus_sign10.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign11:
                case R.id.kb_eq_symbol_calculus_sign11_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign11;
                    ll_kb_sub_sumbol_calculus_sign11.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign12:
                case R.id.kb_eq_symbol_calculus_sign12_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign12;
                    ll_kb_sub_sumbol_calculus_sign12.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign13:
                case R.id.kb_eq_symbol_calculus_sign13_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign13;
                    ll_kb_sub_sumbol_calculus_sign13.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign14:
                case R.id.kb_eq_symbol_calculus_sign14_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign14;
                    ll_kb_sub_sumbol_calculus_sign14.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign15:
                case R.id.kb_eq_symbol_calculus_sign15_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign15;
                    ll_kb_sub_sumbol_calculus_sign15.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_calculus_sign16:
                case R.id.kb_eq_symbol_calculus_sign16_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_calculus_sign16;
                    ll_kb_sub_sumbol_calculus_sign16.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_statistics_sign1:
                case R.id.kb_eq_symbol_statistics_sign1_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_statistics_sign1;
                    ll_kb_sub_sumbol_statistics_sign1.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_statistics_sign2:

                    break;

                case R.id.kb_eq_symbol_statistics_sign3:
                case R.id.kb_eq_symbol_statistics_sign3_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_statistics_sign3;
                    ll_kb_sub_sumbol_statistics_sign3.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_statistics_sign4:
                case R.id.kb_eq_symbol_statistics_sign4_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_statistics_sign4;
                    ll_kb_sub_sumbol_statistics_sign4.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_statistics_sign5:

                    break;

                case R.id.kb_eq_symbol_statistics_sign6:
                case R.id.kb_eq_symbol_statistics_sign6_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_statistics_sign6;
                    ll_kb_sub_sumbol_statistics_sign6.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_statistics_sign7:
                case R.id.kb_eq_symbol_statistics_sign7_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_statistics_sign7;
                    ll_kb_sub_sumbol_statistics_sign7.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_finitemath_sign1:
                case R.id.kb_eq_symbol_finitemath_sign1_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_finitemath_sign1;
                    ll_kb_sub_sumbol_finitemath_sign1.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_finitemath_sign2:
                case R.id.kb_eq_symbol_finitemath_sign2_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_finitemath_sign2;
                    ll_kb_sub_sumbol_finitemath_sign2.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_finitemath_sign3:

                    break;

                case R.id.kb_eq_symbol_finitemath_sign4:
                case R.id.kb_eq_symbol_finitemath_sign4_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_finitemath_sign4;
                    ll_kb_sub_sumbol_finitemath_sign4.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_finitemath_sign5:
                case R.id.kb_eq_symbol_finitemath_sign5_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_finitemath_sign5;
                    ll_kb_sub_sumbol_finitemath_sign5.setVisibility(View.VISIBLE);

                    break;

                case R.id.kb_eq_symbol_finitemath_sign8:
                case R.id.kb_eq_symbol_finitemath_sign8_arrow:

                    ll_visible_view = ll_kb_sub_sumbol_finitemath_sign8;
                    ll_kb_sub_sumbol_finitemath_sign8.setVisibility(View.VISIBLE);

                    break;



            }
        } catch (Exception e){

        }
    }

    protected void setanimationtoeqsymbols1() {

        try {
            animation = AnimationUtils.loadAnimation(this, R.anim.symbol_hide_animation);
            hsv_keyboard_eq_symbol.setAnimation(animation);
        } catch (Exception e){

        }

    }

    protected void setanimationtoeqsymbols2() {
        try {
            animation = AnimationUtils.loadAnimation(this, R.anim.symbol_show_animation);
            hsv_keyboard_eq_symbol.setAnimation(animation);
        } catch (Exception e){

        }
    }

    public void onkbclick(View v) {
        try {
            int id_view = v.getId();

            switch (id_view) {

                case R.id.btn_eq_name_pre_scroll:

                    this.callscrollmethod(1);

                    break;

                case R.id.btn_eq_name_next_scroll:

                    this.callscrollmethod(2);

                    break;

                case R.id.btn_eq_symbol_pre_scroll:

                    this.callscrollmethod(3);

                    break;

                case R.id.btn_eq_symbol_next_scroll:

                    this.callscrollmethod(4);

                    break;

                case R.id.kb_btn_abc_close:

                    hideKeyboard();

                    break;

                case R.id.kb_btn_123_close:

                    hideKeyboard();

                    break;

                case R.id.kb_btn_abc:

                    setvisibilityofabc123layout(2);

                    break;

                case R.id.kb_btn_123:

                    setvisibilityofabc123layout(1);

                    break;

                case R.id.kb_btn_abc_case:

                    this.changecasevalue();

                    break;

                case R.id.kb_tv_eq_name_basicmath:

                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_basicmath, kb_tv_eq_name_prealgebra, kb_tv_eq_name_algebra, kb_tv_eq_name_trignometry,
                            kb_tv_eq_name_precalculus, kb_tv_eq_name_calculus, kb_tv_eq_name_statistics, kb_tv_eq_name_finitemath);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {


                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_basicmath, kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_algebra, kb_ll_eq_symbol_trignometry,
                                    kb_ll_eq_symbol_precalculus, kb_ll_eq_symbol_calculus, kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_finitemath);
                            setanimationtoeqsymbols2();

                        }
                    }, 500);

                    this.setvisibility_scroll_btn(false);

                    break;

                case R.id.kb_tv_eq_name_prealgebra:

                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_prealgebra, kb_tv_eq_name_basicmath, kb_tv_eq_name_algebra, kb_tv_eq_name_trignometry,
                            kb_tv_eq_name_precalculus, kb_tv_eq_name_calculus, kb_tv_eq_name_statistics, kb_tv_eq_name_finitemath
                    );

                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_basicmath, kb_ll_eq_symbol_algebra, kb_ll_eq_symbol_trignometry,
                                    kb_ll_eq_symbol_precalculus, kb_ll_eq_symbol_calculus, kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_finitemath);
                            setanimationtoeqsymbols2();

                        }
                    }, 500);

                    this.setvisibility_scroll_btn(false);

                    break;

                case R.id.kb_tv_eq_name_algebra:

                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_algebra, kb_tv_eq_name_basicmath, kb_tv_eq_name_prealgebra, kb_tv_eq_name_trignometry,
                            kb_tv_eq_name_precalculus, kb_tv_eq_name_calculus, kb_tv_eq_name_statistics, kb_tv_eq_name_finitemath);

                    Handler handler3 = new Handler();
                    handler3.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_algebra, kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_basicmath, kb_ll_eq_symbol_trignometry,
                                    kb_ll_eq_symbol_precalculus, kb_ll_eq_symbol_calculus, kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_finitemath);
                            setanimationtoeqsymbols2();
                        }
                    }, 500);

                    this.setvisibility_scroll_btn(true);

                    break;

                case R.id.kb_tv_eq_name_trignometry:
                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_trignometry, kb_tv_eq_name_basicmath, kb_tv_eq_name_prealgebra, kb_tv_eq_name_algebra,
                            kb_tv_eq_name_precalculus, kb_tv_eq_name_calculus, kb_tv_eq_name_statistics, kb_tv_eq_name_finitemath);

                    Handler handler4 = new Handler();
                    handler4.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_trignometry, kb_ll_eq_symbol_algebra, kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_basicmath,
                                    kb_ll_eq_symbol_precalculus, kb_ll_eq_symbol_calculus, kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_finitemath);
                            setanimationtoeqsymbols2();
                        }
                    }, 500);

                    this.setvisibility_scroll_btn(true);

                    break;

                case R.id.kb_tv_eq_name_precalculus:
                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_precalculus, kb_tv_eq_name_basicmath, kb_tv_eq_name_prealgebra, kb_tv_eq_name_algebra, kb_tv_eq_name_trignometry,
                            kb_tv_eq_name_calculus, kb_tv_eq_name_statistics, kb_tv_eq_name_finitemath);

                    Handler handler5 = new Handler();
                    handler5.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_precalculus, kb_ll_eq_symbol_trignometry, kb_ll_eq_symbol_algebra,
                                    kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_basicmath,
                                    kb_ll_eq_symbol_calculus, kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_finitemath);
                            setanimationtoeqsymbols2();
                        }
                    }, 500);

                    this.setvisibility_scroll_btn(true);

                    break;

                case R.id.kb_tv_eq_name_calculus:
                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_calculus, kb_tv_eq_name_basicmath, kb_tv_eq_name_prealgebra, kb_tv_eq_name_algebra, kb_tv_eq_name_trignometry,
                            kb_tv_eq_name_precalculus, kb_tv_eq_name_statistics, kb_tv_eq_name_finitemath);

                    Handler handler6 = new Handler();
                    handler6.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_calculus, kb_ll_eq_symbol_precalculus, kb_ll_eq_symbol_trignometry,
                                    kb_ll_eq_symbol_algebra, kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_basicmath,
                                    kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_finitemath);
                            setanimationtoeqsymbols2();
                        }
                    }, 500);

                    this.setvisibility_scroll_btn(true);

                    break;

                case R.id.kb_tv_eq_name_statistics:
                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_statistics, kb_tv_eq_name_basicmath, kb_tv_eq_name_prealgebra, kb_tv_eq_name_algebra, kb_tv_eq_name_trignometry,
                            kb_tv_eq_name_precalculus, kb_tv_eq_name_calculus, kb_tv_eq_name_finitemath);

                    Handler handler7 = new Handler();
                    handler7.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_calculus, kb_ll_eq_symbol_precalculus,
                                    kb_ll_eq_symbol_trignometry, kb_ll_eq_symbol_algebra, kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_basicmath,
                                    kb_ll_eq_symbol_finitemath);
                            setanimationtoeqsymbols2();
                        }
                    }, 500);

                    this.setvisibility_scroll_btn(true);

                    break;

                case R.id.kb_tv_eq_name_finitemath:
                    setanimationtoeqsymbols1();

                    Utils.changetextbg(kb_tv_eq_name_finitemath, kb_tv_eq_name_basicmath, kb_tv_eq_name_prealgebra, kb_tv_eq_name_algebra, kb_tv_eq_name_trignometry,
                            kb_tv_eq_name_precalculus, kb_tv_eq_name_calculus, kb_tv_eq_name_statistics);

                    Handler handler8 = new Handler();
                    handler8.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Utils.setvisibility_eq_symbol(kb_ll_eq_symbol_finitemath, kb_ll_eq_symbol_statistics, kb_ll_eq_symbol_calculus,
                                    kb_ll_eq_symbol_precalculus, kb_ll_eq_symbol_trignometry, kb_ll_eq_symbol_algebra,
                                    kb_ll_eq_symbol_prealgebra, kb_ll_eq_symbol_basicmath);
                            setanimationtoeqsymbols2();
                        }
                    }, 500);

                    this.setvisibility_scroll_btn(true);

                    break;


            }
            ll_main_eq_sub_symbol.setVisibility(View.VISIBLE);
            ll_main_eq_sub_symbol.setVisibility(View.GONE);
        } catch (Exception e){

        }
    }

    private void setvisibilityofabc123layout(int int_layout){ // Added By Siddhi Info Soft

        if (int_layout == 1) {
            kb_ll_123.setVisibility(View.VISIBLE);
            kb_ll_abc.setVisibility(View.GONE);
        } else {
            kb_ll_123.setVisibility(View.GONE);
            kb_ll_abc.setVisibility(View.VISIBLE);
        }

    }

    public void onkb_abc_click(View v) { // Added By Siddhi Info Soft

        try {

            String btn_tag = (String)v.getTag();
            this.setTextToSelectedTextView(selectedTextView, btn_tag);
            ll_main_eq_sub_symbol.setVisibility(View.VISIBLE);
            ll_main_eq_sub_symbol.setVisibility(View.GONE);

        } catch (Exception e){

        }

    }

    public void onkb_123_click(View v) { // Added By Siddhi Info Soft

        try {

            String btn_tag = String.valueOf(v.getTag());
            this.setTextToSelectedTextView(selectedTextView, btn_tag);
            ll_main_eq_sub_symbol.setVisibility(View.VISIBLE);
            ll_main_eq_sub_symbol.setVisibility(View.GONE);

        } catch (Exception e){

        }

    }

    public void onkb_123_symbol_click(View v) { // Added By Siddhi Info Soft

        try {

            String btn_tag = String.valueOf(v.getTag());
            this.add_sign_into_box(btn_tag);
            ll_main_eq_sub_symbol.setVisibility(View.VISIBLE);
            ll_main_eq_sub_symbol.setVisibility(View.GONE);

        } catch (Exception e){

        }

    }


    public void onkb_sub_symbol_click(View v) { // Added By Siddhi Info Soft

        try {

            String btn_tag = String.valueOf(v.getTag());

            ll_main_eq_sub_symbol.setVisibility(View.VISIBLE);
            ll_main_eq_sub_symbol.setVisibility(View.GONE);

            if (btn_tag.equals("fraction") ||
                    btn_tag.equals("pointview")
                    || btn_tag.equals("lim") || btn_tag.equals("parenthesis") | btn_tag.equals("squareroot") || btn_tag.equals("nthroot")
                    || btn_tag.equals("super_script") || btn_tag.equals("sub_script") || btn_tag.equals("super_sub_script")) {
                this.addviewtoselectedview(ll_ans_box_selected, btn_tag, "view");
            } else if( btn_tag.equals("absolute")) {
                setTextToSelectedTextView(selectedTextView,"|  |");
            } else {
                this.add_sign_into_box(btn_tag);
            }

        } catch (Exception e){

        }

    }

    private void add_sign_into_box(final String tag){

        String str_text = "";
        boolean is_operator = false;

        if (tag.equals("op_plus")) {
            str_text = ""+Html.fromHtml("&#43;");
            is_operator = true;
        } else if (tag.equals("op_minus")) {
            str_text = ""+Html.fromHtml("&#8722;");
            is_operator = true;
        } else if (tag.equals("op_equal")) {
            str_text = ""+Html.fromHtml("&#61;");
            is_operator = true;
        } else if (tag.equals("op_multi")) {
            str_text = ""+Html.fromHtml("&#215;");
            is_operator = true;
        } else if (tag.equals("op_divide")) {
            str_text = ""+Html.fromHtml("&#247;");
            is_operator = true;
        } else if (tag.equals("op_union")) {
            str_text = ""+Html.fromHtml("&#8746;");
        } else if (tag.equals("op_intersection")) {
            str_text = ""+Html.fromHtml("&#8745;");
        } else if (tag.equals("op_pi")) {
            str_text = ""+Html.fromHtml("&#960;");
        } else if (tag.equals("op_factorial")) {
            str_text = ""+Html.fromHtml("&#33;");
        } else if (tag.equals("op_percentage")) {
            str_text = ""+Html.fromHtml("&#37;");
        } else if (tag.equals("op_rarrow")) {
            str_text = ""+Html.fromHtml("&#8594;");
        } else if (tag.equals("op_xbar")) {
            str_text = ""+Html.fromHtml("x&#x0304;");
        } else if (tag.equals("op_muxbar")) {
            str_text = ""+Html.fromHtml("&#956;") + "" + Html.fromHtml("x&#772;");
        } else if (tag.equals("op_sigmaxbar")) {
            str_text = ""+Html.fromHtml("&#963;") + "" + Html.fromHtml("x&#772;");
        } else if (tag.equals("op_goe")) {
            str_text = ""+Html.fromHtml("&#8805;");
            is_operator = true;
        } else if (tag.equals("op_loe")) {
            str_text = ""+Html.fromHtml("&#8804;");
            is_operator = true;
        } else if (tag.equals("op_grthan")) {
            str_text = ""+Html.fromHtml("&#62;");
            is_operator = true;
        } else if (tag.equals("op_lethan")) {
            str_text = ""+Html.fromHtml("&#60;");
            is_operator = true;
        } else if (tag.equals("op_infinity")) {
            str_text = ""+Html.fromHtml("&#8734;");
        } else if (tag.equals("op_degree")) {
            str_text = ""+Html.fromHtml("&#176;");
        } else if(tag.equals("op_integral")) {
            str_text = " "+Html.fromHtml("&#8747;");
        } else if(tag.equals("op_summation")) {
            str_text = " "+Html.fromHtml("&#8721;");
        } else if(tag.equals("op_alpha")) {
            str_text = " "+Html.fromHtml("&#945;");
        } else if(tag.equals("op_theta")) {
            str_text = " ø";
        } else if(tag.equals("op_mu")) {
            str_text = " "+Html.fromHtml("&#956;");
        } else if(tag.equals("op_sigma")) {
            str_text = " "+Html.fromHtml("&#963;");
        } else{
            str_text = tag;
        }

        if (is_operator){
            setTextToSelectedTextView2(selectedTextView," "+str_text+" ");
        } else {
            setTextToSelectedTextView2(selectedTextView, str_text);
        }

    }

    public void onkb_sum_symbol_click(View v){

        try {
            String btn_tag = String.valueOf(v.getTag());
            String str_text = "";
            if(btn_tag.equals("op_integral")) {
                str_text = " "+Html.fromHtml("&#8747;");
            } else if(btn_tag.equals("op_summation")) {
                str_text = " "+Html.fromHtml("&#8721;");
            }

            SpannableString ss1=  new SpannableString(str_text);
            ss1.setSpan(new RelativeSizeSpan(2f), 1, 2, 0);

            selectedTextView.getText().insert(selectedTextView.getSelectionStart(), ss1);

        } catch (Exception e){

        }

    }

    private void addnewed(final LinearLayout ll_main,final String str_cut,final int pos,final int text_size){

//        String sss = String.valueOf(ll_main.getTag(R.id.first));
//        int tag1 = Integer.valueOf(sss);
//        String tag2 = String.valueOf(ll_main.getTag(R.id.second));
//        int text_size = 22;
//
//        try {
//
//            if (tag2.equals("super_top") || tag2.equals("sub_bottom") || tag2.equals("ss_top") ||
//                    tag2.equals("ss_bottom") || tag2.equals("nth_top") || tag2.equals("lim_left") || tag2.equals("lim_right")){
//                text_size = (text_size - 3)-(tag1+1);
//            } else if(tag2.equals("frac_top") || tag2.equals("frac_bottom") || tag2.equals("sqrt_c") || tag2.equals("nth_bottom")
//                    || tag2.equals("parenthesis_center")){
//                text_size = text_size-(tag1+1);
//            }
//
//        } catch (Exception e){
//
//        }

        final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
        ll_last.setTag("text");
        final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
        // ed_centre.setText(str_cut);
        this.replacesignfromchar(str_cut, ed_centre);
        ed_centre.setMinWidth(20);
        ed_centre.setTextSize(text_size);
        ll_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
            }
        });
        ed_centre.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
                return false;
            }
        });
        ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    selectedTextView = ed_centre;
                    ll_selected_view = ll_last;
                    selected_ed_2 = null;
                    ll_ans_box_selected = ll_main;
                }
            }
        });

        ll_main.addView(ll_last, (pos + 2));

        //   }

    }

    private void add_last_ed(final LinearLayout ll_main,final int textsize,final int pos){

        String sss = String.valueOf(ll_main.getTag(R.id.first));
        int tag1 = Integer.valueOf(sss);
        String tag2 = String.valueOf(ll_main.getTag(R.id.second));
        int text_size = MainActivity.this.getResources().getInteger(R.integer.kb_textsize_main_int);

        try {

            if (tag2.equals("super_top") || tag2.equals("sub_bottom") || tag2.equals("ss_top") ||
                    tag2.equals("ss_bottom") || tag2.equals("nth_top") || tag2.equals("lim_left") || tag2.equals("lim_right")){
                text_size = (text_size - 1)-(tag1+1);
            } else if(tag2.equals("frac_top") || tag2.equals("frac_bottom") || tag2.equals("sqrt_c") || tag2.equals("nth_bottom")
                    || tag2.equals("parenthesis_center")){
                text_size = text_size-(tag1+1);
            }

        } catch (Exception e){

        }
        if (text_size<5){
            text_size = 5;
        }

        final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
        ll_last.setTag("text");
        final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
        ed_centre.setMinWidth(10);
        ed_centre.setTextSize(text_size);
        ll_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
            }
        });
        ed_centre.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
                return false;
            }
        });
        ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    selectedTextView = ed_centre;
                    ll_selected_view = ll_last;
                    selected_ed_2 = null;
                    ll_ans_box_selected = ll_main;
                }
            }
        });
        Log.e("delete6", "1234");
        ll_main.addView(ll_last, pos);
        Log.e("delete7", "1234");
        ed_centre.requestFocus();
    }

    private void add_ed_after_delete(final LinearLayout ll_main,final int textsize,final int pos){

        String sss = String.valueOf(ll_main.getTag(R.id.first));
        int tag1 = Integer.valueOf(sss);
        String tag2 = String.valueOf(ll_main.getTag(R.id.second));
        int text_size = MainActivity.this.getResources().getInteger(R.integer.kb_textsize_main_int);

        try {

            if (tag2.equals("super_top") || tag2.equals("sub_bottom") || tag2.equals("ss_top") ||
                    tag2.equals("ss_bottom") || tag2.equals("nth_top") || tag2.equals("lim_left") || tag2.equals("lim_right")){
                text_size = (text_size - 1)-(tag1+1);
            } else if(tag2.equals("frac_top") || tag2.equals("frac_bottom") || tag2.equals("sqrt_c") || tag2.equals("nth_bottom")
                    || tag2.equals("parenthesis_center")){
                text_size = text_size-(tag1+1);
            }

        } catch (Exception e){

        }
        if (text_size<5){
            text_size = 5;
        }
        final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
        ll_last.setTag("text");
        final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
        ed_centre.setMinWidth(20);
        ed_centre.setTextSize(text_size);
        ll_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
            }
        });
        ed_centre.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
                return false;
            }
        });
        ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                custom_ed_focus(ed_centre, ll_last, ll_main, hasFocus);
            }
        });
        //   Utils.change_edittext_bg(true, ed_centre);
        Log.e("edd2", "" + pos);
        ll_main.addView(ll_last, pos);
        ed_centre.requestFocus();

    }

    private void custom_ed_touch(final EditTextBlink ed,final LinearLayout ll_sub, final LinearLayout ll_main) {

        try {

            ed.setCursorVisible(true);
            selectedTextView = ed;
            ll_selected_view = ll_sub;
            ll_ans_box_selected = ll_main;
            selected_ed_2 = null;
            showKeyboard();

        } catch (Exception e){
        }
    }

    private void add_inside_ed(final LinearLayout ll_main,final boolean req_focus,int text_size){

        String tag2 = String.valueOf(ll_main.getTag(R.id.second));

        try {

            if (tag2.equals("super_top") || tag2.equals("sub_bottom") || tag2.equals("ss_top") ||
                    tag2.equals("ss_bottom") || tag2.equals("nth_top") || tag2.equals("lim_left") || tag2.equals("lim_right")){
                // text_size = (text_size - 3)-(tag1+1);
                text_size = text_size-3;
            } else if(tag2.equals("frac_top") || tag2.equals("frac_bottom") || tag2.equals("sqrt_c") || tag2.equals("nth_bottom")
                    || tag2.equals("parenthesis_center")){
                //  text_size = text_size-(tag1+1);
                text_size = text_size-1;
            }

        } catch (Exception e){
            text_size = 22;
        }

        Log.e("text_size",""+text_size);
        final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
        ll_last.setTag("text");
        final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
        ed_centre.setMinWidth(25);
        ed_centre.setTextSize(text_size);
        ll_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
            }
        });
        ed_centre.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                custom_ed_touch(ed_centre, ll_last, ll_main);
                return false;
            }
        });
        ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                custom_ed_focus(ed_centre, ll_last, ll_main, hasFocus);
            }
        });
        Utils.change_edittext_bg(true, ed_centre);
        ll_main.addView(ll_last);

        Log.e("het", "" + ll_last.getHeight());
        ll_main.requestLayout();

        if (req_focus){
            ed_centre.requestFocus();
        }

    }

    private void custom_ed_focus(final EditTextBlink ed,final LinearLayout ll_sub, final LinearLayout ll_main,final boolean hasFocus) {

        if (!(ll_main.getTag(R.id.second).equals("main"))) {
            Utils.change_edittext_bg(hasFocus, ed);
        }

        if (hasFocus){
            selectedTextView = ed;
            ll_selected_view = ll_sub;
            selected_ed_2 = null;
            ll_ans_box_selected = ll_main;
        }

    }

    private void addviewtoselectedview(final LinearLayout ll_ans_box, String tag,String type) {  // Added By Siddhi Info Soft
        boolean is_devide=false;
        int start_pos = 0,ed_legnth=0,ll_sub_selected_pos=0;
        String cut_str="";
        String sss = String.valueOf(ll_ans_box.getTag(R.id.first));
        int tag_main_ll = Integer.valueOf(sss);
        boolean need_delete = false;
        int text_size = MainActivity.this.getResources().getInteger(R.integer.kb_textsize_main_int);

        try {
            DisplayMetrics metrics;
            metrics = getApplicationContext().getResources().getDisplayMetrics();
            float Textsize =selectedTextView.getTextSize()/metrics.density;
            text_size = Math.round(Textsize);
            Log.e("text_size",""+text_size);
            if (text_size<5){
                text_size = 5;
            }

        } catch (Exception e){
            text_size = 16;
        }

        try {

            start_pos = selectedTextView.getSelectionStart();
            ed_legnth = selectedTextView.getText().toString().length();

            try {
                ll_sub_selected_pos = ll_ans_box_selected.indexOfChild(ll_selected_view);
            } catch (Exception e){
                ll_sub_selected_pos = 0;
            }

            try {
                if (ll_sub_selected_pos == -1){
                    ll_sub_selected_pos = 0;
                }

                if (start_pos != 0 && start_pos < ed_legnth){
                    cut_str = selectedTextView.getText().toString();
                    cut_str = cut_str.substring(start_pos, ed_legnth);
                    is_devide = true;
                    Log.e("math_ed_pos",cut_str+""+ll_sub_selected_pos);
                    selectedTextView.getText().delete(start_pos,ed_legnth);
                }
            } catch (Exception e){
            }

            try {
                if (selectedTextView.getText().toString().trim().length() == 0){
                    need_delete = true;
                }
            } catch (Exception e){
            }

            try {

                LinearLayout ll_last = (LinearLayout)ll_ans_box.getChildAt((ll_ans_box.getChildCount()-1));
                String str_tag = String.valueOf(ll_last.getTag());
                if (str_tag.equals("text")){
                    EditTextBlink ed_last = (EditTextBlink)ll_last.getChildAt(0);
                    if (ed_last.getText().toString().trim().length() == 0){

                        try {
                            if (ll_ans_box.getChildCount()>1){
                                LinearLayout ll_last_2 = (LinearLayout)ll_ans_box.getChildAt((ll_ans_box.getChildCount()-2));
                                String str_tag_2 = String.valueOf(ll_last_2.getTag());
                                if (str_tag_2.equals("text")){
                                    ll_ans_box.removeView(ll_last);
                                } else {
                                    ed_last.setMinWidth(4);
                                }
                            } else {
                                ed_last.setMinWidth(4);
                            }
                        } catch (Exception e){
                        }
                    } else {
                        ed_last.setMinWidth(15);
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }

            if (type.equals("view")) {
                selected_ed_2 = null;
                if (tag.equals("super_script")) {

                    final LinearLayout ll_super_script = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_superscript, null);
                    ll_super_script.setTag("super_script");
                    final LinearLayout ll_top_superscript = (LinearLayout) ll_super_script.findViewById(R.id.ll_top_superscript);
                    ll_top_superscript.setTag(R.id.first, (tag_main_ll + 1));
                    ll_top_superscript.setTag(R.id.second, "super_top");

                    add_inside_ed(ll_top_superscript, true, text_size);

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_super_script, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_super_script, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }
                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                } else if(tag.equals("sub_script")) {

                    final LinearLayout ll_sub_script = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_subscript, null);
                    ll_sub_script.setTag("sub_script");
                    final LinearLayout ll_bottom_subscript = (LinearLayout) ll_sub_script.findViewById(R.id.ll_bottom_subscript);
                    ll_bottom_subscript.setTag(R.id.first,(tag_main_ll + 1));
                    ll_bottom_subscript.setTag(R.id.second, "sub_bottom");
                    add_inside_ed(ll_bottom_subscript, true, text_size);

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_sub_script, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_sub_script, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }
                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                } else if(tag.equals("super_sub_script")) {

                    final LinearLayout ll_super_sub_script = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_super_sub_script, null);
                    ll_super_sub_script.setTag("super_sub_script");

                    final LinearLayout ll_top_super_sub_script = (LinearLayout)ll_super_sub_script.findViewById(R.id.ll_top_super_sub_script);
                    final LinearLayout ll_bottom_super_sub_script = (LinearLayout)ll_super_sub_script.findViewById(R.id.ll_bottom_super_sub_script);
                    ll_top_super_sub_script.setTag(R.id.first,(tag_main_ll+1));
                    ll_bottom_super_sub_script.setTag(R.id.first,(tag_main_ll + 1));
                    ll_top_super_sub_script.setTag(R.id.second,"ss_top");
                    ll_bottom_super_sub_script.setTag(R.id.second, "ss_bottom");
                    add_inside_ed(ll_top_super_sub_script,true,text_size);
                    add_inside_ed(ll_bottom_super_sub_script, false,text_size);

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_super_sub_script, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_super_sub_script, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }
                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                } else if (tag.equals("fraction")) {

                    final LinearLayout ll_fraction = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_fraction, null);
                    final LinearLayout ll_fraction_top = (LinearLayout)ll_fraction.findViewById(R.id.ll_fraction_top);
                    final LinearLayout ll_fraction_bottom = (LinearLayout)ll_fraction.findViewById(R.id.ll_fraction_bottom);
                    ll_fraction_top.setTag(R.id.first, (tag_main_ll + 1));
                    ll_fraction_bottom.setTag(R.id.first, (tag_main_ll + 1));
                    ll_fraction_top.setTag(R.id.second, "frac_top");
                    ll_fraction_bottom.setTag(R.id.second, "frac_bottom");
                    add_inside_ed(ll_fraction_top, true,text_size);
                    add_inside_ed(ll_fraction_bottom, false,text_size);

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_fraction, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_fraction, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }

                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                } else if (tag.equals("squareroot")) {

                    final LinearLayout ll_squareroot = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_square_root, null);
                    final LinearLayout ll_center_square_root = (LinearLayout) ll_squareroot.findViewById(R.id.ll_center_square_root);
                    ll_center_square_root.setTag(R.id.first,(tag_main_ll + 1));
                    ll_center_square_root.setTag(R.id.second, "sqrt_c");
                    add_inside_ed(ll_center_square_root, true,text_size);

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_squareroot, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_squareroot, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }
                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                } else if (tag.equals("nthroot")) {

                    final LinearLayout ll_nthroot = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_nth_root, null);

                    final LinearLayout ll_top_nth_root = (LinearLayout) ll_nthroot.findViewById(R.id.ll_top_nth_root);
                    final LinearLayout ll_center_nth_root = (LinearLayout) ll_nthroot.findViewById(R.id.ll_center_nth_root);
                    final ImageView img = (ImageView) ll_nthroot.findViewById(R.id.img);
                    ll_top_nth_root.setTag(R.id.first,(tag_main_ll + 1));
                    ll_center_nth_root.setTag(R.id.first,(tag_main_ll + 1));
                    ll_top_nth_root.setTag(R.id.second,"nth_top");
                    ll_center_nth_root.setTag(R.id.second,"nth_bottom");
                    add_inside_ed(ll_top_nth_root, true, text_size);
                    add_inside_ed(ll_center_nth_root, false, text_size);
                    img.getLayoutParams().height = ll_center_nth_root.getHeight();
                    img.requestLayout();
                    ll_center_nth_root.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                        @Override
                        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            Log.e("het", "" + v.getHeight());
                            img.getLayoutParams().height = v.getHeight();
                            img.requestLayout();
                        }
                    });

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_nthroot, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_nthroot, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }
                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                }  else if (tag.equals("lim")) {

                    final LinearLayout ll_lim = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_lim, null);
                    final TextView tv_text = (TextView) ll_lim.findViewById(R.id.tv_text);
                    tv_text.setText(Html.fromHtml("&#8594;"));
                    final LinearLayout ll_lim_left = (LinearLayout)ll_lim.findViewById(R.id.ll_lim_left);
                    final LinearLayout ll_lim_right = (LinearLayout)ll_lim.findViewById(R.id.ll_lim_right);
                    ll_lim_left.setTag(R.id.first, (tag_main_ll + 1));
                    ll_lim_right.setTag(R.id.first, (tag_main_ll + 1));
                    ll_lim_left.setTag(R.id.second, "lim_left");
                    ll_lim_right.setTag(R.id.second, "lim_right");
                    add_inside_ed(ll_lim_left, true,text_size);
                    add_inside_ed(ll_lim_right, false,text_size);

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_lim, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_lim, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }

                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                } else if(tag.equals("parenthesis")) {

                    final LinearLayout ll_parenthesis = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_parenthesis, null);
                    ll_parenthesis.setTag("parenthesis");
                    final LinearLayout ll_parenthesis_center = (LinearLayout) ll_parenthesis.findViewById(R.id.ll_parenthesis_center);
                    ll_parenthesis_center.setTag(R.id.first, (tag_main_ll + 1));
                    ll_parenthesis_center.setTag(R.id.second, "parenthesis_center");
                    add_inside_ed(ll_parenthesis_center, true,text_size);

                    if (start_pos==0 && !need_delete){
                        ll_ans_box.addView(ll_parenthesis, ll_sub_selected_pos);
                    } else {
                        ll_ans_box.addView(ll_parenthesis, (ll_sub_selected_pos + 1));
                    }

                    if (is_devide){
                        addnewed(ll_ans_box,cut_str,ll_sub_selected_pos,text_size);
                    }
                    if (need_delete){
                        ll_ans_box.removeViewAt(ll_sub_selected_pos);
                    }

                }
            }

            LinearLayout ll_last_2 = (LinearLayout)ll_ans_box.getChildAt((ll_ans_box.getChildCount()-1));
            String str_tag = String.valueOf(ll_last_2.getTag());
            if (str_tag.equals("text")) {
                EditTextBlink ed_last = (EditTextBlink) ll_last_2.getChildAt(0);
                ed_last.setMinWidth(5);

            } else {

                final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
                ll_last.setTag("text");
                final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
                ed_centre.setTextSize(text_size);
                ed_centre.setMinWidth(5);
                ll_last.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ed_centre.setCursorVisible(true);
                        selectedTextView = ed_centre;
                        ll_selected_view = ll_last;
                        ll_ans_box_selected = ll_ans_box;
                        selected_ed_2 = null;
                        showKeyboard();
                    }
                });
                ed_centre.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        ed_centre.setCursorVisible(true);
                        selectedTextView = ed_centre;
                        ll_selected_view = ll_last;
                        ll_ans_box_selected = ll_ans_box;
                        selected_ed_2 = null;
                        showKeyboard();
                        return false;
                    }
                });
                ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            selectedTextView = ed_centre;
                            ll_selected_view = ll_last;
                            selected_ed_2 = null;
                            ll_ans_box_selected = ll_ans_box;
                        }
                    }
                });

                ll_ans_box.addView(ll_last);

            }

        } catch (Exception e){

        }
    }

    public void setstudentansbox(final String customeAns,final LinearLayout ll_ans_box,final
    String playerAns) {
        try {



                if (playerAns != null) {

                    String str_ans = "";

                    if (str_ans.trim().length() != 0){
                        setstudentansboxsub(str_ans,ll_ans_box);
                    }

                }

                final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
                ll_last.setTag("text");
                final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
                ed_centre.setMinWidth(20);
                ed_centre.setTextSize(22);
                ll_last.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        custom_ed_touch(ed_centre, ll_last, ll_ans_box);
                    }
                });
                ed_centre.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        custom_ed_touch(ed_centre, ll_last, ll_ans_box);
                        return false;
                    }
                });
                ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            selectedTextView = ed_centre;
                            ll_selected_view = ll_last;
                            ll_ans_box_selected = ll_ans_box;
                        }
                    }
                });
                ll_ans_box.addView(ll_last);


        } catch (Exception e) {

        }
    }

    public void setstudentansboxsub(final String str_ans,final LinearLayout ll_ans_box) {

        String[] str_1 = str_ans.split(ll_ans_box.getTag(R.id.first) + "_" + ll_ans_box.getTag(R.id.first));

        String sss = String.valueOf(ll_ans_box.getTag(R.id.first));
        int tag_main_ll = Integer.valueOf(sss);

        for (int i = 0; i < str_1.length; i++) {

            String str_1_value = str_1[i];

            if (str_1_value.startsWith("text")) {

                str_1_value = str_1_value.substring(5);

                String sss1 = String.valueOf(ll_ans_box.getTag(R.id.first));
                int tag1 = Integer.valueOf(sss1);
                String tag2 = String.valueOf(ll_ans_box.getTag(R.id.second));
                int text_size = MainActivity.this.getResources().getInteger(R.integer.kb_textsize_main_int);

                try {

                    if (tag2.equals("super_top") || tag2.equals("sub_bottom") || tag2.equals("ss_top") ||
                            tag2.equals("ss_bottom") || tag2.equals("nth_top") || tag2.equals("lim_left") || tag2.equals("lim_right")){
                        text_size = (text_size - 1)-(tag1+1);
                    } else if(tag2.equals("frac_top") || tag2.equals("frac_bottom") || tag2.equals("sqrt_c") || tag2.equals("nth_bottom")
                            || tag2.equals("parenthesis_center")){
                        text_size = text_size-(tag1+1);
                    }

                } catch (Exception e){

                }

                final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
                ll_last.setTag("text");
                final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
                this.replacesignfromchar(str_1_value, ed_centre);
                ed_centre.setMinWidth(20);
                ed_centre.setTextSize(text_size);
                ll_last.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        custom_ed_touch(ed_centre, ll_last, ll_ans_box);
                    }
                });
                ed_centre.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        custom_ed_touch(ed_centre, ll_last, ll_ans_box);
                        return false;
                    }
                });
                ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (hasFocus) {
                            selectedTextView = ed_centre;
                            ll_selected_view = ll_last;
                            ll_ans_box_selected = ll_ans_box;
                        }
                    }
                });

                ll_ans_box.addView(ll_last);

            }  if (str_1_value.startsWith("fraction")) {

                str_1_value = str_1_value.substring(8);

                final LinearLayout ll_fraction = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_fraction, null);
                final LinearLayout ll_fraction_top = (LinearLayout)ll_fraction.findViewById(R.id.ll_fraction_top);
                final LinearLayout ll_fraction_bottom = (LinearLayout)ll_fraction.findViewById(R.id.ll_fraction_bottom);
                ll_fraction_top.setTag(R.id.first, (tag_main_ll + 1));
                ll_fraction_bottom.setTag(R.id.first, (tag_main_ll + 1));
                ll_fraction_top.setTag(R.id.second, "frac_top");
                ll_fraction_bottom.setTag(R.id.second, "frac_bottom");

                final String[] str_2 = str_1_value.split("frac_btm_"+ll_ans_box.getTag(R.id.first));

                ll_ans_box.addView(ll_fraction);

                this.setstudentansboxsub(str_2[0], ll_fraction_top);
                this.setstudentansboxsub(str_2[1], ll_fraction_bottom);

            } else if(str_1_value.startsWith("super_script")) {
                str_1_value = str_1_value.substring(12);

                final LinearLayout ll_super_script = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_superscript, null);
                final LinearLayout ll_top_superscript = (LinearLayout)ll_super_script.findViewById(R.id.ll_top_superscript);
                ll_top_superscript.setTag(R.id.first,(tag_main_ll + 1));
                ll_top_superscript.setTag(R.id.second, "super_top");

                ll_ans_box.addView(ll_super_script);

                this.setstudentansboxsub(str_1_value, ll_top_superscript);

            } else if(str_1_value.startsWith("sub_script")) {
                str_1_value = str_1_value.substring(10);

                final LinearLayout ll_super_script = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_subscript, null);
                final LinearLayout ll_bottom_subscript = (LinearLayout)ll_super_script.findViewById(R.id.ll_bottom_subscript);
                ll_bottom_subscript.setTag(R.id.first,(tag_main_ll + 1));
                ll_bottom_subscript.setTag(R.id.second,"sub_bottom");

                ll_ans_box.addView(ll_super_script);

                this.setstudentansboxsub(str_1_value, ll_bottom_subscript);

            } else if (str_1_value.startsWith("super_sub_script")) {

                str_1_value = str_1_value.substring(16);

                final LinearLayout ll_super_sub_script = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_super_sub_script, null);
                final LinearLayout ll_top_super_sub_script = (LinearLayout)ll_super_sub_script.findViewById(R.id.ll_top_super_sub_script);
                final LinearLayout ll_bottom_super_sub_script = (LinearLayout)ll_super_sub_script.findViewById(R.id.ll_bottom_super_sub_script);
                ll_top_super_sub_script.setTag(R.id.first,(tag_main_ll + 1));
                ll_bottom_super_sub_script.setTag(R.id.first,(tag_main_ll + 1));
                ll_top_super_sub_script.setTag(R.id.second, "ss_top");
                ll_bottom_super_sub_script.setTag(R.id.second, "ss_bottom");

                final String[] str_2 = str_1_value.split("ss_btm_"+ll_ans_box.getTag(R.id.first));

                ll_ans_box.addView(ll_super_sub_script);

                this.setstudentansboxsub(str_2[0], ll_top_super_sub_script);
                this.setstudentansboxsub(str_2[1], ll_bottom_super_sub_script);

            } else if (str_1_value.startsWith("sqrt")) {

                str_1_value = str_1_value.substring(4);
                final LinearLayout ll_sqrt = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_square_root, null);
                final LinearLayout ll_center_square_root = (LinearLayout)ll_sqrt.findViewById(R.id.ll_center_square_root);
                ll_center_square_root.setTag(R.id.first, (tag_main_ll + 1));
                ll_center_square_root.setTag(R.id.second,"sqrt_c");

                ll_ans_box.addView(ll_sqrt);

                this.setstudentansboxsub(str_1_value, ll_center_square_root);

            } else if (str_1_value.startsWith("nsqrt")) {

                str_1_value = str_1_value.substring(5);

                final LinearLayout ll_nsqrt = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_nth_root, null);
                final LinearLayout ll_top_nth_root = (LinearLayout)ll_nsqrt.findViewById(R.id.ll_top_nth_root);
                final LinearLayout ll_center_nth_root = (LinearLayout)ll_nsqrt.findViewById(R.id.ll_center_nth_root);
                final ImageView img = (ImageView) ll_nsqrt.findViewById(R.id.img);
                ll_top_nth_root.setTag(R.id.first,(tag_main_ll + 1));
                ll_center_nth_root.setTag(R.id.first, (tag_main_ll + 1));
                ll_top_nth_root.setTag(R.id.second,"nth_top");
                ll_center_nth_root.setTag(R.id.second,"nth_bottom");

                img.getLayoutParams().height = ll_center_nth_root.getHeight();
                img.requestLayout();
                ll_center_nth_root.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                    @Override
                    public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Log.e("het", "" + v.getHeight());
                        img.getLayoutParams().height = v.getHeight();
                        img.requestLayout();
                    }
                });

                final String[] str_2 = str_1_value.split("nsqrt_center_"+ll_ans_box.getTag(R.id.first));

                ll_ans_box.addView(ll_nsqrt);

                this.setstudentansboxsub(str_2[0], ll_top_nth_root);
                this.setstudentansboxsub(str_2[1], ll_center_nth_root);

            } else if (str_1_value.startsWith("lim")) {

                str_1_value = str_1_value.substring(3);

                final LinearLayout ll_lim = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_new_view_lim, null);
                final TextView tv_text = (TextView) ll_lim.findViewById(R.id.tv_text);
                tv_text.setText(Html.fromHtml("&#8594;"));
                final LinearLayout ll_lim_left = (LinearLayout)ll_lim.findViewById(R.id.ll_lim_left);
                final LinearLayout ll_lim_right = (LinearLayout)ll_lim.findViewById(R.id.ll_lim_right);
                ll_lim_left.setTag(R.id.first,(tag_main_ll + 1));
                ll_lim_right.setTag(R.id.first,(tag_main_ll + 1));
                ll_lim_left.setTag(R.id.second,"lim_left");
                ll_lim_right.setTag(R.id.second,"lim_right");

                final String[] str_2 = str_1_value.split("lim_rht_"+ll_ans_box.getTag(R.id.first));

                ll_ans_box.addView(ll_lim);

                this.setstudentansboxsub(str_2[0], ll_lim_left);
                this.setstudentansboxsub(str_2[1], ll_lim_right);

            } else if(str_1_value.startsWith("parenthesis")) {
                str_1_value = str_1_value.substring(11);

                final LinearLayout ll_super_script = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_parenthesis, null);
                final LinearLayout ll_parenthesis_center = (LinearLayout)ll_super_script.findViewById(R.id.ll_parenthesis_center);
                ll_parenthesis_center.setTag(R.id.first,(tag_main_ll + 1));
                ll_parenthesis_center.setTag(R.id.second,"parenthesis_center");

                ll_ans_box.addView(ll_super_script);

                this.setstudentansboxsub(str_1_value, ll_parenthesis_center);

            }
        }
    }

    public void onnextsubcall(final LinearLayout ll_sub) {

        if (ll_sub.getTag().toString().equals("text")){

            EditTextBlink ed = (EditTextBlink)ll_sub.getChildAt(0);
            ed.requestFocus();
            ed.setSelection(0);

        } else if (ll_sub.getTag().toString().equals("fraction") || ll_sub.getTag().toString().equals("super_script") || ll_sub.getTag().toString().equals("super_sub_script")
                || ll_sub.getTag().toString().equals("nsqrt")){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(0);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
            this.onnextsubcall(ll_sub_1);

        } else if( ll_sub.getTag().toString().equals("sub_script") ) {

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
            this.onnextsubcall(ll_sub_1);

        }else if(ll_sub.getTag().toString().equals("parenthesis")) {

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
            this.onnextsubcall(ll_sub_1);

        } else if(ll_sub.getTag().toString().equals("sqrt")){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt(0);
            this.onnextsubcall(ll_sub_1);

        } else if(ll_sub.getTag().toString().equals("lim")){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(0);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt(0);
            this.onnextsubcall(ll_sub_1);

        }

    }

    public void onnextclick(View v) {

        try {
            int cur_pos = 0, ed_legnth=0;

            try {
                cur_pos = selectedTextView.getSelectionStart();
                ed_legnth = selectedTextView.getText().toString().length();
            } catch (Exception e){
            }

            if ((cur_pos!=ed_legnth)){

                String str_bar_1 = ""+Html.fromHtml("&#x0304;");
                String str_bar_2 = ""+Html.fromHtml("&#772;");
                String str_mu = ""+Html.fromHtml("&#956;");
                String str_sigma = ""+Html.fromHtml("&#963;");

                if (selectedTextView.getText().toString().length() > 1) {
                    String ss = String.valueOf(selectedTextView.getText().toString().charAt(cur_pos));
                    if (ss.equals(str_mu) || ss.equals(str_sigma)){
                        selectedTextView.setSelection((cur_pos + 3));
                    } else if(ss.equals("x") ){
                        if ((cur_pos+1)<ed_legnth){
                            String ss_1 = String.valueOf(selectedTextView.getText().toString().charAt(cur_pos+1));
                            if (ss_1.equals(str_bar_1) || ss_1.equals(str_bar_2)){
                                selectedTextView.setSelection((cur_pos + 2));
                            } else {
                                selectedTextView.setSelection((cur_pos + 1));
                            }
                        } else {
                            selectedTextView.setSelection((cur_pos + 1));
                        }
                    } else {
                        selectedTextView.setSelection((cur_pos + 1));
                    }
                } else {
                    selectedTextView.setSelection((cur_pos + 1));
                }

            } else {
                final LinearLayout ll_main_ll = ll_ans_box_selected;
                final LinearLayout ll_sub_ll = ll_selected_view;

                int pos_sub_ll = ll_main_ll.indexOfChild(ll_sub_ll);

                if (ll_main_ll.getChildCount()>1 && pos_sub_ll<(ll_main_ll.getChildCount()-1)){

                    LinearLayout ll_sub = (LinearLayout)ll_main_ll.getChildAt(pos_sub_ll+1);
                    onnextsubcall(ll_sub);

                } else if(pos_sub_ll == (ll_main_ll.getChildCount()-1)){

                    String main_tag = (String)ll_main_ll.getTag(R.id.second);

                    if (main_tag.equals("frac_top")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                        onnextsubcall(ll_sub_1);

                    } else if (main_tag.equals("ss_top")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(1);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                        onnextsubcall(ll_sub_1);

                    } else if (main_tag.equals("nth_top")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                        LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(1);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt(0);
                        onnextsubcall(ll_sub_1);

                    } else if (main_tag.equals("lim_left")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                        onnextsubcall(ll_sub_1);

                    } else if (main_tag.equals("sqrt_c") || main_tag.equals("nth_bottom") || main_tag.equals("lim_right")){

                        sub_next_sqrt_c(ll_main_ll);

                    } else if (main_tag.equals("frac_bottom") || main_tag.equals("ss_bottom") ||
                            main_tag.equals("super_top") || main_tag.equals("sub_bottom") || main_tag.equals("parenthesis_center")){

                        sub_next_frac_bottom(ll_main_ll);

                    }
                }
            }

        } catch (Exception e){
        }
    }

    public void sub_next_sqrt_c(final LinearLayout ll_main_ll){
        try {

            try {

                final LinearLayout ll_mainm = (LinearLayout)ll_main_ll.getParent();
                final LinearLayout ll_main_1m = (LinearLayout)ll_mainm.getParent();
                final LinearLayout ll_main2 = (LinearLayout)ll_main_1m.getParent();
                int main_pos = ll_main2.indexOfChild(ll_main_1m);

                final String main_tag = String.valueOf(ll_main2.getTag(R.id.second));

                if(ll_main2.getChildCount()>1 && main_pos<(ll_main2.getChildCount()-1)){
                    final LinearLayout ll_sub = (LinearLayout)ll_main2.getChildAt(main_pos+1);
                    if (!(ll_sub.getTag().equals("text"))){
                        add_last_ed(ll_main2,22,main_pos+1);
                    } else {
                        onnextsubcall(ll_sub);
                    }
                } else {

                    if (main_tag.equals("sqrt_c") || main_tag.equals("nth_bottom") || main_tag.equals("lim_right")){
                        sub_next_sqrt_c(ll_main2);
                    } else if (main_tag.equals("frac_bottom") || main_tag.equals("ss_bottom")
                            || main_tag.equals("super_top") || main_tag.equals("sub_bottom") || main_tag.equals("parenthesis_center")){
                        sub_next_frac_bottom(ll_main2);
                    } else if (main_tag.equals("frac_top")){
                        final LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                        final LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                        final LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                        onnextsubcall(ll_sub_1);
                    } else if (main_tag.equals("ss_top")){
                        final LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                        final LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(1);
                        final LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                        onnextsubcall(ll_sub_1);
                    } else if (main_tag.equals("nth_top")){
                        final LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                        final LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                        final LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(1);
                        final LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt(0);
                        onnextsubcall(ll_sub_1);
                    } else if (main_tag.equals("lim_left")){

                        LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                        onnextsubcall(ll_sub_1);

                    } else if(main_tag.equals("main")) {
                        add_last_ed(ll_main2,18,ll_main2.getChildCount());
                    }
                }

            } catch (Exception e){

            }

        } catch (Exception e){
        }
    }

    public void sub_next_frac_bottom(final LinearLayout ll_main_ll){
        try {
            final LinearLayout ll_mainm = (LinearLayout)ll_main_ll.getParent();
            final LinearLayout ll_main2 = (LinearLayout)ll_mainm.getParent();
            int main_pos = ll_main2.indexOfChild(ll_mainm);
            final String main_tag = String.valueOf(ll_main2.getTag(R.id.second));

            if(ll_main2.getChildCount()>1 && main_pos<(ll_main2.getChildCount()-1)){
                final LinearLayout ll_sub = (LinearLayout)ll_main2.getChildAt(main_pos+1);
                if (!(ll_sub.getTag().equals("text"))){
                    add_last_ed(ll_main2,22,main_pos+1);
                } else {
                    onnextsubcall(ll_sub);
                }

            } else {
                if (main_tag.equals("sqrt_c") || main_tag.equals("nth_bottom") || main_tag.equals("lim_right")){
                    sub_next_sqrt_c(ll_main2);
                } else if (main_tag.equals("frac_bottom") || main_tag.equals("ss_bottom")
                        || main_tag.equals("super_top") || main_tag.equals("sub_bottom") || main_tag.equals("parenthesis_center")){
                    sub_next_frac_bottom(ll_main2);
                } else if (main_tag.equals("frac_top")){
                    final LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    final LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                    final LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                    onnextsubcall(ll_sub_1);
                } else if (main_tag.equals("ss_top")){
                    final LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    final LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(1);
                    final LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                    onnextsubcall(ll_sub_1);
                } else if (main_tag.equals("nth_top")){
                    final LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    final LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                    final LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(1);
                    final LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt(0);
                    onnextsubcall(ll_sub_1);
                } else if (main_tag.equals("lim_left")){

                    LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(2);
                    LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt(0);
                    onnextsubcall(ll_sub_1);

                } else if(main_tag.equals("main")) {
                    add_last_ed(ll_main2,22,ll_main2.getChildCount());
                }

            }
        } catch (Exception e){
        }
    }

    public void onpresubcall(final LinearLayout ll_sub) {

        if (ll_sub.getTag().toString().equals("text")){

            EditTextBlink ed = (EditTextBlink)ll_sub.getChildAt(0);
            ed.setSelection(ed.getText().toString().length());
            ed.requestFocus();

        } else if ( ll_sub.getTag().toString().equals("sub_script")
                ){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt((ll_main_1.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        }   else if ( ll_sub.getTag().toString().equals("super_script")
                ){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(0);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt((ll_main_1.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        }  else if(ll_sub.getTag().toString().equals("fraction") ){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(2);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt((ll_main_1.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        } else if(ll_sub.getTag().toString().equals("parenthesis")) {

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt((ll_main_1.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        }else if(ll_sub.getTag().toString().equals("super_sub_script")){
            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt((ll_main_1.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        } else if(ll_sub.getTag().toString().equals("sqrt")  ){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        } else if(ll_sub.getTag().toString().equals("nsqrt")) {
            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(2);
            LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(1);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        } else if(ll_sub.getTag().toString().equals("lim")){

            LinearLayout ll_main_1 = (LinearLayout)ll_sub.getChildAt(1);
            LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(2);
            LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
            this.onpresubcall(ll_sub_1);

        }

    }

    public void ondeleteclick() {

        final LinearLayout ll_main_ll = ll_ans_box_selected;
        final LinearLayout ll_sub_ll = ll_selected_view;

        try {
            int ed_pos = 0,ed_legnth=0;
            try {
                ed_pos = selectedTextView.getSelectionStart();
                ed_legnth = selectedTextView.getText().toString().trim().length();
            } catch (Exception e){
            }
            if (ed_pos > 0 && ed_legnth > 0) {
                String str_bar_1 = ""+Html.fromHtml("&#x0304;");
                String str_bar_2 = ""+Html.fromHtml("&#772;");
                String str_mu = ""+Html.fromHtml("&#956;");
                String str_sigma = ""+Html.fromHtml("&#963;");
                if (selectedTextView.getText().toString().length() > 1) {
                    String ss = String.valueOf(selectedTextView.getText().toString().charAt(ed_pos - 1));
                    if (ss.equals(str_bar_1) || ss.equals(str_bar_2)){
                        if (selectedTextView.getText().toString().length() > 2) {
                            if (ed_pos !=1 && ed_pos !=2){
                                String ss_1 = String.valueOf(selectedTextView.getText().toString().charAt(ed_pos - 3));
                                if (ss_1.equals(str_mu) || ss_1.equals(str_sigma)){
                                    selectedTextView.getText().delete(ed_pos - 3, ed_pos);
                                } else {
                                    selectedTextView.getText().delete(ed_pos - 2, ed_pos);
                                }
                            } else {
                                selectedTextView.getText().delete(ed_pos - 2, ed_pos);
                            }
                        } else {
                            selectedTextView.getText().delete(ed_pos - 2, ed_pos);
                        }
                    } else if(ss.equals(str_mu) || ss.equals(str_sigma)){
                        selectedTextView.getText().delete(ed_pos - 1, ed_pos+2);
                    } else if(ss.equals("x")) {
                        if (ed_pos < ed_legnth) {
                            String ss_2 = String.valueOf(selectedTextView.getText().toString().charAt(ed_pos));
                            if (ss_2.equals(str_bar_1) || ss_2.equals(str_bar_2)) {
                                if (ed_pos > 1) {
                                    String ss_3 = String.valueOf(selectedTextView.getText().toString().charAt(ed_pos - 2));
                                    if (ss_3.equals(str_mu) || ss_3.equals(str_sigma)) {
                                        selectedTextView.getText().delete(ed_pos - 2, ed_pos+1);
                                    } else {
                                        selectedTextView.getText().delete(ed_pos - 1, ed_pos+1);
                                    }
                                } else {
                                    selectedTextView.getText().delete(ed_pos - 1, ed_pos+1);
                                }
                            }  else {
                                selectedTextView.getText().delete(ed_pos - 1, ed_pos);
                            }
                        } else {
                            selectedTextView.getText().delete(ed_pos - 1, ed_pos);
                        }
                    }else {
                        selectedTextView.getText().delete(ed_pos - 1, ed_pos);
                    }
                } else {
                    selectedTextView.getText().delete(ed_pos - 1, ed_pos);
                }
                try {
                    if (selectedTextView.getText().toString().trim().length() == 0){
                        selectedTextView.setSelection(0);
                    }
                } catch (Exception e){
                }

                if (is_touch_kb){
                    Handler hnd = new Handler();
                    hnd.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ondeleteclick();
                        }
                    },150);
                }

            } else if(ed_pos==0 && ed_legnth==0) {

                int pos_sub_ll = ll_main_ll.indexOfChild(ll_sub_ll);
                Log.e("delete4",""+pos_sub_ll);

                if(pos_sub_ll!=0 && pos_sub_ll!=-1){

                    LinearLayout ll_sub = (LinearLayout)ll_main_ll.getChildAt(pos_sub_ll-1);
                    onpresubcall(ll_sub);
                    ll_main_ll.removeViewAt(pos_sub_ll);

                } else if(pos_sub_ll==0) {

                    String main_tag = (String)ll_main_ll.getTag(R.id.second);

                    Log.e("delete5",""+main_tag);

                    if (main_tag.equals("frac_bottom") || main_tag.equals("ss_bottom")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(0);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt((ll_main_1.getChildCount()-1));
                        onpresubcall(ll_sub_1);

                        if (ll_main_ll.getChildCount()>1){
                            ll_main_ll.removeViewAt(pos_sub_ll);
                        }

                    }  else if (main_tag.equals("nth_bottom")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getParent();
                        LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(0);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                        onpresubcall(ll_sub_1);

                        if (ll_main_ll.getChildCount()>1){
                            ll_main_ll.removeViewAt(pos_sub_ll);
                        }

                    } else if (main_tag.equals("lim_right")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_2 = (LinearLayout)ll_main.getChildAt(0);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                        onpresubcall(ll_sub_1);

                        if (ll_main_ll.getChildCount()>1){
                            ll_main_ll.removeViewAt(pos_sub_ll);
                        }

                    } else if(main_tag.equals("super_top") || main_tag.equals("sub_bottom") || main_tag.equals("parenthesis_center")) {

                        try {
                            LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                            LinearLayout ll_main2 = (LinearLayout)ll_main.getParent();
                            int main_pos = ll_main2.indexOfChild(ll_main);

                            if (ll_main_ll.getChildCount()>1){
                                sub_pre_frac_top(ll_main_ll, 0, false);
                                ll_main_ll.removeViewAt(pos_sub_ll);
                            } else {

                                if (main_pos == 0 && ll_main2.getChildCount()==1){
                                    sub_pre_frac_top(ll_main_ll, 2, false);
                                    ll_main2.removeViewAt(main_pos);
                                    this.add_ed_after_delete(ll_main2, 18, main_pos);
                                } else {
                                    if (main_pos!=0){
                                        sub_pre_frac_top(ll_main_ll, 1, false);
                                        ll_main2.removeViewAt(main_pos);
                                    } else {
                                        sub_pre_frac_top(ll_main_ll, 1, false);
                                        ll_main2.removeViewAt(main_pos);
                                        try {
                                            final LinearLayout lll = (LinearLayout)ll_main2.getChildAt(main_pos);
                                            if (lll.getTag().toString().equals("text")){
                                                EditTextBlink edd = (EditTextBlink)lll.getChildAt(0);
                                                edd.requestFocus();
                                                if (!(ll_main2.getTag(R.id.second).equals("main"))) {
                                                    Utils.change_edittext_bg(true, edd);
                                                }
                                            }
                                        } catch (Exception e){
                                        }
                                    }
                                }
                            }
                        } catch (Exception e){
                        }

                    } else if(main_tag.equals("sqrt_c")) {

                        try {

                            final LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                            final LinearLayout ll_main1 = (LinearLayout)ll_main.getParent();
                            final LinearLayout ll_main2 = (LinearLayout)ll_main1.getParent();
                            int main_pos = ll_main2.indexOfChild(ll_main1);

                            if (ll_main_ll.getChildCount()>1){
                                sub_pre_sqrt_c(ll_main_ll, 0, false);
                                ll_main_ll.removeViewAt(pos_sub_ll);
                            } else {
                                if (main_pos == 0 && ll_main2.getChildCount()==1){
                                    Log.e("edd",""+main_pos);
                                    sub_pre_sqrt_c(ll_main_ll, 2,false);
                                    ll_main2.removeViewAt(main_pos);
                                    Log.e("edd1", "" + main_pos);
                                    this.add_ed_after_delete(ll_main2, 18, main_pos);
                                } else {
                                    if (main_pos!=0){
                                        sub_pre_sqrt_c(ll_main_ll, 1, false);
                                        ll_main2.removeViewAt(main_pos);
                                    } else {
                                        sub_pre_sqrt_c(ll_main_ll, 1,false);
                                        ll_main2.removeViewAt(main_pos);
                                        try {
                                            final LinearLayout lll = (LinearLayout)ll_main2.getChildAt(main_pos);
                                            if (lll.getTag().toString().equals("text")){
                                                final EditTextBlink edd = (EditTextBlink)lll.getChildAt(0);
                                                edd.requestFocus();
                                                if (!(ll_main2.getTag(R.id.second).equals("main"))) {
                                                    Utils.change_edittext_bg(true, edd);
                                                }
                                            }
                                        } catch (Exception e){
                                        }
                                    }
                                }
                            }

                        } catch (Exception e){
                        }

                    } else if(main_tag.equals("nth_top")) {

                        try {
                            final LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                            final LinearLayout ll_main2 = (LinearLayout)ll_main.getParent();
                            int main_pos = ll_main2.indexOfChild(ll_main);

                            if (ll_main_ll.getChildCount()>1){
                                sub_pre_frac_top(ll_main_ll, 0,false);
                                ll_main_ll.removeViewAt(pos_sub_ll);
                            } else {
                                final LinearLayout ll_sqrt = (LinearLayout)ll_main.getChildAt(2);
                                final LinearLayout ll_sqrt2 = (LinearLayout)ll_sqrt.getChildAt(1);
                                if (this.makeansfromview(ll_sqrt2).trim().length() == 0){
                                    if (main_pos == 0 && ll_main2.getChildCount()==1){
                                        sub_pre_frac_top(ll_main_ll, 2,false);
                                        ll_main2.removeViewAt(main_pos);
                                        this.add_ed_after_delete(ll_main2, 18, main_pos);
                                    } else {
                                        if (main_pos!=0){
                                            sub_pre_frac_top(ll_main_ll, 1,false);
                                            ll_main2.removeViewAt(main_pos);
                                        } else {
                                            sub_pre_frac_top(ll_main_ll, 1,false);
                                            ll_main2.removeViewAt(main_pos);
                                            try {
                                                final LinearLayout lll = (LinearLayout)ll_main2.getChildAt(main_pos);
                                                if (lll.getTag().toString().equals("text")){
                                                    EditTextBlink edd = (EditTextBlink)lll.getChildAt(0);
                                                    edd.requestFocus();
                                                    if (!(ll_main2.getTag(R.id.second).equals("main"))) {
                                                        Utils.change_edittext_bg(true, edd);
                                                    }
                                                }
                                            } catch (Exception e){
                                            }
                                        }
                                    }
                                }
                            }

                        } catch (Exception e){
                        }

                    } else if(main_tag.equals("lim_left")){

                        try {
                            final LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                            final LinearLayout ll_main1 = (LinearLayout)ll_main.getParent();
                            final LinearLayout ll_main2 = (LinearLayout)ll_main1.getParent();
                            int main_pos = ll_main2.indexOfChild(ll_main1);

                            if (ll_main_ll.getChildCount()>1){
                                sub_pre_sqrt_c(ll_main_ll, 0, false);
                                ll_main_ll.removeViewAt(pos_sub_ll);
                            } else {
                                final LinearLayout ll_lim_rht = (LinearLayout)ll_main.getChildAt(2);
                                if (this.makeansfromview(ll_lim_rht).trim().length() == 0){
                                    if (main_pos == 0 && ll_main2.getChildCount()==1){
                                        sub_pre_sqrt_c(ll_main_ll, 2, false);
                                        ll_main2.removeViewAt(main_pos);
                                        this.add_ed_after_delete(ll_main2, 18, main_pos);
                                    } else {
                                        if (main_pos!=0){
                                            sub_pre_sqrt_c(ll_main_ll, 1, false);
                                            ll_main2.removeViewAt(main_pos);
                                        } else {
                                            sub_pre_sqrt_c(ll_main_ll, 1,false);
                                            ll_main2.removeViewAt(main_pos);
                                            try {
                                                final LinearLayout lll = (LinearLayout)ll_main2.getChildAt(main_pos);
                                                if (lll.getTag().toString().equals("text")){
                                                    EditTextBlink edd = (EditTextBlink)lll.getChildAt(0);
                                                    edd.requestFocus();
                                                    if (!(ll_main2.getTag(R.id.second).equals("main"))) {
                                                        Utils.change_edittext_bg(true, edd);
                                                    }
                                                }
                                            } catch (Exception e){
                                            }
                                        }
                                    }
                                }
                            }

                        } catch (Exception e){
                        }

                    }else if(main_tag.equals("frac_top") || main_tag.equals("ss_top")) {

                        final LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        final LinearLayout ll_main2 = (LinearLayout)ll_main.getParent();
                        int main_pos = ll_main2.indexOfChild(ll_main);

                        if (ll_main_ll.getChildCount()>1){
                            sub_pre_frac_top(ll_main_ll,0,false);
                            ll_main_ll.removeViewAt(pos_sub_ll);
                        } else {
                            if (main_tag.equals("frac_top")){
                                LinearLayout ll_frac = (LinearLayout) ll_main.getChildAt(2);
                                if (this.makeansfromview(ll_frac).trim().length() == 0){
                                    if (main_pos == 0 && ll_main2.getChildCount()==1){
                                        sub_pre_frac_top(ll_main_ll,2,false);
                                        ll_main2.removeViewAt(main_pos);
                                        this.add_ed_after_delete(ll_main2, 18, main_pos);
                                    } else {
                                        if (main_pos!=0){
                                            sub_pre_frac_top(ll_main_ll, 1,false);
                                            ll_main2.removeViewAt(main_pos);
                                        } else {
                                            sub_pre_frac_top(ll_main_ll, 1,false);
                                            ll_main2.removeViewAt(main_pos);
                                            try {
                                                final LinearLayout lll = (LinearLayout)ll_main2.getChildAt(main_pos);
                                                if (lll.getTag().toString().equals("text")){
                                                    EditTextBlink edd = (EditTextBlink)lll.getChildAt(0);
                                                    edd.requestFocus();
                                                    if (!(ll_main2.getTag(R.id.second).equals("main"))) {
                                                        Utils.change_edittext_bg(true, edd);
                                                    }
                                                }
                                            } catch (Exception e){
                                            }
                                        }
                                    }
                                }
                            } else {
                                LinearLayout ll_frac = (LinearLayout) ll_main.getChildAt(1);

                                if (this.makeansfromview(ll_frac).trim().length() == 0){
                                    if (main_pos == 0 && ll_main2.getChildCount()==1){
                                        sub_pre_frac_top(ll_main_ll,2,false);
                                        ll_main2.removeViewAt(main_pos);
                                        this.add_ed_after_delete(ll_main2, 18, main_pos);
                                    } else {
                                        if (main_pos!=0){
                                            sub_pre_frac_top(ll_main_ll, 1,false);
                                            ll_main2.removeViewAt(main_pos);
                                        } else {
                                            sub_pre_frac_top(ll_main_ll, 1,false);
                                            ll_main2.removeViewAt(main_pos);
                                            try {
                                                final LinearLayout lll = (LinearLayout)ll_main2.getChildAt(main_pos);
                                                if (lll.getTag().toString().equals("text")){
                                                    EditTextBlink edd = (EditTextBlink)lll.getChildAt(0);
                                                    edd.requestFocus();
                                                    if (!(ll_main2.getTag(R.id.second).equals("main"))) {
                                                        Utils.change_edittext_bg(true, edd);
                                                    }
                                                }
                                            } catch (Exception e){
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (is_touch_kb){
                    Handler hnd = new Handler();
                    hnd.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ondeleteclick();
                        }
                    },150);

                }

            }

        } catch (Exception e){
        }
    }

    public void onpreviousclick(View v) {

        try {
            int cur_pos = 0;

            try {
                cur_pos = selectedTextView.getSelectionStart();
            } catch (Exception e){
            }

            if (cur_pos!=0){

                String str_bar_1 = ""+Html.fromHtml("&#x0304;");
                String str_bar_2 = ""+Html.fromHtml("&#772;");
                String str_mu = ""+Html.fromHtml("&#956;");
                String str_sigma = ""+Html.fromHtml("&#963;");

                if (selectedTextView.getText().toString().length() > 1) {
                    String ss = String.valueOf(selectedTextView.getText().toString().charAt(cur_pos - 1));
                    if (ss.equals(str_bar_1) || ss.equals(str_bar_2)){
                        if (selectedTextView.getText().toString().length() > 2) {
                            if (cur_pos !=1 && cur_pos !=2){
                                String ss_1 = String.valueOf(selectedTextView.getText().toString().charAt(cur_pos - 3));
                                if (ss_1.equals(str_mu) || ss_1.equals(str_sigma)){
                                    selectedTextView.setSelection((cur_pos - 3));
                                } else {
                                    selectedTextView.setSelection((cur_pos - 2));
                                }
                            } else {
                                selectedTextView.setSelection((cur_pos - 2));
                            }
                        } else {
                            selectedTextView.setSelection((cur_pos - 2));
                        }
                    } else {
                        selectedTextView.setSelection((cur_pos-1));
                    }
                } else {
                    selectedTextView.setSelection((cur_pos - 1));
                }

            } else {

                final LinearLayout ll_main_ll = ll_ans_box_selected;
                final LinearLayout ll_sub_ll = ll_selected_view;

                int pos_sub_ll = ll_main_ll.indexOfChild(ll_sub_ll);

                if (pos_sub_ll!=0 && pos_sub_ll!=-1){

                    LinearLayout ll_sub = (LinearLayout)ll_main_ll.getChildAt(pos_sub_ll - 1);
                    onpresubcall(ll_sub);

                } else if(pos_sub_ll == 0) {

                    String main_tag = (String)ll_main_ll.getTag(R.id.second);

                    if (main_tag.equals("frac_bottom")|| main_tag.equals("ss_bottom")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getChildAt(0);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_1.getChildAt((ll_main_1.getChildCount()-1));
                        onpresubcall(ll_sub_1);

                    }  else if (main_tag.equals("nth_bottom")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_1 = (LinearLayout)ll_main.getParent();
                        LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(0);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                        onpresubcall(ll_sub_1);

                    } else if (main_tag.equals("lim_right")){

                        LinearLayout ll_main = (LinearLayout)ll_main_ll.getParent();
                        LinearLayout ll_main_2 = (LinearLayout)ll_main.getChildAt(0);
                        LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                        onpresubcall(ll_sub_1);

                    } else if(main_tag.equals("sqrt_c") || main_tag.equals("lim_left")){

                        try {
                            sub_pre_sqrt_c(ll_main_ll,0,true);
                        } catch (Exception e){
                        }

                    } else if(main_tag.equals("frac_top") || main_tag.equals("ss_top") ||
                            main_tag.equals("super_top") || main_tag.equals("sub_bottom") || main_tag.equals("nth_top") || main_tag.equals("parenthesis_center")) {

                        try {
                            sub_pre_frac_top(ll_main_ll,0,true);
                        } catch (Exception e){
                        }

                    }
                }
            }

        } catch (Exception e){
        }

    }

    public void sub_pre_sqrt_c(final LinearLayout ll_main_ll,final int is_main,final boolean is_add_ed){

        try {

            LinearLayout ll_mainm = (LinearLayout)ll_main_ll.getParent();
            LinearLayout ll_main1 = (LinearLayout)ll_mainm.getParent();
            LinearLayout ll_main2 = (LinearLayout)ll_main1.getParent();
            int main_pos = ll_main2.indexOfChild(ll_main1);
            final String main_tag = String.valueOf(ll_main2.getTag(R.id.second));
            if(ll_main2.getChildCount()>1 && main_pos!=0){
                LinearLayout ll_sub = (LinearLayout)ll_main2.getChildAt(main_pos-1);
                if (!(ll_sub.getTag().equals("text")) && is_add_ed){
                    add_last_ed(ll_main2,22,main_pos);
                } else {
                    onpresubcall(ll_sub);
                }
            } else {
                if (main_tag.equals("sqrt_c") || main_tag.equals("lim_left")){
                    this.sub_pre_sqrt_c(ll_main2, 0, is_add_ed);
                } else if (main_tag.equals("frac_top") || main_tag.equals("ss_top")
                        || main_tag.equals("super_top") || main_tag.equals("sub_bottom")
                        || main_tag.equals("nth_top") || main_tag.equals("parenthesis_center")){
                    this.sub_pre_frac_top(ll_main2,0,is_add_ed);
                } else if (main_tag.equals("frac_bottom") || main_tag.equals("ss_bottom")) {
                    final LinearLayout ll_main = (LinearLayout) ll_main2.getParent();
                    final LinearLayout ll_main_1 = (LinearLayout) ll_main.getChildAt(0);
                    final LinearLayout ll_sub_1 = (LinearLayout) ll_main_1.getChildAt((ll_main_1.getChildCount() - 1));
                    onpresubcall(ll_sub_1);
                } else if (main_tag.equals("nth_bottom")){
                    LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    LinearLayout ll_main_1 = (LinearLayout)ll_main.getParent();
                    LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(0);
                    LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                    onpresubcall(ll_sub_1);
                } else if (main_tag.equals("lim_right")){

                    LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    LinearLayout ll_main_2 = (LinearLayout)ll_main.getChildAt(0);
                    LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                    onpresubcall(ll_sub_1);

                } else if(main_tag.equals("main")) {
                    if (is_main == 0){
                        add_last_ed(ll_main2,18,0);
                    } else if (is_main == 1){
                        this.onnextsubcall((LinearLayout)ll_main2.getChildAt(1));
                    }
                }
            }

        } catch (Exception e){
        }

    }

    public void sub_pre_frac_top(final LinearLayout ll_main_ll,final int is_main,final boolean is_add_ed){

        try {
            final LinearLayout ll_mainm = (LinearLayout)ll_main_ll.getParent();
            final LinearLayout ll_main2 = (LinearLayout)ll_mainm.getParent();
            int main_pos = ll_main2.indexOfChild(ll_mainm);
            final String main_tag = String.valueOf(ll_main2.getTag(R.id.second));
            if(ll_main2.getChildCount()>1 && main_pos!=0){
                final LinearLayout ll_sub = (LinearLayout)ll_main2.getChildAt(main_pos - 1);
                if (!(ll_sub.getTag().equals("text")) && is_add_ed){
                    add_last_ed(ll_main2,22,main_pos);
                } else {
                    onpresubcall(ll_sub);
                }
            } else {
                Log.e("delete2",""+ll_main2.getTag(R.id.second));
                if (main_tag.equals("sqrt_c")  || main_tag.equals("lim_left")){
                    this.sub_pre_sqrt_c(ll_main2, 0, is_add_ed);
                } else if (main_tag.equals("frac_top") || main_tag.equals("ss_top")
                        || main_tag.equals("super_top") || main_tag.equals("sub_bottom")
                        || main_tag.equals("nth_top") || main_tag.equals("parenthesis_center")){
                    this.sub_pre_frac_top(ll_main2, 0, is_add_ed);
                } else if (main_tag.equals("frac_bottom") || main_tag.equals("ss_bottom")) {
                    final LinearLayout ll_main = (LinearLayout) ll_main2.getParent();
                    final LinearLayout ll_main_1 = (LinearLayout) ll_main.getChildAt(0);
                    final LinearLayout ll_sub_1 = (LinearLayout) ll_main_1.getChildAt((ll_main_1.getChildCount() - 1));
                    onpresubcall(ll_sub_1);
                } else if (main_tag.equals("nth_bottom")){
                    LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    LinearLayout ll_main_1 = (LinearLayout)ll_main.getParent();
                    LinearLayout ll_main_2 = (LinearLayout)ll_main_1.getChildAt(0);
                    LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                    onpresubcall(ll_sub_1);
                } else if (main_tag.equals("lim_right")){

                    LinearLayout ll_main = (LinearLayout)ll_main2.getParent();
                    LinearLayout ll_main_2 = (LinearLayout)ll_main.getChildAt(0);
                    LinearLayout ll_sub_1 = (LinearLayout)ll_main_2.getChildAt((ll_main_2.getChildCount()-1));
                    onpresubcall(ll_sub_1);

                } else if(main_tag.equals("main")) {
                    if (is_main == 0){
                        add_last_ed(ll_main2,18,0);
                    } else if (is_main == 1){
                        this.onnextsubcall((LinearLayout)ll_main2.getChildAt(1));
                    }
                }
            }
        } catch (Exception e){
        }

    }

    private String makeansfromview(final LinearLayout ll_ans_box) {

        String str = "";

        for (int i=0;i<ll_ans_box.getChildCount();i++){

            LinearLayout ll_view = (LinearLayout)ll_ans_box.getChildAt(i);

            String main_tag = String.valueOf(ll_view.getTag());

            if(main_tag.equals("text")) {

                EditTextBlink ed_1 = (EditTextBlink) ll_view.getChildAt(0);
                if (ed_1.getText().toString().trim().length() != 0) {
                    str = str + "text#" + this.replacecharfromsign(ed_1.getText().toString().trim()) + ""+ll_ans_box.getTag(R.id.first)+"_"+ll_ans_box.getTag(R.id.first);
                }

            } else if(main_tag.equals("fraction")){

                LinearLayout ll_fraction_top = (LinearLayout)ll_view.getChildAt(0);
                LinearLayout ll_fraction_bottom = (LinearLayout)ll_view.getChildAt(2);

                String ss = this.makeansfromview(ll_fraction_top);
                String ss1 = this.makeansfromview(ll_fraction_bottom);
                if (ss.trim().length() != 0 && ss1.trim().length() != 0) {
                    str = str + "fraction" + ss + "frac_btm_" + ll_ans_box.getTag(R.id.first)
                            + ss1 + "" + ll_ans_box.getTag(R.id.first) + "_" + ll_ans_box.getTag(R.id.first);
                }
            } else if(main_tag.equals("super_script")){

                LinearLayout ll_top_superscript = (LinearLayout)ll_view.getChildAt(0);

                String ss = this.makeansfromview(ll_top_superscript);

                if (ss.trim().length() != 0){
                    str = str + "super_script" +ss+ ""+ll_ans_box.getTag(R.id.first)+"_"+ll_ans_box.getTag(R.id.first);
                }

            } else if(main_tag.equals("sub_script")){

                LinearLayout ll_bottom_subscript = (LinearLayout)ll_view.getChildAt(1);

                String ss = this.makeansfromview(ll_bottom_subscript);

                if (ss.trim().length() != 0){
                    str = str + "sub_script" +ss+ ""+ll_ans_box.getTag(R.id.first)+"_"+ll_ans_box.getTag(R.id.first);
                }


            } else if(main_tag.equals("super_sub_script")){

                LinearLayout ll_top_super_sub_script = (LinearLayout)ll_view.getChildAt(0);
                LinearLayout ll_bottom_super_sub_script = (LinearLayout)ll_view.getChildAt(1);

                String ss = this.makeansfromview(ll_top_super_sub_script);
                String ss1 = this.makeansfromview(ll_bottom_super_sub_script);
                if (ss.trim().length() != 0 && ss1.trim().length() != 0) {
                    str = str + "super_sub_script" + ss + "ss_btm_" + ll_ans_box.getTag(R.id.first)
                            + ss1 + "" + ll_ans_box.getTag(R.id.first) + "_" + ll_ans_box.getTag(R.id.first);
                }
            } else if(main_tag.equals("sqrt")){

                LinearLayout ll_l = (LinearLayout)ll_view.getChildAt(1);
                LinearLayout ll_center_square_root = (LinearLayout)ll_l.getChildAt(1);

                String ss = this.makeansfromview(ll_center_square_root);

                if (ss.trim().length() != 0){
                    str = str + "sqrt" +ss+ ""+ll_ans_box.getTag(R.id.first)+"_"+ll_ans_box.getTag(R.id.first);
                }

            } else if(main_tag.equals("nsqrt")){

                LinearLayout ll_top_nth_root = (LinearLayout)ll_view.getChildAt(0);
                LinearLayout ll_l = (LinearLayout)ll_view.getChildAt(2);
                LinearLayout ll_center_nth_root = (LinearLayout)ll_l.getChildAt(1);

                String ss = this.makeansfromview(ll_top_nth_root);
                String ss1 = this.makeansfromview(ll_center_nth_root);
                if (ss.trim().length() != 0 && ss1.trim().length() != 0) {
                    str = str + "nsqrt" + ss + "nsqrt_center_" + ll_ans_box.getTag(R.id.first)
                            + ss1 + "" + ll_ans_box.getTag(R.id.first) + "_" + ll_ans_box.getTag(R.id.first);
                }
            } else if(main_tag.equals("lim")){

                LinearLayout ll_1 = (LinearLayout)ll_view.getChildAt(1);
                LinearLayout ll_lim_left = (LinearLayout)ll_1.getChildAt(0);
                LinearLayout ll_lim_right = (LinearLayout)ll_1.getChildAt(2);

                String ss = this.makeansfromview(ll_lim_left);
                String ss1 = this.makeansfromview(ll_lim_right);
                if (ss.trim().length() != 0 && ss1.trim().length() != 0) {
                    str = str + "lim" + ss + "lim_rht_" + ll_ans_box.getTag(R.id.first)
                            + ss1 + "" + ll_ans_box.getTag(R.id.first) + "_" + ll_ans_box.getTag(R.id.first);
                }
            } else if(main_tag.equals("parenthesis")){

                LinearLayout ll_top_superscript = (LinearLayout)ll_view.getChildAt(1);

                String ss = this.makeansfromview(ll_top_superscript);

                if (ss.trim().length() != 0){
                    str = str + "parenthesis" +ss+ ""+ll_ans_box.getTag(R.id.first)+"_"+ll_ans_box.getTag(R.id.first);
                }

            }
        }
        try {
            str = str.substring(0,(str.length()-3));
        } catch (Exception e){

        }

        try {
            String cut_str = str.substring(str.length()-8);
            if (cut_str.equals("fraction")){
                str = str.substring(0,(str.length()-11));
            }
        } catch (Exception e){
        }

        try {
            String cut_str = str.substring(str.length()-12);
            if (cut_str.equals("super_script")){
                str = str.substring(0,(str.length()-15));
            }
        } catch (Exception e){
        }
        try {
            String cut_str = str.substring(str.length()-10);
            if (cut_str.equals("sub_script")){
                str = str.substring(0,(str.length()-13));
            }
        } catch (Exception e){
        }
        try {
            String cut_str = str.substring(str.length()-16);
            if (cut_str.equals("super_sub_script")){
                str = str.substring(0,(str.length()-19));
            }
        } catch (Exception e){
        }
        try {
            String cut_str = str.substring(str.length()-4);
            if (cut_str.equals("sqrt")){
                str = str.substring(0,(str.length()-7));
            }
        } catch (Exception e){
        }
        try {
            String cut_str = str.substring(str.length() - 5);
            if (cut_str.equals("nsqrt")){
                str = str.substring(0,(str.length()-8));
            }
        } catch (Exception e){
        }

        try {
            String cut_str = str.substring(str.length() - 3);
            if (cut_str.equals("lim")){
                str = str.substring(0,(str.length()-6));
            }
        } catch (Exception e){
        }

        try {
            String cut_str = str.substring(str.length() - 11);
            if (cut_str.equals("parenthesis")){
                str = str.substring(0,(str.length()-14));
            }
        } catch (Exception e){
        }

        return str;
    }

    private String replacecharfromsign(final String str){
        String str_final = str;

        try {

            String str_plus = ""+Html.fromHtml("&#43;");
            String str_minus = ""+Html.fromHtml("&#8722;");
            String str_equal = ""+Html.fromHtml("&#61;");
            String str_multi = ""+Html.fromHtml("&#215;");
            String str_divide = ""+Html.fromHtml("&#247;");
            String str_union = ""+Html.fromHtml("&#8746;");
            String str_intersection = ""+Html.fromHtml("&#8745;");
            String str_pi = ""+Html.fromHtml("&#960;");
            String str_factorial = ""+Html.fromHtml("&#33;");
            String str_percentage = ""+Html.fromHtml("&#37;");
            String str_goe = ""+Html.fromHtml("&#8805;");
            String str_loe = ""+Html.fromHtml("&#8804;");
            String str_grthan = ""+Html.fromHtml("&#62;");
            String str_lethan = ""+Html.fromHtml("&#60;");
            String str_infinity = ""+Html.fromHtml("&#8734;");
            String str_degree = ""+Html.fromHtml("&#176;");
            String str_xbar = ""+Html.fromHtml("x&#x0304;");
            String str_muxbar = ""+Html.fromHtml("&#956;") + "" + Html.fromHtml("x&#772;");
            String str_sigmaxbar = ""+Html.fromHtml("&#963;") + "" + Html.fromHtml("x&#772;");

            String str_integral = ""+Html.fromHtml("&#8747;");
            String str_summation = ""+Html.fromHtml("&#8721;");
            String str_alpha = ""+Html.fromHtml("&#945;");
            String str_theta = ""+Html.fromHtml("ø");
            String str_mu = ""+Html.fromHtml("&#956;");
            String str_sigma = ""+Html.fromHtml("&#963;");


            str_final = str_final.replace(str_plus,"op_plus");
            str_final = str_final.replace(str_minus,"op_minus");
            str_final = str_final.replace(str_equal,"op_equal");
            str_final = str_final.replace(str_multi,"op_multi");
            str_final = str_final.replace(str_divide, "op_divide");
            str_final = str_final.replace(str_union, "op_union");
            str_final = str_final.replace(str_intersection, "op_intersection");
            str_final = str_final.replace(str_pi, "op_pi");
            str_final = str_final.replace(str_factorial, "op_factorial");
            str_final = str_final.replace(str_percentage, "op_percentage");
            str_final = str_final.replace(str_goe, "op_goe");
            str_final = str_final.replace(str_loe, "op_loe");
            str_final = str_final.replace(str_grthan, "op_grthan");
            str_final = str_final.replace(str_lethan, "op_lethan");
            str_final = str_final.replace(str_infinity, "op_infinity");
            str_final = str_final.replace(str_degree, "op_degree");
            str_final = str_final.replace(str_muxbar, "op_muxbar");
            str_final = str_final.replace(str_sigmaxbar, "op_sigmaxbar");
            str_final = str_final.replace(str_xbar, "op_xbar");

            str_final = str_final.replace(str_integral,"op_integral");
            str_final = str_final.replace(str_summation,"op_summation");
            str_final = str_final.replace(str_alpha,"op_alpha");
            str_final = str_final.replace(str_theta,"op_theta");
            str_final = str_final.replace(str_mu, "op_mu");
            str_final = str_final.replace(str_sigma, "op_sigma");

        } catch (Exception e){

        }

        return str_final;
    }

    private String replacesignfromchar(final String str,final EditTextBlink ed){
        String str_final = str;



        try {

            String str_plus = ""+Html.fromHtml("&#43;");
            String str_minus = ""+Html.fromHtml("&#8722;");
            String str_equal = ""+Html.fromHtml("&#61;");
            String str_multi = ""+Html.fromHtml("&#215;");
            String str_divide = ""+Html.fromHtml("&#247;");
            String str_union = ""+Html.fromHtml("&#8746;");
            String str_intersection = ""+Html.fromHtml("&#8745;");
            String str_pi = ""+Html.fromHtml("&#960;");
            String str_factorial = ""+Html.fromHtml("&#33;");
            String str_percentage = ""+Html.fromHtml("&#37;");
            String str_goe = ""+Html.fromHtml("&#8805;");
            String str_loe = ""+Html.fromHtml("&#8804;");
            String str_grthan = ""+Html.fromHtml("&#62;");
            String str_lethan = ""+Html.fromHtml("&#60;");
            String str_infinity = ""+Html.fromHtml("&#8734;");
            String str_degree = ""+Html.fromHtml("&#176;");
            String str_xbar = ""+Html.fromHtml("x&#x0304;");
            String str_muxbar = ""+Html.fromHtml("&#956;") + "" + Html.fromHtml("x&#772;");
            String str_sigmaxbar = ""+Html.fromHtml("&#963;") + "" + Html.fromHtml("x&#772;");

            String str_integral = ""+Html.fromHtml("&#8747;");
            String str_summation = ""+Html.fromHtml("&#8721;");
            String str_alpha = ""+Html.fromHtml("&#945;");
            String str_theta = ""+Html.fromHtml("ø");
            String str_mu = ""+Html.fromHtml("&#956;");
            String str_sigma = ""+Html.fromHtml("&#963;");

            str_final = str_final.replace("op_plus",str_plus);
            str_final = str_final.replace("op_minus",str_minus);
            str_final = str_final.replace("op_equal",str_equal);
            str_final = str_final.replace("op_multi",str_multi);
            str_final = str_final.replace("op_divide",str_divide);
            str_final = str_final.replace("op_union",str_union);
            str_final = str_final.replace("op_intersection",str_intersection);
            str_final = str_final.replace("op_pi",str_pi);
            str_final = str_final.replace("op_factorial",str_factorial);
            str_final = str_final.replace("op_percentage",str_percentage);
            str_final = str_final.replace("op_goe",str_goe);
            str_final = str_final.replace("op_loe",str_loe);
            str_final = str_final.replace("op_grthan",str_grthan);
            str_final = str_final.replace("op_lethan",str_lethan);
            str_final = str_final.replace("op_infinity",str_infinity);
            str_final = str_final.replace("op_degree",str_degree);
            str_final = str_final.replace("op_xbar",str_xbar);
            str_final = str_final.replace("op_muxbar",str_muxbar);
            str_final = str_final.replace("op_sigmaxbar",str_sigmaxbar);

            str_final = str_final.replace("op_alpha",str_alpha);
            str_final = str_final.replace("op_theta",str_theta);
            str_final = str_final.replace("op_mu",str_mu);
            str_final = str_final.replace("op_sigma",str_sigma);

            str_final = str_final.replace("op_integral",str_integral);
            str_final = str_final.replace("op_summation",str_summation);

            for (int i=0;i<str_final.length();i++) {

                String ss = String.valueOf(str_final.charAt(i));

                if (ss.equals(str_integral)){
                    SpannableString ss1=  new SpannableString(ss);
                    ss1.setSpan(new RelativeSizeSpan(2f), 0,1, 0);
                    ed.getText().insert(ed.getSelectionStart(),ss1);
                } else if(ss.equals(str_summation)){
                    SpannableString ss2=  new SpannableString(ss);
                    ss2.setSpan(new RelativeSizeSpan(2f), 0,1, 0);
                    ed.getText().insert(ed.getSelectionStart(), ss2);
                } else {
                    ed.getText().insert(ed.getSelectionStart(),ss);
                }

            }

        } catch (Exception e){

        }



        return str_final;
    }

    private boolean is_char_match(String ss){

        String str_plus = ""+Html.fromHtml("&#43;");
        String str_minus = ""+Html.fromHtml("&#8722;");
        String str_equal = ""+Html.fromHtml("&#61;");
        String str_multi = ""+Html.fromHtml("&#215;");
        String str_divide = ""+Html.fromHtml("&#247;");
        String str_goe = ""+Html.fromHtml("&#8805;");
        String str_loe = ""+Html.fromHtml("&#8804;");
        String str_grthan = ""+Html.fromHtml("&#62;");
        String str_lethan = ""+Html.fromHtml("&#60;");

        if (ss.equals(str_plus) || ss.equals(str_minus) || ss.equals(str_equal) || ss.equals(str_multi) || ss.equals(str_divide)
                || ss.equals(str_goe) || ss.equals(str_loe) || ss.equals(str_grthan)
                || ss.equals(str_lethan) ){
            return true;
        } else {
            return false;
        }

    }

    public void onplusminusclick(View v) {
        try {
            if (selected_ed_2 == null) {

                int pos = selectedTextView.getSelectionStart();

                try {

                    if (pos == 0) {

                        if (selectedTextView.getText().toString().trim().length() > 0){

                            String ss = String.valueOf(selectedTextView.getText().toString().charAt(0));

                            if (ss.equals("-")){
                                selectedTextView.getText().delete(0, 1);
                            } else {
                                selectedTextView.getText().insert(0, "-");
                            }

                        } else {
                            selectedTextView.getText().insert(0, "-");
                        }

                    }

                } catch (Exception e){

                }

                for (int i = (pos-1);i>=0;i--){

                    String ss = String.valueOf(selectedTextView.getText().toString().charAt(i));

                    if (ss.equals("-")){
                        selectedTextView.getText().delete(i, i+1);
                        break;
                    } else if (ss.equals(" ")){
                        selectedTextView.getText().insert(i+1, "-");
                        break;
                    } else if (ss.equals("(") || ss.equals(")")){
                        selectedTextView.getText().insert(i+1, "-");
                        break;
                    } else if (is_char_match(ss)){
                        selectedTextView.getText().insert(i+1, "-");
                        break;
                    } else if(i==0){
                        selectedTextView.getText().insert(i, "-");
                        break;
                    }

                }

            } else {

                int cur_pos = ll_ans_box_selected.indexOfChild(ll_selected_view);

                if (cur_pos < ll_ans_box_selected.getChildCount()) {

                    LinearLayout ll_next = (LinearLayout)ll_ans_box_selected.getChildAt((cur_pos+1));

                    if (String.valueOf(ll_next.getTag()).equals("text")) {
                        EditTextBlink ed_text = (EditTextBlink)ll_next.getChildAt(0);
                        if (ed_text.getText().toString().contains("-")) {
                            ed_text.getText().delete(0,1);
                        } else {
                            ed_text.getText().insert(0,"-");
                        }
                        ed_text.setSelection(1);
                        ed_text.requestFocus();
                    } else {
                        final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
                        ll_last.setTag("text");
                        final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
                        ed_centre.setText("-");
                        ed_centre.requestFocus();
                        ll_last.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ed_centre.setCursorVisible(true);
                                selectedTextView = ed_centre;
                                ll_selected_view = ll_last;
                                selected_ed_2 = null;
                                showKeyboard();
                            }
                        });
                        ed_centre.setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public boolean onTouch(View v, MotionEvent event) {
                                ed_centre.setCursorVisible(true);
                                selectedTextView = ed_centre;
                                ll_selected_view = ll_last;
                                selected_ed_2 = null;
                                showKeyboard();
                                return false;
                            }
                        });
                        ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                            @Override
                            public void onFocusChange(View v, boolean hasFocus) {
                                if (hasFocus) {
                                    selectedTextView = ed_centre;
                                    ll_selected_view = ll_last;
                                    selected_ed_2 = null;
                                }
                            }
                        });

                        ll_ans_box_selected.addView(ll_last,(cur_pos+1));
                    }
                }
            }
        } catch (Exception e){

        }
    }

    private void setTextToSelectedTextView(EditText txtView , String text){ // Changes by Siddhi info soft

        final LinearLayout ll_ans_box = ll_ans_box_selected;

        try {

            if(text.equals("op_pi")){
                text = ""+Html.fromHtml("&#960;");
            }

            if (selected_ed_2 == null) {

                setTextToSelectedTextView2(txtView, text);

            } else {

                int cur_pos = ll_ans_box_selected.indexOfChild(ll_selected_view);

                if (cur_pos < ll_ans_box_selected.getChildCount()) {

                    final LinearLayout ll_last = (LinearLayout) getLayoutInflater().inflate(R.layout.kb_view_ed_last, null);
                    ll_last.setTag("text");
                    final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
                    ed_centre.setText(text);
                    ll_last.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ed_centre.setCursorVisible(true);
                            selectedTextView = ed_centre;
                            ll_selected_view = ll_last;
                            selected_ed_2 = null;
                            ll_ans_box_selected = ll_ans_box;
                            showKeyboard();
                        }
                    });
                    ed_centre.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            ed_centre.setCursorVisible(true);
                            selectedTextView = ed_centre;
                            ll_selected_view = ll_last;
                            selected_ed_2 = null;
                            ll_ans_box_selected = ll_ans_box;
                            showKeyboard();
                            return false;
                        }
                    });
                    ed_centre.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public void onFocusChange(View v, boolean hasFocus) {
                            if (hasFocus) {
                                selectedTextView = ed_centre;
                                ll_selected_view = ll_last;
                                selected_ed_2 = null;
                                ll_ans_box_selected = ll_ans_box;
                            }
                        }
                    });

                    ll_ans_box.addView(ll_last, (cur_pos + 1));

                    ed_centre.requestFocus();

                }
            }

        } catch (Exception e){

        }

    }

    public void setTextToSelectedTextView2(EditText txtView , String text){ //added by siddhiinfosoft
        try{
            if(selectedTextView != null){

                int cur_pos = selectedTextView.getSelectionStart();
                int ed_length = selectedTextView.getText().toString().length();

                if (selectedTextView.getText().toString().length() > 1) {

                    String str_bar_1 = ""+Html.fromHtml("&#x0304;");
                    String str_bar_2 = ""+Html.fromHtml("&#772;");
                    String str_mu = ""+Html.fromHtml("&#956;");
                    String str_sigma = ""+Html.fromHtml("&#963;");

                    if (cur_pos != 0 && cur_pos < ed_length){
                        String ss = String.valueOf(selectedTextView.getText().toString().charAt(cur_pos - 1));

                        if (ss.equals(str_mu) || ss.equals(str_sigma)){

                        } else if(ss.equals("x")) {

                            String ss_1 = String.valueOf(selectedTextView.getText().toString().charAt(cur_pos));

                            if (ss_1.equals(str_bar_1) || ss_1.equals(str_bar_2)){

                            } else {
                                selectedTextView.getText().insert(selectedTextView.getSelectionStart(), text);
                            }

                        } else {
                            selectedTextView.getText().insert(selectedTextView.getSelectionStart(), text);
                        }

                    } else {
                        selectedTextView.getText().insert(selectedTextView.getSelectionStart(), text);
                    }

                } else {

                    selectedTextView.getText().insert(selectedTextView.getSelectionStart(), text);

                }

                if (text.equals("|  |")){
                    selectedTextView.setSelection((selectedTextView.getText().toString().trim().length() - 3));
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void callclickmethod(final LinearLayout ll_ans_box
    ) {

        try {

            LinearLayout ll_last = (LinearLayout) ll_ans_box.getChildAt((ll_ans_box.getChildCount() - 1));
            if (ll_last.getTag().toString().equals("text")){
                final EditTextBlink ed_centre = (EditTextBlink) ll_last.findViewById(R.id.ed_centre);
                ed_centre.setSelection(ed_centre.getText().toString().length());
                ed_centre.requestFocus();
            } else {
                add_last_ed(ll_ans_box, 18, ll_ans_box.getChildCount());
            }

            showKeyboard();

        } catch (Exception e) {

        }
    }


    protected void setvisibility_scroll_btn(boolean is_visible){

        if (is_visible){

            btn_eq_symbol_pre_scroll.setVisibility(View.VISIBLE);
            btn_eq_symbol_next_scroll.setVisibility(View.VISIBLE);

        } else {

            btn_eq_symbol_pre_scroll.setVisibility(View.GONE);
            btn_eq_symbol_next_scroll.setVisibility(View.GONE);

        }

    }

    protected void changecasevalue() {

        if (kwyboard_case_value){
            kb_btn_abc_case.setBackgroundResource(R.drawable.kb_abc_text_trf);
            kb_btn_abc_q.setText("q");
            kb_btn_abc_w.setText("w");
            kb_btn_abc_e.setText("e");
            kb_btn_abc_r.setText("r");
            kb_btn_abc_t.setText("t");
            kb_btn_abc_y.setText("y");
            kb_btn_abc_u.setText("u");
            kb_btn_abc_i.setText("i");
            kb_btn_abc_o.setText("o");
            kb_btn_abc_p.setText("p");
            kb_btn_abc_a.setText("a");
            kb_btn_abc_s.setText("s");
            kb_btn_abc_d.setText("d");
            kb_btn_abc_f.setText("f");
            kb_btn_abc_g.setText("g");
            kb_btn_abc_h.setText("h");
            kb_btn_abc_j.setText("j");
            kb_btn_abc_k.setText("k");
            kb_btn_abc_l.setText("l");
            kb_btn_abc_z.setText("z");
            kb_btn_abc_x.setText("x");
            kb_btn_abc_c.setText("c");
            kb_btn_abc_v.setText("v");
            kb_btn_abc_b.setText("b");
            kb_btn_abc_n.setText("n");
            kb_btn_abc_m.setText("m");
            kb_btn_abc_q.setTag("q");
            kb_btn_abc_w.setTag("w");
            kb_btn_abc_e.setTag("e");
            kb_btn_abc_r.setTag("r");
            kb_btn_abc_t.setTag("t");
            kb_btn_abc_y.setTag("y");
            kb_btn_abc_u.setTag("u");
            kb_btn_abc_i.setTag("i");
            kb_btn_abc_o.setTag("o");
            kb_btn_abc_p.setTag("p");
            kb_btn_abc_a.setTag("a");
            kb_btn_abc_s.setTag("s");
            kb_btn_abc_d.setTag("d");
            kb_btn_abc_f.setTag("f");
            kb_btn_abc_g.setTag("g");
            kb_btn_abc_h.setTag("h");
            kb_btn_abc_j.setTag("j");
            kb_btn_abc_k.setTag("k");
            kb_btn_abc_l.setTag("l");
            kb_btn_abc_z.setTag("z");
            kb_btn_abc_x.setTag("x");
            kb_btn_abc_c.setTag("c");
            kb_btn_abc_v.setTag("v");
            kb_btn_abc_b.setTag("b");
            kb_btn_abc_n.setTag("n");
            kb_btn_abc_m.setTag("m");
            kwyboard_case_value = false;
        } else {
            kb_btn_abc_case.setBackgroundResource(R.drawable.kb_abc_text_trf_sel);
            kb_btn_abc_q.setText("Q");
            kb_btn_abc_w.setText("W");
            kb_btn_abc_e.setText("E");
            kb_btn_abc_r.setText("R");
            kb_btn_abc_t.setText("T");
            kb_btn_abc_y.setText("Y");
            kb_btn_abc_u.setText("U");
            kb_btn_abc_i.setText("I");
            kb_btn_abc_o.setText("O");
            kb_btn_abc_p.setText("P");
            kb_btn_abc_a.setText("A");
            kb_btn_abc_s.setText("S");
            kb_btn_abc_d.setText("D");
            kb_btn_abc_f.setText("F");
            kb_btn_abc_g.setText("G");
            kb_btn_abc_h.setText("H");
            kb_btn_abc_j.setText("J");
            kb_btn_abc_k.setText("K");
            kb_btn_abc_l.setText("L");
            kb_btn_abc_z.setText("Z");
            kb_btn_abc_x.setText("X");
            kb_btn_abc_c.setText("C");
            kb_btn_abc_v.setText("V");
            kb_btn_abc_b.setText("B");
            kb_btn_abc_n.setText("N");
            kb_btn_abc_m.setText("M");
            kb_btn_abc_q.setTag("Q");
            kb_btn_abc_w.setTag("W");
            kb_btn_abc_e.setTag("E");
            kb_btn_abc_r.setTag("R");
            kb_btn_abc_t.setTag("T");
            kb_btn_abc_y.setTag("Y");
            kb_btn_abc_u.setTag("U");
            kb_btn_abc_i.setTag("I");
            kb_btn_abc_o.setTag("O");
            kb_btn_abc_p.setTag("P");
            kb_btn_abc_a.setTag("A");
            kb_btn_abc_s.setTag("S");
            kb_btn_abc_d.setTag("D");
            kb_btn_abc_f.setTag("F");
            kb_btn_abc_g.setTag("G");
            kb_btn_abc_h.setTag("H");
            kb_btn_abc_j.setTag("J");
            kb_btn_abc_k.setTag("K");
            kb_btn_abc_l.setTag("L");
            kb_btn_abc_z.setTag("Z");
            kb_btn_abc_x.setTag("X");
            kb_btn_abc_c.setTag("C");
            kb_btn_abc_v.setTag("V");
            kb_btn_abc_b.setTag("B");
            kb_btn_abc_n.setTag("N");
            kb_btn_abc_m.setTag("M");
            kwyboard_case_value = true;
        }

    }

    protected void callscrollmethod(int int_type){

        switch (int_type){

            case 1:

                hsv_keyboard_eq_name.post(new Runnable() {
                    @Override
                    public void run() {
                        hsv_keyboard_eq_name.scrollTo((hsv_keyboard_eq_name.getScrollX()-60),0);
                    }
                });

                break;

            case 2:

                hsv_keyboard_eq_name.post(new Runnable() {
                    @Override
                    public void run() {
                        hsv_keyboard_eq_name.scrollTo((hsv_keyboard_eq_name.getScrollX()+60),0);
                    }
                });

                break;

            case 3:

                hsv_keyboard_eq_symbol.post(new Runnable() {
                    @Override
                    public void run() {
                        hsv_keyboard_eq_symbol.scrollTo((hsv_keyboard_eq_symbol.getScrollX()-60),0);
                    }
                });

                break;

            case 4:

                hsv_keyboard_eq_symbol.post(new Runnable() {
                    @Override
                    public void run() {
                        hsv_keyboard_eq_symbol.scrollTo((hsv_keyboard_eq_symbol.getScrollX()+60),0);
                    }
                });

                break;

        }

    }

}

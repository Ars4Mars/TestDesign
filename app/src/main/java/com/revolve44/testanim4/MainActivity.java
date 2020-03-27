package com.revolve44.testanim4;


import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
//import android.support.v7.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends AppCompatActivity {

    private ImageView ivSun;
    private RelativeLayout SkyLayout;
    private ImageView ivCloud1;
    private ImageView ivCloud2;
    private ImageView ivBird;
    private ImageView ivRoof;
    ImageView image;
    private int ANIMATION_DURATION = 3000;

    // a c = is start
    public float a = -400; // start X
    public float c = 60; // start Y

    public float b = 150;// to X
    public float d = 150;// to Y

    public int width;
    public int height;

    SupportMapFragment mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivSun = (ImageView) findViewById(R.id.ivSun);
        SkyLayout = (RelativeLayout) findViewById(R.id.SkyLayout);
        ivRoof = (ImageView) findViewById(R.id.ivRoof);

//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment_byID = fm.findFragmentById(R.id.mapView);


        calcScreen();



    }
    public void calcScreen(){
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
        height = displayMetrics2.heightPixels-130;
        width = displayMetrics2.widthPixels-210;
    }


    public void firstsection(View view) {
        //darken sky
        ValueAnimator skyAnim =
                ObjectAnimator.ofInt(SkyLayout, "backgroundColor",
                        Color.parseColor("#CAD2E3"),
                        Color.parseColor(getString(R.string.spacegrey)));
        skyAnim.setDuration(ANIMATION_DURATION);
        //skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        //skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim.setEvaluator(new ArgbEvaluator());
        skyAnim.start();

    }

    public void secondsection(View view) {

    }

    public void thirdsection(View view) {

    }


// motion desing
    public void sunrise(View view) {
        //darken sky
        SkyLayout = (RelativeLayout) findViewById(R.id.SkyLayout);
        ValueAnimator skyAnim =
                ObjectAnimator.ofInt(SkyLayout, "backgroundColor",
                        Color.parseColor(getString(R.string.night)),
                        Color.parseColor(getString(R.string.day)));
        skyAnim.setDuration(ANIMATION_DURATION);
        //skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        //skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim.setEvaluator(new ArgbEvaluator());
        skyAnim.start();
        //Motion Sun
        ImageView image4 = (ImageView) findViewById(R.id.ivSun);
        image4.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation animation1 = new TranslateAnimation(-220, width/100,250, 200 );
        animation1.setDuration(3000);
        animation1.setFillAfter(true);
        image4.startAnimation(animation1);

    }

    public void deg45(View view) {
        //darken sky
        SkyLayout = (RelativeLayout) findViewById(R.id.SkyLayout);
        ValueAnimator skyAnim =
                ObjectAnimator.ofInt(SkyLayout, "backgroundColor",
                        Color.parseColor(getString(R.string.night)),
                        Color.parseColor(getString(R.string.day)));
        skyAnim.setDuration(ANIMATION_DURATION);
        //skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        //skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim.setEvaluator(new ArgbEvaluator());
        skyAnim.start();
        //Motion Sun
        ImageView image4 = (ImageView) findViewById(R.id.ivSun);
        image4.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation animation1 = new TranslateAnimation(-220, width/6,200, -20 );
        animation1.setDuration(3000);
        animation1.setFillAfter(true);
        image4.startAnimation(animation1);


    }

    public void deg90(View view) {
        //darken sky
        SkyLayout = (RelativeLayout) findViewById(R.id.SkyLayout);
        ValueAnimator skyAnim2 =
                ObjectAnimator.ofInt(SkyLayout, "backgroundColor",
                        Color.parseColor(getString(R.string.night)),
                        Color.parseColor(getString(R.string.day)));
        skyAnim2.setDuration(ANIMATION_DURATION);
        //skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        //skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim2.setEvaluator(new ArgbEvaluator());
        skyAnim2.start();

        //Motion Sun
        ImageView image4 = (ImageView) findViewById(R.id.ivSun);
        image4.setVisibility(View.VISIBLE);
    //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation animation2 = new TranslateAnimation(-220, width/2,200, -20 );
        animation2.setDuration(3000);
        animation2.setFillAfter(true);
        image4.startAnimation(animation2);
     }

    public void deg135(View view) {
        //darken sky
        SkyLayout = (RelativeLayout) findViewById(R.id.SkyLayout);
        ValueAnimator skyAnim =
                ObjectAnimator.ofInt(SkyLayout, "backgroundColor",
                        Color.parseColor(getString(R.string.night)),
                        Color.parseColor(getString(R.string.day)));
        skyAnim.setDuration(ANIMATION_DURATION);
        //skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        //skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim.setEvaluator(new ArgbEvaluator());
        skyAnim.start();
        //Motion Sun
        ImageView image4 = (ImageView) findViewById(R.id.ivSun);
        image4.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation animation1 = new TranslateAnimation(0, (width/6)*5,-200, -20 );
        animation1.setDuration(3000);
        animation1.setFillAfter(true);
        image4.startAnimation(animation1);
    }

    public void sunset(View view) {
        //darken sky
        SkyLayout = (RelativeLayout) findViewById(R.id.SkyLayout);
        ValueAnimator skyAnim =
                ObjectAnimator.ofInt(SkyLayout, "backgroundColor",
                        Color.parseColor(getString(R.string.night)),
                        Color.parseColor(getString(R.string.day)));
        skyAnim.setDuration(ANIMATION_DURATION);
        //skyAnim.setRepeatCount(ValueAnimator.INFINITE);
        //skyAnim.setRepeatMode(ValueAnimator.REVERSE);
        skyAnim.setEvaluator(new ArgbEvaluator());
        skyAnim.start();
        //Motion Sun
        ImageView image4 = (ImageView) findViewById(R.id.ivSun);
        image4.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation animation1 = new TranslateAnimation(0, (width/100)*99,-200, 200 );
        animation1.setDuration(3000);
        animation1.setFillAfter(true);
        image4.startAnimation(animation1);
    }

    public void firsttest(View view) {
    }
}

package com.revolve44.testanim4;


import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
//import android.support.v7.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.Random;

import de.nitri.gauge.Gauge;
import pl.pawelkleczkowski.customgauge.CustomGauge;

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

    int random_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivSun = (ImageView) findViewById(R.id.ivSun);
        SkyLayout = (RelativeLayout) findViewById(R.id.SkyLayout);
        ivRoof = (ImageView) findViewById(R.id.ivRoof);

//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment_byID = fm.findFragmentById(R.id.mapView);
//        Random r = new Random();
//        int random_num = r.nextInt(50 - 1) + 1;
        //final Gauge gauge = (Gauge) findViewById(R.id.gauge);

        //gauge.moveToValue(800);

//        HandlerThread thread = new HandlerThread("GaugeDemoThread");
//        thread.start();
//        Handler handler = new Handler(thread.getLooper());
//
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                gauge.moveToValue(300);
//            }
//        }, 2800);
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                gauge.moveToValue(550);
//            }
//        }, 5600);





        calcScreen();




    }
    public void calcScreen(){
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
        height = displayMetrics2.heightPixels-130;
        width = displayMetrics2.widthPixels;


        int min = 1;
        int max = 50;

        Random r = new Random();
        random_num = r.nextInt(max - min + 1) + min;
        Toast.makeText(this, ""+width, Toast.LENGTH_SHORT).show();


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

    public void MasterCloud(){
        //Motion CloudL
        ImageView cloud = (ImageView) findViewById(R.id.ivCloudLARGE);
        cloud.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation cloudanim = new TranslateAnimation(-720, (width/100)+random_num,-20, -20 );
        cloudanim.setDuration(3000);
        cloudanim.setFillAfter(true);
        cloud.startAnimation(cloudanim);
        //
        //Motion CloudL
        ImageView cloud2 = (ImageView) findViewById(R.id.ivCloudLARGE2);
        cloud2.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation cloudanim2 = new TranslateAnimation(-720, (width/3)+random_num,-20, -20 );
        cloudanim2.setDuration(3500);
        cloudanim2.setFillAfter(true);
        cloud2.startAnimation(cloudanim2);
        //
        //Motion CloudL
        ImageView cloud3 = (ImageView) findViewById(R.id.ivCloudLARGE3);
        cloud3.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation cloudanim3 = new TranslateAnimation(-720, (width/2)+random_num,-20, -20 );
        cloudanim3.setDuration(4000);
        cloudanim3.setFillAfter(true);
        cloud3.startAnimation(cloudanim3);
        //
        //Motion CloudL
        ImageView cloud4 = (ImageView) findViewById(R.id.ivCloudLARGE4);
        cloud4.setVisibility(View.VISIBLE);
        //TranslateAnimation animation2 = new TranslateAnimation(a, 200, c, 280);
        TranslateAnimation cloudanim4 = new TranslateAnimation(-720, (width-100)+random_num,-20, -20 );
        cloudanim4.setDuration(4500);
        cloudanim4.setFillAfter(true);
        cloud4.startAnimation(cloudanim4);
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

        MasterCloud();

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
        TranslateAnimation animation2 = new TranslateAnimation(-220, width/2-100,200, -20 );
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
        TranslateAnimation animation1 = new TranslateAnimation(0, (width/6)*5,-320, -20 );
        animation1.setDuration(4000);
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
        TranslateAnimation animation1 = new TranslateAnimation(0, width-200,-320, 200 );
        animation1.setDuration(4000);
        animation1.setFillAfter(true);
        image4.startAnimation(animation1);

        int width2 = image4.getDrawable().getIntrinsicWidth();
        Toast.makeText(this, ""+width2, Toast.LENGTH_SHORT).show();
    }

    public void firsttest(View view) {
        ImageView imageX= (ImageView) findViewById(R.id.birds);
        RotateAnimation rotate = new RotateAnimation(360, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        rotate.setDuration(Animation.INFINITE);
//        rotate.setInterpolator(new LinearInterpolator());
        rotate.setDuration(500);
        rotate.setRepeatCount(Animation.INFINITE);
        rotate.setInterpolator(new LinearInterpolator());
        imageX.startAnimation(rotate);


    }
}

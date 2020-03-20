package com.revolve44.testanim4;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    AnimationView myAnimationView;
    CornerPathEffect mCornerPathEffect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAnimationView = (AnimationView)findViewById(R.id.MyAnimationView);

        prepareThings();
    }

    private void prepareThings(){
        Paint paint;
        Path animPath;
        Path animPath2;

        float step;
        Bitmap bm;

        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.STROKE);

        bm = BitmapFactory.decodeResource(getResources(), R.drawable.lightbeam);
//        animPath.moveTo(100, 100);
//        animPath.lineTo(200, 100);
//        animPath.lineTo(300, 50);
//        animPath.lineTo(400, 150);
//        animPath.lineTo(100, 300);
//        animPath.lineTo(600, 300);
//        animPath.lineTo(100, 100);

        animPath = new Path();
        float radius = 30.0f;
        mCornerPathEffect = new CornerPathEffect(radius);
        paint.setPathEffect(mCornerPathEffect);
        //RectF rectF = new RectF(50, 20, 100, 80);
        animPath.moveTo(50, 100);
        //animPath.addArc(rectF,180,0);
        animPath.lineTo(100, 50);
        animPath.lineTo(150, 50);
        animPath.lineTo(200, 100);
        animPath.lineTo(50, 100);

//        animPath.lineTo(600, 300);
//        animPath.lineTo(100, 100);
        animPath.close();

        step = 1;

        animPath2 = new Path();
        //RectF rectF2 = new RectF(50, 20, 100, 80);
        animPath2.moveTo(50, 400);
        animPath2.moveTo(450, 600);
        //animPath2.addArc(rectF2,180,0);
//        animPath2.lineTo(100, 50);
//        animPath2.lineTo(150, 50);
//        animPath2.lineTo(200, 100);
//        animPath2.lineTo(50, 100);

//        animPath.lineTo(600, 300);
//        animPath.lineTo(100, 100);
        animPath2.close();
        step =2;

        AnimationThing thing = new AnimationThing(paint, animPath, bm, step);
        myAnimationView.insertThing(thing);

        //The second thing
        //bm = BitmapFactory.decodeResource(getResources(), android.R.drawable.ic_menu_add);

//        animPath.reset();
//        //animPath.addArc(100,40,200,10,60,60);
//        //animPath.addArc(1,2,3);
//        //animPath.addOval(50,50,50,50, Path.Direction.CCW);
//        //animPath.addCircle(400, 400, 300, Path.Direction.CW);
//        step = 3;
//        thing = new AnimationThing(paint, animPath, bm, step);
//        myAnimationView.insertThing(thing);
    }
}

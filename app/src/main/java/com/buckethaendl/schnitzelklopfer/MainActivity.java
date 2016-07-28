package com.buckethaendl.schnitzelklopfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView score;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.score = (TextView) this.findViewById(R.id.score);

    }

    public void onClickSchnitzel(View view) {

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.schnitzel_anim);
        view.startAnimation(animation);

        count++;

        this.score.setText(getString(R.string.score, count));

    }

}

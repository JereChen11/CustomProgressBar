package com.jere.customprogressbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author jere
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button systemProBarBtn = findViewById(R.id.system_pro_bar_btn);
        systemProBarBtn.setOnClickListener(this);
        Button circleProBarBtn = findViewById(R.id.circle_pro_bar_btn);
        circleProBarBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.system_pro_bar_btn:
                Intent systemProBarIntent = new Intent(this, TestSystemProgressBarActivity.class);
                startActivity(systemProBarIntent);
                break;
            case R.id.circle_pro_bar_btn:
                Intent circleProBarIntent = new Intent(this, TestCircleProgressBarActivity.class);
                startActivity(circleProBarIntent);
                break;
            default:
                break;
        }
    }
}

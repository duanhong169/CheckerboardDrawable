package top.defaults.checkerboarddrawable;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckerboardDrawable drawable = new CheckerboardDrawable.Builder()
                .colorOdd(Color.LTGRAY)
                .colorEven(Color.DKGRAY)
                .size(20)
                .build();
        findViewById(android.R.id.content).setBackgroundDrawable(drawable);
    }
}

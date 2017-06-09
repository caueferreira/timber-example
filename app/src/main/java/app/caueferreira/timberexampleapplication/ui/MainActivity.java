package app.caueferreira.timberexampleapplication.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.caueferreira.timberexampleapplication.R;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.e(new NullPointerException(), "duh");
        Timber.d("duh");
    }
}

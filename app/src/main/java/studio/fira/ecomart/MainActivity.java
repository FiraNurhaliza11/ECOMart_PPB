package studio.fira.ecomart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buahMenu(View view) {
        Intent i = new Intent(this, BuahActivity.class);
        startActivity(i);
    }

    public void sayurMenu(View view) {
        Intent i = new Intent(this, SayurActivity.class);
        startActivity(i);
    }

    public void snackMenu(View view) {
        Intent i = new Intent(this, SnackActivity.class);
        startActivity(i);
    }

    public void minumanMenu(View view) {
        Intent i = new Intent(this, MinumanActivity.class);
        startActivity(i);
    }
}
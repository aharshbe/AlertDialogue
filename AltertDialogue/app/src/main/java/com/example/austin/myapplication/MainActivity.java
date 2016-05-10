package com.example.austin.myapplication;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView helloworld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void peekabooclick(View view) {
        System.out.println("Clicked peek");
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Peek-A-Boo");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Now you don't",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "You see me!",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }

    public void youseemeclick(View view) {
        System.out.println("Clicked you see me");
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("You see me");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Now you don't",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "You see me",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();

    }
}

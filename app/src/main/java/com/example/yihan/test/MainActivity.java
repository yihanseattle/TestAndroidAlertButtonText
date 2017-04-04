package com.example.yihan.test;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Button mButtonStardard;
    private Button mButtonSupport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();
        mButtonStardard = (Button) findViewById(R.id.bStandard);
        mButtonStardard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showStandardDialog();
            }
        });
        mButtonSupport = (Button) findViewById(R.id.bSupportLibrary);
        mButtonSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSupportDialog();
            }
        });

    }


    private void showSupportDialog() {
        android.support.v7.app.AlertDialog.Builder alertDialogBuilder = new android.support.v7.app.AlertDialog.Builder(
                this);

        // set title
        alertDialogBuilder.setTitle("Your Title");

        // set dialog message
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Foo1234567890",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
//                        MainActivity.this.finish();
                        Toast.makeText(mContext, "Foo1234567890", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Bar1234567890",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
//                        dialog.cancel();
                        Toast.makeText(mContext, "Bar1234567890", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Baz1234567890", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mContext, "Baz1234567890", Toast.LENGTH_SHORT).show();
                    }
                });

        // create alert dialog
        android.support.v7.app.AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }

    private void showStandardDialog() {
        android.app.AlertDialog.Builder alertDialogBuilder = new android.app.AlertDialog.Builder(
                this);

        // set title
        alertDialogBuilder.setTitle("Your Title");

        // set dialog message
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Foo1234567890",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
//                        MainActivity.this.finish();
                        Toast.makeText(mContext, "Foo1234567890", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Bar1234567890",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
//                        dialog.cancel();
                        Toast.makeText(mContext, "Bar1234567890", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Baz1234567890", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(mContext, "Baz1234567890", Toast.LENGTH_SHORT).show();
                    }
                });

        // create alert dialog
        android.app.AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }
}

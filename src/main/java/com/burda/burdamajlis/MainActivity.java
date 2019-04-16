package com.burda.burdamajlis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    Button baith, translation, arabic, malayalam ;
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void burdha_baith(View view) {
       Intent intent = new Intent(MainActivity.this, Burdha_baith.class);
       startActivity(intent);
    }

    public void burdha_translation(View view) {
        Intent intent = new Intent(MainActivity.this, Burdha_translation.class);
        startActivity(intent);
        }

    public void arabic_recitation(View view){
        //code for arabic audio burdha
    }

    public void malayalam_recitation(View view){
        //code for malayalam audio burdha
    }
}

package com.burda.burdamajlis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Burdha_baith extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burdha_baith);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("burdha_baith.pdf").load();
    }
}

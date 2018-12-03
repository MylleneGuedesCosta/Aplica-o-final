package com.lourdinas.finalaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class media_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_);

        final EditText tx1 = (EditText) findViewById(R.id.txt_1);
        final EditText tx2 = (EditText) findViewById(R.id.txt_2);
        final EditText tx3 = (EditText) findViewById(R.id.txt_3);
        final EditText tx4 = (EditText) findViewById(R.id.txt_4);
        final Button btn = (Button) findViewById(R.id.btn_calcular);
        final TextView txt_resu = (TextView) findViewById(R.id.txt_resultado);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double v1 = Double.parseDouble(tx1.getText().toString());
                double v2 = Double.parseDouble(tx2.getText().toString());
                double v3 = Double.parseDouble(tx3.getText().toString());
                double v4 = Double.parseDouble(tx4.getText().toString());

                double media = ( v1 + v2+ v3 +v4 )/4;
                String md = Double.toString(media);
                txt_resu.setText(md);

            }
        });



    }
}

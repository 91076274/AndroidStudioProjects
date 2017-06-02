package com.example.rbajor.keyboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_a = (Button) findViewById(R.id.button_a);
        Button button_b = (Button) findViewById(R.id.button_b);
        Button button_c = (Button) findViewById(R.id.button_c);
        Button button_d = (Button) findViewById(R.id.button_d);
        Button button_e = (Button) findViewById(R.id.button_e);
        Button button_f = (Button) findViewById(R.id.button_f);
        Button button_g = (Button) findViewById(R.id.button_g);
        Button button_h = (Button) findViewById(R.id.button_h);
        Button button_i = (Button) findViewById(R.id.button_i);
        Button button_j = (Button) findViewById(R.id.button_j);
        Button button_k = (Button) findViewById(R.id.button_k);
        Button button_l = (Button) findViewById(R.id.button_l);
        Button button_m = (Button) findViewById(R.id.button_m);
        Button button_n = (Button) findViewById(R.id.button_n);
        Button button_o = (Button) findViewById(R.id.button_o);
        Button button_p = (Button) findViewById(R.id.button_p);
        Button button_q = (Button) findViewById(R.id.button_q);
        Button button_r = (Button) findViewById(R.id.button_r);
        Button button_s = (Button) findViewById(R.id.button_s);
        Button button_t = (Button) findViewById(R.id.button_t);
        Button button_u = (Button) findViewById(R.id.button_u);
        Button button_v = (Button) findViewById(R.id.button_v);
        Button button_w = (Button) findViewById(R.id.button_w);
        Button button_x = (Button) findViewById(R.id.button_x);
        Button button_y = (Button) findViewById(R.id.button_y);
        Button button_z = (Button) findViewById(R.id.button_z);
        Button button_period = (Button) findViewById(R.id.button_period);
        Button button_comma = (Button) findViewById(R.id.button_comma);
        Button button_space = (Button) findViewById(R.id.button_space);
        Button button_clear = (Button) findViewById(R.id.button_clear);
        button_a.setOnClickListener(this);
        button_b.setOnClickListener(this);
        button_c.setOnClickListener(this);
        button_d.setOnClickListener(this);
        button_e.setOnClickListener(this);
        button_f.setOnClickListener(this);
        button_g.setOnClickListener(this);
        button_h.setOnClickListener(this);
        button_i.setOnClickListener(this);
        button_j.setOnClickListener(this);
        button_k.setOnClickListener(this);
        button_l.setOnClickListener(this);
        button_m.setOnClickListener(this);
        button_n.setOnClickListener(this);
        button_o.setOnClickListener(this);
        button_p.setOnClickListener(this);
        button_q.setOnClickListener(this);
        button_r.setOnClickListener(this);
        button_s.setOnClickListener(this);
        button_t.setOnClickListener(this);
        button_u.setOnClickListener(this);
        button_v.setOnClickListener(this);
        button_w.setOnClickListener(this);
        button_x.setOnClickListener(this);
    }
}

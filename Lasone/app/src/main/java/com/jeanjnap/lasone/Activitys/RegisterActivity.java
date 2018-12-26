package com.jeanjnap.lasone.Activitys;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.jeanjnap.lasone.R;
import com.jeanjnap.lasone.Util.TextUtil;

public class RegisterActivity extends AppCompatActivity {

    TextUtil textUtil;

    TextView terms;
    CheckBox checkBox;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(R.string.register);

        textUtil = new TextUtil(this);
        terms = findViewById(R.id.terms);
        textUtil.setUnderlineText(terms);

        checkBox = findViewById(R.id.checkBox);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()) {
                    Intent i = new Intent(RegisterActivity.this, HomeActivity.class);
                    startActivity(i);
                    finish();
                } else {
                    String error = String.valueOf(R.string.errorTerms);
                    checkBox.setError(error);
                }
            }
        });


    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}

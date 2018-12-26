package com.jeanjnap.lasone.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jeanjnap.lasone.R;
import com.jeanjnap.lasone.Util.TextUtil;

public class LoginActivity extends AppCompatActivity {

    TextUtil textUtil;

    TextView createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textUtil = new TextUtil(this);

        createAccount = findViewById(R.id.createAccount);
        textUtil.setUnderlineText(createAccount);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addCategory(Intent.CATEGORY_HOME);
        startActivity(i);
    }


}

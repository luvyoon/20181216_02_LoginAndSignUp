package kr.tjeit.a20181216_02_loginandsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    TextView useridTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String userid= getIntent().getStringExtra("입력아이디");
        useridTxt.setText(userid);


    }

    @Override
    public void bindViews() {

        useridTxt= findViewById(R.id.useridTxt);

    }
}

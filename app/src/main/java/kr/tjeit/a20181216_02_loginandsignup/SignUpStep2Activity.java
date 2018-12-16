package kr.tjeit.a20181216_02_loginandsignup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpStep2Activity extends BaseActivity {

    EditText emailEdt;
    EditText pwEdt;
    Button completeBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_step2);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        completeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                아이디가  이멜 형식 맞는지? /@포함하는가? emailEdt 에 !
                if (!emailEdt.getText().toString().contains("@")) {
//                    @ 포함하지 않으면 email형식으로 입력해주세요! Toast, 메쏘드 강제종료

                    Toast.makeText(mContext, "이메일 형식으로 입력해 주세요", Toast.LENGTH_SHORT).show();
                    return;
                }

//                비밀번호의 길이가 8자리 이상인가?
//                8글자보다 작으면 안내 메세지로 토스트!
                if (pwEdt.getText().toString().length()<8){
                    Toast.makeText(mContext, "8글자 이상으로 입력해주세요", Toast.LENGTH_SHORT).show();

                    return;

                }

//                회원가입이 완료되었습니다 토스트 띄움
//                로그인 화면 이동.

                Toast.makeText(mContext, "회원가입에 성공했습니다", Toast.LENGTH_SHORT).show();

//                새 액티비티를 띄울때, 기존에 잇던 모든 화면을 날려버리는게 낫다.


                Intent intent = new Intent(mContext,LoginActivity.class);

//                intent 를 만들때 특이사항을 메모
//                기존의 화면을 전부 날리고 + 새로운 액티비티로 띄워 주자
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

        emailEdt =findViewById(R.id.emailEdt);
        pwEdt =findViewById(R.id.pwEdt);
        completeBtn =findViewById(R.id.completeBtn);


    }
}

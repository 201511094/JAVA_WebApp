package kr.android.s17linearlayoutdemo07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*
        [실습]
        첫 번째 숫자와 두 번째 숫자를 입력한 후 연산자 선택 버튼을 누르면 연산 결과를 TextView에 표시하는 앱
        0으로 나누면 TextView에 (주의)0으로 나눌 수 없습니다, 를 표시
        이외의 조건은 체크 X

        Tip! EditText에서 입력 정보 읽기
        1) 문자 editText.getText().toString()
        2) 숫자 Integer.parseInt(editText.getText().toString())
    */

    EditText et1, et2;
    Integer num1, num2;
    TextView text;
    Button btn_plus, btn_minus, btn_multiply, btn_divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.text);
        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);

        btn_plus = (Button)findViewById(R.id.plus);
        //btn_plus.setOnClickListener(this);    //View.OnClickListener를 implements 한 경우 이벤트 연결
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                text.setText("계산 결과: " + (num1+num2));
            }
        });

        btn_minus = (Button)findViewById(R.id.minus);
        //btn_minus.setOnClickListener(this);
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                text.setText("계산 결과: " + (num1-num2));
            }
        });

        btn_multiply = (Button)findViewById(R.id.multiply);
        //btn_multiply.setOnClickListener(this);
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                text.setText("계산 결과: " + (num1*num2));
            }
        });

        btn_divide = (Button)findViewById(R.id.divide);
        //btn_divide.setOnClickListener(this);
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(et1.getText().toString());
                num2 = Integer.parseInt(et2.getText().toString());
                if (num2 == 0) {
                    text.setText("(주의)0으로 나눌 수 없습니다.");
                }
                else {
                    text.setText("계산 결과: " + (num1/num2));
                }
            }
        });
    }

    //View.OnClickListener를 implements한 경우
    @Override
    public void onClick(View v) {
        //버튼을 눌렀을 때 데이터를 읽어와야 함
        num1 = Integer.parseInt(et1.getText().toString());
        num2 = Integer.parseInt(et2.getText().toString());
        
        if (v.getId() == R.id.plus) {
            text.setText("계산 결과: " + (num1+num2));
        }
        else if (v.getId() == R.id.minus) {
            text.setText("계산 결과: " + (num1-num2));
        }
        else if (v.getId() == R.id.multiply) {
            text.setText("계산 결과: " + (num1*num2));
        }
        else if (v.getId() == R.id.divide) {
            if (num2 == 0) {
                text.setText("(주의)0으로 나눌 수 없습니다.");
            }
            else {
                text.setText("계산 결과: " + (num1/num2));
            }
        }
        else {
            text.setText("오류 발생!");
        }
    }

}
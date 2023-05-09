package sg.edu.rp.c346.id22002222.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //step 1: Declare the field variables

    Button btn;
    TextView tv;
    EditText et;

    ToggleButton tg;

    RadioGroup rg;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnButton);
        tv = findViewById(R.id.tvDisplay);
        et = findViewById(R.id.etTextInput);
        tg = findViewById(R.id.tg);
        rg = findViewById(R.id.RadioGroupGender);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tg.isChecked()){
                    String stringResponse = et.getText().toString();
                    tv.setText(stringResponse);
               }


            }
        });

        tg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tg.isChecked()){
                    et.setEnabled(true);
                } else{
                    et.setEnabled(false);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";
                String stringResponse = et.getText().toString();
                int checkedRadioId = rg.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtonMale){
                    message += "He say ";
                }else{
                    message += "She say ";
                }
                tv.setText(message + " " +stringResponse);
            }
        });
    }
}
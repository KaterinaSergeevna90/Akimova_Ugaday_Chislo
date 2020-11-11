package com.example.akimova_ugaday_chislo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//ввод переменных
    TextView tvInfo;
    EditText etInput;
    Button bControl;
    int guess;
    boolean gameFinished;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//связываем переменные
        tvInfo = (TextView)findViewById(R.id.textView1);
        etInput = (EditText)findViewById(R.id.editText1);
        bControl = (Button)findViewById(R.id.button1);

        guess = (int)(Math.random()*100);
        gameFinished = false;

    }

    public void onClic(View V){
        if (!gameFinished){
            int inp=Integer.parseInt(etInput.getText().toString());
            if (inp > guess)
                tvInfo.setText("Перелет!");
            if (inp < guess)
                tvInfo.setText("Недолет!");
            if (inp == guess){
                tvInfo.setText("В точку!");
                bControl.setText("Сыграть еще");
                gameFinished=true;
            }
        }
        else
        {
            guess = (int)(Math.random()*100);
            bControl.setText("Ввести значание:");
            tvInfo.setText("Попробуйте угадать число (1-100");
            gameFinished = false; }
    }

}
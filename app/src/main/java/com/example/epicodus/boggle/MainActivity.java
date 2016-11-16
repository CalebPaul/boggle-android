package com.example.epicodus.boggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private String mRandLetters;
    private List<Character> startLetters = new ArrayList<>();
    @Bind(R.id.scrambleTextView) TextView mScrambleTextView;
    @Bind(R.id.wordListView) TextView mWordListView;
    @Bind(R.id.inputField) EditText mInputField;
    @Bind(R.id.submitButton) Button mSubmitButton;
    @Bind(R.id.refreshButton) Button mRefreshButton;
    @Bind(R.id.shuffleButton) Button mShuffleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String newInput = mInputField.toString();

        Random randomGenerator = new Random();
        Shuffle s = new Shuffle();
        mShuffleButton.setOnClickListener(this);


        for(int i = 0; i < 8; i++){
                if(i==0||i==1){
                    char[] vowels = {'A','E','I','O','U'};
                    int randomNumber = randomGenerator.nextInt(5);
                    startLetters.add(vowels[randomNumber]);
                }else{
                    int randomNumber = randomGenerator.nextInt(26)+65;
                    char newLetter = (char) randomNumber;
                    startLetters.add(newLetter);
                }

        }
        s.shuffle(startLetters.toString());
        mScrambleTextView.setText(startLetters.toString());
    }

    @Override
    public void onClick(View v) {
        if(v == mShuffleButton){
            Shuffle s = new Shuffle();
            System.out.println();

            s.shuffle(startLetters.toString());

            mScrambleTextView.setText(startLetters.toString());
        }
    }
}



package com.example.epicodus.boggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.scrambleTextView) TextView mScrambleTextView;
    @Bind(R.id.wordListView) TextView mWordListView;
    @Bind(R.id.inputField) EditText mInputField;
    @Bind(R.id.submitButton) Button mSubmitButton;
    @Bind(R.id.refreshButton) Button mRefreshButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

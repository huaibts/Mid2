package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent1 = new Intent(this, Func1Activity.class);
        Intent intent2 = new Intent(this, Func2Activity.class);
        Intent intent3 = new Intent(this, Func3Activity.class);
        Intent intent4 = new Intent(this, Func4Activity.class);
        Intent intent5 = new Intent(this, Func5Activity.class);
        Intent intent6 = new Intent(this, Func6Activity.class);
        Intent intent7 = new Intent(this, Func7Activity.class);
        Intent intent8 = new Intent(this, Func8Activity.class);


        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);

        String button = b1.getText().toString();

        startActivity(intent1);
       // startActivity(intent1);
    }

    public void login1(View view){
    }
    public void login2(View view){

    }
    public void login3(View view){
        Toast.makeText(this, "特殊功能", Toast.LENGTH_SHORT).show();
    }
    public void login4(View view){

    }
    public void login5(View view){

    }
    public void login6(View view){

    }
    public void login7(View view){
        Toast.makeText(this, "特殊功能", Toast.LENGTH_SHORT).show();
    }
    public void login8(View view){
        Toast.makeText(this, "特殊功能", Toast.LENGTH_SHORT).show();
    }
}

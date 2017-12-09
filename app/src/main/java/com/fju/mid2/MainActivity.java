package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int FUNCTION_MAIN = 102;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNCTION_MAIN){
            Toast.makeText(this, "特殊功能", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login1(View view){
        Intent intent1 = new Intent(this, Func1Activity.class);
        startActivity(intent1);
    }
    public void login2(View view){
        Intent intent2 = new Intent(this, Func2Activity.class);
        startActivity(intent2);
    }
    public void login3(View view){
        Intent intent3 = new Intent(this, Func3Activity.class);
        startActivityForResult(intent3, FUNCTION_MAIN);
    }
    public void login4(View view){
        Intent intent4 = new Intent(this, Func4Activity.class);
        startActivity(intent4);
    }
    public void login5(View view){
        Intent intent5 = new Intent(this, Func5Activity.class);
        startActivity(intent5);
    }
    public void login6(View view){
        Intent intent6 = new Intent(this, Func6Activity.class);
        startActivity(intent6);
    }
    public void login7(View view){
        Intent intent7 = new Intent(this, Func7Activity.class);
        startActivityForResult(intent7, FUNCTION_MAIN);
    }
    public void login8(View view){
        Intent intent8 = new Intent(this, Func8Activity.class);
        startActivityForResult(intent8, FUNCTION_MAIN);
    }
    
}

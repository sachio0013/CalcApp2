package jp.techacademy.sachio.suenaga.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =(Button) findViewById(R.id.plus);
        button1.setOnClickListener(this);

        Button button2 =(Button) findViewById(R.id.minus);
        button2.setOnClickListener(this);

        Button button3 =(Button) findViewById(R.id.kakeru);
        button3.setOnClickListener(this);

        Button button4 =(Button) findViewById(R.id.waru);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText editText1 = (EditText)findViewById(R.id.et1);
        EditText editText2 = (EditText)findViewById(R.id.et2);
        String et1 = editText1.getText().toString();
        String et2 = editText2.getText().toString();

        try {
            double i = Double.parseDouble(et1);
            double i2 = Double.parseDouble(et2);

            double result = 0;
            if (v.getId() == R.id.plus) {
                result = i + i2;
            } else if (v.getId() == R.id.minus) {
                result = i - i2;
            } else if (v.getId() == R.id.kakeru) {
                result = i * i2;
            } else if (v.getId() == R.id.waru && i !=0 && i2 !=0) {
                result = i / i2;
            } else if (v.getId() == R.id.waru && (i == 0 || i2 == 0)) {
                Toast tt = Toast.makeText(this, "0以外の数字を入力してください！", Toast.LENGTH_LONG);
                tt.show();
            }

            Intent intent = new Intent(this, Main2.class);
            intent.putExtra("i", result);

            startActivity(intent);

        } catch (NumberFormatException e) {
            Toast ts = Toast.makeText(this, "数字を入力してください！", Toast.LENGTH_LONG);
            ts.show();

        }

    }
}

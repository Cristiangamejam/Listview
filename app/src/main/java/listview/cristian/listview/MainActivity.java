package listview.cristian.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1= (Button)findViewById(R.id.Boton1);
        button1.setOnClickListener(this);
        Button button2= (Button)findViewById(R.id.Boton2);
        button2.setOnClickListener(this);
        Button button3= (Button)findViewById(R.id.Boton3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.Boton1:
                Intent intent1 =new Intent(MainActivity.this,Ejemplo1Activity.class);
                startActivity(intent1);
                break;
            case R.id.Boton2:
                Intent intent2 = new Intent(MainActivity.this,Ejemplo2Activity.class);
                startActivity(intent2);
                break;
            case R.id.Boton3:
                Intent intent3 = new Intent(MainActivity.this,Ejemplo3Activity.class);
                startActivity(intent3);
                break;
        }
    }
}

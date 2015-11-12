package listview.cristian.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ejemplo2Activity extends AppCompatActivity {
    static final String[] Nombre= new String[]{"Jose","Luis","Josue","Alberto","Mariano","Miguel"
            ,"Manuel","Lucas","jorge","Jaime","Elias",
            "Diego","Antonio","Cristian","Alicia","Alfredo","Alejandro","Alfonnso","Roberto","Pablo"};

ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo2);

        listView= (ListView)findViewById(R.id.ListViewEjemplo2);
        ArrayAdapter adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,Nombre);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}

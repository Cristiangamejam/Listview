package listview.cristian.listview;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Ejemplo1Activity extends ListActivity {
    static final String[] Nombre= new String[]{"Jose","Luis","Josue","Alberto","Mariano","Miguel"
            ,"Manuel","Lucas","jorge","Jaime","Elias",
            "Diego","Antonio","Cristian","Alicia","Alfredo","Alejandro","Alfonnso","Roberto","Pablo"};
    ListView listView;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,Nombre));
        listView= getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Ejemplo1Activity.this, "posicion"+ String.valueOf(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

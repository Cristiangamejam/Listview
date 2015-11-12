package listview.cristian.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ejemplo3Activity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo3);


        Alumnos alumnos_datos[]= new Alumnos[]{
                new Alumnos(R.drawable.ic_launcher,"jose"),
                new Alumnos(R.drawable.ic_launcher,"pepe"),
                new Alumnos(R.drawable.ic_launcher,"cristian"),
                new Alumnos(R.drawable.ic_launcher,"aa"),
                new Alumnos(R.drawable.ic_launcher,"dd"),
                new Alumnos(R.drawable.ic_launcher,"ggg"),
                new Alumnos(R.drawable.ic_launcher,"hhh"),
                new Alumnos(R.drawable.ic_launcher,"jjj")
        };


        listView = (ListView)findViewById(R.id.ListViewEjemplo3);

        AlumnosAdapter adapter= new AlumnosAdapter(this,R.layout.listview_item_row,alumnos_datos);//Fila

        View header =(View) getLayoutInflater().inflate(R.layout.list_header_row,null);//Cabecera
        listView.addHeaderView(header);
        listView.setAdapter(adapter);

    }
}

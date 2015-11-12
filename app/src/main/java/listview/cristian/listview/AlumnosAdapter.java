package listview.cristian.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by cristian on 04/11/2015.
 */
public class AlumnosAdapter extends ArrayAdapter<Alumnos> {
    Context context;
    int layoutidresource;
    Alumnos[]data;

    public AlumnosAdapter(Context context,int layoutidresource,Alumnos[]data){
        super(context,layoutidresource,data);
        this.context=context;
        this.layoutidresource=layoutidresource;
        this.data=data;
    }
   public View getView(int position,View convertView,ViewGroup parent){
       View row = convertView;// cargo un vista
       AlumnosHolder holder= null;// soporte o el lugar de la informacion del alumno seleccionado.

       if(row==null){
           LayoutInflater inflater=((Activity)context).getLayoutInflater();
           row=inflater.inflate(layoutidresource,parent,false);

           holder=new AlumnosHolder();//creo un objeto de la clase AlumnosHolder
           holder.foto= (ImageView)row.findViewById(R.id.image);// entrego al objeto el dato imagen
           holder.nombre = (TextView)row.findViewById(R.id.text);//entrego al objeto el nombre
           row.setTag(holder);//se ingresa en row la informacion del alumno
       }else {
           holder=(AlumnosHolder)row.getTag();//se entrega la información a holder
       }

       Alumnos alumnos=data[position];
       holder.nombre.setText(alumnos.nombre);
       holder.foto.setImageResource(alumnos.foto);

       return row;
   }
    //Creo una "replica" de la clase alumno para
    //recibir y entregar los datos del alumno.
    static class AlumnosHolder{
        ImageView foto;
        TextView nombre;
    }
}

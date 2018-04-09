package com.example.alexander.pkexares.util;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

import com.example.alexander.pkexares.R;
import com.example.alexander.pkexares.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class AdapterListItemProduct extends BaseAdapter {

    private ArrayList<Producto> BD;
    private Activity ac;
    //ArrayList<Producto> objects;

    public AdapterListItemProduct(Activity a){this.ac=a;}

    public AdapterListItemProduct(ArrayList<Producto> BD, Activity a){
        this.BD = BD;
        this.ac = a;
    }

    @Override
    public int getCount() {
        return BD.size();
    }

    @Override
    public Object getItem(int position) {
        return BD.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    Producto getProduct(int position){
        return ((Producto)getItem(position));
    }


    @Override
    public View getView(int position, View vista, ViewGroup parent) {

        View item = vista;
        if (vista == null){
            LayoutInflater inf = (LayoutInflater)ac.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            item = inf.inflate(R.layout.product_layout,parent,false);

        }




        CheckBox chbProduc = (CheckBox)item.findViewById(R.id.ChbProduct);
        EditText txtPrecio = (EditText)item.findViewById(R.id.editPrecio);
        Spinner spinnerCantidad = (Spinner)item.findViewById(R.id.spinCantidad);


        Producto prod = getProduct(position);
        int max = prod.CantidadProducto;

        String[] NumberCantidadSpinner = new String[max];
        for (int i=1;i<=max;i++) {
            NumberCantidadSpinner[i] = String.valueOf(i);
        }

        //Error del Dia aun sin solucionar
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( ac,android.R.layout.simple_spinner_item,NumberCantidadSpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        chbProduc.setText(""+prod.NombreProducto);
        txtPrecio.setText("S/."+prod.PrecioProducto);
        spinnerCantidad.setAdapter(adapter);
        chbProduc.setOnCheckedChangeListener(myCheckChangList);
        chbProduc.setTag(position);
        chbProduc.setChecked(prod.box);


        return  item;
    }

    public ArrayList<Producto> getBox(){
        ArrayList<Producto> box= new ArrayList<Producto>();
        for (Producto p: BD){
            if (p.box)
                box.add(p);
        }
        return box;
    }

    OnCheckedChangeListener myCheckChangList = new OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            getProduct((Integer)buttonView.getTag()).box = isChecked;
        }
    };


}

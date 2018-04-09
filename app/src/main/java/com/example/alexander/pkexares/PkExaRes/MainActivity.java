package com.example.alexander.pkexares.PkExaRes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexander.pkexares.R;
import com.example.alexander.pkexares.modelo.Producto;
import com.example.alexander.pkexares.util.AdapterListItemProduct;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Object[] lista = {"Ceviche","Caldo","Segundo","postre"};
    ArrayList<Producto> productos = new ArrayList<Producto>();
    AdapterListItemProduct boxAdapter;
    private ListView ListaProductos;
    TextView txtSubtotal, txtIGV,txtDescuento,txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillData();
        boxAdapter = new AdapterListItemProduct(productos,this);
        ListaProductos =(ListView)findViewById(R.id.listaProductos);
        //Toast.makeText(this,lista[1].toString(),Toast.LENGTH_LONG).show();
        ListaProductos.setAdapter(boxAdapter);


    }

    public void Onclick_BtnCalcular(View v){

        txtSubtotal= (TextView)findViewById(R.id.txtSubtotal);
        txtIGV = (TextView)findViewById(R.id.txtIGV);
        txtDescuento = (TextView)findViewById(R.id.txtDescuento);
        txtTotal = (TextView)findViewById(R.id.txtTotal);

        txtDescuento.setText("20");
        txtIGV.setText("10");
        txtSubtotal.setText("30");
        txtTotal.setText("50");


    }

    void fillData(){
        for (int i =1; i<=20; i++){
            productos.add(new Producto("Producto"+i,i*100,10+i,false));
        }
    }

    public void ShowResulto(View v){
        int totalAmount=0;
        for (Producto p : boxAdapter.getBox()){
            if (p.box){
                totalAmount+=p.PrecioProducto;
            }
        }
        Toast.makeText(this, "Total Amount:="+totalAmount, Toast.LENGTH_LONG).show();
    }

}

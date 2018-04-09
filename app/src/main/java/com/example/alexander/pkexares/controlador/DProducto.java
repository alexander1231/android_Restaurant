package com.example.alexander.pkexares.controlador;

import android.app.Activity;
import android.content.Context;

import com.example.alexander.pkexares.modelo.Producto;
import com.example.alexander.pkexares.sqlite.SQLProducto;

import java.util.List;

public class DProducto implements INFPrincipal<Producto>{
    private Context ct;
    private Activity at;
    private SQLProducto sqlProd;
    //private FaltaElAdapter x;

    public DProducto(Context c,Activity a){
        this.ct = c;
        this.sqlProd=new SQLProducto(c);
        this.at = a;


    }


    @Override
    public void Add(Producto obj) {

    }

    @Override
    public void Update(Producto obj) {

    }

    @Override
    public void Delete(Object cod) {

    }

    @Override
    public List<Producto> getList(Object f) {
        return null;
    }

    @Override
    public Producto getItem(int f) {
        return null;
    }
}

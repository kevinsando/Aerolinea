/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import logicaNegocios.vuelo;

/**
 *
 * @author Kike
 */
public class DAL {
    private static DAL mInstance;
    private ArrayList<vuelo> v1;
    public static DAL getInstance()
    {
        if(mInstance==null)
        {
            mInstance=new DAL();
        }
        return mInstance;
    }
    public DAL()
    {
        v1=new ArrayList<>();
    }
    public void insertar(vuelo v)
    {
        v1.add(v);
    }
    public void eliminar(vuelo v)
    {
        v1.remove(v);
    }
    public void actualizar(int pos, vuelo v)
    {
        v1.set(pos, v);
    }
    public int consultar(vuelo v)
    {
        return v1.indexOf(v);
    }
    public vuelo consultar(int index)
    {
        return v1.get(index);
    }
    public ArrayList list()
    {
        return v1;
    }
    
}

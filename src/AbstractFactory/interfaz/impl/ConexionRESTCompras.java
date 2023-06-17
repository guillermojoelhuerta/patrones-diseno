package AbstractFactory.interfaz.impl;

import AbstractFactory.interfaz.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {
    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose a " + url);
    }
}

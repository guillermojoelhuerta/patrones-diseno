package Prototype.model;

import Prototype.interfaz.ICuenta;

public class CuentaAHImpl implements ICuenta {
    private String tipo;
    private double monto;

    public CuentaAHImpl() {
        tipo = "AHORRO";
    }

    @Override
    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;
        try{
            cuenta = (CuentaAHImpl) clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return cuenta;
    }

    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "CuentaAHImpl{" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                '}';
    }
}

package Proxy.proxy;

import java.util.logging.Logger;
import Proxy.interfaz.ICuenta;
import Proxy.interfaz.impl.CuentaBancoAImpl;
import Proxy.model.Cuenta;

public class CuentaProxy implements ICuenta {
    private ICuenta cuentaReal;
    private static final Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());

    public CuentaProxy(ICuenta cuentaReal) {
        this.cuentaReal = cuentaReal;
    }
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
        if(cuentaReal == null){
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.retirarDinero(cuenta, monto);
        }else{
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }
    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            return cuentaReal.depositarDinero(cuenta, monto);
        } else {
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }
    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoAImpl();
            cuentaReal.mostrarSaldo(cuenta);
        } else {
            cuentaReal.mostrarSaldo(cuenta);
        }
    }
}

package Proxy;

import Proxy.interfaz.ICuenta;
import Proxy.interfaz.impl.CuentaBancoAImpl;
import Proxy.model.Cuenta;
import Proxy.proxy.CuentaProxy;

public class App {
    /**
     Cuenta: Es una clase que representa una cuenta bancaria. Tiene propiedades como idCuenta, usuario
     y saldoInicial. Proporciona getters y setters para acceder y modificar estas propiedades.

     ICuenta: Es una interfaz que define métodos para realizar operaciones en una cuenta bancaria,
     como retirar dinero, depositar dinero y mostrar el saldo.

     CuentaBancoBImpl y CuentaBancoAImpl: Son implementaciones concretas de la interfaz ICuenta. Cada
     una de ellas implementa los métodos definidos en la interfaz de acuerdo con las reglas y lógica
     específicas del banco al que pertenecen.

     CuentaProxy: Es una clase que actúa como un proxy para la implementación real de la cuenta bancaria
     (CuentaBancoAImpl en este caso). El proxy intercepta las llamadas a los métodos de la interfaz ICuenta
     y realiza algunas acciones adicionales, como la creación de una instancia de la implementación real
     en caso de que aún no exista. También utiliza un objeto Logger para registrar información sobre las
     operaciones realizadas.

     App: Es la clase principal que contiene el método main. En el método main, se crea una instancia de
     Cuenta con ciertos valores iniciales. Luego, se crea una instancia de CuentaProxy pasando una instancia
     de CuentaBancoAImpl como parámetro. A través de la instancia de CuentaProxy, se realizan diferentes
     operaciones en la cuenta, como mostrar el saldo, depositar dinero y retirar dinero.

     En resumen, el patrón Proxy se utiliza en este código para proporcionar una capa adicional de
     funcionalidad alrededor de la implementación real de la cuenta bancaria. El proxy se encarga de
     gestionar la creación de la implementación real cuando sea necesario y registra información adicional
     a través de un Logger. Esto permite realizar operaciones adicionales o personalizadas en las cuentas
     sin modificar directamente la implementación real.
     */

    public static void main(String[] args){
        Cuenta c = new Cuenta(1, "Joel", 100);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);
    }
}

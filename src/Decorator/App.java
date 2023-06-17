package Decorator;

import Decorator.decorador.BlindajeDecorador;
import Decorator.interfaz.ICuentaBancaria;
import Decorator.interfaz.impl.CuentaAhorro;
import Decorator.model.Cuenta;

public class App {

    /**
     En primer lugar, se define una clase Cuenta que tiene dos atributos privados: id y cliente.
     Esta clase tiene un constructor vacío y otro constructor que acepta los valores para id y cliente.
     Además, tiene métodos getId() y getCliente() para acceder a los valores de los atributos, y
     métodos setId() y setCliente() para establecer los valores de los atributos.

     Luego, se define una interfaz ICuentaBancaria que declara un método abrirCuenta() sin implementación.

     A continuación, se definen dos clases concretas que implementan la interfaz
     ICuentaBancaria: CuentaCorriente y CuentaAhorro. Ambas clases sobrescriben el método abrirCuenta() y
     muestran mensajes en la consola indicando el tipo de cuenta y el cliente.

     Después, se define una clase abstracta CuentaDecorador que implementa la interfaz ICuentaBancaria.
     Esta clase tiene un atributo cuentaDecorada de tipo ICuentaBancaria que representa la cuenta a la
     que se le agregará el decorador. La clase tiene un constructor que acepta la cuenta decorada y un
     método abrirCuenta() que delega la llamada al método correspondiente de la cuenta decorada.

     A continuación, se define la clase BlindajeDecorador, que extiende la clase CuentaDecorador. Esta
     clase también tiene un constructor que acepta la cuenta decorada y sobrescribe el método abrirCuenta().
     En este método, primero se llama al método abrirCuenta() de la cuenta decorada y luego se muestra un
     mensaje adicional indicando que se agregó blindaje a la cuenta.

     Finalmente, en la clase App se crea una instancia de la clase Cuenta con un id y un nombre de cliente.
     Luego se crea una instancia de la clase CuentaAhorro y se pasa como argumento al constructor de la
     clase BlindajeDecorador. Esto significa que se está decorando la cuenta de ahorro con el blindaje.
     Finalmente, se llama al método abrirCuenta() en la cuenta decorada.

     Al ejecutar la aplicación, se imprimirá en la consola el mensaje de apertura de cuenta correspondiente
     al tipo de cuenta (ahorro) y el nombre del cliente. Además, se mostrará un mensaje adicional indicando
     que se agregó blindaje a la cuenta del cliente.
     */
    public static void main(String[] args){
        Cuenta c = new Cuenta(1, "Joel");
        ICuentaBancaria cuenta = new CuentaAhorro();
        ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }
}

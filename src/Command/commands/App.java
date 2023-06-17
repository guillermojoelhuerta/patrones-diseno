package Command.commands;

public class App {

    /**
     Cuenta: Es una clase que representa una cuenta bancaria. Tiene propiedades como id y saldo.
     Proporciona métodos para retirar y depositar dinero en la cuenta.

     IOperacion (Command): Es una interfaz funcional que define un único método execute(). Representa
     una operación en la cuenta, como retirar o depositar dinero.

     DepositarImpl y RetirarImpl: Son implementaciones concretas de la interfaz IOperacion. Cada una de
     ellas implementa el método execute() y realiza la operación correspondiente en la cuenta utilizando
     los métodos de la clase Cuenta.

     Invoker: Es una clase que actúa como el invocador de las operaciones. Tiene una lista de operaciones
     (IOperacion) y proporciona métodos para recibir operaciones y realizar todas las operaciones almacenadas
     en la lista.

     App: Es la clase principal que contiene el método main. En el método main, se crea una instancia de
     Cuenta con cierto saldo inicial. Luego se crean instancias de DepositarImpl y RetirarImpl, pasando la
     cuenta y los montos correspondientes como parámetros. A través de una instancia de Invoker, se agregan
     estas operaciones a la lista de operaciones y se realiza la ejecución de todas las operaciones almacenadas
     en el invocador.

     En resumen, el patrón Command se utiliza en este código para encapsular las operaciones en objetos
     (DepositarImpl y RetirarImpl) que implementan la interfaz IOperacion. Estos objetos se agregan a un
     invocador (Invoker), que se encarga de ejecutar todas las operaciones almacenadas en su lista. Esto
     permite desacoplar las operaciones de los objetos que las invocan, lo que facilita la gestión y
     reutilización de las operaciones de manera flexible.
     */
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta(1, 200);
        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);
        ivk.realizarOperaciones();
    }
}

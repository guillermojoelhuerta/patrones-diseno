package Prototype;

import Prototype.model.CuentaAHImpl;

public class App {
    /**
     El patrón Prototype se utiliza para crear copias exactas de un objeto existente sin conocer su
     clase concreta.

     1 - La interfaz ICuenta define el método clonar(), que debe ser implementado por las clases concretas
     que deseen ser clonables. En este caso, la interfaz extiende la interfaz Cloneable, que es una
     interfaz marcadora utilizada por la clase Object en Java para indicar que una clase puede ser clonada.

     2 - La clase CuentaAHImpl implementa la interfaz ICuenta y proporciona una implementación concreta
     del método clonar(). En este caso, se utiliza el método clone() heredado de la clase Object para
     crear una copia exacta del objeto. Luego, se realiza un casting para convertir el objeto clonado
     en una instancia de CuentaAHImpl y se devuelve.

     3 - En el método main() de la clase App, se crean instancias de CuentaAHImpl. La primera instancia se
     llama cuentaAhorro y se establece su atributo monto en 200. La segunda instancia se llama
     cuentaAhorro2 y no se le asigna ningún valor.

     4 - Se clona la instancia cuentaAhorro llamando al método clonar(), y se guarda en la variable
     cuentaClonada.

     5 - Se imprime en la consola el resultado de llamar al método toString() de las tres
     instancias: cuentaAhorro, cuentaAhorro2 y cuentaClonada. Esto muestra la información de cada
     instancia, incluyendo el tipo y el monto.

     En resumen, el código muestra cómo utilizar el patrón Prototype para crear copias exactas de
     objetos existentes sin conocer su clase concreta. En este caso, se utiliza el método clone()
     heredado de la clase Object para realizar la clonación. Esto permite crear nuevas instancias de
     CuentaAHImpl con los mismos valores de atributos que una instancia existente, lo que puede ser
     útil para evitar la creación y configuración manual de objetos similares.
     */
    public static void main(String[] args) {
        CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
        cuentaAhorro.setMonto(200);

        CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

        System.out.println(cuentaAhorro);
        System.out.println(cuentaAhorro2);
        System.out.println(cuentaClonada);

        /*
        if(cuentaClonada != null){
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaClonada == cuentaAhorro);
         */
    }
}

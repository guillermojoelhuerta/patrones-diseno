package Observer;

import Observer.observer.PesoARGObservador;
import Observer.observer.PesoMXObservador;
import Observer.observer.SolObservador;
import Observer.observer.Subject;

public class App {
    /**
     El patrón Observador se utiliza para establecer una relación uno a muchos entre objetos, de modo
     que cuando un objeto cambia de estado, todos los objetos dependientes de él son notificados y
     actualizados automáticamente.

     En primer lugar, se define una clase abstracta llamada Observador. Esta clase tiene un campo protegido
     llamado "sujeto" de tipo Subject y un método abstracto llamado "actualizar()" que será implementado por
     las clases concretas que extienden Observador. Esta clase abstracta proporciona una estructura común
     para todos los observadores.

     Luego, se define la clase Subject. Esta clase mantiene una lista de observadores (objetos Observador)
     y un estado interno representado por la variable "estado". La clase Subject tiene métodos para obtener
     y establecer el estado, así como métodos para agregar observadores a la lista y notificar a todos los
     observadores cuando el estado cambia.

     A continuación, se definen tres clases concretas que extienden Observador: SolObservador,
     PesoMXObservador y PesoARGObservador. Estas clases implementan el método "actualizar()" y proporcionan
     una implementación específica para cada observador. Cada observador tiene un valor de cambio específico
     y cuando se actualiza, imprime el estado actual del sujeto multiplicado por el valor de cambio
     correspondiente.

     Finalmente, en la clase App (principal), se crea una instancia de Subject. Luego, se crean instancias
     de los observadores SolObservador, PesoARGObservador y PesoMXObservador, pasando el sujeto como
     parámetro en el constructor de cada observador. Después de eso, se establece el estado del sujeto y se
     imprime el resultado.

     En resumen, este código implementa el patrón Observador para permitir que los observadores
     (SolObservador, PesoARGObservador, PesoMXObservador) se suscriban a cambios en el estado de un
     sujeto (Subject) y sean notificados automáticamente cuando el estado cambie. Los observadores
     realizan alguna acción basada en el estado actualizado del sujeto. En este caso, simplemente
     imprimen el estado multiplicado por un valor de cambio específico.
     */
    public static void main(String[] args){
        Subject subject = new Subject();
        new SolObservador(subject);
        new PesoARGObservador(subject);
        new PesoMXObservador(subject);

        System.out.println("Si desea cambiar 10 dólares obtendrá : ");
        subject.setEstado(10);
        System.out.println("-----------------");
        System.out.println("Si desea cambiar 100 dólares obtendrá : ");
        subject.setEstado(100);
    }
}

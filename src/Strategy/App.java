package Strategy;

import Strategy.strategy.AntivirusAvanzado;
import Strategy.strategy.Contexto;

public class App {
                
    /**
     El patrón Estrategia permite definir una familia de algoritmos, encapsular cada uno de ellos en una
     clase separada y hacer que sean intercambiables. Esto permite que los algoritmos varíen
     independientemente de los clientes que los utilizan.

     En primer lugar, se define una interfaz llamada "IEstrategia" que tiene un método "analizar()" sin
     implementación.

     Luego, se define la clase "Contexto". Esta clase tiene un campo privado llamado "estrategia" de tipo
     "IEstrategia". El constructor de la clase recibe una estrategia y la asigna al campo "estrategia".
     La clase también tiene un método "ejecutar()" que llama al método "analizar()" de la estrategia actual.

     A continuación, se definen dos clases abstractas: "AnalisisSimple" y "AnalisisAvanzado". Ambas
     implementan la interfaz "IEstrategia" y proporcionan una implementación común para el método
     "analizar()". Sin embargo, los detalles de cómo se realiza cada paso específico se dejan como
     abstractos para que las subclases los implementen. "AnalisisSimple" tiene tres métodos abstractos:
     "iniciar()", "saltarZip()" y "detener()", mientras que "AnalisisAvanzado" tiene seis métodos
     abstractos: "iniciar()", "analizarMemoria()", "analizarKeyloggers()", "analizarRootKits()",
     "descomprimirZip()" y "detener()".

     A continuación, se definen dos clases concretas: "AntivirusSimple" y "AntivirusAvanzado". Ambas
     clases extienden las clases abstractas "AnalisisSimple" y "AnalisisAvanzado" respectivamente. Cada
     una de estas clases proporciona una implementación para los métodos abstractos correspondientes a
     su nivel de análisis. Los métodos de las clases concretas imprimen mensajes de salida para simular
     las acciones que se están realizando, y en algunos casos, se añade un retardo de tiempo utilizando
     el método "Thread.sleep()" para simular la duración de ciertas acciones.

     Finalmente, en la clase "App" (principal), se crea una instancia de "Contexto" pasando un objeto
     "AntivirusAvanzado" como parámetro en el constructor. Luego, se llama al método "ejecutar()" del
     contexto, lo que a su vez ejecuta el método "analizar()" de la estrategia asignada. En este caso,
     se utiliza el antivirus avanzado para llevar a cabo el análisis.

     En resumen, este código implementa el patrón Estrategia para permitir que diferentes estrategias de
     análisis sean intercambiables en el contexto del antivirus. Las estrategias de análisis se encapsulan
     en clases separadas que implementan la interfaz "IEstrategia", y el contexto utiliza la estrategia
     asignada para llevar a cabo la operación de análisis. Esto permite agregar nuevas estrategias de
     análisis fácilmente sin modificar el código del contexto, y también permite cambiar la estrategia
     en tiempo de ejecución.
     */
    public static void main(String[] args){
        Contexto contexto = new Contexto(new AntivirusAvanzado());
        contexto.ejecutar();
    }
}

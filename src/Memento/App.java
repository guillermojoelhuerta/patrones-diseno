package Memento;

import Memento.memento.Caretaker;
import Memento.memento.Juego;
import Memento.memento.Originator;

public class App {

    /**
     El código muestra una implementación básica del patrón de diseño Memento. A continuación, se explica
     cada una de las clases y su funcionalidad:

     Juego: Es una clase que representa el estado de un juego. Tiene propiedades como nombre y checkpoint,
     y métodos getter y setter para acceder y modificar estas propiedades. También implementa el método
     toString() para facilitar la representación del objeto como una cadena de texto.

     Memento: Es una clase que encapsula el estado de un juego en un momento específico. Tiene una propiedad
     estado que es una instancia de la clase Juego. Proporciona un método getEstado() para obtener el estado
     guardado.

     Originator: Es una clase que crea y restaura los mementos. Tiene una propiedad estado que es una
     instancia de la clase Juego. Proporciona métodos para establecer y obtener el estado, así como para
     crear un memento (guardar()) que encapsula el estado actual. También tiene un método restaurar() que
     permite restaurar un estado guardado previamente.

     Caretaker: Es una clase que almacena y administra los mementos. Tiene una lista de mementos
     (ArrayList<Memento>) y proporciona métodos para agregar un memento (addMemento()) a la lista y obtener
     un memento específico por su índice (getMemento()).

     App: Es la clase principal que contiene el método main. En el método main, se crea una instancia de
     Juego y se establece su estado inicial. Luego, se crea una instancia de Caretaker y Originator. A
     continuación, se actualiza el estado del juego y se guarda un memento en el caretaker. Esto se repite
     varias veces para simular cambios en el estado del juego y guardar múltiples mementos. Finalmente,
     se restaura un estado guardado previamente y se muestra por pantalla el estado del juego.

     En resumen, el patrón Memento se utiliza en este código para permitir la captura y restauración del
     estado de un objeto Juego. El Originator es responsable de crear y restaurar los mementos, el Caretaker
     almacena y administra los mementos, y el Memento encapsula el estado del juego en un momento específico.
     Esto permite guardar y restaurar el progreso del juego en diferentes puntos, lo que puede ser útil para
     implementar características como guardado y carga de partidas.
     */

    public static void main(String[] args){
        String nombreJuego = "Crash bandicoot";

        Juego juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(1);

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(2);
        originator.setEstado(juego);

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(3);
        originator.setEstado(juego);

        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(4);

        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(5);
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

        originator.setEstado(juego);
        originator.restaurar(caretaker.getMemento(1));

        juego = originator.getEstado();
        System.out.println(juego);
    }
}

package Facade;

import Facade.facade.CheckFacade;

public class App {
    /**
     El patrón Facade proporciona una interfaz simplificada para un conjunto complejo de subsistemas,
     ocultando la complejidad y proporcionando una forma más fácil de interactuar con esos subsistemas.

     En este ejemplo, se tienen dos subsistemas: AvionAPI y HotelAPI. Cada uno de estos subsistemas tiene
     métodos para buscar vuelos y buscar hoteles respectivamente, con parámetros como fechas, origen y destino.

     La clase CheckFacade actúa como la fachada que proporciona una interfaz simple para realizar una
     búsqueda combinada de vuelos y hoteles.La fachada crea instancias de AvionAPI y HotelAPI en su
     constructor y proporciona un método llamado buscar que acepta los parámetros necesarios
     y llama a los métodos correspondientes en los subsistemas.

     En la clase App, se crean instancias de CheckFacade y se realiza una búsqueda de vuelos y hoteles
     para diferentes destinos y fechas.
     En este caso, se crean dos instancias de CheckFacade para buscar vuelos y hoteles a Cancún y Quito
     respectivamente.

     El uso de la fachada CheckFacade simplifica el proceso de búsqueda para el cliente, ya que no es
     necesario interactuar directamente con
     los subsistemas individuales y preocuparse por su complejidad. La fachada oculta esos detalles y
     proporciona una interfaz más sencilla y coherente para llevar a cabo la tarea deseada.

     En resumen, el patrón Facade se utiliza para proporcionar una interfaz simplificada a un conjunto de
     subsistemas complejos, ocultando su complejidad y facilitando su uso.
     */
    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Cancún");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
    }
}

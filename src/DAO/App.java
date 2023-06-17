package DAO;

import DAO.dao.CRUD;
import DAO.dao.PersonaDAOImpl;
import DAO.model.Persona;

public class App {
    /**
     En una implementación básica de un sistema de persistencia de datos utilizando interfaces y clases
     genéricas.

     En primer lugar, se definen las clases "Persona" y "Medico". Ambas clases tienen dos propiedades:
     "id" de tipo entero y "nombres" de tipo String. También tienen métodos getter y setter para acceder
     y establecer los valores de las propiedades.

     A continuación, se define una interfaz genérica llamada "CRUD" que tiene métodos para realizar
     operaciones básicas de persistencia de datos, como listar todos los registros, leer un registro
     por su ID, registrar un nuevo registro, actualizar un registro existente y eliminar un registro
     por su ID.

     Luego, se definen dos interfaces: "PersonaDAO" y "MedicoDAO". Estas interfaces extienden la interfaz
     "CRUD" y agregan métodos adicionales específicos para las entidades "Persona" y "Medico". Por ejemplo,
     la interfaz "PersonaDAO" tiene un método "mostrarNombre()" que no existe en la interfaz "CRUD".

     A continuación, se implementan las interfaces "PersonaDAO" y "MedicoDAO" en las clases concretas
     "PersonaDAOImpl" y "MedicoDAOImpl" respectivamente. Estas clases proporcionan implementaciones concretas
     para los métodos definidos en las interfaces. En el caso de "PersonaDAOImpl", se crea una lista de
     personas y se implementan los métodos para realizar operaciones en esa lista, como listar todos los
     registros, registrar una nueva persona, actualizar una persona existente y eliminar una persona
     por su ID.

     Finalmente, en la clase "App" (principal), se crea una instancia de "PersonaDAOImpl" y se utiliza
     la referencia del tipo de la interfaz "CRUD<Persona>" para acceder a los métodos de la interfaz
     "CRUD". Se muestra la lista de todas las personas y se registra una nueva persona.

     En resumen, este código muestra un sistema básico de persistencia de datos utilizando interfaces
     genéricas y clases concretas. Permite realizar operaciones CRUD en entidades como "Persona" y "Medico"
     de una manera flexible y extensible.
     */
    public static void main(String[] args){
        CRUD<Persona> dao = new PersonaDAOImpl();
        dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));

        Persona per = new Persona();
        per.setNombres("Guillermo");
        dao.registrar(per);
    }
}

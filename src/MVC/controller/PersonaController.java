package MVC.controller;

import MVC.dao.PersonaDAOImpl;
import MVC.model.Persona;
import MVC.service.PersonaService;
import MVC.service.PersonaServiceImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonaController implements Serializable {
    private List<Persona> lista;
    private PersonaService service;
    private String motor;

    public PersonaController() {
        motor = "MYSQL";
        lista = new ArrayList<>();
        service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
        listar();
    }

    public void listar() {
        lista = service.listar();
    }

    public void seleccionar(String motor) {
        service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
        listar();
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
}

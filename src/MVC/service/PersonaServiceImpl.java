package MVC.service;

import MVC.dao.PersonaDAO;
import MVC.model.Persona;

import java.util.List;

public class PersonaServiceImpl implements PersonaService{

    private PersonaDAO dao;

    public PersonaServiceImpl(PersonaDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Persona> listar() {
        return dao.listar();
    }
}

package DAO.dao;

import DAO.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO{
    @Override
    public List<Persona> listarTodos() {
        List<Persona> lista = new ArrayList<>();
        Persona per = new Persona();
        per.setId(1);
        per.setNombres("Joel");

        lista.add(per);

        per = new Persona();
        per.setId(2);
        per.setNombres("Guillermo");

        lista.add(per);

        return lista;
    }

    @Override
    public Persona leerPorId(int id) {
        //logica
        return null;
    }

    @Override
    public void registrar(Persona persona) {
        System.out.println("Persona " + persona.getNombres() + " registrada");
    }

    @Override
    public void actualizar(Persona persona) {
        System.out.println("Persona " + persona.getNombres() + " actualizada");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("id " + id + "eliminado");
    }

    @Override
    public void mostrarNombre() {}
}

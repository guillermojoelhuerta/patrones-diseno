package DependencyInjection.dao;

import DependencyInjection.model.Persona;

public interface PersonaDAO extends CRUD<Persona>{

    void mostrarNombre();
    void setConexion(IConexion conexion);

}

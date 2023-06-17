package DAO.dao;

import DAO.model.Medico;

public interface MedicoDAO extends CRUD<Medico>{
    void curar();
}

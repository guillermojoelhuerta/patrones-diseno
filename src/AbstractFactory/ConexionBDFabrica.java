package AbstractFactory;

import AbstractFactory.interfaz.FabricaAbstracta;
import AbstractFactory.interfaz.IConexionBD;
import AbstractFactory.interfaz.IConexionREST;
import AbstractFactory.interfaz.impl.*;

public class ConexionBDFabrica implements FabricaAbstracta {
    @Override
    public IConexionBD getBD(String motor) {
        if (motor == null) {
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")) {
            return new ConexionMySQL();
        } else if (motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        } else if (motor.equalsIgnoreCase("POSTGRE")) {
            return new ConexionPostgreSQL();
        } else if (motor.equalsIgnoreCase("SQL")) {
            return new ConexionSQLServer();
        }
        return new ConexionVacia();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}

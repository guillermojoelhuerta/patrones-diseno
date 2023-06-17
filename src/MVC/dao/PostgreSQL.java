package MVC.dao;

public class PostgreSQL implements Conexion{

    @Override
    public void conectar() {
        System.out.println("Conexión a POSTGRESQL");
    }
}

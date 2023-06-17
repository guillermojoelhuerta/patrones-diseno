package MVC.dao;

public class MySQL implements Conexion{
    @Override
    public void conectar() {
        System.out.println("Conexión a MYSQL");
    }
}

package Singleton;

public class Conexion {

    private static Conexion instancia;

    private Conexion(){}

    //Para obtener la instancia unicamente por este método
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    public void conectar(){
        System.out.println("Conectar");
    }

    public void desconectar(){
        System.out.println("Desconectar");
    }
}

package AbstractFactory.interfaz;

public interface FabricaAbstracta {
    IConexionBD getBD(String motor);
    IConexionREST getREST(String area);
}

package AbstractFactory;

import AbstractFactory.interfaz.FabricaAbstracta;
import AbstractFactory.interfaz.IConexionBD;
import AbstractFactory.interfaz.IConexionREST;
import AbstractFactory.interfaz.impl.ConexionRESTCompras;
import AbstractFactory.interfaz.impl.ConexionRESTNoArea;
import AbstractFactory.interfaz.impl.ConexionRESTVentas;

public class ConexionRESTFabrica implements FabricaAbstracta {

    @Override
    public IConexionBD getBD(String motor) {
        return null;
    }

    @Override
    public IConexionREST getREST(String area) {
        if (area == null) {
            return new ConexionRESTNoArea();
        }
        if (area.equalsIgnoreCase("COMPRAS")) {
            return new ConexionRESTCompras();
        } else if (area.equalsIgnoreCase("VENTAS")) {
            return new ConexionRESTVentas();
        }

        return new ConexionRESTNoArea();
    }
}

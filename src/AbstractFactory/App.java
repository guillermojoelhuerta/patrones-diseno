package AbstractFactory;

import AbstractFactory.interfaz.FabricaAbstracta;
import AbstractFactory.interfaz.IConexionBD;
import AbstractFactory.interfaz.IConexionREST;

public class App {
    /**
     El código que has compartido muestra un ejemplo de uso del patrón de diseño Abstract Factory
     (Fábrica Abstracta) en Java. El patrón Abstract Factory proporciona una interfaz para crear
     familias de objetos relacionados sin especificar las clases concretas.

     Las clases ConexionVacia, ConexionSQLServer, ConexionRESTVentas, ConexionRESTNoArea,
     ConexionRESTCompras, ConexionPostgreSQL, ConexionOracle y ConexionMySQL son implementaciones
     concretas de diferentes interfaces (IConexionBD e IConexionREST) que representan diferentes
     tipos de conexiones y acciones de conexión.

     Las interfaces IConexionBD e IConexionREST definen los métodos conectar() y desconectar()
     para la conexión de bases de datos, y leerURL() para la conexión REST, respectivamente.
     Estas interfaces proporcionan una abstracción común para diferentes tipos de conexiones.

     La interfaz FabricaAbstracta define los métodos getBD() y getREST() que deben ser implementados
     por las fábricas concretas para crear objetos de conexión y objetos de conexión REST,
     respectivamente.

     La clase ConexionRESTFabrica es una fábrica concreta que implementa la interfaz FabricaAbstracta.
     Esta fábrica se encarga de crear objetos de conexión REST según el área especificada.

     La clase ConexionBDFabrica es otra fábrica concreta que también implementa la interfaz
     FabricaAbstracta. Esta fábrica se encarga de crear objetos de conexión de bases de datos según
     el motor especificado.

     La clase FabricaProductor es una clase de utilidad que se utiliza para obtener la fábrica abstracta
     adecuada según el tipo especificado. En este caso, se obtiene una instancia de ConexionBDFabrica o
     ConexionRESTFabrica.

     La clase App es una clase de ejemplo que utiliza la fábrica abstracta y las implementaciones concretas
     para obtener objetos de conexión y realizar acciones de conexión o lectura de URL según el tipo
     especificado.

     En resumen, el código muestra cómo utilizar el patrón Abstract Factory para crear familias de objetos
     relacionados sin especificar las clases concretas. En este caso, se utilizan dos fábricas concretas
     (ConexionBDFabrica y ConexionRESTFabrica) para crear objetos de conexión y objetos de conexión REST
     respectivamente, de acuerdo con el tipo de fabrica requerida. Esto proporciona una forma flexible de
     crear diferentes tipos de objetos sin acoplar el código a implementaciones concretas.
     */

    public static void main(String[] args){
        FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");
        IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

        cxBD1.conectar();

        FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
        IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

        cxRS1.leerURL("https://www.youtube.com/watch?v=o-6swMu76m8");
    }
}

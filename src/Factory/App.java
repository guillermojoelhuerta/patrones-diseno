package Factory;

import Factory.interfaz.IConexion;

public class App {

    /**
     El patrón Factory se utiliza cuando quieres encapsular la creación de objetos y permitir la
     creación de diferentes tipos de objetos a través de una interfaz común.

     Las clases ConexionVacia, ConexionPostgreSQL y ConexionMySQL implementan la interfaz IConexion.
     Esta interfaz define los métodos conectar() y desconectar() que deben ser implementados
     por todas las clases que la implementen.

     La clase ConexionVacia es una implementación de IConexion que simplemente imprime un mensaje
     indicando que no se especificó el proveedor de conexión. Es una implementación de respaldo
     cuando no se proporciona un proveedor válido.

     Las clases ConexionPostgreSQL y ConexionMySQL son implementaciones específicas de la interfaz
     IConexion para los proveedores de bases de datos PostgreSQL y MySQL respectivamente.
     Tienen sus propios atributos y comportamientos específicos para establecer la conexión y desconectarse.

     La interfaz IConexion define la firma de los métodos conectar() y desconectar(), que serán
     implementados por las clases concretas. Esto asegura que todas las implementaciones de
     conexión cumplan con esta interfaz común.

     La clase ConexionFabrica es una clase fábrica que se encarga de crear objetos de tipo IConexion
     según el proveedor especificado. Tiene un método getConexion() que toma el proveedor como
     parámetro y devuelve una instancia apropiada de IConexion para ese proveedor.

     La clase App es una clase de ejemplo que utiliza la fábrica ConexionFabrica para obtener
     conexiones de diferentes proveedores y realizar acciones de conexión y desconexión en función
     del proveedor.

     En resumen, el código muestra cómo puedes utilizar una fábrica para crear objetos de conexión
     (IConexion) de diferentes proveedores de bases de datos, y así permitir la creación de objetos
     sin conocer los detalles de implementación específicos de cada proveedor. Esto proporciona
     flexibilidad y facilita el intercambio de proveedores sin tener que cambiar mucho código.
     */
    public static void main(String[] args){

        ConexionFabrica fabrica = new ConexionFabrica();

        IConexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        IConexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        IConexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
}

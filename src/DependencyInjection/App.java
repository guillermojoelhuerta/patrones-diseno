package DependencyInjection;

import DependencyInjection.dao.*;

public class App {

    /**
     El patrón de diseño de inyección de dependencias se utiliza para separar la creación y manejo de
     dependencias de una clase. En lugar de que la clase cree directamente las dependencias que necesita,
     se le proporcionan desde el exterior, lo que hace que la clase sea más flexible y fácil de probar.

     El patrón de inyección de dependencias se implementa en las clases
     PersonaDAOImpl, ConexionPostgre y ConexionMySQL.

     La interfaz IConexion define un método conectar() que representa una conexión a una base de datos.
     Las clases ConexionPostgre y ConexionMySQL implementan esta interfaz y proporcionan una
     implementación concreta del método conectar() para los sistemas de bases de datos PostgreSQL y
     MySQL, respectivamente.

     La interfaz CRUD<T> define los métodos para realizar operaciones básicas de persistencia de datos,
     como listar todos los registros, leer un registro por su ID, registrar un nuevo registro, actualizar
     un registro existente y eliminar un registro por su ID. Esta interfaz es genérica y puede trabajar
     con cualquier tipo de entidad.

     La interfaz PersonaDAO extiende la interfaz CRUD<Persona> y agrega dos métodos adicionales:
     mostrarNombre() y setConexion(IConexion conexion). Esto permite que la implementación del
     PersonaDAO también tenga la capacidad de mostrar nombres y recibir una conexión de base de datos.

     La clase PersonaDAOImpl implementa la interfaz PersonaDAO. Tiene una dependencia de la interfaz
     IConexion, que se establece a través del método setConexion(IConexion conexion). Luego, esta
     dependencia se utiliza en el método listarTodos() para llamar al método conectar() de la conexión
     establecida antes de realizar la operación de listado de registros.

     En la clase App (principal), se crean instancias de ConexionMySQL y ConexionPostgre que representan
     las conexiones a las bases de datos. Luego, se crea una instancia de PersonaDAOImpl y se utiliza
     el método setConexion() para establecer la conexión deseada. Finalmente, se llama al método
     listarTodos() para listar todos los registros de personas utilizando la conexión especificada.

     En resumen, el patrón de inyección de dependencias se utiliza en este código para proporcionar la
     conexión a la base de datos a la clase PersonaDAOImpl desde el exterior, lo que permite una mayor
     flexibilidad y facilita las pruebas unitarias al separar las dependencias de la lógica de la clase.
     */
    public static void main(String[] args){
        IConexion cx1 = new ConexionMySQL("mibase", "7482", "localhost");

        IConexion cx2 = new ConexionPostgre("mibase", "7482", "192.168.1.1");

        PersonaDAO dao = new PersonaDAOImpl();
        dao.setConexion(cx1);
        dao.listarTodos();
    }
}

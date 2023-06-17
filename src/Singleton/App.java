package Singleton;

import Singleton.Conexion;

public class App {
    /**
     El patrón Singleton se utiliza cuando quieres asegurarte de que solo haya una instancia de
     una clase en todo el programa y proporcionar un punto de acceso global a esa instancia.

     Explicación paso a paso del código:

     1 - La clase Conexion es declarada como pública, lo que significa que puede ser accedida desde otras clases.

     2 - La variable instancia es declarada como privada y estática (private static Conexion instancia).
     Es estática para que exista solo una copia de esta variable compartida entre todas las instancias de la clase.

     3 - El constructor de la clase Conexion es declarado como privado (private Conexion()).
     Esto impide que se puedan crear nuevas instancias de la clase fuera de la misma.

     4 - El método getInstance() es declarado como público y estático (public static Conexion getInstance()).
     Este método se utiliza para obtener la única instancia de la clase Conexion. Dentro de este método,
     se verifica si la variable instancia es null (es decir, si aún no se ha creado ninguna instancia).
     En ese caso, se crea una nueva instancia de la clase Conexion y se asigna a la variable instancia.
     Luego, se devuelve la instancia. Si la variable instancia ya tiene un valor (es decir, ya se ha creado
     una instancia), se devuelve directamente ese valor.

     5 - Los métodos conectar() y desconectar() son públicos y no son estáticos. Estos métodos pueden
     ser utilizados para realizar acciones relacionadas con la conexión, como establecer una conexión
     con una base de datos y desconectarla. Estos métodos no están directamente relacionados con la
     funcionalidad del patrón Singleton, pero son parte de la clase Conexion en este ejemplo.

     En resumen, el código proporciona una manera de crear una única instancia de la clase Conexion
     utilizando el método getInstance(), asegurándose de que no se puedan crear múltiples instancias y
     proporcionando un punto de acceso global a la instancia existente. Esto es útil cuando quieres
     tener una única instancia compartida en tu programa, como por ejemplo, para manejar conexiones a
     una base de datos o recursos compartidos.
     **/

    public static void main(String[] args){
        Conexion c = Conexion.getInstance();
        c.conectar();
        c.desconectar();
        
        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }
}

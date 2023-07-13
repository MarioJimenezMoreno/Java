package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class Ej40_CRUD {
    public static void main(String[] args) {
        Connection connection;
        final String url = "jdbc:mysql://localhost:3306/db_test";
        final String user = "root";
        final String pass = "admin";

        try {
            connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();

            Scanner scanner = new Scanner(System.in);
            boolean ejecutar = true;

            while (ejecutar) {
                System.out.println("Seleccione una función:");
                System.out.println("1. Crear usuario");
                System.out.println("2. Leer usuarios");
                System.out.println("3. Actualizar usuario");
                System.out.println("4. Eliminar usuario");
                System.out.println("5. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea después de leer el entero

                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca el nombre del usuario:");
                        String nombre = scanner.nextLine();
                        System.out.println("Introduzca la edad del usuario:");
                        int edad = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea después de leer el entero
                        System.out.println("Introduzca la nacionalidad del usuario:");
                        String nacionalidad = scanner.nextLine();
                        crearUsuario(statement, nombre, edad, nacionalidad);
                        break;
                    case 2:
                        leerUsuarios(statement);
                        break;
                    case 3:
                        System.out.println("Introduzca el ID del usuario a actualizar:");
                        int idActualizar = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea después de leer el entero
                        actualizarUsuario(statement, idActualizar, scanner);
                        break;
                    case 4:
                        System.out.println("Introduzca el ID del usuario a eliminar:");
                        int idEliminar = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea después de leer el entero
                        eliminarUsuario(statement, idEliminar);
                        break;
                    case 5:
                        ejecutar = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        break;
                }

                System.out.println(); // Salto de línea para mayor legibilidad
            }

            scanner.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void crearUsuario(Statement statement, String nombre, int edad, String nacionalidad) throws Exception {
        String consultaInsert = "INSERT INTO usuarios (nombre, edad, nacionalidad) VALUES ('" + nombre + "', " + edad + ", '" + nacionalidad + "')";
        int filasAfectadas = statement.executeUpdate(consultaInsert);
        if (filasAfectadas > 0) {
            System.out.println("Nuevo usuario creado exitosamente");
        }
    }

    public static void leerUsuarios(Statement statement) throws Exception {
        ResultSet result = statement.executeQuery("SELECT * FROM usuarios");
        ResultSetMetaData rsmd = result.getMetaData();
        int columnCount = rsmd.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.printf("%-15s", rsmd.getColumnName(i).toString());
        }
        int spacing = columnCount * 15;
        String textoFormateado = String.format("%n%" + spacing + "s", " ", " ").replace(' ', '-');
        System.out.println(textoFormateado);
        while (result.next()) {
            int id_usuarios = result.getInt("id_usuarios");
            String nombre = result.getString("nombre");
            int edad = result.getInt("edad");
            String nacionalidad = result.getString("nacionalidad");
            System.out.printf("%-15d%-15s%-15d%-15s%n", id_usuarios, nombre, edad, nacionalidad);
        }
        result.close();
    }

    public static void actualizarUsuario(Statement statement, int id, Scanner scanner) throws Exception {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione el dato a actualizar:");
            System.out.println("1. Nombre");
            System.out.println("2. Edad");
            System.out.println("3. Nacionalidad");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el nuevo nombre:");
                    String nuevoNombre = scanner.nextLine();
                    actualizarDato(statement, id, "nombre", nuevoNombre);
                    break;
                case 2:
                    System.out.println("Introduzca la nueva edad:");
                    int nuevaEdad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea después de leer el entero
                    actualizarDato(statement, id, "edad", String.valueOf(nuevaEdad));
                    break;
                case 3:
                    System.out.println("Introduzca la nueva nacionalidad:");
                    String nuevaNacionalidad = scanner.nextLine();
                    actualizarDato(statement, id, "nacionalidad", nuevaNacionalidad);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println(); // Salto de línea para mayor legibilidad
        }
    }

    public static void actualizarDato(Statement statement, int id, String columna, String valor) throws Exception {
        String consultaUpdate = "UPDATE usuarios SET " + columna + " = '" + valor + "' WHERE id_usuarios = " + id;
        int filasAfectadas = statement.executeUpdate(consultaUpdate);
        if (filasAfectadas > 0) {
            System.out.println("Dato actualizado exitosamente");
        }
    }

    public static void eliminarUsuario(Statement statement, int id) throws Exception {
        String consultaDelete = "DELETE FROM usuarios WHERE id_usuarios = " + id;
        int filasAfectadas = statement.executeUpdate(consultaDelete);
        if (filasAfectadas > 0) {
            System.out.println("Usuario eliminado exitosamente");
        }
    }
}

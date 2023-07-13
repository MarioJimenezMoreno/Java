package ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Ej41_SqlQuerys {
    public static void main(String[] args) {
             String url = "jdbc:mysql://localhost:3306/db_test";
             String user = "root";
             String pass = "admin";
            
            // Establecer la conexión con la base de datos
            try (Connection connection = DriverManager.getConnection(url, user, pass)) {
                // Crear un objeto Statement para ejecutar las consultas
                Statement statement = connection.createStatement();
                
                // Crear un objeto Scanner para leer las consultas desde la terminal
                Scanner sc = new Scanner(System.in);
                
                while (true) {
                    // Leer la consulta desde la terminal
                    System.out.print("Introduce una consulta MySQL (o 'exit' para salir): ");
                    String query = sc.nextLine();
                    
                    if (query.equalsIgnoreCase("exit")) {
                        break;
                    }
                    
                    try {
                        // Ejecutar la consulta
                        boolean hasResults = statement.execute(query);
                        
                        if (hasResults) {
                            // Obtener el resultado de la consulta
                            ResultSet resultSet = statement.getResultSet();
                            
                            // Obtener los metadatos de las columnas
                            ResultSetMetaData metaData = resultSet.getMetaData();
                            int columnCount = metaData.getColumnCount();
                            
                            // Imprimir los nombres de las columnas
                            for (int i = 1; i <= columnCount; i++) {
                                System.out.print(metaData.getColumnName(i) + "\t");
                            }
                            System.out.println();
                            
                            // Imprimir los datos de cada fila
                            while (resultSet.next()) {
                                for (int i = 1; i <= columnCount; i++) {
                                    System.out.print(resultSet.getString(i) + "\t");
                                }
                                System.out.println();
                            }
                            
                            resultSet.close();
                        } else {
                            // Imprimir el número de filas afectadas por la consulta
                            int rowCount = statement.getUpdateCount();
                            System.out.println("Filas afectadas: " + rowCount);
                        }
                    } catch (SQLException e) {
                        // Manejar los errores de SQL
                        e.printStackTrace();
                    }
                }
                
                // Cerrar el Statement y la conexión a la base de datos
                statement.close();
                sc.close();
            } catch (SQLException e) {
                // Manejar los errores de SQL
                e.printStackTrace();
            }
        }
    }
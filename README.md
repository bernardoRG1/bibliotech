## README

**Proyecto CRUD para Visitas a la Biblioteca Universitaria**

**Descripción**

Este proyecto es un CRUD (Create, Read, Update, Delete) desarrollado en Java para registrar las visitas a la biblioteca universitaria. El sistema utiliza una base de datos SQL para almacenar la información de las visitas y un script para leer la matrícula del estudiante mediante un escáner.

**Funcionalidades**

* Registrar la entrada y salida de los estudiantes a la biblioteca.
* Consultar el historial de visitas de un estudiante.
* Modificar o eliminar registros de visitas.
* Generar reportes en formato PDF con las estadísticas de visitas.

**Tecnologías utilizadas**

* Lenguaje de programación: Java
* Base de datos: SQL
* Framework: Java Swing
* Librería para la conexión a la base de datos: JDBC
* Librería para la generación de reportes: iText

**Requisitos para ejecutar el proyecto**

* Tener instalado Java SE Development Kit 8 o superior.
* Tener instalado un servidor de base de datos SQL (MySQL, PostgreSQL, etc.).
* Tener instalado un escáner de código de barras.

**Instrucciones de instalación**

1. Clonar el proyecto desde GitHub:

```
git clone https://github.com/tu_usuario/proyecto_crud_visitas_biblioteca.git
```

2. Importar el proyecto en un IDE de Java (IntelliJ IDEA, Eclipse, etc.).

3. Configurar la conexión a la base de datos en el archivo `src/main/resources/config.properties`.

4. Compilar y ejecutar el proyecto.

**Estructura del proyecto**

```
src
├── main
│   ├── java
│   │   └── paquete_principal
│   │       └── ...
│   ├── resources
│   │   └── config.properties
│   └── test
└── pom.xml
```

**Código fuente**

```markdown
# Registrar entrada

## Pasos

1. **Solicitar la matrícula del estudiante:**

```
System.out.println("Introduzca la matrícula del estudiante: ");
String matricula = scanner.nextLine();
```

2. **Conectarse a la base de datos:**

```java
Connection connection = null;
try {
    connection = DriverManager.getConnection(URL_BASE_DE_DATOS, USUARIO_BASE_DE_DATOS, CONTRASENA_BASE_DE_DATOS);
} catch (SQLException e) {
    e.printStackTrace();
}
```

3. **Preparar la consulta SQL:**

```java
String sql = "INSERT INTO visitas (matricula, fecha_entrada) VALUES (?, ?)";
PreparedStatement statement = connection.prepareStatement(sql);
```

4. **Establecer los valores de la consulta:**

```java
statement.setString(1, matricula);
statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
```

5. **Ejecutar la consulta:**

```java
statement.executeUpdate();
```

6. **Mostrar un mensaje de éxito:**

```java
System.out.println("Entrada registrada correctamente.");
```

7. **Cerrar la conexión a la base de datos:**

```java
if (connection != null) {
    try {
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
```

## Código completo

```java
package paquete_principal;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String URL_BASE_DE_DATOS = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USUARIO_BASE_DE_DATOS = "root";
    private static final String CONTRASENA_BASE_DE_DATOS = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Registrar entrada
        System.out.println("Introduzca la matrícula del estudiante: ");
        String matricula = scanner.nextLine();

        // Conexión a la base de datos
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL_BASE_DE_DATOS, USUARIO_BASE_DE_DATOS, CONTRASENA_BASE_DE_DATOS);

            // Registrar la entrada en la base de datos
            String sql = "INSERT INTO visitas (matricula, fecha_entrada) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, matricula);
            statement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            statement.executeUpdate();

            System.out.println("Entrada registrada correctamente.");

        } catch (SQLException e

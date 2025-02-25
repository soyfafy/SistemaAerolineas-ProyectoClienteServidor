# ✈️ Sistema Aerolíneas - Proyecto Cliente/Servidor

## 📌 Descripción
SistemaAerolineas es un proyecto desarrollado en 2023 como parte del curso de **Programación Cliente/Servidor**. Su propósito es automatizar la gestión de aerolíneas, permitiendo realizar compras, reservas y emisión de tickets de manera eficiente. Además, cuenta con un **sistema de administrador** que permite realizar **CRUDs** para cada sección, facilitando la modificación de datos desde la propia ejecución. Para acceder a las credenciales de administrador, se deben consultar en la base de datos **SQLite**.

## 🛠 Tecnología Utilizada
Este proyecto fue desarrollado en **Java** utilizando **NetBeans** como entorno de desarrollo y **SQLite** como base de datos.

## 🚀 Instalación y Uso

### 📋 Requisitos Previos
- Tener instalado **Java Development Kit (JDK)**. Se recomienda la versión más reciente de Java.
- Descargar e instalar **NetBeans IDE** desde [aquí](https://netbeans.apache.org/download/index.html).
- Descargar el controlador JDBC para **SQLite** desde [aquí](https://github.com/xerial/sqlite-jdbc).

### 🔧 Instalación
1. Clonar este repositorio:
   ```bash
   git clone https://github.com/TU_USUARIO/sistema-aerolineas.git
   ```
2. Abrir NetBeans.
3. En NetBeans, hacer clic en **File > Open Project** y seleccionar la carpeta del proyecto.

### ⚠️ IMPORTANTE - Configuración de la Base de Datos
Para que la base de datos funcione correctamente, es necesario modificar las rutas de conexión en el archivo **DBadminsystem.java**, ubicado en `ControlBaseDatos/DBadminsystem.java`.

Debe cambiar las rutas en `dbConnection = DriverManager.getConnection()` según la ubicación donde clonó o descargó el proyecto. Por ejemplo:

Antes:
```java
 dbConnection = DriverManager.getConnection("jdbc:sqlite:D:\\Repositorios\\usuario\\SistemaAerolineas\\src\\DB\\productos-ventas.db");
```
Después (ajustado a su ruta local):
```java
 dbConnection = DriverManager.getConnection("jdbc:sqlite:C:\\Usuarios\\TU_USUARIO\\SistemaAerolineas\\src\\DB\\productos-ventas.db");
```
Debe realizar este cambio en las **tres rutas** dentro de `DBadminsystem.java`.

### ▶️ Ejecución del Proyecto
1. Asegurar que NetBeans esté configurado con el JDK instalado.
2. Abrir el proyecto en NetBeans.
3. Modificar las rutas de la base de datos según lo indicado en la sección anterior.
4. Hacer clic en el botón **Run** (`F6`) para ejecutar el programa.

### 🛠 Edición de la Base de Datos con SQLite
Si desea modificar la base de datos directamente, puede utilizar herramientas como:
- **DB Browser for SQLite** ([Descargar aquí](https://sqlitebrowser.org/))
- **SQLite Studio** ([Descargar aquí](https://sqlitestudio.pl/))

## ✨ Características y Funcionalidades
- Login/Register de usuarios.
- Sistema de compras de boletos.
- Gestión de reservaciones.
- Emisión de tickets de vuelo.
- Facturación automatizada.
- **Sistema de administrador** para gestión de datos.
- **CRUDs** para modificar información directamente desde la aplicación.

## 📷 Ejemplo de Uso
Agrega tus capturas de pantalla o GIFs del programa en acción aquí:

![Imagen 1](https://github.com/soyfafy/SistemaAerolineas-ProyectoClienteServidor/blob/main/Screenshot%202025-02-25%20122426.png?raw=true)
![Imagen 2](https://github.com/soyfafy/SistemaAerolineas-ProyectoClienteServidor/blob/main/Screenshot%202025-02-25%20122737.png?raw=true)
![Imagen 3](https://github.com/soyfafy/SistemaAerolineas-ProyectoClienteServidor/blob/main/Screenshot%202025-02-25%20122746.png?raw=true)
![Imagen 4](https://github.com/soyfafy/SistemaAerolineas-ProyectoClienteServidor/blob/main/Screenshot%202025-02-25%20122752.png?raw=true)
![Imagen 5](https://github.com/soyfafy/SistemaAerolineas-ProyectoClienteServidor/blob/main/Screenshot%202025-02-25%20122820.png?raw=true)
![Imagen 6](https://github.com/soyfafy/SistemaAerolineas-ProyectoClienteServidor/blob/main/Screenshot%202025-02-25%20122852.png?raw=true)

## 📬 Contacto
Si deseas conocer más sobre este y otros proyectos, puedes contactarme en:
- 📧 Email: [fabian.ruuiz@gmail.com](mailto:abian.ruuiz@gmail.com)
- 🔗 LinkedIn: [Fabian Ruiz Garita](https://www.linkedin.com/in/fabian-ruiz-garita/)

---
Este proyecto es de uso libre y no se requiere colaboración. Es un respaldo en mi portafolio.


# LlanquihueTourSystem

## Descripción del Proyecto
Sistema orientado a objetos desarrollado en Java para la agencia de turismo **Llanquihue Tour**, ubicada en la comuna de Llanquihue, Región de Los Lagos. Permite digitalizar y estructurar los registros de personas y empleados reduciendo errores y duplicación de información.

## Estructura de Paquetes y Clases
- `model`: Paquete que contiene las clases del dominio.
  - `Direccion`: Clase componente utilizada para aplicar composición.
  - `Persona`: Clase base con atributos fundamentales (rut, nombre, email, direccion) y encapsulamiento.
  - `Empleado`: Clase derivada que hereda de `Persona` e incluye cargo y sueldo.
- `app`: Paquete con la lógica de ejecución del sistema.
  - `Main`: Clase principal que instancia los objetos y prueba las salidas por consola mediante `toString()`.

## Requisitos de Compilación y Ejecución
1. Abrir el proyecto en **IntelliJ IDEA**.
2. Verificar que la estructura de carpetas coincida con los paquetes `model` y `app`.
3. Ejecutar la clase `app.Main` (Shift + F10 o botón Run).

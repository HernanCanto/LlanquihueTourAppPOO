package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SISTEMA DE GESTIÓN LLANQUIHUE TOUR    ");
        System.out.println("==========================================");

        // Instancias de Dirección (Composición)
        Direccion dir1 = new Direccion("Av. Vicente Pérez Rosales", "450", "Llanquihue");
        Direccion dir2 = new Direccion("Calle Baquedano", "120", "Frutillar");
        Direccion dir3 = new Direccion("Costanera San Martín", "880", "Puerto Varas");

        // Objeto de clase base Persona
        Persona cliente = new Persona("15.432.890-K", "María González", "maria.gonzalez@email.com", dir1);

        // Objetos de clase Empleado (Herencia)
        Empleado guia = new Empleado("18.765.432-1", "Carlos Silva", "carlos.silva@llanquihuetour.cl", dir2, "Guía Turístico", 850000);
        Empleado operador = new Empleado("12.345.678-9", "Ana Martínez", "ana.martinez@llanquihuetour.cl", dir3, "Operadora Lacustre", 920000);

        // Salida por consola utilizando toString()
        System.out.println("\n--- REGISTRO DE CLIENTES ---");
        System.out.println(cliente);

        System.out.println("\n--- REGISTRO DE EMPLEADOS ---");
        System.out.println(guia);
        System.out.println(operador);

        System.out.println("\n==========================================");
        System.out.println("   PROTOTIPO EJECUTADO CORRECTAMENTE      ");
        System.out.println("==========================================");
    }
}

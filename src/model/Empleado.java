package model;

public class Empleado extends Persona {
    private String cargo;
    private double sueldo;

    public Empleado(String rut, String nombre, String email, Direccion direccion, String cargo, double sueldo) {
        super(rut, nombre, email, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    @Override
    public String toString() {
        return super.toString() + " | Cargo: " + cargo + " | Sueldo: $" + sueldo;
    }
}

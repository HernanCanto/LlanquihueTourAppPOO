package model;

public class Persona {
    private String rut;
    private String nombre;
    private String email;
    private Direccion direccion; // Composición

    public Persona(String rut, String nombre, String email, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Rut: " + rut + " | Nombre: " + nombre + " | Email: " + email + " | Dirección: [" + direccion + "]";
    }
}

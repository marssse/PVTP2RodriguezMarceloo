package ar.edu.unju.edm.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    // Constructor
    public Persona(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento);
        return fechaActual.getYear() - fechaNac.getYear();
    }

    public String determinarSignoZodiaco() {

        return "Signo del zodiaco";
    }

    public String determinarEstacionAnio() {
        return "Estación del año";
    }

    public int getEdad() {
        return calcularEdad();
    }

    public String getSignoZodiaco() {
        return determinarSignoZodiaco();
    }

    public String getEstacionAnio() {
        return determinarEstacionAnio();
    }

}

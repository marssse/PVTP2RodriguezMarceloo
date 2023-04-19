package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.Period;

public class ProcesoFecha {
    private LocalDate fecha1;
    private LocalDate fecha2;
    private String mensaje1;
    private String mensaje2;
    
    public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
        this.fecha1 = fecha1;
        this.fecha2 = fecha2;
    }
    
    public void compararFechas() {
        Period periodo = Period.between(fecha1, fecha2);
        if (fecha1.isAfter(fecha2)) {
            mensaje1 = "La fecha " + fecha1 + " es posterior a la fecha " + fecha2;
        } else if (fecha1.isBefore(fecha2)) {
            mensaje1 = "La fecha " + fecha1 + " es anterior a la fecha " + fecha2;
        } else {
            mensaje1 = "Las fechas son iguales";
        }
        mensaje2 = "Han transcurrido " + periodo.getYears() + " años, " 
                   + periodo.getMonths() + " meses y " + periodo.getDays() + " días desde la fecha menor hasta la fecha mayor.";
    }
    
    public LocalDate getFecha1() {
        return fecha1;
    }
    
    public void setFecha1(LocalDate fecha1) {
        this.fecha1 = fecha1;
    }
    
    public LocalDate getFecha2() {
        return fecha2;
    }
    
    public void setFecha2(LocalDate fecha2) {
        this.fecha2 = fecha2;
    }
    
    public String getMensaje1() {
        return mensaje1;
    }
    
    public String getMensaje2() {
        return mensaje2;
    }
}
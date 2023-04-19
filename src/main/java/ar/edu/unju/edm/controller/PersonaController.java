package ar.edu.unju.edm.controller;
import ar.edu.unju.edm.model.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

   

    public class PersonaController {
        private String nombre;
        private String apellido;
        private String fechaNacimiento;
        
        public int calcularEdad() {
        	
            LocalDate fechaActual = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(this.fechaNacimiento, formatter);

            int edad = Period.between(fechaNacimiento, fechaActual).getYears();

            return edad;
        }

        public String determinarSignoZodiaco() {
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(this.fechaNacimiento, formatter);
            int dia = fechaNacimiento.getDayOfMonth();
            int mes = fechaNacimiento.getMonthValue();

            // Determinar el signo del zodiaco según el día y mes de nacimiento
            String signoZodiaco = "";
            if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
                signoZodiaco = "Aries";
            } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
                signoZodiaco = "Tauro";
            } else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
                signoZodiaco = "Géminis";
            } else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
                signoZodiaco = "Cáncer";
            } else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
                signoZodiaco = "Leo";
            } else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
                signoZodiaco = "Virgo";
            } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
                signoZodiaco = "Libra";
            } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
                signoZodiaco = "Escorpio";
            } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
                signoZodiaco = "Sagitario";
            } else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
                signoZodiaco = "Capricornio";
            } else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
                signoZodiaco = "Acuario";
            } else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
                signoZodiaco = "Piscis";
            }

            return signoZodiaco;
        }

        public String determinarEstacionAnio() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(this.fechaNacimiento, formatter);
            int mes = fechaNacimiento.getMonthValue();

            // Determinar la estación del año según el mes de nacimiento
            String estacionAnio = "";
            if (mes == 12 || mes <= 2) {
                estacionAnio = "Invierno";
            } else if (mes >= 3 && mes <= 5) {
                estacionAnio = "Primavera";
            } else if (mes >= 6 && mes <= 8) {
                estacionAnio = "Verano";
            } else if (mes >= 9 && mes <= 11) {
                estacionAnio = "Otoño";
            }

            return estacionAnio;
        }

    }


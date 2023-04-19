package ar.edu.unju.edm.model;


public class ProcesoString {
    private String cadena;
    private String mensaje1;
    private String cadenaInvertida;
    private String mensaje2;

    public ProcesoString(String cadena) {
        this.cadena = cadena;
    }

    public void determinarLongitud() {
        int longitud = cadena.length();
        int numVocales = 0;
        for (char c : cadena.toCharArray()) {
            if (esVocal(c)) {
                numVocales++;
            }
        }
        mensaje1 = "La cadena tiene " + longitud + " caracteres y " + numVocales + " vocales";
    }

    public void invertirCadena() {
        cadenaInvertida = cadena.replace(" ", "");
        cadenaInvertida = new StringBuilder(cadenaInvertida).reverse().toString();
    }

    public void contarPalabras() {
        String[] palabras = cadena.trim().split("\\s+");
        mensaje2 = "La cadena tiene " + palabras.length + " palabras";
    }

    private boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Getters y Setters
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getMensaje1() {
        return mensaje1;
    }

    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }

    public String getCadenaInvertida() {
        return cadenaInvertida;
    }

    public void setCadenaInvertida(String cadenaInvertida) {
        this.cadenaInvertida = cadenaInvertida;
    }

    public String getMensaje2() {
        return mensaje2;
    }

    public void setMensaje2(String mensaje2) {
        this.mensaje2 = mensaje2;
    }
}

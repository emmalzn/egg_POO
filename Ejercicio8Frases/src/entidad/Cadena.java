/*
 * 
 * 
 */
package entidad;


public class Cadena {
    private String frase;
    private int longitud;
    private String frase2;

    public Cadena() {
    }

    public Cadena(String frase, int longitud, String frase2) {
        this.frase = frase;
        this.longitud = longitud;
        this.frase2 = frase2;
    }

    public String getFrase2() {
        return frase2;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    

}

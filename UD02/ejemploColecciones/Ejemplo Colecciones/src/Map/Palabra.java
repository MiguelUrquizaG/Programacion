package Map;

import java.util.Objects;

public class Palabra {

    private String palabra;
    private String definicion;

    public Palabra(String palabra, String definicion) {
        this.palabra = palabra;
        this.definicion = definicion;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra1 = (Palabra) o;
        return Objects.equals(palabra, palabra1.palabra) && Objects.equals(definicion, palabra1.definicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra, definicion);
    }

    @Override
    public String toString() {
        return "Map.Palabra{" +
                "palabra='" + palabra + '\'' +
                ", definicion='" + definicion + '\'' +
                '}';
    }
}

package ejercicio07;

public class Bombilla {
    private boolean encendida;

    public Bombilla(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    @Override
    public String toString() {
        return "Bombilla{" +
                "encendida=" + encendida +
                '}';
    }

    public void encender(){
        setEncendida(true);
    }

    public void apagar(){
        setEncendida(false);
    }

    public void estadoBombilla(){
        if(isEncendida()){
            System.out.println("La bombilla está encendia");
        }else{
            System.out.println("La bombilla está apagada");
        }
    }
}

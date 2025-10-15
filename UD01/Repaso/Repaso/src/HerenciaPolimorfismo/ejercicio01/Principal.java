package HerenciaPolimorfismo.ejercicio01;

public class Principal {

    public static void main(String[] args) {
        Ordenador o = new Ordenador(50,10,100,"MSI");
        Ordenador p = new Portatil(10,2,50,"daidsa",true,100);
        Ordenador s = new Sobremesa(1,3,200,"daijd",50);

        System.out.println("Precio ordenador: "+o.calcularPrecio(10));
        System.out.println("Precio Portatil: "+ p.calcularPrecio(10));
        System.out.println("Precio Sobremesa: "+s.calcularPrecio(10));
    }

}

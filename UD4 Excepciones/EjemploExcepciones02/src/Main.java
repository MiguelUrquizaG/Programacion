//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num = 10;
        int den=0;
        double res=0;

        //En el catch si hay que poner paréntesis.
        //Una excepcion es un objeto, entonces cuando hay algún error se crea un objeto de tipo Exception
        try{
            res = num/den;
            System.out.println("La división es: "+res);
        }catch (Exception e){
            System.err.println("Estas diviendo entre 0.");
        }

        //La consola de error es más lenta que la normal. Es decir System.err es más lenta.
        //En los parámetros del catch ponemos siempre primero la excepción más específica y
        // si hay varias en el mismo nivel es indiferente el orden.
        //Finally se ejecuta siempre pero no es obligatorio usarlo. Se usa mucho con los ficheros.

        //Throws el método lanza una excepción
       //En general no usaremos try catch dentro de métodos.
        //Solo se pone throws cuando la excepción sea creada por nosotros.
    }
}
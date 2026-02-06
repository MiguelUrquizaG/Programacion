import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File canal = new File("C:\\Users\\Alumno\\Documents\\Programacion\\UD5 Ficheros\\ejemplos\\ejemplo03");

        File [] lista=canal.listFiles();

        for(int i= 0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}
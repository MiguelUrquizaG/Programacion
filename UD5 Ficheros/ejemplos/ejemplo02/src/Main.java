import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File[] lista = File.listRoots();

        for (File root:lista){
            System.out.println("Raíz: "+root.getAbsolutePath());
        }
    }
}
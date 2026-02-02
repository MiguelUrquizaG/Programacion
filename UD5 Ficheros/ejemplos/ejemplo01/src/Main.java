import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        File file = new File("fichero.txt");

        System.out.println("Archivo: "+file.getName());
        System.out.println(file.isDirectory()?"Es un directorio":"No es directorio");
        System.out.println("Ruta absoluta: "+ file.getAbsolutePath());
        System.out.println("Ruta: "+ file.getPath());
        System.out.println("Ultima modificación: "+file.lastModified());
        System.out.println(file.exists()?"Existe":"No existe");
        System.out.println(file.canWrite()?"Se puede escribir":"No se puede escribir");
        System.out.println(file.canRead()?"Se puede leer":"No se puede leer");

        if(file.exists()){
            boolean borrado = file.delete();
            if(borrado){
                System.out.println("El fichero se ha borrado correctamente");
            }else{
                System.out.println("No se pudo borrar el fichero");
            }

        }else{
            System.out.println("El fichero no existe y por tanto no pudo ser borrado");
        }


    }
}
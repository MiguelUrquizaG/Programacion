import java.io.*;

public class Servicios {
    //Hariamos un throws pero en este ejemplo no porque venia asi.
    public void borarLinea(String file,String lineaABorrar){
        try{
            File inFile = new File(file);

            if(!inFile.isFile()){
                System.out.println("El parámetro no es un archivo.");
                return;
            }
            File tempFile = new File(inFile.getAbsolutePath()+".tmp");
            BufferedReader br = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

            String line = null;

            while((line= br.readLine())!=null){
                if(!line.trim().equals(lineaABorrar)){
                    pw.println(line);
                    pw.flush();//Limpiamos el buffer
                }
            }

            pw.close();
            br.close();

            if(!inFile.delete()){
                System.out.println("No se ha podido eliminar el fichero");
            }
            if(!tempFile.renameTo(inFile))
                System.out.println("No se ha podido renombrar el fichero");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException();
        }

    }
}

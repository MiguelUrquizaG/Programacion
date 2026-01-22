import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Matricula> matriculaList = new ArrayList<>();

        GestionMatriculas gestionMatriculas = new GestionMatriculas(matriculaList);


        try {
            System.out.println(gestionMatriculas.comprobarMatricula("K2K1889", 7));
        } catch (NumCaracteresInvalidoException | EmpezarLetraException ex) {
            System.err.println(ex.getMessage());
        }


    }
}
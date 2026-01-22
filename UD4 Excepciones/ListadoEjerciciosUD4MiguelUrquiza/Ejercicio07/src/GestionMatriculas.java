import java.util.List;

public class GestionMatriculas {

    private List<Matricula> matriculaList;

    public GestionMatriculas() {

    }

    public GestionMatriculas(List<Matricula> matriculaList) {
        this.matriculaList = matriculaList;
    }

    public Matricula comprobarMatricula(String matricula,int longitud)throws NumCaracteresInvalidoException, EmpezarLetraException{



        List<String>numeros =List.of("1","2","3","4","5","6","7","8","9");

        if(matricula.length()>longitud){
            throw new NumCaracteresInvalidoException("La cantidad de caracteres es superior a la permitida.");
        } else if (matricula.length()<longitud) {
            throw new NumCaracteresInvalidoException("La cantidad de caracteres es menor a la permitida.");
        }

//        if(matricula.substring(0,3).contains("123456789")){
//
//        }

        for(String numero : numeros){
            if(matricula.substring(0,2).contains(numero)){
                throw new EmpezarLetraException("No contiene letras en sus 3 primeros caracteres");
            }
        }

        Matricula m =  new Matricula(matricula);

        matriculaList.add(m);

        return m;

    }

}

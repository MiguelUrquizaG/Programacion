import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String numero;
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter fileWriter = new FileWriter("Palindromos.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            boolean isValido;

            numero = sc.nextLine();

            char[] characterList;
            characterList = numero.toCharArray();

            for(int i=0;i<characterList.length;i++){

            }

        }catch (IOException e){

        }
    }
}
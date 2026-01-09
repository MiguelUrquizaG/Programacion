//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a =  new int[3];

        for(int i =0;i<=3;i++){
            a[i]=i;
        }

        metodo(a);

    }

    static void metodo(int b[]){
        b[2]=1/b[0];
    }
}
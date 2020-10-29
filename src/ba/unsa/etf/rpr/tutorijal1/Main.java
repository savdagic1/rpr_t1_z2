package ba.unsa.etf.rpr.tutorijal1;



import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n;
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();

        for(int i = 1; i <= n; i++ ){
            if(i % sumaCifara(i) == 0)
                System.out.println(i);
        }
    }
    private static int sumaCifara(int br){
        int suma = 0;
        do{
            suma += br % 10;
            br /= 10;

        }while(br != 0);
        return suma;
    }
}

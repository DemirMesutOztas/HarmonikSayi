import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        double result=0.0;
        System.out.print("Sayı giriniz: ");
        x=input.nextInt();

        for (int i=1; i<=x;i++)
        {
            result+=(1.0/i);
        }

        System.out.print("Harmonik Değeri: "+result);

    }
}
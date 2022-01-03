import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int birinciSayi;
        int ikinciSayi;
        int ucuncusayi;
        System.out.print("Birinci sayıyı girin: ");
        birinciSayi=scanner.nextInt();
        System.out.print("İkinci sayıyı girin:");
        ikinciSayi=scanner.nextInt();
        ucuncusayi=ikinciSayi;
        ikinciSayi=birinciSayi;
        birinciSayi=ucuncusayi;
        System.out.println("Birinci sayı: "+birinciSayi);
        System.out.println("İkinci sayı: "+ikinciSayi);

    }
}

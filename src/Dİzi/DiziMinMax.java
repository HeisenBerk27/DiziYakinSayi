package Dİzi;
import java.util.Arrays;
import java.util.Scanner;

public class DiziMinMax {
	
	public static void yakinBuyukSayi() {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] dizi = {15,12,788,1,-1,-778,2,0};
		Arrays.sort(dizi);
		
		System.out.println("Bir sayi giriniz: ");
		int sayi = scanner.nextInt();
		
		if(sayi>778) {
			System.out.println("Dizinin en büyük elamanından bile büyük sayi girdiniz");
		}
		
		for(int i=0; i<dizi.length ;i++) {
			if(dizi[i]<sayi) {
				
			}else if(dizi[i]==sayi){
				System.out.println("Sayidan büyük en yakın sayi: " +dizi[i+1]);
				break;
			}else if(dizi[i]>sayi && dizi[i]<778) {
				System.out.println("Sayidan büyük en yakın sayi: " +dizi[i]);
				break;
			}else if(i==7) {
				System.out.println("En büyük sayiyi girdiniz");
				break;
			}
		}
		
	}
	
	public static void yakinKucukSayi() {
		Scanner scanner = new Scanner(System.in);
		
		int[] dizi = {15,12,788,1,-1,-778,2,0};
		Arrays.sort(dizi);
		
		System.out.println("Bir sayi giriniz: ");
		int sayi = scanner.nextInt();

		if(sayi<-778) {
			System.out.println("Dizinin en kücük elemanından bile kücük sayi girdiniz");
		}
		if(sayi>778) {
			System.out.println("Sayidan kücük en yakın sayi: " + dizi[7]);
		}
		for(int i=0; i<dizi.length ;i++) {
			if(dizi[i]>sayi ) {
				System.out.println("Sayidan kücük en yakın sayi: " + dizi[i-1]);
				break;
			}else if(dizi[i] ==sayi) {
				System.out.println("Sayidan kücük en yakın sayi: " + dizi[i-1]);
				break;
			}else if(dizi[i]<sayi) {
				
			}else if(i==0) {
				System.out.println("En kucuk sayiyi girdiniz");
				break;
			}
		} 
				
}

	public static void main(String[] args) {
		
		yakinBuyukSayi();
		yakinKucukSayi();
	}
}

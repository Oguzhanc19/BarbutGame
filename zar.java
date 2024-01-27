
import java.util.Scanner;

public class zar {

public static void main(String[] args) {
		
	
		System.out.println("Barbut Oyununu Başlatmak İçin '1'e Çıkmak İçin '2'ye Basın");
		Scanner input=new Scanner(System.in);
		System.out.print("--->");
		
		try {
		int tercih=input.nextInt();
		if(tercih==2) {
			System.out.println("Çıkış Yapıldı");
		
		}else if(tercih==1) {
			
			zarAt();			//Metodu kullanığım yer
			
			
		}}catch(Exception hata1) {System.out.println("Lütfen 1 veya 2 Giriniz!");}
		


		}
		public static void zarAt() {
		
		int toplam1=0;	
		int toplam2=0;
		//İlk atış kısmı
		int sayı1=(int) (Math.random()*6+1);
		int sayı2=(int)(Math.random()*6+1);				//İlk zar değerleri
		
		System.out.println("Oyuncunu Attığı Zar: "+sayı1+"+"+sayı2+"="+(sayı1+sayı2));
		
		if(sayı1+sayı2==7||sayı1+sayı2==11) {
				
				System.out.println("Oyuncu Kazandı!");				//İlk atış 7 veya 11 ise
			}
		
		if(sayı1+sayı2==2||sayı1+sayı2==3||sayı1+sayı2==12) {
				System.out.println("Oyuncu Kaybetti!");				//İlk atış 2 veya 3 veya 12 ise
				
			}toplam1=sayı1+sayı2;
			
		if(sayı1+sayı2==4||sayı1+sayı2==5||sayı1+sayı2==6||sayı1+sayı2==8||sayı1+sayı2==9||sayı1+sayı2==10) {
			
			System.out.println("Oyuncu Puanı: "+(sayı1+sayı2));		//İlk atış yukardakiler değilse puan olarak alınan kısım
				
			}	
		
		while(sayı1+sayı2==4||sayı1+sayı2==5||sayı1+sayı2==6||sayı1+sayı2==8||sayı1+sayı2==9||sayı1+sayı2==10) {
			
			int sayı3=(int) (Math.random()*6+1);		//İkinci zar atış değerleri
			int sayı4=(int)(Math.random()*6+1);
			
			System.out.println("Oyuncunu Attığı Zar: "+sayı3+"+"+sayı4+"="+(sayı3+sayı4));
			
			toplam2=sayı3+sayı4;
			

			
			if(sayı3+sayı4==7) {
				System.out.println("Oyuncu Kaybetti!");
				break;										//Sonrasında 7 gelirse
			}
			
				if(toplam1==toplam2) {
				System.out.println("Kazandınız ...");		//İlk atıştaki puan 2. ye eşitse
				break;
			}
				
			
				
			continue;
			}
}	
}
	










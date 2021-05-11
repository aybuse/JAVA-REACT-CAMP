package homework;

public class day1 {

	public static void main(String[] args) {

		// Variables

		// case sensitive (büyük küçük harfe duyarlý)

		int ogrenciSayisi = 10;
		String mesaj = "öðrenci sayýsý: ";
		System.out.println(mesaj + ogrenciSayisi);

		// Data Types

		int sayii = 12;
		// sayi = "ankara"; sayi ,tam sayý bir ifadedir; ankara ise metinsel bir
		// ifadedir.Bu nedenle uyumsuzluk oluþmaktadýr.
		// byte-short-int-long(tam sayý tutar), double-float(ondalýklý sayý tutarlar),
		// char(tek týrnak içerisinde tek karakter tutar), boolean(true or false)
		double sayii1 = 12.5;
		char karakter = 'a';
		boolean dogruMu = false;

		// Conditionals
		// if

		int sayi = 24;
		if (sayi < 20) {
			System.out.println("sayý 20 den küçüktür");
		} else if (sayi == 20) {
			System.out.println("sayý 20 ye eþittir");
		} else {
			System.out.println("sayý 20 den büyüktür");
		}

		// ReCap demo 1

		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("en büyük sayý =" + enBuyuk);

		// Switch

		char grade = 'D';
		switch (grade) {
		case 'A':
			System.out.println("mükemmel : geçtiniz ");
			break;
		case 'B':
			System.out.println("çok güzel : geçtiniz ");
			break;
		case 'C':
			System.out.println("iyi : geçtiniz ");
			break;
		case 'D':
			System.out.println("fena deðil : geçtiniz");
			break;
		case 'F':
			System.out.println("maalesef kaldýnýz");
			break;
		default:
			System.out.println("geçersiz not girdiniz");

		}

		// Loop
		// For

		for (int i = 1; i < 10; i += 2) {// 1 den 10 a kadar ki tek sayýlarý yazdýrýr
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");

		// while

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("while döngüsü bitti");

		// do-while

		int j = 1;
		do {
			System.out.println("loglandý");// döngünün çalýþýp çalýþmadýðýna bakýlýr
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("do-while döngüsü bitti");

		// Arrays

		String ogrenci1 = "engin";
		String ogrenci2 = "derin";
		String ogrenci3 = "salih";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("-----------------");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "derin";
		ogrenciler[2] = "salih";

		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}
		System.out.println("-----------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// reCapDemo2

		double[] myList = { 1.2, 1.3, 4.3, 5.6 }; // dizilerin bir diðer yazým þekli
		double total = 0;
		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;
			}

			total = total + number;
			System.out.println(number);
		}

		System.out.println("toplam= " + total);
		System.out.println("en büyük sayý= " + max);

		// multiDimensionalArrayDemo

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";

		for (int m = 0; m <= 2; m++) {
			System.out.println("-----------------");
			for (int n = 0; n < 3; n++) {
				System.out.println(sehirler[m][n]);
			}
		}

		System.out.println("-----------------");
		// stringsDemo

		String mesaJ = "bugün hava çok güzel.";
		System.out.println(mesaJ);

		System.out.println("eleman sayýsý = " + mesaJ.length());
		System.out.println("5. eleman = " + mesaJ.charAt(4));// 4.karakteri yazdýrýr
		System.out.println(mesaJ.concat("yaþasýn !"));// iki metni birleþtirir
		System.out.println(mesaJ.startsWith("b"));// baþlangýç harfi b ise true deðil ise false döndürür
		System.out.println(mesaJ.endsWith("."));// son karakteri . ise true deðil ise false döndürür

		char[] karakterler = new char[5];
		mesaJ.getChars(0, 4, karakterler, 0);// karakterleri aktarmaya yarar. Birinci bölüme aktarýlan metinde kaçýncý
												// karakterden baþlayacaðý yazýlýr,
		// ikinci bölüme aktarýlan metinde kaçýncý karaktere kadar aktarýlacaðý yazýlýr,
		// üçüncü bölümde nereye aktarýlacaðý yazýlýr ve son bölümde aktarýlan metinde
		// kaçýncý karakterden baþlayarak aktarýlacaðý yazýlýr
		System.out.println(karakterler);// bugü

		System.out.println(mesaJ.indexOf("a"));// belirtilen karakterin mesajýn içinde kaçýncý karakter sýrada olduðunu
												// gösterir
		System.out.println(mesaJ.lastIndexOf("a"));// belirtilen karakterin mesajýn içinde kaçýncý sýrada olduðunu
													// saymaya sondan baþlayarak gösterir

		System.out.println(mesaJ.replace(' ', '-'));// bir karakteri baþka bir karakterle deðiþtirir

		String newMesaj = mesaJ.replace(' ', '-');
		System.out.println(newMesaj);
		System.out.println(mesaJ.substring(2, 5));// bir metnin içerisinden parça almak için kullanýlýr

		for (String kelime : mesaJ.split(" ")) {// kelimeleri parçalamamýzý saðlar
			System.out.println(kelime);
		}
		System.out.println(mesaJ.toLowerCase());// büyük harfleri küçük harfe çevirir
		System.out.println(mesaJ.toUpperCase());// küçük harfleri büyük harfe çevirir
		System.out.println(mesaJ.trim());// cümlenin baþýndaki ve sonundaki boþluklarý atar

		// MÝNÝ PROJE ASAL SAYI

		int number = 7;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("asal sayý deðildir");
			return; // kodu bitirmeye yarar yani aþaðýdaki döngüye girmez
		}
		if (number < 1) {
			System.out.println("geçersiz sayý");
			return;
		}
		for (int k = 2; k < number; k++) {
			if (number % k == 0)
				isPrime = false;
		}
		if (isPrime) {
			System.out.println("asal sayýdýr");
		} else {
			System.out.println("asal sayý deðildir");
		}

		// SESLÝ HARFLER

		char harf = 'A';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(" kalýn sesli harf ");
			break;
		default:
			System.out.println(" ince sesli harf ");
		}

		// MÜKEMMEL SAYI

		int number1 = 496;
		int sonuc = 0;

		for (int z = 1; z < number1; z++) {
			if (number1 % z == 0) {
				sonuc = sonuc + z;
			}
			;
		}
		if (sonuc == number1) {
			System.out.println(" mükemmel sayýdýr ");
		} else {
			System.out.println(" mükemmel sayý deðildir ");
		}

		// ARKADAÞ SAYILAR

		int sayÝ_1 = 220;
		int sayi_2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int q = 1; q < sayÝ_1; q++) {
			if (sayÝ_1 % q == 0) {
				toplam1 = toplam1 + q;
			}
		}
		for (int w = 1; w < sayÝ_1; w++) {
			if (sayi_2 % w == 0) {
				toplam2 = toplam2 + w;
			}
		}
		if (sayÝ_1 == toplam2 && sayi_2 == toplam1) {
			System.out.println(" Bu iki sayý arkadaþtýr ");
		} else {
			System.out.println(" Bu iki sayý arkadaþ deðildir ");
		}

	}

}

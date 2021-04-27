package intro;

public class main {

	public static void main(String[] args)// main:çalýþmaya baþlangýç noktasý
	{
		// ctrl+space : büyük-küçük harf nedeniyle hata yapmamamýz için yardýmcý olur

		String internetSubeButonu = "Ýnternet Þubesi";
		System.out.println(internetSubeButonu);
		// deðiþken isimlendirmelerinde camelCase(ilk kelimenin ilk harfi küçük sonraki
		// kelimelerin ilk harfi büyük)kullanýlýr
		// string metinsel veri tipi olduðundan dolayý çift týrnak ile yazýlýr

		System.out.println("hello world");// çýktý almamýzý saðlar

		// int tam sayýlar için sayýsal veri tipidir
		// double ondalýklý sayýlar için sayýsal veri tipidir

		double dolarDun = 8.15;
		double dolarBugun = 8.20;
		int vade = 36;

		// boolean : mantýksal durumlarý tuttuðumuz veri tipidir(true or false)
		boolean dustuMu = false;

		// ctrl+space kullanarak veri isimlerini doðru yazmada yardým alabiliriz

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü resmi");// çalýþmaz çünkü koþul saðlanmadý
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi resmi");// çalýþýr þart saðlandý
		} else {
			System.out.println("Dolar eþittir resmi");// çalýþmaz çünkü þart saðlanmadý
		}
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Çiftçi Kredi";
		String kredi5 = "Mbs Kredi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);

		// yukarýda yazýlanlarý dizi haline getirerek kullanýmýný kolaylaþtýrýrýz

		String[] krediler = { "Hýzlý Kredi", "Mutlu Emekli Kredi", "Konut Kredi", "Çiftçi Kredi", "Mbs Kredi" };
		// for döngüsü : belirtilen miktar kadar döngü çalýþýr
		for (String kredi : krediler)// foreach
		{
			System.out.println(kredi);
		}
		for (int i = 0; i < krediler.length; i += 1) {
			System.out.println(krediler[i]);// [i]deðiþen i deðerine göre sýrasýyla yazdýrýlmasýný saðlar

		}

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;// deðer atamasý yapýldýktan sonra sayi1 ve sayi2 arasýnda baðlantý kalmaz
		sayi2 = 100;
		System.out.println(sayi1);// 20

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;// sayilar1 in adresi sayilar2 nin adresine eþitlendikten sonra ayný adresi
							// tuttuklarý için aralarýnda baðlantý vardýr
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);// 100

		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);// Ýstanbul

	}

}

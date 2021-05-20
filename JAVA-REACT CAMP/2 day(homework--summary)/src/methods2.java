
public class methods2 {

	public static void main(String[] args) {
		String mesaj = "bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		String sehir = sehirVer();
		System.out.println(sehir);
		int sayi = topla(5, 7);
		System.out.println(sayi);
	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void güncelle() {
		System.out.println("güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}

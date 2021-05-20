
public class methods {

	public static void main(String[] args) {

		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranan = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			varMi = true;
			break;

		}

		if (varMi) {
			mesajVer("sayý mevcuttur " + aranan);
		} else {
			System.out.println("sayý mevcut deðildir");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}

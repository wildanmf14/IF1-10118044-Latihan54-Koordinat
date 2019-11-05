
public class Main {
	public static void main(String[] args) {
        WarnaKoordinat wk = new WarnaKoordinat(10, 4, "Jingga");
        System.out.printf("Warna Koordinat : %s%n", wk.namaWarna);
        System.out.printf("Koordinat sumbu x : %d, y : %d%n", wk.getX(), wk.getY());

    }

}

package enkapsulasiDemo;
import java.text.DecimalFormat;

public class DemoEnkapsulasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat digitpresisi=new DecimalFormat("0,00");
		System.out.println("\nDEMO ENKAPSULASI");
		System.out.println("===================");
		HitungGaji tony = new HitungGaji();
		tony.setGaji(25000000);
		tony.hitungGaji();
		System.out.println("Informasi Gaji Pegawai");
		System.out.println("\nBesar Gaji Kotor : "+digitpresisi.format(tony.getGajiKotor()));
		System.out.println("\nBesar Gaji yang dibawa pulang: "+digitpresisi.format(tony.getGajiBersih()));
	}

}

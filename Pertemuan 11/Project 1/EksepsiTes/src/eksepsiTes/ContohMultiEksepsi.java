package eksepsiTes;

public class ContohMultiEksepsi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cobaEksepsi(4,0); //menimbulkan ArithmeticException
		System.out.println();
		
		cobaEksepsi(12,4);
		
	}
		public static void cobaEksepsi(int pembilang,int penyebut) {
		try {    
			int hasil = pembilang/penyebut;
		
		System.out.println("Hasil bagi: "+hasil);
		}
		catch(ArithmeticException a) {
			System.out.println("Terdapat pembagian dengan 0");
			
	}
		}


}

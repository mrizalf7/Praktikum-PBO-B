package arrayTesPackage;

public class arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dataProdi = new String [10];
		dataProdi[0] = "Administrasi";
		dataProdi[1] = "Agroteknologi";
		dataProdi[2] = "Teknik Elektro";
		dataProdi[3] = "Bahasa Arab";
		dataProdi[4] = "Bahasa Inggris";
		dataProdi[5] = "Teknik Informatika";
		dataProdi[6] = "Fisika";
		dataProdi[7] = "Kimia";
		dataProdi[8] = "Biologi";
		dataProdi[9] = "Managemen";
		
		//System.out.println(dataProdi[1]);
		//System.out.println(dataProdi[3]);
		//System.out.println(dataProdi[5]);
		for(int i=0;i<dataProdi.length;i++) {
			if(dataProdi[i]==dataProdi[3])
				continue;
			System.out.println(dataProdi[i]);
		}

	}

}

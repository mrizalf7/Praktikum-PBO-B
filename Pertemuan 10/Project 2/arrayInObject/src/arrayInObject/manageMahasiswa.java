package arrayInObject;

public class manageMahasiswa {
	private Mahasiswa [] data;
	private int n;
public manageMahasiswa (int max) {
	data = new Mahasiswa[max];
	
}
public void insert(String nim,String nama,int umur) {
	data[n] = new Mahasiswa(nim,nama,umur);
	n++;
}
public void display() {
	for(int j =0; j<n; j++) {
		System.out.print((j+1)+". ");
		data[j].displayMhs();
	}
	
}
}

package arrayInObject;

public class dataMahasiswa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 100;
		manageMahasiswa obj = new manageMahasiswa(maxSize);
		obj.insert("116705000","Andre" , 24);
		obj.insert("116705001", "Parto", 29);
		obj.insert("116705002","Sule",27);
		obj.insert("116705003", "Aziz", 20);
		obj.insert("116705004", "Nunung", 20);
		System.out.println("Data Mahasiswa: ");
		obj.display();
		
	}

}

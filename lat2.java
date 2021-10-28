class Siswa { int nrp; String nama;

	public void setNrp(int i) { 
	nrp=i;
	}

	public void setNama(String i){
	nama=i;
	}
}

public class lat2 {
	public static void main(String args[]){ 

		Siswa anak = new Siswa(); 
	anak.setNama("Muhammad Ali");
	anak.setNrp(7201); 
	
	System.out.print("Nama mahasiswa " + anak.nama);
	System.out.print(" NRP "+anak.nrp); 
	
	}
	
}



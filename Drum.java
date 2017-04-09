//Nama 	: Irvan Nuroni
//NIM	: 14.111.052
//Kelas	: 14.TIF.Weekend

public class Drum extends Gitar {

	public void drumpukul(){
	System.out.println("Drum Dipukul");
	}

	public void NadaAlat(){
	System.out.println("Nada Dari Drum");
	}


public static void main(String[] args){

	Drum MyDrum = new Drum(); //class yang dibutuhkan
	
	MyDrum.warna="Warna Drum : Merah";
	MyDrum.merk="Merk Drum  : Fender";
	MyDrum.type="Jenis Drum : Akustik";

	System.out.println(MyDrum.warna);
	System.out.println(MyDrum.merk);
	System.out.println(MyDrum.type);

	//memanggil method gitardiambil
	MyDrum.MusikNada();
	MyDrum.MusikSuara();
	MyDrum.drumpukul();
	MyDrum.NadaAlat();
	
}
}





	
//Nama 	: Irvan Nuroni
//NIM	: 14.111.052
//Kelas	: 14.TIF.Weekend

public class Gitar extends Musik {

	public void gitarpetik(){
	System.out.println("Gitar dipetik");
	}

	public void NadaAlat(){
	System.out.println("Nada Dari Gitar");
	}


public static void main(String[] args){

	Gitar MyGitar = new Gitar(); //class yang dibutuhkan
	
	MyGitar.warna="Warna Gitar : Hitam";
	MyGitar.merk="Merk Gitar  : Ibanez";
	MyGitar.type="Jenis Gitar : Akustik";

	System.out.println(MyGitar.warna);
	System.out.println(MyGitar.merk);
	System.out.println(MyGitar.type);

	//memanggil method gitardiambil
	MyGitar.MusikNada();
	MyGitar.MusikSuara();
	MyGitar.gitarpetik();
	MyGitar.NadaAlat();
	
}
}





	
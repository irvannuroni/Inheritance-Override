//Nama 	: Irvan Nuroni
//NIM	: 14.111.052
//Kelas	: 14.TIF.Weekend

class Musik{

	String warna;
	String merk;
	String type;

	public void MusikNada(){
	System.out.println("Musik Itu Nada");
	}

	public void MusikSuara(){
	System.out.println("Musik Itu Suara");
	}
}

class Rock extends Musik{

	public void MusikNada(){
	System.out.println("Musik Itu Nada Rock");
	}

	public void MusikSuara(){
	System.out.println("Musik Itu Suara Rock");
	}
}

public class MainRock {
	
    public static void main (String[] args) {

	Musik rock = new Musik();
	Musik rocker = new Rock();
	rock.MusikNada();
	rock.MusikSuara();
	rocker.MusikNada();
	rocker.MusikSuara();	
}
}
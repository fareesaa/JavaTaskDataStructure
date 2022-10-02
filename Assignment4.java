import java.util.Scanner;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner inputStr = new Scanner (System.in);
    Scanner inputInt = new Scanner (System.in);
      System.out.println ("Hello World");
    class Mobil
    {
      String merk;
      String warna;
      int tahun;
        Mobil (String merk, String warna, int tahun)
      {
	this.merk = merk;
	this.warna = warna;
	this.tahun = tahun;
      }
    }

    ArrayList < Mobil > al = new ArrayList < Mobil > ();
    int menu;

    do
      {
	System.out.println ("Pilihan");
	System.out.println ("1. Input Data ");
	System.out.println ("2. Tampilkan Data ");
	System.out.println ("3. Keluar ");
	System.out.println ("Pilih Menu: ");
	menu = inputInt.nextInt ();

	if (menu == 1)
	  {
	    System.out.println ("Masukkan merk: ");
	    String merk = inputStr.nextLine ();
	    System.out.println ("Masukkan warna: ");
	    String warna = inputStr.nextLine ();
	    System.out.println ("Masukkan tahun pembuatan: ");
	    int tahun = inputInt.nextInt ();

	    Mobil mobil = new Mobil (merk, warna, tahun);
	    al.add (mobil);

	  }
	else if (menu == 2)
	  {
	    Iterator itr = al.iterator ();
	    
	    System.out.println ("Total Mobil: "+ al.size());
	    while (itr.hasNext ())
	      {
		Mobil viewData = (Mobil) itr.next ();

		System.out.println ("=================");
		System.out.println ("Merk : " + viewData.merk);
		System.out.println ("Warna : " + viewData.warna);
		System.out.println ("Tahun Pembuatan : " + viewData.tahun);
	      }

	  }

      }
    while (menu < 2);



  }
}

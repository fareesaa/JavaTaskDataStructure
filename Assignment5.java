import java.util.Scanner;
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner inputStr = new Scanner (System.in);
    Scanner inputInt = new Scanner (System.in);

    class Mobil
    {
      String nama;
        Mobil (String nama)
      {
	this.nama = nama;
      }
    }

    ArrayList<Mobil> al = new ArrayList<Mobil>();
    ArrayList<Mobil> al2= new ArrayList<Mobil>();
    ArrayList<Mobil> al3= new ArrayList<Mobil>();
    ArrayList<Mobil> al4= new ArrayList<Mobil>();
    int menu;
    
    do
      {
	System.out.println ("Pilihan");
	System.out.println ("1. Input Data ");
	System.out.println ("2. Input data tambahan");
	System.out.println ("3. Remove All ");
	System.out.println ("4. Retain All ");
	System.out.println ("5. Tambahkan data dengan Add All ");
	System.out.println ("6. Add Map ");

	System.out.println ("Pilih Menu: ");
	menu = inputInt.nextInt ();

	if (menu == 1)
	  {
	    System.out.println ("Masukkan nama: ");
	    String nama = inputStr.nextLine ();

	    Mobil mobil = new Mobil (nama);
	    al.add (mobil);
	  }

      else if (menu ==2){
        System.out.println ("Masukkan nama yang akan ditambahkan ke list awal: ");
	    String nama = inputStr.nextLine ();

        Mobil mobil1 = new Mobil (nama);
        al2.add(mobil1);
        
        
        Iterator itr = al2.iterator ();
        int isAdd = inputInt.nextInt();
	    
	    System.out.println ("Total nama ditambahkan: "+ al2.size());
	    while (itr.hasNext ())
	      {
		Mobil viewData = (Mobil) itr.next ();
        
		System.out.println ("=================");
		System.out.println ("Nama : " + viewData.nama);
	      }
      }

      else if (menu ==3){
        System.out.println ("Masukkan yang akan dihapus: ");
	    String nama = inputStr.nextLine ();

        Mobil mobil2 = new Mobil (nama);
        al3.add(mobil2);
        al.removeAll(al3);
        
        Iterator itr = al3.iterator ();
	    
	    System.out.println ("Total nama dihapus: "+ al3.size());
	    while (itr.hasNext ())
	      {
		Mobil viewData = (Mobil) itr.next ();
        
		System.out.println ("=================");
		System.out.println ("Nama Terhapus: " + viewData.nama);
	      }
          
      }
    else if (menu ==4)
        {
        System.out.println ("Masukkan nama yang akan dipertahankan: ");
	    String nama = inputStr.nextLine ();

        Mobil mobil3 = new Mobil (nama);
        al4.add(mobil3);
        al.retainAll(al4);
        
        Iterator itr = al4.iterator ();
	    
	    System.out.println ("Total nama dipertahankan: "+ al4.size());
	    while (itr.hasNext ())
	      {
		Mobil viewData = (Mobil) itr.next ();
        
		System.out.println ("=================");
		System.out.println ("Nama dipertahankan: " + viewData.nama);
	      }
        }
	else if (menu == 5)
	  {
	    al.addAll(al2);
	    Iterator itr = al.iterator ();
	    
	    System.out.println ("Total Mobil: "+ al.size());
	    while (itr.hasNext ())
	      {
		Mobil viewData = (Mobil) itr.next ();
        
		System.out.println ("=================");
		System.out.println ("Merk : " + viewData.nama);
	      }

	  }
	  	else if (menu == 6)
	  {
	    Iterator itr = al.iterator ();
	    
	    System.out.println ("Total Mobil: "+ al.size());

	    while (itr.hasNext ())
	      {
	    String key = "";
	    Map map = new HashMap();
	    
	    key = inputStr.nextLine();
	    map.put(Integer.parseInt(key), (Mobil) itr.next());
		Mobil viewData = (Mobil) itr.next ();
        
		System.out.println ("=================");
		System.out.println ("Merk : " + key + viewData.nama);
	      }

	  }

      }
    while (menu < 6);



  }
}

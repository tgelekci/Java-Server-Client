package proje2;

import java.net.*;
import java.util.*;
import java.io.*;

public class Ýstemci {

	public static void main(String[] args) {
		
		try{
			Socket clsoc=new Socket("127.0.0.1", 6013);
			Scanner sc=new Scanner(System.in);
			String veri;
			PrintWriter yaz=new PrintWriter(clsoc.getOutputStream(), true);
			System.out.print("Ýstemciden Sunucuya Gidecek ve Karesi Alýnacak Sayýyý Girin: ");
			veri=sc.nextLine();
			yaz.println(veri);
			
			
			InputStream ins=clsoc.getInputStream();
			BufferedReader binr=new BufferedReader(new InputStreamReader(ins));
			String str=binr.readLine();
			int k3=Integer.parseInt(str);
			System.out.println("Sunucudan Geri Alýnan Arabellek Ýçeriði(Kare): "+k3);
			sc.close();
			clsoc.close();
			
			
			
			}
		
		catch(Exception e){
			System.err.println(e);
		}
	}

}

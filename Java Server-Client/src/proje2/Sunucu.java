package proje2;

import java.net.*;
import java.io.*;

public class Sunucu {

	public static void main(String[] args) {
		try{
		ServerSocket svsoc=new ServerSocket(6013);
		while(true)
		{
			Socket client=svsoc.accept();
			InputStream in=client.getInputStream();
			BufferedReader bin=new BufferedReader(new InputStreamReader(in));
			String data=bin.readLine();
			int sayi=Integer.parseInt(data);
			System.out.println("�stemciden Al�nan Arabellek ��eri�i(Karesi Al�nacak Say�): "+sayi);
			int kare=sayi*sayi;
			System.out.println("Sunucuda Hesaplan�p Bast�r�lan Sonu�(Say�n�n Karesi): "+kare);
			
			
			String k2=Integer.toString(kare);
			PrintStream out=new PrintStream(client.getOutputStream());
			out.println(k2);
		}
		
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}
	}

}

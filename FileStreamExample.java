import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileStreamExample {
	public static void main(String[] args) {
		try
		{
			FileOutputStream fous=new FileOutputStream("C:\Users\Suyas\Documents\Java");
			DataOutputStream dous=new DataOutputStream(fous);
			dous.writeInt(73);
			dous.writeChar("S");
			dous.flush();
			dous.close();
			fous.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileInputStream fis =new FileInputStream("C:\Users\Suyas\Documents\Java");
			DataInputStream dis = new DataInputStream(fis);
			Int count=dis.available();
			Byte[] b=new byte[count];
			dis.read(b);
			for(byte bt:b)
			{
				System.out.println((char)bt);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

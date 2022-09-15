import java.io.FileInputStream;
public class File_Display
{   
    public static void main(String[] args) throws Exception    //throws exception
    {
    	int lines=0,chars=0,words=0;
		int code=0;
		FileInputStream file = new FileInputStream(“E:\\details.txt”);  //create a fileinputstream for read data into file
		while(file.available()!=0) // check condition 
		{
			code = file.read();
			if(code!=10)
			chars++;
			if(code==32)
			words++;
			if(code==13)
			{
				lines++;
				words++;
			}
		}
		System.out.println("No.of characters = "+chars);
		System.out.println("No.of words = "+(words+1));
		System.out.println("No.of lines = "+(lines+1));
		file.close();
    }
}
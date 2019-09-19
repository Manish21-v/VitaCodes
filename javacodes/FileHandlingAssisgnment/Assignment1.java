import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author vita1
 *
 */
public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int count=0;
		int num=0;
		Scanner s= new Scanner(System.in);
		
		try {
			FileOutputStream fos= new FileOutputStream("C:\\Users\\vita1\\Desktop\\demo.java");
			DataOutputStream dos= new DataOutputStream(fos);
			System.out.println("Enter the Numbers");
			while(true)
			{
				num=s.nextInt();
				if(num==0)
				{
					break;
				}
				else
				{
					dos.writeInt(num);
					count++;
				}
			}
			//System.out.println(count);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\vita1\\Desktop\\demo.java");
			DataInputStream dis= new DataInputStream(fis);
			for(int i=0;i<count;i++)
			{
				System.out.println(dis.readInt());
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}

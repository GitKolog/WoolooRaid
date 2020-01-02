import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class saveWooloo 
{
	public static void main(String[] args) throws Exception
	{
		String woolooURL = 
				"https://swordshield.pokemon.com/assets/img/articles/pokemon-wooloo_2x.png";
		
		for(int i=0;i<10;i++)
		{
			String woolooFILE = 
					"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\wooloo" + (i+1) + ".jpg";
		
			URL url = new URL(woolooURL);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(woolooFILE);
		
			byte[] b = new byte[2048];
			int length;

			while ((length = is.read(b)) != -1) os.write(b, 0, length);		
			os.close(); is.close();	
		}
	}
}

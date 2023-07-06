package lesson27.odev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lesson27.FileOrnek2;

/*


Daha sonra  listemizden rastgele index ile bir ogrenci cekelim (buna bir metot yazılabilir) 

Daha sonra çektiğimiz ogrenciyi başka bir dosyaya yazdıralım(ismiAlınanlar.txt gibi olabilir) 

Daha sonra bu ogrenciyi listemizden silip güncel listeyi tekrar  ogrenciListesiKopya.txt dosyasına yazdıralım 
 */
public class OgrenciFileİslemler {
	List<String> ogrenciList ;
	
	public void dosyadanVeriOkuma(String dosyayolu) {
		File file =new File(dosyayolu);
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
}

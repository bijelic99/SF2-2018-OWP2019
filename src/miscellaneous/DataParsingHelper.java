package miscellaneous;

import java.io.BufferedReader;
import java.io.IOException;

public interface DataParsingHelper {
	public static String getJsonFromBufferReader(BufferedReader br) throws IOException {
		String json = "";
		String readerRow = "";
		do {
			json+=readerRow;
			readerRow = br.readLine();
		}
		while(readerRow != null);
		
		return json;
	}
}

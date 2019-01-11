import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FiletoConsole extends InputOutput{
	Reader reader = null;
	BufferedReader br = null;
	
	@Override
	public String read(){
		String str = "";
		String letters = "";
		try {
			reader = new FileReader("Sample.txt");
			br = new BufferedReader(reader);
			while((str = br.readLine()) != null) {
				letters += str+"\n";	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {reader.close();} catch (IOException e) {}
		try {br.close();} catch (IOException e) {}
		test(letters);
		return letters;
	}

	@Override
	public void write(int cntLetters) {
		System.out.println("입력하신 단어의 수는 "+cntLetters);
	}
	
	public void test(String letters) {
		System.out.println("입력하신 문장은\n"+letters);
	}

}

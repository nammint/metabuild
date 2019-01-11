import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FiletoFile extends InputOutput{
	Reader reader = null;
	BufferedReader br = null;
	Writer writer = null;
	
	@Override
	public String read() {
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
		}finally {
			try {reader.close();} catch (IOException e) {}
			try {br.close();} catch (IOException e) {}
		}
		test(letters);
		return letters;
	}

	@Override
	public void write(int cntLetters) {
		try {
			writer = new FileWriter("Result.txt");
			writer.write("입력하신 단어의 수는 "+Integer.toString(cntLetters));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {writer.close();} catch (IOException e) {}
		}
	}
	
	public void test(String letters) {
		System.out.println("입력하신 문장은\n"+letters);
	}
}

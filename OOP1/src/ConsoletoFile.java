import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ConsoletoFile extends InputOutput{
	Scanner sc = null;
	Writer writer = null;
	
	@Override
	public String read() {
		sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		String letters = sc.nextLine();
		sc.close();
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
}

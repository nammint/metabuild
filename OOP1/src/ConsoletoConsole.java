import java.util.Scanner;

public class ConsoletoConsole extends InputOutput{
	Scanner sc = null;
	
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
		System.out.println("입력하신 단어의 수는 "+cntLetters);
	}

}

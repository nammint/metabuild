import java.util.Scanner;

public class ConsoletoConsole extends InputOutput{
	Scanner sc = null;
	
	@Override
	public String read() {
		sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���.");
		String letters = sc.nextLine();
		sc.close();
		return letters;
	}

	@Override
	public void write(int cntLetters) {
		System.out.println("�Է��Ͻ� �ܾ��� ���� "+cntLetters);
	}

}


public abstract class InputOutput {
	
	private String letters;
	private int cntLetters;
	
	protected abstract String read();
	
	protected abstract void write(int cntLetters);
	
	private int count(String letters) {
		String [] cnt = null;
		letters = letters.trim();
		letters = letters.replaceAll("\n", " ");
		letters = letters.replaceAll(" +", " ");
		cnt = letters.split(" ");
		return cnt.length;
	}
	
	public void stream() {
		this.letters = read();
		this.cntLetters = count(letters);
		write(cntLetters);
	}	
}








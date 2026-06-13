import java.util.HashMap;
public class QuizQuestion {
	private String prompt;	
	private HashMap<Option, Boolean> options;
	
	public QuizQuestion(String prompt) {
		this.prompt = prompt;
		this.options = new HashMap<Option, Boolean>();
	}
	
	public String getPrompt() {
		return this.prompt;
	}
	
	public HashMap<Option, Boolean> getOptions() {
		return this.options;
	}
}

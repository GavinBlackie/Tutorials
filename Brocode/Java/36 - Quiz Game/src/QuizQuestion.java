import java.util.HashMap;
public class QuizQuestion {
	private String prompt;	
	private String questionsMsg;
	private HashMap<Integer, Boolean> options;
	
	public QuizQuestion(String prompt, String questionsMsg) {
		this.prompt = prompt;
		this.questionsMsg = questionsMsg;
		this.options = new HashMap<Integer, Boolean>();
	}
	
	public String getPrompt() {
		return this.prompt;
	}
	
	public String getQuestionsMsg() {
		return this.questionsMsg;
	}
	
	public HashMap<Integer, Boolean> getOptions() {
		return this.options;
	}
}

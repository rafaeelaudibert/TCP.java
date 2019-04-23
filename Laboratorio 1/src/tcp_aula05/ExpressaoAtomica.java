package tcp_aula05;

import java.util.Map;

public class ExpressaoAtomica implements ExpressaoLogica {
	private String variable;
	
	public ExpressaoAtomica(String variable) {
		this.variable = variable;
	}
	
	public String getVariable() {
		return variable;
	}
	
	public String toString() {
		return variable;
	}
	
	public boolean eval(Map<String, Boolean> booleanos) {
		return booleanos.getOrDefault(variable, false);
	}
}

package tcp_aula05;

import java.util.Map;

public class ExpressaoNot extends ExpressaoUnaria {
	public ExpressaoNot(ExpressaoLogica expressao) {
		super(expressao);
	}
	
	public ExpressaoNot(String expressao) {
		super(new ExpressaoAtomica(expressao));
	}
	
	public String toString() {
		return "(not " + getExpressao() + ")";
	}
	
	public boolean eval(Map<String, Boolean> booleanos) {
		return !super.getExpressao().eval(booleanos);
	}
}

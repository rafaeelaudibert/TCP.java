package tcp_aula05;

import java.util.Map;

public class ExpressaoImplicacao extends ExpressaoBinaria {
	public ExpressaoImplicacao(ExpressaoLogica expressaoLeft, ExpressaoLogica expressaoRight) {
		super(expressaoLeft, expressaoRight);
	}
	
	public ExpressaoImplicacao(String expressaoLeft, String expressaoRight) {
		super(new ExpressaoAtomica(expressaoLeft), new ExpressaoAtomica(expressaoRight));
	}
	
	public String toString() {
		return "(" + getExpressaoLeft() + " --> " + getExpressaoRight() + ")";
	}
	
	public boolean eval(Map<String, Boolean> booleanos) {
		return !getExpressaoLeft().eval(booleanos) || getExpressaoRight().eval(booleanos);
	}
}

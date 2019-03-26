package tcp_aula05;

import java.util.Map;

public class ExpressaoOr extends ExpressaoBinaria {
	public ExpressaoOr(ExpressaoLogica expressaoLeft, ExpressaoLogica expressaoRight) {
		super(expressaoLeft, expressaoRight);
	}
	
	public ExpressaoOr(String expressaoLeft, String expressaoRight) {
		super(new ExpressaoAtomica(expressaoLeft), new ExpressaoAtomica(expressaoRight));
	}
	
	public String toString() {
		return "(" + getExpressaoLeft() + " or " + getExpressaoRight() + ")";
	}
	
	public boolean eval(Map<String, Boolean> booleanos) {
		return getExpressaoLeft().eval(booleanos) || getExpressaoRight().eval(booleanos);
	}
}

package tcp_aula05;

import java.util.Map;

public class ExpressaoAnd extends ExpressaoBinaria {
	public ExpressaoAnd(ExpressaoLogica expressaoLeft, ExpressaoLogica expressaoRight) {
		super(expressaoLeft, expressaoRight);
	}
	
	public ExpressaoAnd(String expressaoLeft, String expressaoRight) {
		super(new ExpressaoAtomica(expressaoLeft), new ExpressaoAtomica(expressaoRight));
	}
	
	public String toString() {
		return "(" + getExpressaoLeft() + " and " + getExpressaoRight() + ")";
	}
	
	public boolean eval(Map<String, Boolean> booleanos) {
		return getExpressaoLeft().eval(booleanos) && getExpressaoRight().eval(booleanos);
	}
}

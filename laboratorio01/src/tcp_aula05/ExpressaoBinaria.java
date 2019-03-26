package tcp_aula05;

public abstract class ExpressaoBinaria implements ExpressaoLogica {
	private ExpressaoLogica expressaoLeft;
	private ExpressaoLogica expressaoRight;
	
	public ExpressaoBinaria(ExpressaoLogica expressaoLeft, ExpressaoLogica expressaoRight) {
		this.expressaoLeft = expressaoLeft;
		this.expressaoRight = expressaoRight;
	}
	
	public ExpressaoLogica getExpressaoLeft() {
		return expressaoLeft;
	}
	
	public ExpressaoLogica getExpressaoRight() {
		return expressaoRight;
	}
}

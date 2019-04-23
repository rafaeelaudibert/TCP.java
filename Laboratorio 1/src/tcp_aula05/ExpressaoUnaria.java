package tcp_aula05;

public abstract class ExpressaoUnaria implements ExpressaoLogica {
	private ExpressaoLogica expressao;
	
	public ExpressaoUnaria(ExpressaoLogica expressao) {
		this.expressao = expressao;
	}
	
	public ExpressaoLogica getExpressao() {
		return expressao;
	}	
	
}

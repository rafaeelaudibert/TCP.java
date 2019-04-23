package tcp_aula05;

import java.util.HashMap;

public class TestaExpressaoLogica {

	public static void main(String[] args) {
		// expressao será ((A V B) --> (C ^ A)) --> (((not B) ^ C) V (A ^ D)), mas facilitaremos a criação usando variáveis auxiliares
		ExpressaoLogica expressao;
		
		// sideLeft = (A V B) --> (C ^ A)
		ExpressaoLogica orLeft = new ExpressaoOr("A", "B");
		ExpressaoLogica andLeft = new ExpressaoAnd("C", "A");
		ExpressaoLogica sideLeft = new ExpressaoImplicacao(orLeft, andLeft);
		
		// sideRight = ((not B) ^ C) V (A ^ D)
		ExpressaoLogica notRight = new ExpressaoNot("B");
		ExpressaoLogica andRight1 = new ExpressaoAnd(notRight, new ExpressaoAtomica("C"));
		ExpressaoLogica andRight2 = new ExpressaoAnd("A", "D");
		ExpressaoLogica sideRight = new ExpressaoOr(andRight1, andRight2);
		
		// expressao = sideLeft --> sideRight
		expressao = new ExpressaoImplicacao(sideLeft, sideRight);
		System.out.println("Expressão Lógica: " + expressao);
		
		// HashMap contendo os valores que serão passados para serem avaliados pela Expressão Booleana
		// Na minha implementação, caso a variável que está sendo avaliada não exista dentro do Map, ela será avaliada como false
		final HashMap<String, Boolean> booleanos = new HashMap<>();
		booleanos.put("B", true); 
		booleanos.put("C", true);
		System.out.println("Mapa de variáveis (variáveis não presentes serão avaliadas como false): " + booleanos);
		
		System.out.println("O HashMap aplicado à expressão avalia em: " + expressao.eval(booleanos));
		
	}

}

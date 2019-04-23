# Questões da Aula 12 - Técnicas de Construção de Programas
Rafael Baldasso Audibert - 00287695

---
### Evolução do Projeto
Modifique o projeto realizado na aula prática 07, fazendo as seguintes alterações.

1. Criação da exceção IllegalMeasurementException, que estende RuntimeException. Esta exceção deve ser lançada quando um valor de medida fornecido a uma forma geométrica for inválido (nulo ou menor ou igual à 0)

2. As formas geométricas criadas devem ser genéricas, no sentido que suas medidas (lado, raio, etc.) podem ser um inteiro, double, etc. A aplicação (interface) deve trabalhar com double, e as instâncias das formas geométricas criadas devem ser do tipo double. Dica: o tipo genérico pode ser uma extensão da classe Number (Java), que possui o método doubleValue().

### Implementação do Projeto
Implemente a aplicação para cálculo de área e perímetro de formas geométrica baseando-se no seu projeto. Algumas exigências.

* Faça uso de tratamento de exceções para verificar dados fornecidos pelo usuário ou manipulados no programa.

* Faça uso de tipos genéricos como informado acima.

* Escreva seu código com boa legibilidade e seguindo boas práticas.
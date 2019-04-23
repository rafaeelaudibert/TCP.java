# Questões da Aula 05 - Técnicas de Construção de Programas
Rafael Baldasso Audibert - 00287695

---
### Questão 1: O que aconteceu quando você criou uma das classes concretas e estendeu as classes abstratas?
Foi necessário criar um construtor para poder chamar o construtor da classe pai, já que o contrutor da classe pai possui um parâmetro default.

### Questão 2: O que aconteceu quando você adicionou o método eval à interface ExpressaoLogica?
Todas as classes concretas que implementavam a interface e/ou herdavam de uma classe abstrata que implementava a interface foram obrigadas a implementar o método eval.
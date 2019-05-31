Os bugs encontrados (e corrigidos) são enumerados abaixo:

* Senhas com 6 caracteres (mínimo permitido) não eram aceitas
* Senhas com 10 caracteres (máximo permitido) não eram aceitas
* Senhas que constem no dicionário com outras capitalizações (maiusculas em algum ponto) eram aceitas
* Caso não fosse entrado nenhuma senha, e fosse passado null para a função, teríamos um erro do tipo NullPointerException pois testamos password.charAt(0)

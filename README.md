#   Conta Bancária :bank:

programa em JAVA de um Banco. Temos duas classes, sendo  a principal, a classe **Main** e a classe **ContaBanco** e uma *interface* **Banco** implementando o conceito de encapsulamento. 

### Classe ContaBanco

#### Atributos:

- numConta - tipo  inteiro;
- tipo - tipo String
- saldo - tipo double;
- dono - tipo String;
- status - tipo boolean;

#### Métodos:



- contrutor;
- abrirConta();
- fecharConta();
- pagarMensal();
- sacar();
- depositar();
- status();
- getter() e setter();

## Interface Banco

#### Métodos abstratos:

- abrirConta();
- fecharConta();
- pagarMensal();
- sacar();
- depositar();
- status();





Quando inicializo a classe **contaBanco** na classe principal, no método construtor, já atribuo como *false* o atributo *status* e atribuo o valor *R$0.00* ao atributo *saldo*.














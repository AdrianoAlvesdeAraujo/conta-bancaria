public class Main {

    public static void main(String[] args) {
        Banco c=new ContaBanco("Joesley","cc", 1212);
        Banco c1=new ContaBanco("Adriano","cp",1111);


        c.abrirConta();
        c.depositar(500.00);
        c.pagarMensal();
        c.sacar(100.00);
        c.status();


        c1.abrirConta();
        c1.depositar(300.00);
        c1.pagarMensal();
        c1.sacar(150.00);
        c1.status();

        c1.fecharConta();
        c1.status();

    }
}

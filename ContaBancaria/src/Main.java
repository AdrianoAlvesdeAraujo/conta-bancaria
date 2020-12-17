public class Main {

    public static void main(String[] args) {
        Banco c=new ContaBanco();
        Banco c1=new ContaBanco();


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

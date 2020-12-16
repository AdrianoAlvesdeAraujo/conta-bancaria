public class Main {

    public static void main(String[] args) {
        ContaBanco c=new ContaBanco("cc", "Creuza", 1001);
        ContaBanco c1=new ContaBanco("cp", "Jubileu", 1002);


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


    }
}

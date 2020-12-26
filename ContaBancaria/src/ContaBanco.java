public class ContaBanco implements Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo = 0.0D;
    private boolean status = false;
    private int count;

    public ContaBanco(String nome,String tipo, int numero) {
        this.tipo=tipo;
        this.dono=nome;
        this.numConta=numero;

        setSaldo(0.00D);
        setStatus(false);
    }

    public void abrirConta() {
        if (!this.isStatus()) {
            this.setStatus(true);
            if (this.getTipo() == "cc") {
                this.saldo += 100.0D;
            } else {
                this.saldo += 150.0D;
            }
        } else {
            System.out.println("Já existe a conta");
        }

    }

    public void fecharConta() {

        this.count++;
        if (this.saldo < 0.0D) {
            System.out.println("Existe débito para esta conta, não é possível fechar conta");
        } else if (this.saldo > 0.0D) {
            System.out.println("Existe saldo na conta");
        } else {
            this.setStatus(false);
        }

    }

    public void depositar(double valorParaDepositar) {
        this.count++;
        if (this.isStatus()) {
            this.saldo += valorParaDepositar;
            this.setSaldo(this.saldo);
        } else {
            System.out.println("Não existe essa conta");
        }

    }

    public void sacar(double valorParaSacar) {
        this.count++;
        if (this.isStatus()) {
            if (this.saldo > valorParaSacar) {
                this.saldo -= valorParaSacar;
                this.setSaldo(this.saldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Não existe essa conta");
        }

    }

    public void pagarMensal() {
        this.count++;
        double valor = 0.0D;
        if (this.isStatus()) {
            if (this.getTipo() == "cc") {
                valor = 20.0D;
            } else {
                valor = 10.0D;
            }

            this.saldo -= valor;
            this.setSaldo(this.saldo);
        } else {
            System.out.println("Não existe essa conta");
        }
        if(count == 10){
            valor=5.00;
            this.saldo -= valor;

            setSaldo(this.saldo);
            count=0;
        }

    }

    public void status() {
        System.out.println("-------Status da Conta---------");
        System.out.println("O tipo da conta é: " + this.getTipo());
        System.out.println("O nome do dono da conta é: " + this.getDono());
        System.out.println("O numero da conta é: " + this.getNumConta());
        System.out.println("O saldo da conta é: " + this.getSaldo());
        System.out.println("A conta está ativa?: " + this.isStatus());
        System.out.println("\n");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

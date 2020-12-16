public class ContaBanco {

    public int numConta = 0;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(String tipoConta, String nomeDono, int numConta){
        this.status=false;
        this.saldo=0;
        this.tipo=tipoConta;
        this.dono=nomeDono;
        this.numConta=numConta;



    }
    public void abrirConta(){

        if(!isStatus()){


           setStatus(true);

            if(getTipo()=="cc") {
                this.saldo += 100.00;
            }else{
                    this.saldo+=150.00;
                }

            }else{
            System.out.println("Já existe a conta");
        }

        }



    public void fecharConta(){

        if(saldo <  0){
            System.out.println("Existe débito para esta conta, não é possível fechar conta");
        }else if(saldo>0){
            System.out.println("Existe saldo na conta");
        }else{
            setStatus(false);
        }

    }

    public void depositar(double valorParaDepositar){

        if(isStatus()) {
            this.saldo +=valorParaDepositar;
            setSaldo(this.saldo);
        }else{
            System.out.println("Não existe essa conta");
        }


    }

    public void sacar(double valorParaSacar){

        if(isStatus()){
            if(saldo > valorParaSacar){
                this.saldo -=valorParaSacar;
                setSaldo(this.saldo);
            }else{
                System.out.println("Saldo insuficiente");
            }

        }else{
            System.out.println("Não existe essa conta");
        }


    }
    public void pagarMensal(){
            double valor=0;
        if(isStatus()){
            if(getTipo()=="cc"){
                valor=20.00;
            }else{
                valor=10.00;
            }
            this.saldo -=valor;
            setSaldo(this.saldo);

        }else{
            System.out.println("Não existe essa conta");
        }

    }

    public void status(){

        System.out.println("-------Status da Conta---------");
        System.out.println("O tipo da conta é: "+getTipo());
        System.out.println("O nome do dono da conta é: "+getDono());
        System.out.println("O numero da conta é: "+getNumConta());
        System.out.println("O saldo da conta é: "+getSaldo());
        System.out.println("A conta está ativa?: "+isStatus());
        System.out.println("\n");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

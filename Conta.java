
package banco;

public class Conta {

    private final int NUMERO;
    private double saldo;

    public Conta(int NUMERO, double saldo) {
        this.NUMERO = NUMERO;
        this.saldo = saldo;
    }

    

    public void deposito(double valor) {
        saldo += valor;
    }

    public boolean saque(double valor) {
        if(saldo >= valor){
            saldo -= valor;
        return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNUMERO() {
        return NUMERO;
    }

    @Override
    public String toString() {
        return "Numero da conta = " + NUMERO + "\nSaldo=" + saldo;
    }

}

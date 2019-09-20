
package banco;

import java.util.ArrayList;
import java.util.Scanner;


public class Agencia {

    private ArrayList<Conta> contas = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);
    private int numero = 0;

    public void menu() {
        int op;
        do {
            System.out.println("\n 1 - Criar conta \n 2 - Acessar conta \n 3 - Sair ");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    System.out.println("Qual o numero da sua conta?");
                    int numero = entrada.nextInt();
                    acessarConta(existeConta(numero));

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;

            }
        } while (op != 3);

    }

    private void criarConta() {
        System.out.println("Qual é o saldo inicial");
        Conta c = new Conta(++numero, entrada.nextDouble());
        contas.add(c);
    }

    private void acessarConta(Conta c) {

        System.out.println(contas.get(contas.indexOf(c)));
        int op;
        do {
            System.out.println("\n1 - Deposito\n2 - Saque \n3 - Ver saldo\n4 - Sair");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Qual a quantia?");
                    double valor = entrada.nextDouble();
                    c.deposito(valor);
                    break;
                case 2:
                    System.out.println("Qaul a quantia?");
                    double valorSaque = entrada.nextDouble();
                    c.saque(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo = " + c.getSaldo());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default: System.out.println("Entrada invalida");
            }
        } while (op != 4);
    }

    private Conta existeConta(int numero) {

        for (Conta c : contas) {
            if (c.getNUMERO() == numero) {
                return c;
            }
        }

        return null;
    }

}

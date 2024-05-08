package edu.bootcamp.conta_banco;

import java.util.Scanner;

public class ContaTerminal {
    
    private String agencia;
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    @SuppressWarnings("resource")
    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da agência: ");
        this.agencia = scanner.nextLine();
        System.out.println("Informe o número da conta: ");
        this.numeroConta = scanner.nextInt();
        System.out.println("Informe o nome do Cliente: ");
        this.nomeCliente = scanner.next();
        System.out.println("Informe o saldo: ");
        this.saldo = scanner.nextDouble();
    }

    public void exibeCadastro() {
        System.out.println("\n Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + ", conta " + this.numeroConta + ", e seu saldo " + this.saldo + " R$ já está disponivel para saque.");
    }
}

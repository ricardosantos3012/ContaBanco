package edu.bootcamp.conta_banco;

public class ContaBanco {
    public static void main(String[] args) {
        
        ContaFisica conta = new ContaFisica();

        conta.cadastrarCliente();
        conta.exibeCadastro();
    }
}

package edu.bootcamp.conta_banco;

public class PrincipalBanco {
    public static void main(String[] args) {
        
        ContaTerminal conta = new ContaTerminal();

        conta.cadastrarCliente();
        conta.exibeCadastro();
    }
}

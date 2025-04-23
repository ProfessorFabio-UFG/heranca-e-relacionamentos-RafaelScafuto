package LabHeranca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja("Loja do Rafael");

        //para os funcionários
        for (int i = 0; i < 2; i++) {
            System.out.println("\nDigite os dados do Funcionário " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            System.out.print("Estado civil (número): ");
            int estadoCivil = scanner.nextInt();
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            Funcionario f = new Funcionario(nome, endereco, telefone, cpf, sexo, estadoCivil, matricula, salario, cargo);
            loja.empregarFuncionario(f);

            if (i == 0) {
                loja.demitirFuncionario(f); // demite o primeiro para testar
            }
        }

        //para os clientes
        for (int i = 0; i < 2; i++) {
            System.out.println("\nDigite os dados do Cliente " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            System.out.print("Estado civil (número): ");
            int estadoCivil = scanner.nextInt();
            System.out.print("Renda: ");
            double renda = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer
            System.out.print("Interesses: ");
            String interesses = scanner.nextLine();
            System.out.print("Profissão: ");
            String profissao = scanner.nextLine();

            Cliente c = new Cliente(nome, endereco, telefone, cpf, sexo, estadoCivil, renda, interesses, profissao);
            loja.cadastrarCliente(c);
        }

        //para os fornecedores
        for (int i = 0; i < 2; i++) {
            System.out.println("\nDigite os dados do Fornecedor " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("CNPJ: ");
            String cnpj = scanner.nextLine();
            System.out.print("Razão Social: ");
            String razaoSocial = scanner.nextLine();
            System.out.print("Produtos fornecidos: ");
            String produtos = scanner.nextLine();

            Fornecedor f = new Fornecedor(nome, endereco, telefone, cnpj, razaoSocial, produtos);
            loja.cadastrarFornecedor(f);
        }

        System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
        loja.listarFuncionarios();

        System.out.println("\n=== LISTA DE CLIENTES ===");
        loja.listarClientes();

        System.out.println("\n=== LISTA DE FORNECEDORES ===");
        loja.listarFornecedores();

        scanner.close();

    }
}

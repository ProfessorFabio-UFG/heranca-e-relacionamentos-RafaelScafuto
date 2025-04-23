package LabHeranca;

public class Loja {

    private String nome;
    private Funcionario[] funcionario;
    private Cliente[] cliente;
    private Fornecedor[] fornecedor;

    Loja(String nome){
        this.nome = nome;
        this.funcionario = new Funcionario[5];
        this.cliente = new Cliente[5];
        this.fornecedor = new Fornecedor[5];
    }

    public void empregarFuncionario(Funcionario novoFuncionario){

        for(int i=0; i<this.funcionario.length;i++){
            if (this.funcionario[i] == null) {
                this.funcionario[i] = novoFuncionario;
                return;
            }
        }

    
    }

    public void demitirFuncionario(Funcionario funcionario){

        for (int i = 0; i < this.funcionario.length; i++) {
            if (this.funcionario[i] != null && this.funcionario[i].equals(funcionario)) {
                this.funcionario[i] = null;
                return;
            }
        }

    }

    public void cadastrarCliente(Cliente novoCliente){
        for (int i = 0; i < this.cliente.length; i++) {
            if (this.cliente[i] == null) {
                this.cliente[i] = novoCliente;
                return;
            }
        }

    }

    public void cadastrarFornecedor(Fornecedor novoFornecedor){
        for(int i = 0; i < this.fornecedor.length;i++){
            if(this.fornecedor[i] == null){
                this.fornecedor[i] = novoFornecedor;
                return;
            }
        }

    }

    public void listarClientes(){
        for (int i = 0; i < this.cliente.length; i++) {
            if (this.cliente[i] != null) {
                System.out.println(this.cliente[i]);
            }
        }
    }

    public void listarFuncionarios(){
        for (int i = 0; i < this.funcionario.length; i++) {
            if (this.funcionario[i] != null) {
                System.out.println(this.funcionario[i]);
            }
        }
    }

    public void listarFornecedores(){
        for (int i = 0; i < this.fornecedor.length; i++) {
            if (this.fornecedor[i] != null) {
                System.out.println(this.fornecedor[i]);
            }
        }
    }



}


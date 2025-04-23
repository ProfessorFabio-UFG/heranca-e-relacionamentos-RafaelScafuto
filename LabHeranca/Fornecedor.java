package LabHeranca;

public class Fornecedor extends PessoaJuridica{

    protected String produtos;

    Fornecedor(String nome,String endereco,String telefone,String cnpj,String razaoSocial,String produtos){
        super(nome,endereco,telefone,cnpj,razaoSocial);
        this.produtos = produtos;
    }

    public String toString(){
        return "Nome: " + this.nome + ",Endereço: " + this.endereco + ",Telefone: " + this.telefone +
                "\n" + "CNPJ: " + this.cnpj + ",Razão Social: " + this.razaoSocial +
                "\n" + "Produtos: " + this.produtos + "\n";
    }
}

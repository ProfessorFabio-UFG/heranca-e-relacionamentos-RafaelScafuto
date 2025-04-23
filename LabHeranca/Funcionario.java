package LabHeranca;

public class Funcionario extends PessoaFisica{

    protected int matricula;
    protected double salario;
    protected String cargo;

    Funcionario(String nome,String endereco,String telefone,String cpf,char sexo,
                int estadoCivil,int matricula,double salario,String cargo){
        super(nome,endereco,telefone,cpf,sexo,estadoCivil);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String toString(){
        return "Nome: " + this.nome + ",Endereço: " + this.endereco + ",Telefone: " + this.telefone +
                "\n" + "CPF: " + this.cpf + ",Sexo: " + this.sexo + ",Estado Civil: " + this.estadoCivil +
                "\n" + "Matricula: " + this.matricula + ",Salario: " + this.salario + ",Cargo: " + this.cargo + "\n";
    }

    @Override       //isso vai garantir que os objetos que estão sendo comparados la em loja sejam considerados iguais caso tenham o mesmo NOME
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funcionario that = (Funcionario) obj;
        return this.nome.equals(that.nome); // ou CPF, ID, etc.
    }
}

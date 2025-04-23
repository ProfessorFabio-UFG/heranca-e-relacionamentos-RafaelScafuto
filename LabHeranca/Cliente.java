    package LabHeranca;

    public class Cliente extends PessoaFisica{

        protected double renda;
        protected String interesses;
        protected String profissao;

        Cliente(String nome,String endereco,String telefone,String cpf,char sexo,
                int estadoCivil,Double renda,String interesses,String profissao){
            super(nome,endereco,telefone,cpf,sexo,estadoCivil);
            this.renda = renda;
            this.interesses = interesses;
            this.profissao = profissao;
        }

        public String toString(){
            return "Nome: " + this.nome + ",Endereço: " + this.endereco + ",Telefone: " + this.telefone +
                    "\n" + "CPF: " + this.cpf + ",Sexo: " + this.sexo + ",Estado Civil: " + this.estadoCivil +
                    "\n" + "Renda: " + this.renda + ",Interesses: " + this.interesses + ",Profissão:" + this.profissao + "\n";
        }
    }

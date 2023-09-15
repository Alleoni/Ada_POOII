package entities.objects;

public class PessoaFisica extends Pessoa {
    private String CPF;

    public PessoaFisica(String nome, String endereco, String telefone, String email, String CPF) {
        super(nome, endereco, telefone, email);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

}

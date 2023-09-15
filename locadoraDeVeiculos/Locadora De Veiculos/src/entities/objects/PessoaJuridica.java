package entities.objects;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String tipoEmpresa;

    public PessoaJuridica(String nome, String endereco, String telefone, String email, String CNPJ, String tipoEmpresa) {
        super(nome, endereco, telefone, email);
        this.CNPJ = CNPJ;
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }
}

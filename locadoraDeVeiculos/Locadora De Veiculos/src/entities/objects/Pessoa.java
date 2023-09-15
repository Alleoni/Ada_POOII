package entities.objects;

import java.util.ArrayList;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private List<Aluguel> alugueis;
    private String endereco;
    private String telefone;
    private String email;

    public Pessoa(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.alugueis = new ArrayList<>();
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public void alugarVeiculo(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public void devolverVeiculo(Veiculo veiculo) {
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getVeiculo().getPlaca().equals(veiculo.getPlaca())) {
                alugueis.remove(aluguel);
                break;
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

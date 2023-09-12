public class Veiculo {
    private String placa;
    private String nome;
    private Modelo modelo;
    private boolean disponivel;
    public Veiculo() {
    }
    public Veiculo(String placa, String nome, Modelo modelo) {
        this.placa = placa;
        this.nome = nome;
        this.modelo = modelo;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", nome='" + nome + '\'' +
                ", modelo=" + modelo +
                ", disponivel=" + disponivel +
                '}';
    }
}
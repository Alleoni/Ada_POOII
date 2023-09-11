public class Veiculo {
    private String placa;
    private String nome;
    private Double motor;
    private Modelo modelo;

    public Veiculo() {
    }

    public Veiculo(String placa, String nome, Double motor, Modelo modelo) {
        this.placa = placa;
        this.nome = nome;
        this.motor = motor;
        this.modelo = modelo;
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

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
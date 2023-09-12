import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private String local;
    private LocalDateTime dataHoraAtual;
    private LocalDateTime dataHoraDevolucao;
    private boolean veiculoDevolvido;

    public Aluguel(Veiculo veiculo, Cliente cliente, String local, LocalDateTime dataHoraAtual, boolean veiculoDevolvido) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.local = local;
        this.dataHoraAtual = dataHoraAtual;
        this.veiculoDevolvido = veiculoDevolvido;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getDataHoraAtual() {
        return dataHoraAtual;
    }

    public void setDataHoraAtual(LocalDateTime dataHoraAtual) {
        this.dataHoraAtual = dataHoraAtual;
    }

    public LocalDateTime getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public boolean isVeiculoDevolvido() {
        return veiculoDevolvido;
    }

    public void setVeiculoDevolvido(boolean veiculoDevolvido) {
        this.veiculoDevolvido = veiculoDevolvido;
    }

}

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAlugueisVeiculos {

    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Aluguel> alugueis = new ArrayList<>();

    public void cadastrarVeiculo(Veiculo veiculo){
        if(!veiculos.contains(veiculo)){
            veiculos.add(veiculo);
        } else System.out.println("Veiculo já cadastrado");
    }

    public void alterarVeiculo(String veiculo, String novaPlaca, Modelo novoModelo){
        for(Veiculo veiculoAluguel : veiculos){
            if(veiculoAluguel.getPlaca().equals(veiculo)){
                veiculoAluguel.setPlaca(novaPlaca);
                veiculoAluguel.setModelo(novoModelo);
            }

        }

    }

    public void cadastrarCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
        } else System.out.println("Cliente já cadastrado");
    }

    public void alterarCliente(String documento, String novoDocumento, String novoNome){
        for(Cliente cliente : clientes){
            cliente.setDocumento(novoDocumento);
            cliente.setNome(novoNome);
        }
    }
    public Veiculo buscarVeiculoPorNome(String nome){
        for(Veiculo veiculo : veiculos){
            if(veiculo.getNome().equalsIgnoreCase(nome)){
                return veiculo;
            }
        }
        return null;
    }

    public void alugarVeiculo(Veiculo veiculo, Cliente cliente, String local, LocalDateTime dataHoraAtual){
        if (veiculo.isDisponivel()){
            Aluguel aluguel = new Aluguel(veiculo, cliente, local, dataHoraAtual);
            veiculo.setDisponivel(false);
            alugueis.add(aluguel);
        }
    }

    public void devolverVeiculo(Veiculo veiculo, Cliente cliente, String Local, LocalDateTime dataHoraDevolucao){

    }

}

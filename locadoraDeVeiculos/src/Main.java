public class Main {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo();

        veiculo1.setModelo(Modelo.PEQUENO);
        veiculo1.setPlaca("ABC2345");
        veiculo1.setNome("ONIX");

        GerenciadorDeAlugueisVeiculos gerenciador = new GerenciadorDeAlugueisVeiculos();

        gerenciador.cadastrarVeiculo(veiculo1);

        System.out.println(veiculo1);

        gerenciador.cadastrarVeiculo(veiculo1);

      //  gerenciador.alterarVeiculo("ABC2345", "AAAAA123", Modelo.SUV);

       // System.out.println(veiculo1);

        System.out.println(gerenciador.buscarVeiculoPorNome("Onix"));


    }
}
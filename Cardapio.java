package restaurante.sistema;

import java.io.IOException;
import java.util.List;

import restaurante.dominio.ArquivoVar;
import restaurante.util.Menu;
import restaurante.util.Processador;

public class Cardapio {
    public static void main(String[] args) throws IOException {

        List<ArquivoVar> listaDePratos = Processador.lerPratos("D:\\Downloads\\pratos.csv");
        List<ArquivoVar> listaDeBebidas = Processador.lerBebidas("D:\\Downloads\\bebidas-tabuladas.txt");
        List<ArquivoVar> listaDeVinhos = Processador.lerVinhos("D:\\Downloads\\vinhos-tabulados.txt");

        Menu.processar(listaDePratos, listaDeBebidas, listaDeVinhos);

    }

}
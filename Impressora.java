package restaurante.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Impressora {
    public static void imprimir(String nomeCliente, List<String> listaDePedidos, List<String> listaObscervacao, double totalPedido) throws IOException {

        FileWriter arquivoDeSaida;
        arquivoDeSaida = new FileWriter("D:\\Downloads\\"+nomeCliente+".txt");
        PrintWriter gravador = new PrintWriter(arquivoDeSaida);

        gravador.println("");
        gravador.println(" ----- RESTAURANTE DO SEU ZE -----");
        gravador.println("");
        gravador.println("Nome:"+Cardapio.getNomeCliente());
        gravador.println("");
        gravador.println("Pedido:"+Cardapio.getListaDePedidos());
        gravador.println("");
        gravador.println("Observacoes:"+Cardapio.getListaObservacao());
        gravador.println("");
        gravador.println("Total:"+Cardapio.getTotalPedido());
        gravador.println("");
        gravador.println(" ----- OBRIGADO E VOLTE SEMPRE! -----");

        gravador.close();
        arquivoDeSaida.close();



    }
}

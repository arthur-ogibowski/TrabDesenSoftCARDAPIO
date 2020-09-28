package restaurante.util;

import restaurante.dominio.ArquivoVar;
import restaurante.dominio.Cardapio;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void processar(List<ArquivoVar> listaDePratos, List<ArquivoVar> listaDeBebidas, List<ArquivoVar> listaDeVinhos) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorChar = new Scanner(System.in);
        Scanner leitorStr = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        int cardapio;


        System.out.println("----- RESTAURANTE DO SEU ZE -----");
        System.out.println("");


        System.out.println("Qual o seu nome? ");
        Cardapio.setNomeClien(leitorStr.nextLine());


        do {

            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("----- ESCOLHA UMA OPCAO -----");
            System.out.println("");
            System.out.println("1- Pratos");
            System.out.println("2- Bebidas");
            System.out.println("3- Vinhos");
            System.out.println("4- Meu Carrinho");
            System.out.println("5- Pedir a conta");

            System.out.println("Cardapio n. :");
            cardapio = leitorInt.nextInt();
            System.out.println("");

            switch (cardapio) {


                case 1:
                    Cardapio.listarPratos(listaDePratos);
                    System.out.println("(digite 0 (zero) para voltar)");
                    System.out.println("Qual prato deseja? Insire o codigo numerico:");
                    int codigo = leitorInt.nextInt();
                    System.out.println("");
                    if (codigo == 0) {
                        break;
                    } else {
                        Cardapio.incluirPrato(codigo);
                        System.out.println("Observacoes? Digite 's' para SIM e 'n' para NAO");
                        char resposta = leitorChar.next().charAt(0);
                        System.out.println("");
                        if (resposta == 's') {

                            System.out.println("Qual a observacao? ");
                            Cardapio.setObservacao(leitor.nextLine());
                            codigo -= 1;
                            Cardapio.getListaObservacao().add(" | " + Cardapio.getNomePrato()[codigo] + ": " + Cardapio.getObservacao() + " | ");
                        } else {
                            break;
                        }
                        break;
                    }


                case 2:
                    Cardapio.listarBebidas(listaDeBebidas);
                    System.out.println("(digite 0 (zero) para voltar)");
                    System.out.println("Qual bebida deseja? Insire o codigo numerico:");
                    int codigo1 = leitorInt.nextInt();
                    System.out.println("");
                    if (codigo1 == 0) {
                        break;
                    } else {
                        Cardapio.incluirBebida(codigo1);
                        System.out.println("Observacoes? Digite 's' para SIM e 'n' para NAO");
                        char resposta = leitorChar.next().charAt(0);
                        System.out.println("");
                        if (resposta == 's') {

                            System.out.println("Qual a observacao? ");
                            Cardapio.setObservacao(leitor.nextLine());
                            codigo1 -= 1;
                            Cardapio.getListaObservacao().add(" | " + Cardapio.getNomeBebida()[codigo1] + ": " + Cardapio.getObservacao() + " | ");
                        } else {
                            break;
                        }

                        break;
                    }


                case 3:
                    Cardapio.listarVinhos(listaDeVinhos);
                    System.out.println("(digite 0 (zero) para voltar)");
                    System.out.println("Qual vinho deseja? Insire o codigo numerico:");
                    int codigo2 = leitorInt.nextInt();
                    System.out.println("");
                    if (codigo2 == 0) {
                        break;
                    } else {
                        Cardapio.incluirVinho(codigo2);
                        System.out.println("Observacoes? Digite 's' para SIM e 'n' para NAO");
                        char resposta = leitorChar.next().charAt(0);
                        System.out.println("");
                        if (resposta == 's') {

                            System.out.println("Qual a observacao? ");
                            Cardapio.setObservacao(leitor.nextLine());
                            codigo2 -= 1;
                            Cardapio.getListaObservacao().add(" | " + Cardapio.getNomeVinho()[codigo2] + ": " + Cardapio.getObservacao() + " | ");
                        } else {
                            break;
                        }

                        break;
                    }
                case 4:
                    for (int i = 0; i < 50; ++i) {
                        Scanner leitorC = new Scanner(System.in);
                        System.out.println("----- MEU CARRINHO -----");
                        System.out.println("" + Cardapio.getListaDePedidos());
                        System.out.println("");
                        System.out.println("Total: " + Cardapio.getListaDePedidos());
                        System.out.println("");
                        System.out.println("Limpar o carrinho? Digite 's' para SIM e 'n' para NAO");
                        char resposta = leitorC.next().charAt(0);

                        if (resposta == 's') {
                            Cardapio.excluir();
                        } else {
                            break;
                        }
                    }
            }


        } while (cardapio != 5);
        for (int i = 0; i < 50; ++i) {

            System.out.println(" OOOO CAMPEAO! ");
            System.out.println(" MANDA A CONTA! ");

            System.out.println(" ----- RESTAURANTE DO SEU ZE -----");
            System.out.println("");
            System.out.println("Nome:" + Cardapio.getNomeCliente());
            System.out.println("");
            System.out.println("Pedido:" + Cardapio.getListaDePedidos());
            System.out.println("");
            System.out.println("Observacoes:" + Cardapio.getListaObservacao());
            System.out.println("");
            System.out.println("Total:" + Cardapio.getTotalPedido());
            System.out.println("");

            leitorStr.close();
            leitorInt.close();
            leitorChar.close();
            leitor.close();

            Impressora.imprimir(Cardapio.getNomeCliente(), Cardapio.getListaDePedidos(), Cardapio.getListaObservacao(), Cardapio.getTotalPedido());
        }
    }
}

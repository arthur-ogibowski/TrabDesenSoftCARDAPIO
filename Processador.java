package restaurante.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import restaurante.dominio.ArquivoVar;

public class Processador {
    public static List<ArquivoVar> lerPratos(String nomeArquivo) {

        File arquivo = new File(nomeArquivo);
        Scanner leitor = null;
        try{
            leitor = new Scanner(new FileInputStream(arquivo), StandardCharsets.UTF_8);
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro na leitura");
        }
        leitor.nextLine();

        List<ArquivoVar> listaDePratos = new ArrayList<>();

        while (leitor.hasNext()) {

            String linha = leitor.nextLine();
            String[] partes = linha.split(";");

            ArquivoVar pratos = new ArquivoVar();
            pratos.setNomePrato(partes[0]);
            pratos.setPrecoPrato(Double.parseDouble(partes[1]));
            pratos.setCodigoPrato(Integer.parseInt(partes[2]));

            listaDePratos.add(pratos);
        }

        leitor.close();
        return listaDePratos;
    }

    public static List<ArquivoVar> lerBebidas(String nomeArquivo) {

        File arquivo = new File(nomeArquivo);
        Scanner leitor = null;
        try{
            leitor = new Scanner(new FileInputStream(arquivo), StandardCharsets.UTF_8);
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro na leitura");
        }
        leitor.nextLine();

        List<ArquivoVar> listaDeBebidas = new ArrayList<>();

        while (leitor.hasNext()) {

            String linha = leitor.nextLine();
            String[] partes = linha.split(";");

            ArquivoVar bebidas = new ArquivoVar();
            pratos.setNomeBebidas(partes[0]);
            pratos.setPrecoBebidas(Double.parseDouble(partes[1]));
            pratos.setCodigoBebidas(Integer.parseInt(partes[2]));

            listaDeBebidas.add(bebidas);
        }

        leitor.close();
        return listaDeBebidas;
    }

    public static List<ArquivoVar> lerVinhos(String nomeArquivo) {

        File arquivo = new File(nomeArquivo);
        Scanner leitor = null;
        try{
            leitor = new Scanner(new FileInputStream(arquivo), StandardCharsets.UTF_8);
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro na leitura");
        }
        leitor.nextLine();

        List<ArquivoVar> listaDeVinhos = new ArrayList<>();

        while (leitor.hasNext()) {

            String linha = leitor.nextLine();
            String[] partes = linha.split(";");

            ArquivoVar vinhos = new ArquivoVar();
            pratos.setNomeVinhos(partes[0]);
            pratos.setPrecoVinhos(Double.parseDouble(partes[1]));
            pratos.setCodigoVinhos(Integer.parseInt(partes[2]));

            listaDeVinhos.add(Vinhos);
        }

        leitor.close();
        return listaDeVinhos;
    }

}
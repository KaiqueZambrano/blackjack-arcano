package com.kaique.blackjackarcano;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

public class GerenciadorDeImagens {

    private static final String CAMINHO = "rider-waite/";

    private final Map<String, Image> imagens;

    public GerenciadorDeImagens() {
        imagens = new HashMap<>();

        for (var naipe : Carta.NAIPES) {
            for (var valor : Carta.VALORES) {
                String nome = valor + " de " + naipe;
                String nomeArquivo = nome.replace(" ", "-").toLowerCase() + ".jpg";
                carregarImagem(nome, CAMINHO + nomeArquivo);
            }
        }

        for (var arcano : Carta.ARCANOS_MAIORES) {
            String nomeArquivo = arcano.replace(" ", "-").toLowerCase() + ".jpg";
            carregarImagem(arcano, CAMINHO + nomeArquivo);
        }
    }

    private void carregarImagem(String chave, String caminhoCompleto) {
        try (InputStream stream = getClass().getClassLoader().getResourceAsStream(caminhoCompleto)) {
            if (stream == null) {
                System.err.println("Não encontrou: " + caminhoCompleto);
                return;
            }
            Image imagem = ImageIO.read(stream);
            imagens.put(chave, imagem);
        } catch (IOException e) {
            System.err.println("Erro ao carregar imagem: " + caminhoCompleto);
            e.printStackTrace();
        }
    }

    public Image getImagemDaCarta(Carta carta) {
        return imagens.get(carta.toString());
    }
}

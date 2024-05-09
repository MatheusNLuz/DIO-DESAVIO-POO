package iphone;

import iphone.componentes.internet.Safari;
import iphone.componentes.musica.AppleMusic;
import iphone.componentes.telefone.Telefone;

public class Iphone implements Safari, AppleMusic, Telefone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        iphone.exibirPagina("https://www.google.com");
        iphone.abrirNovaAba("https://www.youtube.com");
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Stairway to Heaven");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println(
            "Exibindo página: " + url
        );
    }

    @Override
    public void abrirNovaAba(String url) {
        System.out.println(
            "Abrindo nova aba: " + url
        );
    }

    @Override
    public void atualizarPagina() {
        System.out.println(
            "Atualizando página"
        );
    }

    @Override
    public void ligar(String numero) {
        System.out.println(
            "Ligando..."
        );
    }

    @Override
    public void atender() {
        System.out.println(
            "Atendendo chamada"
        );
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println(
            "Iniciando correio de voz"
        );
    }

    @Override
    public void tocar() {
        System.out.println(
            "Tocando música"
        );
    }

    @Override
    public void pausar() {
        System.out.println(
            "Pausando música"
        );
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(
            "Selecionando música: " + musica
        );
    }
    
}

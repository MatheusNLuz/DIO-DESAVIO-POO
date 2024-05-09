package iphone.componentes.internet;

public interface Safari {
    abstract void exibirPagina(String url);
    abstract void abrirNovaAba(String url);
    abstract void atualizarPagina();
}
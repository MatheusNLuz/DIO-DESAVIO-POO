package iphone.componentes.telefone;

public interface Telefone {
    abstract void ligar(String numero);
    abstract void atender();
    abstract void iniciarCorreioDeVoz();
}

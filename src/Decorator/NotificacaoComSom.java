package Decorator;

public class NotificacaoComSom extends NotificacaoDecorator {
    public NotificacaoComSom(INotificacao notificacaoDecorada) {
        super(notificacaoDecorada);
    }

    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando notificação com som: " + mensagem);
        reproduzirSom(mensagem);
    }
    private void reproduzirSom(String mensagem) {

        System.out.println("Reproduzindo som: " + mensagem);
        System.out.println();
    }
}
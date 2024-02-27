package Decorator;

public class NotificacaoComPrioridade extends NotificacaoDecorator {
    public NotificacaoComPrioridade(INotificacao notificacaoDecorada) {
        super(notificacaoDecorada);
    }

    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Marcando notificação como prioritária: " + mensagem);
        System.out.println();
    }
}

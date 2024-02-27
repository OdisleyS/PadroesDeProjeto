package Decorator;

public abstract class NotificacaoDecorator implements INotificacao {
    protected INotificacao notificacaoDecorada;

    public NotificacaoDecorator(INotificacao notificacaoDecorada) {
        this.notificacaoDecorada = notificacaoDecorada;
    }

    public void enviar(String mensagem) {
        notificacaoDecorada.enviar(mensagem);
    }
}

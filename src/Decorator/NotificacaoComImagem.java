package Decorator;

public class NotificacaoComImagem extends NotificacaoDecorator {
    public NotificacaoComImagem(INotificacao notificacaoDecorada) {
        super(notificacaoDecorada);
    }

    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando notificação com imagem: " + mensagem);
        exibirImagem(mensagem);
    }

    private void exibirImagem(String mensagem) {
        System.out.println("Exibindo imagem: " + mensagem);
        System.out.println();
    }
}
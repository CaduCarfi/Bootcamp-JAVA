public class FacebookMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Facebook Messenger");
    }
}

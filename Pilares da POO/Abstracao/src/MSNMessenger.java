public class MSNMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo MSN Messenger");
    }
}

public class MSNMensager extends ServicoMensagemInstantanea {
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN mensagem");
    }

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN mensagem");
    }
}

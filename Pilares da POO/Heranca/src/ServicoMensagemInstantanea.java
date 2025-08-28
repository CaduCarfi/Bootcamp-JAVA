public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo facebook messenger");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo facebook messenger");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se esta conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando historico de mensagem");
    }
}

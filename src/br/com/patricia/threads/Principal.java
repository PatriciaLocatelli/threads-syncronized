package br.com.patricia.threads;

public class Principal {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();
        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "joao");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "pedro");
        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "maria");
        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "ana");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();
    }
}

public interface agendaTAD {
    void armazenaPessoa(String nome, int idade, float altura);
    void removePessoa(String nome);
    int buscarPessoa(String nome); //Informa em que posição da agenda está a pessoa
    void imprimeAgenda(); //Improme os dados de todas as pessoas da agenda
    void imprimePessoa(int index);//imprime os dados da pessoa que está na posição "i" da agenda
}

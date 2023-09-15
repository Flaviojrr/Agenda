public class Agenda implements agendaTAD {
    private int cont=0;
    private agendaObj[] lalala = new agendaObj[10];
    public void armazenaPessoa(String nome, int idade, float altura) {
        if(cont<10){
            agendaObj novaPessoa = new agendaObj(nome,idade,altura);
            lalala[cont] = novaPessoa;
            cont++;
        }else{
            System.out.println("Agenda cheia!!!");
        }
    }

    public void removePessoa(String nome) {
        for (int i=0; i< lalala.length;i++){
            if(this.lalala[i].getNome().equalsIgnoreCase(nome)){
                lalala[i]=null;
                break;
            }else{
                System.out.println("Not ok");
            }
        }
    }

    public int buscarPessoa(String nome) {
        for (int i=0;i<lalala.length;i++){
            if(this.lalala[i].getNome().equalsIgnoreCase(nome)){
                return i;
            }else{
                System.out.println("Contato não existe");
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        for(int i=0;i<lalala.length;i++){
            if (lalala[i]!=null){
                System.out.println(lalala[i].toString());
            }
        }
    }

    public void imprimePessoa(int index) {
        if (lalala[index]!=null){
            System.out.println(lalala[index].toString());
        }else{
            System.out.println("Contato não existe");
        }
    }
}

public class Agenda implements agendaTAD {
    private int cont=0;
    private agendaObj[] lalala = new agendaObj[10];
    public void armazenaPessoa(String nome, int idade, float altura) {
       for (int i=0;i<lalala.length;){
           if(lalala[i]==null){
               agendaObj novaPessoa = new agendaObj(nome,idade,altura);
               lalala[i] = novaPessoa;
               cont++;
               break;
           }else if (cont==10){
               System.out.println("Agenda cheia!!!");
               break;
           }
           i++;
       }
    }

    public void removePessoa(String nome) {
        try {
            for (int i=0; i< lalala.length;i++){
                if(this.lalala[i].getNome().equalsIgnoreCase(nome)){
                    lalala[i]=null;
                    cont--;
                    System.out.println("Contato excluido com sucesso!!!");
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("Contato não encontrado!!!");
        }
    }

    public int buscarPessoa(String nome) {
        try{
            for (int i=0;i<lalala.length;i++){
                if(this.lalala[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
        }catch (Exception e){
            System.out.println("Contato não existe!!!");
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
            System.out.println("Contato não existe!!!");
        }
    }
}

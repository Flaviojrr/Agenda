import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agendaPessoal = new Agenda();
        boolean loop = false;
        do {
            System.out.println("////// Agenda //////"
            +"\n1. Nova Pessoa"
            +"\n2. Excluir Pessoa"
            +"\n3. Buscar Pessoa"
            +"\n4. Imprimir Agenda"
            +"\n5. Imprimir Pessoa (Índice)"
            +"\n6. Sair"
            +"\nSua opção:");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Informe o nome:");
                    String nomeNovoContato=sc.next();
                    System.out.println("Informe a idade");
                    int idadeNovoContato=sc.nextInt();
                    System.out.println("Informe a altura");
                    float alturaNovoContato=sc.nextFloat();
                    agendaPessoal.armazenaPessoa(nomeNovoContato,idadeNovoContato,alturaNovoContato);
                break;
                case 2:
                    System.out.println("Nome do contato para remoção:");
                    String nomeContatoRemocao=sc.next();
                    agendaPessoal.removePessoa(nomeContatoRemocao);
                break;
                case 3:
                    System.out.println("Nome do contato para busca:");
                    String nomeContatoBusca=sc.next();
                    int numeroContato=agendaPessoal.buscarPessoa(nomeContatoBusca);
                    if( numeroContato>=0){
                        System.out.println("O contato estar na posição:"+numeroContato);
                    }
                break;
                case 4:
                    agendaPessoal.imprimeAgenda();
                break;
                case 5:
                    System.out.println("Índice do contato:");
                    int indeceContato=sc.nextInt();
                    agendaPessoal.imprimePessoa(indeceContato);
                break;
                case 6:
                    loop=true;
                break;
            }
        }while (loop==false);
    }
}

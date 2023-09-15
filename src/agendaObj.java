public class agendaObj {
    private String nome;
    private int idade;
    private float altura;
    private int cont=1;
    public agendaObj(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Contatos" +
                "Nome=" + nome +
                ", Idade=" + idade +
                ", Altura=" + altura+
                "\n";
    }
}

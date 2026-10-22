public class Jogador {
	
    private String nome;
    private String nick;
    private int idade;
    private String jogoFavorito;
    private int nivel;

    public Jogador(String nome, String nick, int idade, String jogoFavorito, int nivel) {
        this.nome = nome;
        this.nick = nick;
        this.idade = idade;
        this.jogoFavorito = jogoFavorito;
        this.nivel = nivel;
    }
    
    public String getNome() {
        return this.nome;
    }
    public String getNick() {
        return this.nick;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getJogoFavorito() {
        return this.jogoFavorito;
    }
    public int getNivel() {
        return this.nivel;
    }

    public void mostrarFicha() {
        System.out.println("---FICHA DO JOGADOR---");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nick: " + this.getNick());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Jogo favorito: " + this.getJogoFavorito());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("---");
    }
}

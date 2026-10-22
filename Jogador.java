public class Jogador {
	
    private String nome;
    private String nick;
    private int idade;
    private String jogoFavorito;
    private int nivel;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setJogoFavorito(String jogoFavorito) {
        this.jogoFavorito = jogoFavorito;
    }
    public void setNivel(int nivel) {
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
    
    public void mostrarFicha(){
        System.out.println("-----FICHA DO JOGADOR-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nick: " + this.getNick());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Jogo favorito: " + this.getJogoFavorito());
        System.out.println("Nível: " + this.getNivel());
        System.out.println("---------------");
    }
}

package modelos;

public class PokemonUnico extends Pokemon {

//unico a cadstrar. Herda todos os atributos e objetos.
    
    private String nick;

    public PokemonUnico(int numero, String nome, Tipo tipo, Status status) {
        super(numero, nome, tipo, status);
    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    
}

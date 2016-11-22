package modelos;

/**
 *
 * @author Silvio
 */
public class Status {
    
    //Objeto que recebe e controla os status
    
    private int hp;
    private int ataque;
    private int ataqueEspecial;
    private int defesa;
    private int defesaEspecial;

    public Status(int hp, int ataque, int ataqueEspecial,int defesa,int defesaEspecial){
        this.hp = hp;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defesa = defesa;
        this.defesaEspecial = defesaEspecial;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDefesaEspecial() {
        return defesaEspecial;
    }

    public void setDefesaEspecial(int defesaEspecial) {
        this.defesaEspecial = defesaEspecial;
    }

    @Override
    public String toString(){
        return "HP: " + hp + " Atk: " + ataque + " Def: " + ataqueEspecial + " SAtk: " + defesa + " SDef: " + defesaEspecial;
    }
    
}

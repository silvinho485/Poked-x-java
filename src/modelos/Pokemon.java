/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author awsilva
 */
public class Pokemon {
    
    protected int numero;
    protected String nome;
    protected Tipo tipo;
    protected Status status;

    public Pokemon(int numero, String nome, Tipo tipo, Status status){
       this.numero = numero; 
       this.nome = nome; 
       this.tipo = tipo; 
       this.status = status; 
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    public void mostra(){
        System.out.println("Nome: "  + nome +"\nNum/Pos: " + numero + "\nTipo: " + tipo.getTipo1() + " " + tipo.getTipo2() + "\n" + status + "\n=========================");
        //System.out.println(nome +" " + numero + " " + tipo.getTipo1() + " " + tipo.getTipo2() + " " + status);
    } 
}

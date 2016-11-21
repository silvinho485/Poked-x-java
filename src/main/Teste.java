package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Pokemon;
import modelos.Status;
import modelos.Tipo;

/**
 *
 * @author awsilva
 */
public class Teste {
    public static void main(String[] args) {
        
        Scanner le = new Scanner(System.in); 
        
        
        List<Pokemon> pokemons = new ArrayList<Pokemon>();
       
        pokemons.add(new Pokemon(1, "Bulbasaur", new Tipo("grass", "Poison"), new Status(45, 49, 49, 65, 65)));
        pokemons.add(new Pokemon(4, "Charmander", new Tipo("Fire", ""), new Status(39, 52, 43, 60, 50)));
        pokemons.add(new Pokemon(94, "gengar", new Tipo("Ghost", "Poison"), new Status(60, 65, 60, 130, 75)));
        
     
        
        for(Pokemon pokemon:pokemons)
            pokemon.mostra();
        
        int indice = 1;
        
        while(indice != 0){
            indice = le.nextInt();
            if(indice == 0)
                System.out.println("Saiu");
            else
                pokemons.get(indice -1).mostra();
            
        }
    }
}

package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelos.Pokemon;
import modelos.PokemonUnico;
import modelos.Status;
import modelos.Tipo;

/**
 *
 * @author Silvio
 */
public class Teste {
    public static void main(String[] args) {
        
        Scanner le = new Scanner(System.in); 
        
        List<Pokemon> pokemons = new ArrayList<Pokemon>();
       
        pokemons.add(new Pokemon(1, "Bulbasaur", new Tipo("grass", "Poison"), new Status(45, 49, 49, 65, 65)));
        pokemons.add(new Pokemon(2, "Ivysaur", new Tipo("grass", "Poison"), new Status(60, 62, 63, 80, 80)));
        pokemons.add(new Pokemon(3, "Venusaur", new Tipo("grass", "Poison"), new Status(80, 82, 83, 100, 100)));
        pokemons.add(new Pokemon(4, "Charmander", new Tipo("Fire", ""), new Status(39, 52, 43, 60, 50)));
        pokemons.add(new Pokemon(5, "Charmeleon", new Tipo("Fire", ""), new Status(58, 64, 58, 80, 65)));
        pokemons.add(new Pokemon(6, "Charizard", new Tipo("Fire", "Flying"), new Status(78, 104, 78, 159, 100)));
        pokemons.add(new Pokemon(7, "Squirtle", new Tipo("Water", ""), new Status(44, 48, 65, 50, 64)));
        pokemons.add(new Pokemon(8, "Wartortle", new Tipo("Water", ""), new Status(59, 63, 80, 65, 80)));
        pokemons.add(new Pokemon(9, "Blastoise", new Tipo("Water", ""), new Status(79, 83, 100, 85, 105)));
        pokemons.add(new Pokemon(10, "Caterpie", new Tipo("Bug", ""), new Status(45, 30, 35, 20, 20)));
        pokemons.add(new Pokemon(11, "Metapod", new Tipo("Bug", ""), new Status(50, 20, 55, 25, 25)));
        pokemons.add(new Pokemon(12, "Butterfree", new Tipo("Bug", " Flying"), new Status(60, 45, 50, 80, 80)));
        pokemons.add(new Pokemon(13, "Weedle", new Tipo("Bug", " Poison"), new Status(40, 35, 30, 20, 20)));
        pokemons.add(new Pokemon(14, "Kakuna", new Tipo("Bug", " Poison"), new Status(45, 25, 50, 25, 25)));
        pokemons.add(new Pokemon(15, "Beedrill", new Tipo("Bug", " Poison"), new Status(65, 80, 40, 45, 85)));
        pokemons.add(new Pokemon(16, "Pidgey", new Tipo("Normal", " Flying"), new Status(40, 45, 40, 35, 56)));
        pokemons.add(new Pokemon(17, "Pidgeotto", new Tipo("Normal", " Flying"), new Status(63, 60, 55, 50, 50)));
        pokemons.add(new Pokemon(18, "Pidgeot", new Tipo("Normal", " Flying"), new Status(83, 80, 75, 70, 70)));
        pokemons.add(new Pokemon(19, "Rattata", new Tipo("Normal", ""), new Status(30, 56, 35, 25, 35)));
        pokemons.add(new Pokemon(20, "Raticate", new Tipo("Normal", ""), new Status(75, 71, 70, 40, 80)));
        pokemons.add(new Pokemon(21, "Spearow", new Tipo("Normal", "Flying"), new Status(40, 60, 30, 31, 31)));
        pokemons.add(new Pokemon(22, "Fearow", new Tipo("Normal", "Flying"), new Status(65, 90, 65, 61, 61)));
        pokemons.add(new Pokemon(23, "Ekans", new Tipo("Poison", ""), new Status(35, 60, 44, 40, 54)));
        pokemons.add(new Pokemon(24, "Arbok", new Tipo("Poison", ""), new Status(60, 85, 69, 65, 79)));
        pokemons.add(new Pokemon(25, "Pikachu", new Tipo("Eletric", ""), new Status(35, 55, 30, 50, 40)));
        pokemons.add(new Pokemon(26, "Raichu", new Tipo("Eletric", ""), new Status(60, 90, 55, 90, 80)));
        pokemons.add(new Pokemon(27, "Sandshrew", new Tipo("Ground", ""), new Status(50, 75, 85, 20, 30)));
        pokemons.add(new Pokemon(28, "Sandshrew", new Tipo("Ground", ""), new Status(75, 100, 110, 45, 55)));
        pokemons.add(new Pokemon(29, "Nidoran", new Tipo("Poison", ""), new Status(55, 47, 52, 40, 40)));
        pokemons.add(new Pokemon(30, "Nidorina", new Tipo("Poison", ""), new Status(70, 62, 67, 55, 55)));
        
        /*
        ACIMA O 'BANCO'POPULADO
        */
        
        int indice = 1; //AUXILIA NA SELEÇAO 
        int quantia = pokemons.size(); //USADO PARA GUARDAR NA POSICAO CORRETO DO ARRAY
        while(indice != 0){
            System.out.println("PokeDéx:\nDigite o numero do Pokémon a consultar\n100 - listar todos\n101 - cadastrar um novo\nNo momento estão cadastrados todos, até a posição 30\n0 - Encerrar.");
            indice = le.nextInt();
            if(indice == 0)
                System.out.println("Saiu");
            else if(indice ==100){
                for(Pokemon pokemon:pokemons)
                pokemon.mostra();
            }else if(indice == 101){
                quantia += 1;
                System.out.println("Insira o Nome e em seguida Tipo1 e Tipo2");
                System.out.println("Aperte 'ENTER', para confirmar cada item cadastrado");
                System.out.println("OBS: POR PADRAO TODOS OS NOVOS IRAO COMEÇAR COM STATUS PADROES");
                //SERA RECOLHIDO AS INFORMAÇOES ABAIXO
                pokemons.add(new Pokemon(quantia, le.next(), new Tipo(le.next(), le.next()), new Status(30, 30, 20, 35, 35)));
            }else
                pokemons.get(indice -1).mostra();
            
        }
    }
}

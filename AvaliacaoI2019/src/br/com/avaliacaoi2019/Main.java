package br.com.avaliacaoi2019;
import java.util.ArrayList;
/**
 *
 * @author Matheus
 */
public class Main {
    private final ArrayList<Time>lista_time = new ArrayList<>();
    private final ArrayList<Jogador>lista_jogador = new ArrayList<>();
    private final ArrayList<Campeonato>lista_campeonato = new ArrayList<>();
    
    public static void main(String[] args) {
        Main m = new Main();
        
        /*TIME*/
        Time t = new Time();
        
        t.setNome("Flamengo");
        t.setNomeEstadio("Maracanã");
        t.setEstado("São Paulo");
        t.setCores("Rubro-Negro");
        
        m.lista_time.add(t);
        
        /*JOGADOR*/
        Jogador j = new Jogador();
        
        j.setNome("Matheus");
        j.setIdade(21);
        j.setEmail("vssmatheus@gmail.com");
        j.setCpf("06141865100");
        j.setSalario(20000);
        
        m.lista_jogador.add(j);
        
        /*CAMPEONATO*/
        
        Campeonato c = new Campeonato();
        
        c.setDivisao(2);
        c.setNomeCampeonato("Brasileirão");
        c.setPais("Brasil");
        
        m.lista_campeonato.add(c);
        //t.setCampeonato(m.lista_campeonato);
        //j.setTime(m.lista_time);
        
        for(int i=0; i<m.lista_time.size();i++){
            System.out.println("Nome Time: "+
                m.lista_time.get(i).getNome());
            System.out.println("Nome estadio: "+
                m.lista_time.get(i).getNomeEstadio());
            System.out.println("Nome Estado: "+
                m.lista_time.get(i).getEstado());
            System.out.println("Nome Cores: "+
                m.lista_time.get(i).getCores());
            
            System.out.println("Nome Jogador: "+
                m.lista_jogador.get(i).getNome());
            System.out.println("cpf: "+
                m.lista_jogador.get(i).getCpf());
            System.out.println("Email: "+
                m.lista_jogador.get(i).getEmail());
            System.out.println("Idade Jogador: "+
                m.lista_jogador.get(i).getIdade());
            System.out.println("Salario: "+
                m.lista_jogador.get(i).getSalario());
            
            System.out.println("Nome Campeonato: "+
                m.lista_campeonato.get(i).getNomeCampeonato());
            System.out.println("Pais: "+
                m.lista_campeonato.get(i).getPais());
            System.out.println("Divisao: "+
                m.lista_campeonato.get(i).getDivisao());
            
            
        }
   
    }
    
}

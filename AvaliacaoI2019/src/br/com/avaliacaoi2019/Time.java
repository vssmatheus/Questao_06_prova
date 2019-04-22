package br.com.avaliacaoi2019;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
class Time {
    private String nome;
    private String cores;
    private String estado;
    private String nomeEstadio;
    private Campeonato campeonato;
    
    /*GATTERS AND SETTERS*/

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCores() {
        return this.cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNomeEstadio() {
        return this.nomeEstadio;
    }

    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }

    public Campeonato getCampeonato() {
        return this.campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    void setCampeonato(ArrayList<Campeonato> lista_campeonato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

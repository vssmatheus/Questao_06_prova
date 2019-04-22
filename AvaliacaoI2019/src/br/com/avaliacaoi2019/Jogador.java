package br.com.avaliacaoi2019;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Jogador {

    String nome;
    private String cpf;
    private int idade;
    private String email;
    private String telefone;
    private double salario;
    private ArrayList<Time> time;

    /*GATTERS AND SETTERS*/
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public ArrayList<Time> getTime() {
        return this.time;
    }

    public void setTime(ArrayList<Time> t ){
        this.time = t;
    }
    
    public String retornaMaiusculo(Jogador j){
        return j.toUpperCase();
    }

    private String toUpperCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

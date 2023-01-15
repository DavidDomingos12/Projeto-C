/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Herança_pai.Pessoa;

/**
 *
 * @author David
 */
public class Coordenador extends Pessoa 
{
    private String formacao;
    private String dataInicioContrato;
    private String dataFimContrato;

    public Coordenador(String formacao, String dataInicioContrato, String dataFimContrato, String nome, String email, String telefone, String cpf) {
        super(nome, email, telefone, cpf);
        this.formacao = formacao;
        this.dataInicioContrato = dataInicioContrato;
        this.dataFimContrato = dataFimContrato;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDataInicioContrato() {
        return dataInicioContrato;
    }

    public void setDataInicioContrato(String dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }

    public String getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(String dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
 
 }

   
   
    


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
public class Professor extends Pessoa
{
    private String formacao;

    public Professor(String formacao, String nome, String email, String telefone, String cpf)
    {
        super(nome, email, telefone, cpf);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}


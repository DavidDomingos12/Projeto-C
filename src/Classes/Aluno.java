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
public class Aluno extends Pessoa 
{
    private Curso cursos;
    private String matricula;
    private String dataMatricula;

    public Aluno(Curso cursos, String matricula, String dataMatricula, String nome, String email, String telefone, String cpf) 
    {
        super(nome, email, telefone, cpf);
        this.cursos = cursos;
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    
    public String obterInfo()
    {
        String info = "Nome do Aluno: " + this.nome + "Matricula: " + this.matricula + "\n"
                      + "data da matricula: " + this.dataMatricula + "Seu curso: " + this.cursos;       
        return info;
    }
    
    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
  
   
}

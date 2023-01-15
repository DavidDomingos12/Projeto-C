/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;


/**
 *
 * @author David
 * /*
       Professor professor = new Professor(formacaoProfessor, curso, nomeProfessor, emailProfessor, telefoneProfessor, cpfProfessor);
        Coordenador coordenador = new Coordenador();
        Aluno aluno = new Aluno(curso, nomeAluno, emailAluno, telefoneAluno, cpfAluno, matriculaAluno, dataAluno);    
        * 
        *    
    
    public String nome;
    public String email;
    public String telefone;
    public String cpf;
    private String formacao;
    private String dataInicioContrato;
    private String dataFimContrato;
        */
 
public class CadastroController 
{  
        Scanner scan = new Scanner(System.in);
        //ALUNO
        String nomeAluno, matriculaAluno, dataAluno, emailAluno, telefoneAluno, cpfAluno;
        //PROFESSOR
        String nomeProfessor, emailProfessor, telefoneProfessor, cpfProfessor, formacaoProfessor;
        //COORDENADOR
        String nomeCoordenador, emailCoordenador, telefoneCoordenador, cpfCoordenador, formacaoCoordenador, dtIniContratoCoordenador, dtFContratoCoordenador; 
        //CURSO
        String nomeCurso;
        
        Professor professor = new Professor(formacaoProfessor, nomeProfessor, emailProfessor, telefoneProfessor, cpfProfessor);
        Coordenador coordenador = new Coordenador(nomeCoordenador, emailCoordenador, telefoneCoordenador, cpfCoordenador, formacaoCoordenador,
        dtIniContratoCoordenador, dtFContratoCoordenador);
        
            
        public void CadastroAluno()
        {
        System.out.println(" --------- Sistema de cadastro de alunos ---------");
                                        System.out.println("");
        System.out.println("Digite o Curso do aluno: ");
        nomeCurso = scan.nextLine();
        System.out.println("Digite o email do aluno: ");
        emailAluno = scan.nextLine();     
        System.out.println("Digite o telefone do aluno: ");
        telefoneAluno = scan.nextLine();      
        System.out.println("Digite o cpf do aluno: ");
        cpfAluno = scan.nextLine();      
        System.out.println("Digite a matricula do aluno: ");
        matriculaAluno = scan.nextLine();        
        System.out.println("Digite a data de matricula do aluno: ");
        dataAluno = scan.nextLine();                    
        System.out.println("Digite o nome do aluno: ");
        nomeAluno = scan.nextLine();       
        
        //Curso curso = new Curso();
        //Aluno aluno = new Aluno(curso.setNome(nomeCurso),nomeAluno, emailAluno, telefoneAluno, cpfAluno, matriculaAluno, dataAluno);      
        }
    }           



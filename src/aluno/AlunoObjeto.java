package aluno;

import java.util.Scanner;

import model.Aluno;

public class AlunoObjeto {

	public static void main(String[] args) {
		Aluno aluno1=new Aluno();
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite a matricula do Aluno: ");
		aluno1.matricula=sc.nextInt();
		
		System.out.println("Digite o nome do Aluno: ");
		aluno1.nome=sc.next();

		System.out.println("Digite a nota da primeira prova: ");
		aluno1.nota1=sc.nextDouble();
		
		System.out.println("Digite a nota da segunda prova: ");
		aluno1.nota2=sc.nextDouble();
		
		
		aluno1.CalculaMedia();
        System.out.println("Boletim do Aluno");
        System.out.println("Matricula do aluno: "+aluno1.matricula);
        System.out.println("Nome do aluno: "+aluno1.nome);
        System.out.println("Primeira nota do Aluno: "+aluno1.nota1);
        System.out.println("Segunda nota do Aluno: "+aluno1.nota2);
        System.out.println("Media do aluno"+aluno1.media);
		
		
		
		

	}

}

package aluno;

public class Aluno {
	
	public int matricula;
	public String nome;
	public Double nota1;
	public Double nota2;
	public Double media;
	

	public Aluno() {
		
	}

	public Aluno(int matricula, String nome, Double nota1, Double nota2, Double media) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media =(this.nota1+this.nota2)/2;
	}
	
	public Double CalculaMedia() {
		this.media =(this.nota1+this.nota2)/2;
		return media;
	}
	

}

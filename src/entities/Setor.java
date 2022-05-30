package entities;

public class Setor {
	private int codigo;
	private String nome;

	public Setor(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome Do Setor: " + nome + "\nCodigo Do Setor: " + codigo;
	}

	public String toString1() {
		return "Orgão: " + nome;
	}

}
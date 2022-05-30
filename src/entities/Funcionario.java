package entities;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
	private String numeroRegistro;
	private String cargo;

	private ArrayList<Processo> processos = new ArrayList<>();

	public Funcionario(String nome, String cpf, String email, String telefone, String numeroRegistro, String cargo) {
		super(nome, cpf, email, telefone);
		this.numeroRegistro = numeroRegistro;
		this.cargo = cargo;
	}
	

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void addProcesso(Processo processo) {
		processos.add(processo);
	}

	public void removeProcesso(Processo processo) {
		processos.remove(processo);
	}
	public ArrayList<Processo> getListProcessos() {
		return processos;
	}


	@Override
	public String toString() {
		return "\nNumero de Registro: " + numeroRegistro + "\nNome: " + super.getNome() + "\nCpf: " + super.getCpf()
				+ "\nEmail: " + super.getEmail() + "\nTelefone: " + super.getTelefone() + "\nCargo: " + cargo;
	}

}

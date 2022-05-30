package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Historico {

	private String dataEncaminhamento;
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date data = new Date();
	private Processo processo;
	private Setor setorDestino;
	/*
	 * private String orgao; private String parecer;
	 */
	private boolean processoConcluido;

	public Historico(boolean processoConcluido,Setor setorDestino/*,Processo processo*/) {
		this.dataEncaminhamento = sdf1.format(data);
		this.processoConcluido = processoConcluido; // retornar Em analise ou concluido
		this.setorDestino = setorDestino;
		/*this.processo = processo;*/

		
	}

	public Setor getSetor() {
		return setorDestino;
	}
	public void setSetor(Setor setor) {
		this.setorDestino = setor;
	}
	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public String getDataEncaminhamento() {
		return dataEncaminhamento;
	}

	public void setDataEncaminhamento(String dataEncaminhamento) {
		this.dataEncaminhamento = dataEncaminhamento;
	}

	public boolean isProcessoConcluido() {
		return processoConcluido;
	}

	public void setProcessoConcluido(boolean processoConcluido) {
		this.processoConcluido = processoConcluido;
	}
	public String toString() {
		return "\nData de Encaminhamento: " + dataEncaminhamento + "\nParecer: " + processo + "\n" + setorDestino.toString1() + "\n";
	}


}

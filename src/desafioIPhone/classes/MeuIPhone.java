package desafioIPhone.classes;

import desafioIPhone.interfaces.AparelhoTelefonico;
import desafioIPhone.interfaces.Navegador;
import desafioIPhone.interfaces.ReprodutorMusical;

public class MeuIPhone implements AparelhoTelefonico, ReprodutorMusical, Navegador {

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo página browser IPhone...");
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba browser IPhone...");
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página browser IPhone...");
		
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando música no IPhone...");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando música no IPhone...");
		
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Selecionando música no IPhone...");
		
	}

	@Override
	public void ligar(String numeroTelefone) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para número " + numeroTelefone +" no IPhone...");
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo ligação no IPhone...");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz no IPhone...");
		
	}

}

package desafioIPhone.classes;

public class MainPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MeuIPhone iPhone = new MeuIPhone();
		
		iPhone.exibirPagina();
		iPhone.atualizarPagina();
		iPhone.adicionarNovaAba();
		
		iPhone.selecionarMusica();
		iPhone.tocar();
		iPhone.pausar();
		
		iPhone.ligar("11 98209-5878");
		iPhone.atender();
		iPhone.iniciarCorreioDeVoz();

	}

}

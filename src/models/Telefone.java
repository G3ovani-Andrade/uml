package models;

import interfaces.IAparelhoTelefonico;
import interfaces.INavegadorInternet;
import interfaces.IReprodutorMusical;

public class Telefone implements IReprodutorMusical, INavegadorInternet , IAparelhoTelefonico{

	@Override
	public void tocar() {
		System.out.println("Tocando música");
	}

	@Override
	public void pausar() {
		System.out.println( "Pausar música" );
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println( "Música selecionada " + musica );
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println( "Exibir Página " + url );
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println( "Adicionar aba" );
	}

	@Override
	public void atualizarPagina() {
		System.out.println( "Atualizar Página" );
	}

	@Override
	public void ligar(String numero) {
		System.out.println( "Ligando para o número " + numero );
	}

	@Override
	public void atender() {
		System.out.println( "Atender telefone" );
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println( "Iniciar correio voz" );
	}

}

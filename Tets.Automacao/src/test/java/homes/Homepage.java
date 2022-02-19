package homes;

import java.io.IOException;

import elemento.Elemento;
import metodos.Metodos;

public class Homepage {
	Metodos metodos = new Metodos();
	Elemento el = new Elemento();

	public void encontraProduto() {
		metodos.escrever(el.getPesquisa(), "Livros");
		metodos.submit(el.getPesquisa());
	}

	public void produtoEncontrado() {
		metodos.listaDelivros("5");
		metodos.click(el.getEscolhoProduto());
	}

	public void produtoValidado() {
		try {
			metodos.validaTexto("Fazer login", el.getTextoValidado());
		} catch (Exception e) {
			System.err.println("------------------Erro ao digita-----------------" + e.getMessage());
			System.err.println("------------------Causa do erro-----------------" + e.getCause());
		}
	}

	public void fecharNavegador() throws IOException {
		try {
			metodos.screenShot("foto");
			metodos.fecharNavegador();
		} catch (Exception e) {
			System.err.println("------------------Erro ao digita-----------------" + e.getMessage());
			System.err.println("------------------Causa do erro-----------------" + e.getCause());
		}
	}
	
	public void produtoMaisVendido() {
		try {
			metodos.click(el.getTodosprodutos());
			metodos.click(el.getMaisvendido());
			metodos.click(el.getConstrocao());
		} catch (Exception e) {
			System.err.println("------------------Erro ao digita-----------------" + e.getMessage());
			System.err.println("------------------Causa do erro-----------------" + e.getCause());		
			
		}
	}

	public void escolhaProdutor() {
		try {
			metodos.listaConstrucao("2");
			metodos.click(el.getEscolhoProduto());
		} catch (Exception e) {
			System.err.println("------------------Erro ao digita-----------------" + e.getMessage());
			System.err.println("------------------Causa do erro-----------------" + e.getCause());		
			
		}
	}

	public void textoValido() {
		try {
			metodos.validaTexto("Fazer login", el.getTextoValidado());
		} catch (Exception e) {
			System.err.println("------------------Erro ao digita-----------------" + e.getMessage());
			System.err.println("------------------Causa do erro-----------------" + e.getCause());				}
	}
}

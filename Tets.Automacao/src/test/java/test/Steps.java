package test;

import java.io.IOException;

import homes.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegadores.Navegadores;

public class Steps {

	Navegadores navegadores = new Navegadores();
	Homepage home = new Homepage();

	@Given("que eu esteje no {string}")
	public void que_eu_esteje_no(String string) {
		navegadores.acessaNavegadores(string, "Chrome");
	}

	@Then("pesquiso por produto")
	public void pesquiso_por_produto() {
		home.encontraProduto();
	}

	@Then("encotro o produto")
	public void encotro_o_produto() {
		home.produtoEncontrado();
	}

	@When("Valido o produto")
	public void valido_o_produto() {

		home.produtoValidado();
	}

	@Then("fecho o navegador")
	public void fecho_o_navegador() throws IOException {
		home.fecharNavegador();
	}
	
	@Then("pesquiso por produto mais vendindo")
	public void pesquiso_por_produto_mais_vendindo() {
		home.produtoMaisVendido();
	}

	@Then("acho o produto")
	public void acho_o_produto() {
		home.escolhaProdutor();
	}

	@When("achar o produto valido ele")
	public void achar_o_produto_valido_ele() {
		home.textoValido();
	}

	@When("fecho site")
	public void fecho_site() throws IOException {
		home.fecharNavegador();
	}
}
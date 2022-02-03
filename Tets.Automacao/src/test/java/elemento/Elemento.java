package elemento;

import org.openqa.selenium.By;

public class Elemento {

	private By pesquisa = By.id("twotabsearchtextbox");
	private By escolhoProduto = By.id("buy-now-button");
	private By textoValidado = By.xpath("//*[@class='a-spacing-small']");
	private By Todosprodutos = By.xpath("//a[@href='javascript: void(0)']");
	private By Maisvendido = By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']");
	private By Constrocao = By.xpath("//a[@href='/gp/bestsellers/hi/ref=zg_bs_nav_0']");
	private By CabodeEntrada = By.id("gridItemRoot");
	
	public By getPesquisa() {
		return pesquisa;
	}

	public By getEscolhoProduto() {
		return escolhoProduto;
	}

	public By getTextoValidado() {
		return textoValidado;
	}

	public By getTodosprodutos() {
		return Todosprodutos;
	}

	public By getMaisvendido() {
		return Maisvendido;
	}

	public By getConstrocao() {
		return Constrocao;
	}

	public By getCabodeEntrada() {
		return CabodeEntrada;
	}
}

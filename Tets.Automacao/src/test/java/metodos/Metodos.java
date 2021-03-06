package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import navegadores.Navegadores;

public class Metodos extends Navegadores {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void click(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}
	}

	public void espera() {
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}

	}

	public void validaTexto(String texto, By elemento) {
		try {
			String textocapturado = driver.findElement(elemento).getText();
			assertEquals(texto, textocapturado);
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}
	}

	public void screenShot(String foto) throws IOException {
		try {
			TakesScreenshot shot = ((TakesScreenshot) driver);
			File srcFile = shot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/evidencia" + foto + ".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}
	}

	public void validaCookie(By elemento) {
		try {
			int contador = 3;
			WebElement element1 = driver.findElement(elemento);
			while (element1.isDisplayed() && contador > 0) {
				element1.click();
				contador--;
			}
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}
	}

	public void listaDelivros(String livro) {
		try {
			driver.findElement(
					By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[" + livro + "]/div/div")).click();
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}
	}

	public void fecharNavegador() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}
	}

	public void listaConstrucao(String lista) {
		try {
			driver.findElement(
					By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/div/div/div[2]/div[1]/div[1]/div["+ lista +"]/div/div[2]")).click();
		} catch (Exception e) {
			System.err.println("------------Erro ao digita-------------" + e.getMessage());
			System.err.println("------------Causa do erro--------------" + e.getCause());
		}

	}
}
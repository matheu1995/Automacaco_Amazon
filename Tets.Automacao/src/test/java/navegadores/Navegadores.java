package navegadores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navegadores {

	public static WebDriver driver;

	public void acessaNavegadores(String site, String navegadores) {
		try {
			if (navegadores.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

				ChromeOptions  options = new ChromeOptions();
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--headless");
                

				driver = new ChromeDriver(options);
			} else if (navegadores.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (navegadores.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", ",/driver/msedgedriver.exe");
			}
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("------------------Erro ao digita-----------------" + e.getMessage());
			System.err.println("------------------Causa do erro-----------------" + e.getCause());

		}
	}

}

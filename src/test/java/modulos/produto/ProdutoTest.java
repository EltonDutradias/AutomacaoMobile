package modulos.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@DisplayName("Teste Mobile do Módulo de Produto")
public class ProdutoTest {
    @DisplayName("Validação do valor de Produto Não Permitido")
    @Test
    public void testValidacaoDoValorDeProdutoNaoPermitido () throws MalformedURLException {
        //Abrir o App
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platform", "Android");
        capacidades.setCapability("udid", "192.168.115.102:5555");
        capacidades.setCapability("appPackage","com.lojinha");
        capacidades.setCapability("appActivity","com.lojinha.ui.MainActivity");
        capacidades.setCapability("app","C:\\Users\\elton\\Desktop\\Lojinha Nativa\\lojinha-nativa.apk");

        WebDriver app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);

        //Fazer login
        app.findElement(By.id("com.lojinha:id/user")).click();
        app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys("admin");

        app.findElement(By.id("com.lojinha:id/password")).click();
        app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys("admin");

        app.findElement(By.id("com.lojinha:id/loginButton")).click();

        //Abrir formulário de novo produto

        //Cadastrar produto com valor inválido

        //Validar que a mensagem de valor inválido foi apresentada
    }
}

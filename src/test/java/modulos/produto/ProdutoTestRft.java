package modulos.produto;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@DisplayName("Testes Mobile do Módulo de Produtos")
public class ProdutoTestRft {

    private  WebDriver app;


    @BeforeEach
    public void beforeEach() throws MalformedURLException {
    //Abrir App
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platform", "Android");
        capacidades.setCapability("udid", "192.168.115.103:5555");
        capacidades.setCapability("appPackage","com.lojinha");
        capacidades.setCapability("appActivity","com.lojinha.ui.MainActivity");
        capacidades.setCapability("app","C:\\Users\\elton\\Desktop\\Lojinha Nativa\\lojinha-nativa.apk");

        this.app = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
       this.app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    @DisplayName("Validação do valor de Produto Não Permitido")
    public void testValidacaoDoValorDeProdutoNaoPermitido () {
        //Fazer login
        String mensagemApresentada = new LoginPage(app)
                .informaOUsuario("admin")
                .informarASenha("admin")
                .submeterFormularioDeLogin()
                .acessarFormularioNovoProduto()
                .informarNomeDoProduto("Dell")
                .informarValorDoProduto("700001")
                .informarCoresDoProduto("Prata")
                .submeterFormularioDeAdicaoComErro()
                .capturarMensagemApresentada();

        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemApresentada);

    }
}

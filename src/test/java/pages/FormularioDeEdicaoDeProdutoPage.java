package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeEdicaoDeProdutoPage {
    private WebDriver app;
    public FormularioDeEdicaoDeProdutoPage (WebDriver app){this.app = app;}
    public String capturarMensagemApresentada (){
      return app.findElement(By.xpath("//android.widget.Toast")).getText();
    }

}

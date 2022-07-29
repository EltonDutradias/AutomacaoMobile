package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioDeAdicaoDeProdutoPage {
    private WebDriver app;
    public FormularioDeAdicaoDeProdutoPage (WebDriver app){this.app = app;}

    public FormularioDeAdicaoDeProdutoPage informarNomeDoProduto (String produtoNome){
        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoNome);
        return this;
    }
    public FormularioDeAdicaoDeProdutoPage informarValorDoProduto (String produtoValor){
        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoValor);
        return this;
    }

    public  FormularioDeAdicaoDeProdutoPage informarCoresDoProduto (String produtoCor){
        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoCor);
        return this;
    }

    public FormularioDeAdicaoDeProdutoPage submeterFormularioDeAdicaoComErro (){
        app.findElement(By.id("com.lojinha:id/saveButton")).click();
        return new FormularioDeAdicaoDeProdutoPage(app);
    }
//    public FormularioDeEdicaoDeProdutoPage submeterFormularioDeAdicaoComSucesso (){
//        app.findElement(By.id("com.lojinha:id/saveButton")).click();
//        return new FormularioDeEdicaoDeProdutoPage(app);
//    }

    public String capturarMensagemApresentada(){
        return app.findElement(By.xpath("//android.widget.Toast")).getText();

    }





}

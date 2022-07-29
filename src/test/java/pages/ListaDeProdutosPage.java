package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaDeProdutosPage {
    private WebDriver app;
    public ListaDeProdutosPage(WebDriver app){this.app = app;}
    public FormularioDeAdicaoDeProdutoPage acessarFormularioNovoProduto(){
        //Abrir formulário de novo produto
        app.findElement(By.id("com.lojinha:id/floatingActionButton")).click();
        return new FormularioDeAdicaoDeProdutoPage(app);
    }
    public String capturarMensagemApresentada(){
        return app.findElement(By.xpath("//android.widget.Toast")).getText();

    }


}

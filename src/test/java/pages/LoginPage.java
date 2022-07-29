package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver app;

    public LoginPage(WebDriver app) { this.app = app; }

    public LoginPage informaOUsuario( String usuario){
        //fazer Login
        app.findElement(By.id("com.lojinha:id/user")).click();
        app.findElement(By.id("com.lojinha:id/user")).findElement(By.id("com.lojinha:id/editText")).sendKeys(usuario);
        return this;
    }

    public  LoginPage informarASenha (String senha){
        app.findElement(By.id("com.lojinha:id/password")).click();
        app.findElement(By.id("com.lojinha:id/password")).findElement(By.id("com.lojinha:id/editText")).sendKeys(senha);
        return this;
    }

    public ListaDeProdutosPage submeterFormularioDeLogin(){
        app.findElement(By.id("com.lojinha:id/loginButton")).click();

        return new ListaDeProdutosPage(app);

    }

}

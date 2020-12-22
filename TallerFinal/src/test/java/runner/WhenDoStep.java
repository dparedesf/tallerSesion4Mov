package runner;

import activities.MainScreen;
import activities.RecordatorioFormScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class WhenDoStep {
    private RecordatorioFormScreen recordatorioFormScreen= new RecordatorioFormScreen();
    private MainScreen mainScreen= new MainScreen();


    @Given("yo abro el aplicativo en el whenDo app")
    public void yoAbroElAplicativoEnElWhenDoApp() {
    }

    @When("yo realizo click en el boton [agregarAlarma]  en el main screen")
    public void yoRealizoClickEnElBotonAgregarAlarmaEnElMainScreen() throws MalformedURLException {
        mainScreen.agregarAlarmaButton.click();
    }

    @And("yo realizo click en el boton [fijarRecordatorio] en la pantalla recordatorio")
    public void yoRealizoClickEnElBotonFijarRecordatorioEnLaPantallaRecordatorio() throws MalformedURLException {
        recordatorioFormScreen.fijarRecordatorioButton.click();
    }

    @And("yo realizo click en el boton [ingresarFechaLimite] en la pantalla recordatorio")
    public void yoRealizoClickEnElBotonIngresarFechaLimiteEnLaPantallaRecordatorio() throws MalformedURLException {
        recordatorioFormScreen.fijarFechaLimiteLabel.click();
        recordatorioFormScreen.seleccionFechaButton.click();
        recordatorioFormScreen.aceptarFechaButton.click();
    }

    @And("yo realizo click en el boton[fijarHora] en la pantalla recordatorio")
    public void yoRealizoClickEnElBotonFijarHoraEnLaPantallaRecordatorio() throws MalformedURLException {
        recordatorioFormScreen.fijarHoraLabel.click();
        recordatorioFormScreen.escogerHoraButton.click();
        recordatorioFormScreen.escogerMinutoButton.click();
        recordatorioFormScreen.aceptarHora.click();

    }

    @And("yo realizo click en el boton[recordarATiempo] en la pantalla recordatorio")
    public void yoRealizoClickEnElBotonRecordarATiempoEnLaPantallaRecordatorio() throws MalformedURLException {
        recordatorioFormScreen.agregarRecordatorioLabel.click();
        recordatorioFormScreen.recordarCheckBox.click();
        recordatorioFormScreen.fijarFrecuenciaLabel.click();
        recordatorioFormScreen.repetirCheckBox.click();
    }

    @And("yo lleno la caja de texto [titulo] con : {string} en la pantalla recordatorio")
    public void yoLlenoLaCajaDeTextoTituloConEnLaPantallaRecordatorio(String titulo) throws MalformedURLException {
        recordatorioFormScreen.tituloTextBox.type(titulo);
    }

    @And("yo lleno la caja de texto [notas] con : {string} en la pantalla recordatorio")
    public void yoLlenoLaCajaDeTextoNotasConEnLaPantallaRecordatorio(String nota) throws MalformedURLException {
        recordatorioFormScreen.notasTextBox.type(nota);

    }

    @And("yo realizo click en el boton [guardar] en la pantalla recordatorio")
    public void yoRealizoClickEnElBotonGuardarEnLaPantallaRecordatorio() throws MalformedURLException {
        recordatorioFormScreen.guardarRecordatorioButton.click();
    }

    @Then("yo deberia guardar el recordatorio : {string} este displaya")
    public void yoDeberiaGuardarElRecordatorioEsteDisplaya(String titulo) {
        Assert.assertTrue("ERROR el recordatorio no fue creado",mainScreen.tituloIsDisplayed(titulo));
    }
}

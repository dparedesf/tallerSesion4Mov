package cleanTest;
import activities.RecordatorioFormScreen;
import activities.MainScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoCleanTest {
    private RecordatorioFormScreen recordatorioFormScreen= new RecordatorioFormScreen();
    private MainScreen mainScreen= new MainScreen();

    @Test
    public void verifyCreaterecordatorio() throws MalformedURLException {

        String titulo="Titulo de Prueba";
        String notas="Notas de Prueba";


        mainScreen.agregarAlarmaButton.click();

        recordatorioFormScreen.fijarRecordatorioButton.click();
        recordatorioFormScreen.fijarFechaLimiteLabel.click();
        recordatorioFormScreen.seleccionFechaButton.click();
        recordatorioFormScreen.aceptarFechaButton.click();
        recordatorioFormScreen.fijarHoraLabel.click();
        recordatorioFormScreen.escogerHoraButton.click();
        recordatorioFormScreen.escogerMinutoButton.click();
        recordatorioFormScreen.aceptarHora.click();
        recordatorioFormScreen.agregarRecordatorioLabel.click();
        recordatorioFormScreen.fijarRecordatorioButton.click();
        recordatorioFormScreen.fijarFrecuenciaLabel.click();
        recordatorioFormScreen.repetirCheckBox.click();
        recordatorioFormScreen.tituloTextBox.type(titulo);
        recordatorioFormScreen.notasTextBox.type(notas);
        recordatorioFormScreen.guardarRecordatorioButton.click();

        Assert.assertTrue("ERROR el recordatorio no fue creado",mainScreen.tituloIsDisplayed(titulo));

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().killSession();
    }

}


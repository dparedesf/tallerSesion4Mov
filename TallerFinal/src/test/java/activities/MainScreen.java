package activities;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button agregarAlarmaButton= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public MainScreen(){}

    public boolean tituloIsDisplayed(String titulo){
        Label tituloLabel= new Label(By.xpath("//android.widget.TextView[@text='"+titulo+"']"));
        return tituloLabel.isDisplayedControl();
    }

}
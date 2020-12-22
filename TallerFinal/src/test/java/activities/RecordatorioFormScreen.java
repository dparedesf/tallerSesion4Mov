package activities;
import controlAppium.*;
import org.openqa.selenium.By;

public class RecordatorioFormScreen {

    public Button fijarRecordatorioButton= new Button(By.id("com.vrproductiveapps.whendo:id/note_item_reminder"));
    public Label fijarFechaLimiteLabel= new Label(By.id("com.vrproductiveapps.whendo:id/due_date"));
    public Button seleccionFechaButton= new Button(By.xpath("//android.view.View[@content-desc=\"31 December 2020\"]"));
    public Button aceptarFechaButton= new Button(By.id("android:id/button1"));
    public Label fijarHoraLabel= new Label(By.id("com.vrproductiveapps.whendo:id/time"));
    public Button escogerHoraButton= new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]"));
    public Button escogerMinutoButton= new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"25\"]"));
    public Button aceptarHora= new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));
    public Label agregarRecordatorioLabel= new Label(By.id("com.vrproductiveapps.whendo:id/reminder"));
    public RadioButton recordarCheckBox= new RadioButton(By.xpath("//android.widget.RadioButton[@text=\"15 minutes before\"]"));
    public Label fijarFrecuenciaLabel= new Label(By.id("com.vrproductiveapps.whendo:id/repeat"));
    public RadioButton repetirCheckBox= new RadioButton(By.xpath("//android.widget.RadioButton[@text=\"Daily\"]"));
    public TextBox tituloTextBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox notasTextBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button guardarRecordatorioButton= new Button(By.xpath("//android.widget.TextView[@content-desc=\"Save\"]"));
    public RecordatorioFormScreen(){}
}

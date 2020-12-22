Feature: Agregar recordatorio

  @RecordatorioClean
  Scenario: Crear Recordatorio

    Given yo abro el aplicativo en el whenDo app
    When yo realizo click en el boton [agregarAlarma]  en el main screen
    And yo realizo click en el boton [fijarRecordatorio] en la pantalla recordatorio
    And yo realizo click en el boton [ingresarFechaLimite] en la pantalla recordatorio
    And yo realizo click en el boton[fijarHora] en la pantalla recordatorio
    And yo realizo click en el boton[recordarATiempo] en la pantalla recordatorio
    And yo lleno la caja de texto [titulo] con : "Titulo de Prueba" en la pantalla recordatorio
    And yo lleno la caja de texto [notas] con : "Notas de Prueba" en la pantalla recordatorio
    And yo realizo click en el boton [guardar] en la pantalla recordatorio
    Then yo deberia guardar el recordatorio : "Titulo de Prueba" este displaya

#language: es
#Autor: Jesus Dorado C.

  Característica: Verificacion de tarifas cobradas a los clientes

    Como usuario de DxHotels
    Quiero realizar la busqueda de hoteles por localidad y por menor precio
    Para posterior verificar que el cobro total sea correcto a partir de la tarifa y dias de estadia

    @Escenario
  Esquema del escenario: : Verificacion de cobro total para hotel con menor precio

    Dado que Jesus ingresa a la pagina de DxHotels
    Cuando el diligencia el formulario para buscar un hotel con menor precio
    |ubicacion  |fechaIngreso|fechaSalida|numHabitaciones|numAdultos|numNinos|
    |<ubicacion>  |<fechaIngreso>|<fechaSalida>|<numHabitaciones>|<numAdultos>|<numNinos>|
    Entonces el verifica que el cobro total sea el correcto
      | fechaIngreso | fechaSalida |
      |<fechaIngreso>|<fechaSalida>|
      Ejemplos:
        |ubicacion  |fechaIngreso|fechaSalida|numHabitaciones|numAdultos|numNinos|
        | New York  | 12/14/2020 |12/24/2020 |1              |1         |0       |
        |Los Angeles| 12/14/2020 |12/20/2020 |1              |1         |0       |
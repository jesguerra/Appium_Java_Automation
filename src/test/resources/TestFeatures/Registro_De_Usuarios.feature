Feature: Registro de Usuarios
  Con el fin de poder registrame como usuario en la app
  Yo como usuario quiero poder registrarme
  Para poder hacer parte de la administracion de los usuarios

  @Smock
  Scenario Outline: Registro exitoso de usuario
    Given el usuario <name> es un usuario activo que quiere registrarse en la app en el sistema Operativo Android
    When el ingresa los datos solicitados para el registro
    Then el debe obtener el resumen del registro de usuario con los datos correctos <fullname> <username> <password> <email>
    Examples:
      | name      | username   |  password   |  email               | fullname          |
      | Johnathan | Jesguerra  |  1234       |  jesguerra@hotmail.es| Johnathan Esguerra|
      | Pepito    | Pperez     |  4567       |  perez@hotmail.es    | Pepito Perez      |
      | Alejo     | Aperez     |  87654      |  Aperez@hotmail.es   | Alejo Perez       |
      | Pacho     | Paperez    |  34521      |  Paperez@hotmail.es  | Pacho Perez       |
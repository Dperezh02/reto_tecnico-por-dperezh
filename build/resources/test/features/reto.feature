#Autora: Daniela Perez Henao

Feature: Realizar el diligenciamineto del formulario con el fin de crear un usuario
  Yo como usuario Quiero ingresar a la pagina Utest
  Para realizar la creación de un nuevo usuario

  @caso1
  Scenario Outline: ingresa a la pagina y crear usuario
    Given que Daniela ingresa a Utest
    And Selecciona el botón join Today
    When digita los campos
      |  strFirstname  |  strLastname  |  strEmail |   strLanguage  |   strCity  | strZipcode   |  strPassword  |  strConfirmPass  |
      | <strFirstname> | <strLastname> | <strEmail> | <strLanguage> |  <strCity> | <strZipcode> | <strPassword> | <strConfirmPass> |
    Then encuentra la opción de registro para acceder con el nuevo usuario creado

    Examples:
      | strFirstname | strLastname |     strEmail          | strLanguage |  strCity            | strZipcode | strPassword | strConfirmPass |
      |   Daniela    |   Perez     | danielaz2316@gmail.com | English     | Manizlaes, Colombia | 760004     | Prueba100*  | Prueba100*     |





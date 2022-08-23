# language: es

  Característica: Interactuar con varios elementos en la página demoqa.com
    Los elementos a interactuar seran elements, widgets y alerts,frame & windows

  @RegistroEnTabla
  Escenario: Agregar un nuevo registro en web tables
    Dado que se necesita agregar un nuevo registro
    Cuando se agrega un nuevo registro a la tabla
    Entonces se debe visualizar la tabla con todos los registros

  @EliminarRegistro
  Escenario: Eliminar un registro de web tables
    Dado que la tabla tiene registros ingresados
    Cuando necesito borrar un registro existente
    Entonces el registro es eliminado exitosamente

  @Fecha
  Escenario: Escoger fecha
    Dado que el usuario necesita establecer una agenda
    Cuando necesita escoger la fecha del compromiso
    Entonces el sistema debe indicar la fecha seleccionada

  @Alerta
  Escenario: Interactuar con alertas
    Dado que el usuario da click en un boton
    Cuando aparece la alerta
    Entonces el usuario debe confirmarla

  @AlertaConEspera
  Escenario: Interactuar con alertas de espera
    Dado que el usuario da click en un boton y debe esperar 5 segundos
    Cuando aparece la alerta en un tiempo esperado
    Entonces el usuario debe confirmarla manualmente

  @AlertaConConfirmacion
  Escenario: Interactuar con alertas de confirmacion
    Dado que el usuario da click en un boton
    Cuando aparece la alerta y la confirma
    Entonces el sistema debe generar la confirmacion

  @AlertaConCampo
  Escenario: Interactuar con alertas de llenado
    Dado que el usuario da click en un boton
    Cuando aparece la alerta y el usuario ingresa su nombre
    Entonces el sistema debe confirmar el ingreso del nombre del usuario
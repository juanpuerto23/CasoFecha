# CasoFecha

Supongamos que no tenemos acceso al código de la clase Fecha. Es decir, podemos utilizarla pero no la podemos modificar porque fue hecha por terceras partes. Hagamos de cuenta que no la desarrollamos nosotros. De este modo, supongamos que, aunque la clase Fecha nos resulta util, funciona bien y es muy práctica, queremos modificar la forma en que una fecha se representa a si misma cuando invocamos su método String.

La solución es crear una nueva clase (FechaDetallada) que hereda de Fecha y que modifique la manera en que esta se representa como cadena.
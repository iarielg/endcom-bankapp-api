
# EndCom Api

Una API para movimientos en bancos

### Tecnologias utilizadas
MySQL
Gradle
SpringBoot con las siguientes dependecias:
Spring Web, SpringData JPA, MySQL Driver
IDE: IntelliJ Code
Postman: para pruebas de la API (//localhost:8080/create-account/) y 
(//localhost:8080/movement/)

## Despliegue

Para desplegar la API: 
Se requiere levantar el servidor de MySQL
Java 16
Postman



## Referencia API

#### create-account/

```http
  GET /create-account/
  POST /create-account/
  PUT /create-account/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `id` | `int` | **Required**. Your API key |
|`name`|`string`| **Required**|
|`mail`|`string`|**Required**|
|`account`|`string`|**Required**|
|`balance`|`Float`|**Required**|


#### movement/

```http
  GET /movement/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
|`movementCode`|`String`|`**Required**|
|`description`|`String`|**Optional**|
|`amount`|`Float`|**Required**|
|`account`|`String`|**Required**|
|`date`|`String`|**Required**|

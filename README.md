# swaggertool-springboot-application


if you want use swagger tool add this dependency in pom.xml file
-----------------------------------------------------------------
```bash
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.6.4</version>
</dependency>
```


Swagger tool will open on browser link
--------------------------------------
```bash
http://localhost:8787/swagger-ui.html
```


downloading documentation format our total application details in one file
-------------------------------------------------------------------------
```bash
http://localhost:8787/v3/api-docs.yaml
```

Reference website 
------------------
```bash
https://www.baeldung.com/spring-rest-openapi-documentation
```

Json Response :
```json
{
    "order": {
        "id": 26,
        "name": "ear-phone",
        "qty": 5,
        "price": 4000
    },
    "amount": 4000,
    "transactionId": "9a021fa6-2061-4332-bdb7-b1358b3430c2",
    "message": "payment processing successful and order placed"
}



# Projeto

Sistema Batch em Java

# Banco de dados
    
Executar comandos no MySQL
        
CREATE DATABASE projeto_back;
	    
CREATE TABLE IF NOT EXISTS tb_customer_account (
id_customer INT(20) NOT NULL,
cpf_cnpj VARCHAR(50) NOT NULL,
nm_customer VARCHAR(255) NOT NULL,
is_active TINYINT(1) NOT NULL,
vl_total DECIMAL(5,2) NOT NULL,
PRIMARY KEY (ID_CUSTOMER));



# Autor

 ```
 Jonathan Roberto de Lana Pontes
 ```


# Licença

```
Apache 2.0
									
```

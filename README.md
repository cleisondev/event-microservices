# Event Microservices

## Descrição
O projeto **Event Microservices** é uma solução baseada em microsserviços para gerenciar eventos e notificções. Um dos principais componentes deste repositório é a integração com um microsserviço de envio de e-mails utilizando o Amazon Simple Email Service (SES).

## Tecnologias Utilizadas
- Java (versão X)
- Spring Boot
- Spring Cloud
- AWS SES
- Banco de Dados em Memória (H2)


## Estrutura do Projeto
O sistema é composto por diversos microsserviços, incluindo:
- **Event Service**: Responsável por gerenciar eventos.
- **Email Service**: Microsserviço que utiliza AWS SES para envio de e-mails.

## Requisitos
Antes de executar a aplicação, certifique-se de ter:
- Java e Maven instalados
- Uma conta AWS configurada para uso do SES


## Configuração
### Configuração no `application.properties`
Se preferir, configure diretamente no `application.properties`:

```properties
email.service.url=${EMAIL_SERVICE_URL}
```

## Execução

### Compilar e Executar

```bash
mvn clean install
java -jar target/event-microservices.jar
```

## Integração com o Microsserviço de E-mail
O **Event Service** chama o **Email Service** para envio de notificações por e-mail.

### Exemplo de Chamada
**POST** `/api/email/send`

**Payload:**
```json
{
  "to": "destinatario@example.com",
  "subject": "Novo Evento Criado",
  "body": "Detalhes do evento..."
}
```

## Testes
Para rodar os testes unitários:
```bash
mvn test
```


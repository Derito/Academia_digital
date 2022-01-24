# Projecto Academia_digital da DIO 
> Serve como base de estudo do Sping e da API Rest.
## Inovações ao projecto
> Adição da automação na criação de tabelas no banco PostgreSQL usando ***flyway***.
1. Inserção das pastas db/migration requeridas pelo flyway.
2. ### Dependência adicionada ao projecto original
```
<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-core</artifactId>
    <version>8.4.2</version>
</dependency>
```
3. Configuração no application.yml
```
 flyway:
    baselineOnMigrate: true
    check-location: true
    locations:
      classpath: db/migration
    schemas: public
    enabled: true
```

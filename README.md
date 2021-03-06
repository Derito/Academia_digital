# Projecto Academia_digital da DIO 
> Caso queira consulte o Projecto original existente no **LINK** abaixo:
- [GitHub da Camila Cavalcante](https://github.com/cami-la/academia-digital.git)
- Serve como base de estudo do Spring e da API Rest.
- Modificado para questões de estudo.
> ***projecto Academia_digital***
## Inovações ao projecto
> ***Projecto Academia_digital***
Ao rodar o projecto original o Spring roda, carrega não dá erro nem gera tabelas.
- :point_right: Caso queira siga as orientações abaixo.
### :information_source: Primeira forma usada para resolver:
:warning: **Atenção:**
> Adição da automação na criação de tabelas no banco PostgreSQL usando ***flyway***.
1. Inserção das pastas db/migration requeridas pelo flyway.
2. Adição do script das tabelas na pasta migration.
3. Uso da Anotação @Builder nas entidades,
4. Só foi prossivel criar alunos no banco trocando o gerador sequencial de IDENTIFY para AUTO classe Aluno.
5. ### Dependência adicionada ao projecto original

```
<dependency>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-core</artifactId>
    <version>8.4.2</version>
</dependency>
```
5. Configuração adicional no application.yml
```
 flyway:
    baselineOnMigrate: true
    check-location: true
    locations:
      classpath: db/migration
    schemas: public
    enabled: true
```
> ***Projecto Academia_digital2***
### :information_source: Segunda forma usada para resolver:
:warning: **Atenção:**
- Para resolução do problema foi somente necessário adicionar a anotação @ComponetScan na main
- **Note:** com.dio.acabemiadigital_2 - Refere-se ao pacote generico criado na aplicação.
```
@ComponentScan(basePackages= {"com.dio.acabemiadigital_2"})
```

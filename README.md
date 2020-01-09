# JSF-Persistence

A Aplicação foi desenvolvida como Java Web com base Jave EE em JavaServer Faces conforme dito no item A do desafio de desenvolvimento da etapa de recrutamento da empresa 
ESIG.

O banco de dados utilizado para a implementação da persistencia de dados foi o MySQL junto com a framework Hibernate 4 mais a API JPA.

Itens da avaliação:

A - Foi utilizada JSF para a aplicação WEB, no quesito de gerenciamento de dados por meio de um ManagedBean.
B - Persistencia de dados atingida por meio da framework Hibernate em conjunto com JPA, banco de dados utilizado: MySQL. Os Dados adquiridos pela classe RegistroMB que é um ManagedBean são enviados para a classe DadosDAO ao qual tem função de salvar os dados adquiridos, listar, ou deletar, 
fazendo uso do objeto sessao, da classe Session da framework Hibernate, para o gerenciamento do banco de dados.
C - O Hibernate cuida de toda a parte de gerenciamento do banco de dados da aplicação.
F - Foi utilizado Bootstrap 4 para a estilização de toda a página.

Orientações:

Recomendações: Rodar a aplicação no Netbeans IDE 8.2, e o MySQL Server na sua versão 5.5.

1- Baixar e rodar o script de MySQL fornecido na pasta /* para a criação do banco de dados e tabelas a serem utilizadas no projeto.

2- Seguindo as recomendações, será necessário baixar e ativar os seguintes Plug-in's do Java EE: Java EE Base; JSF; Java Persistence; Hibernate.

3- Pode ser necessário a adição ou renomeação de certas bibliotecas dependendo da versão ou tipo de IDE;
  A- javaee-endorsed-api-7.0, localizada na pasta /libs;
  B- jandex-2.0.0.Final.jar, localizada na pasta /libs;

4- Adicionar e configurar usuario/senha do Apache Tomcat 9.0;

5- Adicionar conexão com o banco de dados "dbregistro", arquivo de configuração da conexão se encontra em /src/java/hibernate.cfg

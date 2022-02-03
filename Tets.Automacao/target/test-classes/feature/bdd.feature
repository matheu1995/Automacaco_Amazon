#Author: your.matheusosilva@gmail.com

@Regressivo
Feature: Automatiza site Amazon
Dado que eu esteje no site da amazon entao escolho um produto e faco a validacao

  Background: Entra no site
  Given que eu esteje no "https://www.amazon.com.br/"
  
  @tag1
  Scenario: Procura por livros
    Then pesquiso por produto
    And encotro o produto
    When Valido o produto
    Then fecho o navegador

 @tag2
 Scenario: Procura por Mais vendido
  Then pesquiso por produto mais vendindo
  And acho o produto
  When achar o produto valido ele
  And fecho site

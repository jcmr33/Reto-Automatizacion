Feature: Validate product in the cart
I as an customer,I want to add a product to the cart.

@TestCase1
  Scenario Outline: Validate that the product is added to the cart.
    Given Enter the website
    When Search the <Product>
    And Add <Product> in shopping cart
    And Clic in the minicart
    Then Validate that <Product> is in shopping cart

    Examples:
      | Product                                  |
      | LG Smart TV 86" 4K UHD 86UK6570 ThinQ AI |
     
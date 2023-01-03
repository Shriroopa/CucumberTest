Feature: Login

  Scenario: successful login with valid credentials
    Given user launch chrome browser
    When when user opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And when user enters email as "admin@yourstore.com" and password as "admin"
    And user clicks on login button
#    And click on books link
#    Then page title should be "nopCommerce demo store.Books"
    When user clicks on log out link
#    Then page title should be "nopCommerce demo store"
    And close browser

    Scenario Outline: Data driven login
      Given user launch chrome browser
      When when user opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
      And when user enters email as "<email>" and password as "<passWord>"
      And user clicks on login button
#    And click on books link
#    Then page title should be "nopCommerce demo store.Books"
      When user clicks on log out link
#    Then page title should be "nopCommerce demo store"
      And close browser
      Examples:
        | email | passWord |
      | admin@yourstore.com | admin |
      |admin1@yourstore.com | admin123|



















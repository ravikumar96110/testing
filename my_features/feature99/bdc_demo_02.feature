Feature: Guest user actions in Demo WebShop
@Regression

  Scenario: user choice to opt for an account
    Given user access the signup page
    And gets the credentials
    @Sanity

  Scenario: User access login page of the demo webshop
    Given user has valid account cred for Demowebshop
    And provide the valid valid cred as inputsfor the login process
    Then verifies the state for the login status

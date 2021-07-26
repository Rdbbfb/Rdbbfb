Feature: Login to Lordabbett.com
  I want to use this template for my feature file

  Scenario Outline: Login to Account from homepage
    Given I click on LA homepage
    And click on login button from homepage
    When I Enter <emailAddress> in Finacial professional first text box
    And enter <Password> on second text field
    And click on Login CTA button
    Then I should be successfully able to login to the page

    Examples: 
      | emailAddress             | Password |
      | rsadarama@lordabbett.com | password |
      | abc@gmail.com            | password |

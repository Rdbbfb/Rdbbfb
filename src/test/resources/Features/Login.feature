Feature: Verify for the login

  Scenario Outline: Title of your scenario outline
    Given facebook homepage
    When I check for the login in step with <name> and <password>
    Then Login successfull

    Examples: 
      | name      | password     |
      | rsadarama | xyz123       |
      | name2     | 7abcpassword |

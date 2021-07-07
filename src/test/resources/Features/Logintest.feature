Feature: Login test scenarios

  @leena
  Scenario Outline: Login
    Given Launch the browser
    And User navigate to tyhe application url
    And User enters the <id> and <password>
    And User clicks on login button
    Then User is logged in

    Examples: 
      | id     | password |
      | Raghav |    12345 |
      | Leena  |    12345 |

Feature: AdactinHotel Booking

  Scenario: Login Page
    Given Browser Launch
    When enter the userName and Password
      | NandhiniVijay |
      | nandhini@5    |
    Then click loginButton

  Scenario: Search Hotel
    When Enter the details
    And click Search
    Then Take Screenshot

  Scenario: Select Hotel
    When Enter the Details and click continueButton

  Scenario: Booking Hotel
    When Enter the detils and click
      | FirstName | LastName | Address | CardNo           | CvvNo |
      | Nandhini  | Prabhu   | Trichy  | 1234567890123456 |   123 |
    Then quit

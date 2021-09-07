Feature: Register Test
  Scenario Outline: Create an Account
    Given Navigate to Website
    And Click on sign button
    And type email "<Email>"
    And Click on Create Account Button
    And Type Firstname"<firstname>" and Lastname "<lastname>"
    And Type Password "<password>"
    And Type Address "<address>"
    And Type Company "<company>"
    Examples:
      | Email                 | firstname | lastname | password | address  | company |
      |joeblack129@gmail.com  |joe        |Black     |a123      |a apt 123M|Apple    |
      |jackybrown129@gmail.com|Jacky      |Brown     |b123      |b apt 456M|Siemens  |
      |johnnycash129@gmail.com|jhonny     |Cash      |c123      |c apt 789M|Toyota   |
      |johnnash129@gmail.com  |john       |Nash      |d123      |d apt 012M|Volvo    |
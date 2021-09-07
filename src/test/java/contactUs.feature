Feature: Contact Us Test
  Scenario: Go to website and test contact us page
    Given Navigate to website
    And Click on contact us button
    And Select subject heading
    And Type email
    And Type order reference
    And Type a message
    When Click on send button

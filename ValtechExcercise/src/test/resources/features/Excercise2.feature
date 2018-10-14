Feature: Exercise #2

Scenario: Assert that the recent blogs section is displaying

Given I am in homepage
Then I shall see the recent blogs section 

Scenario: Click on the first blog article and then assert that the page title is present

Given I am in homepage
When I click on first blog article
Then I shall see the first blog article 
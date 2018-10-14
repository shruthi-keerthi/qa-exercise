Feature: Excercise #3

Scenario: Navigate to About page and assert that h1 tag is displaying the relevant page name

Given I am in homepage
When I click on About 
Then I shall be navigated to About page

Scenario: Navigate to Services page and assert that h1 tag is displaying the relevant page name

Given I am in homepage
When I click on Services 
Then I shall be navigated to Services page

Scenario: Navigate to Work page and assert that h1 tag is displaying the relevant page name

Given I am in homepage
When I click on Work 
Then I shall be navigated to Work page

Scenario: Navigate to Contact page and checking the total Valtech offices

Given I am in homepage
And I click on About 
And I shall be navigated to About page
When I click on Our offices link
Then I shall be navigated to Contact Page
And I shall get the output of total Valtech offices
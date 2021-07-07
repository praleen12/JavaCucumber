Feature: Google search

@google
Scenario: Validate google search
Given Open Browser
And user is on search p[age
When user enter text in search box
And User cliccks on enter
Then user see the results


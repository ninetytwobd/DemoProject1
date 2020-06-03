Feature: Login 

@Sanity
Scenario: Verify user can login successfully
Given Open page "<URL>" 
Then Click on SignIN Button 
Then Click on SignIN Link
Then Enter user name Enter Password Click on Signin 
Then Verify user can login successfully

@Smook
Scenario: Verify Search result
Given Open page "<URL>" 
Then enter XPS in Search Field
Then Click on Search Button
Then Verify Search result



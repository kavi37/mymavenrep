  Feature: Test Login
  I want to use this template for my feature file

  
  Scenario Outline: To open 
    When Open TestMeApp
    And Enter username <new_signup>
    And Enter Password <password>
    And Enter username new <new_user>
    And Enter password new <new_psw>
    And Click search <pro>
    
    
 
 Examples: 
      | new_signup  | password    | new_user  | new_psw    |pro   |
      | kavi        |  kavi111    | kavi      | kavi111    |head  |
      | dharsh      |  dharsh111  | dharsh    | dharsh111  |carpe |
   

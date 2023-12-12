Feature: Create a new user (Sign up)
  As user of the Utest Website
  i need to Sign up to use the webpage

  Scenario Outline: Successful Sign Up
    Given the User has accessed the main page
    When the User tries to register his account
      | firstname   | lastname   | email   | birthday   | birthmonth   | birthyear   | language   |
      | <firstname> | <lastname> | <email> | <birthday> | <birthmonth> | <birthyear> | <language> |
    And the user adds the address
      | city   | zip   | country   |
      | <city> | <zip> | <country> |
    And the user adds his devices
      | computer   | versionpc   | languagepc   | mobile   | modelmobile   | osmobile   |
      | <computer> | <versionpc> | <languagepc> | <mobile> | <modelmobile> | <osmobile> |
    And the user adds one password
      | password   |
      | <password> |
    Then the User will see his account created
    Examples:
      | firstname | lastname | email                | birthday | birthmonth | birthyear | language | city          | zip  | country | computer | versionpc | languagepc | mobile | modelmobile | osmobile | password       |
      | Lu        | Olarte   | Lu1911.123@gmail.com | 10       | April      | 1990      | Arabic   | Arad, Romania | 0055 | Romania | Debian   | Debian 12 | English    | Apple  | Iphone 4    | iOS 11.2 | Lu123123123+++ |
      | Lu        | Olarte   | Lu1922.123@gmail.com | 10       | April      | 1990      | Arabic   | Arad, Romania | 0055 | Romania | Debian   | Debian 12 | English    | Apple  | Iphone 4    | iOS 11.2 | Lu123123123+++ |
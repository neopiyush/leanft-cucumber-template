Feature: Registration

  @regression
  Scenario Outline: Successful Registration on newtours portal
    Given User is on "Home" Page
    And User click on Register Link
    When Enter Contact information "<firstname>" , "<lastname>" , "<phone>" and "<email>"
    And Enter mailing information "<address>" , "<city>" , "<state>" , "<postal>" and "<country>" 
    And Enter user information "<username>" and "<password>" 
    And click on Register button
    Then UserName should be generated
    And Generated UserName should be same as "<email>"

    Examples: 
      | firstname|lastname	  |	phone  	 |email			|address	|city	|state|postal|country|username		|password|
      | neo 	 | automation |9999911111|neo@test.com  |14th cross |Indore | MP  |12	 |INDIA  |neoautomation |neo@test|
      

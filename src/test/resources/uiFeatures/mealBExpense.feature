Feature: Verifying MealB Expense Functionality

  @mb-01
  Scenario: User should be able to create an expense
    Given user navigates to MealB login page
    Then user logs in with valid credentials
    Then user clicks on Expense Tab
    Then user clicks on Add Expense button
    Then user selects Meal and Entertainment option
    #And user fills out all fields on Meal and Entertainment modal window
    Then I fill out all fields on Meal and Entertainment with random data
    And user clicks on save button
    Then user verifies that newly created expense shows up on expense table


    @mb-02
    Scenario: Printing data on excel
      Then print all the data on the excel file

    #this code is from Master branch. some code.
    #this is a code that is from MB-02 branch.
    @mb-03
    Scenario: Writing data to excel
      Then I can write some data to the excel file

    @mb-03
    Scenario: User should be able to see expenses created by them previously
      Given user navigates to MealB login page
      Then user logs in with valid credentials
      Then user clicks on Expense Tab
      And user should see previously created expenses by him

    #Scenario: Adding new Personal Info tab


@regression
Feature: Verify upload/download functionalities

  Background:
    Given user navigates to heroku application

  @upload
  Scenario: Upload a file from local machine
    Then user switch to "fileUpload" page
    Then user able to upload a file from local machine

    @download @custom
    Scenario: Download a file to local Machine
      Then user switch to "download" page
      Then user able to download a file to local machine

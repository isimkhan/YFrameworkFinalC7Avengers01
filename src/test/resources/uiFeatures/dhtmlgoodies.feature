@regression
Feature: Drag and Drop feature

  Background:
    Given User navigates to dhtmlgoodies application

    @dhtmlgoodies @smoke
    Scenario Outline: User should be able to drag Capitals to corresponding Countries
      Then Drag and drop cities "<Capital>" to the corresponding countries "<Country>"
      Examples:
      | Capital    | Country     |
      | Oslo       | Norway      |
      | Stockholm  | Sweden      |
      | Copenhagen | Denmark     |
      | Seoul      | South Korea |
      | Rome       | Italy       |
      | Madrid     | Spain       |
      | Washington | US          |
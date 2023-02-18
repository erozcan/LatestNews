@smoke
Feature: Latest news on Techcrunch website

  Scenario: Check authors and images and links for latest news
    Given user is on techcrunch website
    And each news has an author
    And  each news has an image
    When user clicked one of the news on The Latest News
    Then Check the browser title and full content title is same
    Then Check the links of the content

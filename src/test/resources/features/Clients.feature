@regression
Feature: Testing Clients End Points

  Scenario: Happy Path Create Clients (Client-Create Endpoint) --> POST
    Then User validates 'aigerimCompany', 'Java', 'Codewise' and 'aigerim.company22@gmail.com' from end-point

    Scenario: Happy Path Get Client
      Then User validates 'aigerimCompany', 'Java', 'Codewise' and 'aigerim.company22@gmail.com' from end-point Get

      Scenario: Happy Path Update Client(Client-Update EndPoint) --> PUT
        Then User validates 'aigerimCompanyUpdated', 'Java', 'Codewise' and 'aigerim.companyupdated@gmail.com' from end-point Put

  Scenario: Happy Path Delete Client(Client-Delete EndPoint) --> DELETE
    Then User validates 'aigerimCompanyUpdated', 'Java', 'Codewise' and 'aigerim.companyupdated@gmail.com' from end-point Delete

    Scenario: Happy Path Deleted Client(Client-Check EndPoint) --> Get
      Then User validates 'Internal server error' and 'Client not found' from end-point Get
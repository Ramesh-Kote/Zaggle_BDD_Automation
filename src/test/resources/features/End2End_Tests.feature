Feature: Automated End2End Tests
  Description: The purpose of this feature is to test End 2 End integration.

  #Background:
  # Given I login as an admin user
  Scenario Outline: verify employee expenses options
    Given I login with_credentials "<username>" "<password>"
    Then I verify all employee expenses options "Dashboard","Expenses","Travel Request","Expense Reports","Travel Expenses","Advance"

    Examples: 
      | username                  | password   |
      | staginguser07@yopmail.com | Zaggle@123 |

  @End2End_1
  Scenario Outline: verify Travel Expense Header
    Given I login with_credentials "<username>" "<password>"
    When I clicked on the Travel Expense tab
    And I verify Travel Expenses table Header "Trip ID" "Report ID" "Report Date" "Destination" "Start Date" "End Date" "Travel Cost" "Action"
    Then I verify Travel data also "TA12112200600000CA10" "Uttarpradesh"     "14 Nov 2022"     "14 Nov 2022" "1929" "Expense Trip"

    Examples: 
      | username                  | password   |
      | staginguser07@yopmail.com | Zaggle@123 |

  Scenario Outline: verify Travel allowances for Report
    Given I login with_credentials "<username>" "<password>"
    When I clicked on the Travel Expense tab
    When I clicked on Expense Trip hyperlink
    And I verify whether "Travel Allowances for Report: Trip to Mumbai" "Departure"  "Return" is displayed
    Then I verify data "Hyderabad" "Mumbai" "14-11-2022 13:05:00" "14-11-2022 14:02:00"
    Then I clicked on Next button and observed per diem details "1" "1000"
    Then I clicked on Next button and Observe the details "Trip to Mumbai" "Domestic Policy"
    Then I observe Amount to be reimbursed "1000.00"and click on submit

    Examples: 
      | username                  | password   |
      | staginguser07@yopmail.com | Zaggle@123 |

  Scenario Outline: verify Advance Header
    Given I login with_credentials "<username>" "<password>"
    When I clicked on the Advance tab
    Then I observe cash advance  and click on trip id hyperlink
    Then I observe details "TA12INT1" "Mr Anvesh Reddy" "company" "18 Nov 2022" "26 Nov 2022" and close the tab
    Then I  click on create advance hyperlink and observe details "TA12INT1" "7" "2695" "100"
    Then I click on "Cash" in mode and preferred currency
    Then I changed currency to "USD" and entered amount "300"
    Then I verified whether checkbox is enabled and clicked on "Save" button and "Submit" button
    Then I closed the tab

    Examples: 
      | username                  | password   |
      | staginguser07@yopmail.com | Zaggle@123 |

  @verifylinks_endUser
  Scenario Outline: verify the links in all tabs
    Given I login with_credentials "<username>" "<password>"
    Then I verify the all links on the tabs
    When I clicked on the AddExpense
    Then I verify the all links on the tabs
    When I clicked on the AddMileage
    Then I verify the all links on the tabs
    When I clicked on the usingGeoLocationSubTab
    Then I verify the all links on the tabs
    When I clicked on the clickOnOdometerSubTab
    Then I verify the all links on the tabs
    When I backward the page
    And I clicked on the AddReport
    Then I verify the all links on the tabs
    When I clicked on the Expense tab
    Then I verify the all links on the tabs
    When I clicked on the TravelRequest tab
    Then I verify the all links on the tabs
    When I clicked on the AddNewRequest button
    Then I verify the all links on the tabs
    When I clicked on the ExpenseReoports tab
    Then I verify the all links on the tabs
    When I clicked on the AddReport button
    Then I verify the all links on the tabs
    When I clicked on the TravelExpenses tab
    Then I verify the all links on the tabs
    When I clicked on the AddTripReport button
    Then I verify the all links on the tabs
    When I clicked on the Advance tab
    Then I verify the all links on the tabs
    When I clicked on the Travel Advance sub tab
    Then I verify the all links on the tabs
    When I clicked on the CreateAdvanceColumn
    Then I verify the all links on the tabs

    Examples: 
      | username                  | password   |
      | staginguser07@yopmail.com | Zaggle@123 |

  @verifylinks_AdminUser
  Scenario Outline: verify the links in all tabs
    Given I login with_credentials "<username>" "<password>"
    Then I verify the all links on the tabs
    When I clicked on the inviteEmployeeAddAdminSubTab
    Then I verify the all links on the tabs
    When I clicked on the addNewBtn
    Then I verify the all links on the tabs
    When I clicked on the CrossIcon
    When I clicked on the manageBtn
    Then I verify the all links on the tabs
    When I clicked on the CrossIcon
    When I clicked on the documentsSubTab
    Then I verify the all links on the tabs
    When I clicked on the bulkUploadSubTab
    Then I verify the all links on the tabs
    When I backward the page
    When I clicked on the viewReportsandSummarySubTab
    Then I verify the all links on the tabs
    When I backward the page
    And I clicked on the configureSettingsSubTab
    Then I verify the all links on the tabs
    When I backward the page
    When I clicked on the ExpenseReoports tab
    Then I verify the all links on the tabs
    When I clicked on the TravelRequest tab
    Then I verify the all links on the tabs
    When I clicked on the Advance tab
    Then I verify the all links on the tabs
    When I clicked on the EmployeeTab
    Then I verify the all links on the tabs
    When I clicked on the addNewBtn
    Then I verify the all links on the tabs
    When I clicked on the CrossIcon
    When I clicked on the manageBtn
    Then I verify the all links on the tabs
    When I clicked on the CrossIcon
    When I clicked on the documentsSubTab
    Then I verify the all links on the tabs
    When I clicked on the bulkUploadSubTab
    Then I verify the all links on the tabs
    When I clicked on the managementReports
    Then I verify the all links on the tabs
    When I clicked on the Admin tab
    Then I verify admin tab links
  

    Examples: 
      | username                         | password  |
      | tatapower_stagclient@yopmail.com | Zaggle@12 |

  @verifylinks_AdminUser1
  Scenario Outline: verify the links in all tabs
    Given I login with_credentials "<username>" "<password>"
    When I clicked on the Admin tab
    Then I verify admin tab links

    Examples: 
      | username                         | password  |
      | tatapower_stagclient@yopmail.com | Zaggle@12 |

  @tripIdDetails
  Scenario Outline: verify the travel expense tripid details
    Given I login with_credentials "<username>" "<password>"
    When I clicked on the Travel Expense tab
    And I navigate to tripId "TA12112200600000CA1"
    Then I verify travel expenses tripId details "TA12112200600000CA1" "Mr Anvesh Reddy" "company" "14 Nov 2022" "14 Nov 2022" "Air Asia India" "Air" "Domestic" "Air Asia India" "BLR-MAA" "K6JR7N" "K6JR7N" "Business" "₹ 1929" "Two Way" "14 Nov 2022, 13:05" "14 Nov 2022, 14:02" "India" "India"

    Examples: 
      | username                  | password   |
      | staginguser07@yopmail.com | Zaggle@123 |

  @AddExpense
  Scenario Outline: User is add expense
    Given I login with_credentials "<username>" "<password>"
    When I clicked on the dashboard tab
    And I created the added expense "Airfare (Self) Class 1 City" "100" "Company" "Testing purpose adding expense amont"
    Then I verify the expense details "100" "Company" "Testing purpose adding expense amont"

    Examples: 
      | username                  | password   |
      | staginguser07@yopmail.com | Zaggle@123 |

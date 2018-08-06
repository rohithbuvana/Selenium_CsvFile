Feature: Registration

Scenario: Register Successfull

Given : that user loads the register page
When : User enters the fname as "Ram"
And : User enters the lname as "Rahim"
And : User enters the email as "rr@gmil.com"
And : User enters the contact numbers as "1234567890"
And : User enters the address as "Mogappair east"
And : User enters the city as "Chennai"
And : User selects the state as "Tamil Nadu" 
And : User clicks submit
And : Loads next page
And : User enters the project name as "Bank Application"
And : User enters the client name as "Bank of Ireland"
And : User enters the team size as 10
And : User clicks register
Then : the user registered successfully


Scenario: Register UnSuccessfull

Given : that user loads the register page
When : User enters the fname as "Ram"
And : User enters the lname as "Rahim"
And : User enters the email as "rr@gmilcom"
And : User enters the contact numbers as "1234567890"
And : User enters the address as "Mogappair east"
And : User enters the city as "Chennai"
And : User selects the state as "Tamil Nadu" 
And : User clicks submit
Then : the user registerion unsuccessfull

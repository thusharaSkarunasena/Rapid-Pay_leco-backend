# Rapid Pay - LECO Backend API

## Description
This demo API is a part of the 'Rapid Pay' project which is developed as a utility bill payment platform.
LECO backend API is used to check if the given account number for the 'LECO' bill payment is a valid account number.
API is hosted to 'Heroku' & API endpoints are not secured.

## Technologies Used
* Spring Boot
* PostgreSQL

## API Demo Url
[https://rapidpay-leco.herokuapp.com](https://rapidpay-leco.herokuapp.com/)
	
## API Endpoints
	/leco_user/getAllLecoUsers
	/leco_user/getLecoUser/{id}
	/leco_user/checkLecoUser/{account_number}
	/leco_user/saveLecoUser
	/leco_user/updateLecoUser
	/leco_user/deleteLecoUser/{id}

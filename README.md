# distance-calculator
A Webservice that accepts two distances and returns the total distance

I will be using java spring-boot framework to create a RESTful webservice for this exercise.
Will be using springfox-swagger dependency to create a swagger definition of the rest services.

REST API structure

POST req on the enpoint /api/distance-calculator/add
Request Structure
{
  "distances" : [{
    "value" : "1",
    "unit" : "FEET"
  },{
    "value" : "2",
    "unit" : "YARD"
  }],
  "resultUnit" :"METER"
}

Response 
{
  "distance": {
    "value" : "3.0"
    "unit" : ""METER"
    }
}

After the implementation of the service , i will use Junit for creating unittests 


Rest api details availabel on http://localhost:8080/swagger-ui.html

![swagger](https://user-images.githubusercontent.com/4347307/137624402-b43db3cf-a5fe-45c9-8c45-bfcbc3907ea0.jpg)



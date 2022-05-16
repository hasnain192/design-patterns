Its a creational desgin pattern

Its Used when we have too many arguments to send in constructor and its hard to maintain order.

when we dont want to send all parameters in object initialistion .

(Genrally we send optional parameters as null)

Implementions steps:

We have to create static nested class which contain all argumetns of outer class

Builder class have a public construtor with all required parameters.
Builder class shuld have methods for options fields  and method will return the bulder class object.
Have to create build() method that will return the final object.

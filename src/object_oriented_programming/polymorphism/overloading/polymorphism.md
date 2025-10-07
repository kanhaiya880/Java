
<h2>Polymorphism</h2>
<b>perfoming single task in multiple ways is called as polymorphism.</b>
<br>
<b>Type of polymorphism</b><br>
compiletime polymorphis: method overloading
<br>
runtime polymorphism: method overriding

<h3>Method overloading</h3>
it is performed in same class
single method should have different parameters or return types <br>
it executed during the compile time
<br>In java we can overload main method as well although jvm only call string array type argument
another methods with different argument need to be called by our self
<br> (Note:we can overload static method)


<h3>Method overriding</h3>
method overriding occurs when child class provide implementation of method that is already defined in parent classs
<br>
<b>Rules:</b> <br>
1.there is must be a parent child relationship (is-a relationship) <br>
2.method name must be same in parent and child class <br>
3.parameterers and return type must be same in parent and child class <br>
4.you can't not override static and final method's <br>
5.private and default method's can not be override <br>
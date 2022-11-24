# Generic

Generic is used to create a template, where type is decided at the time of declaration.

Classes which are defined using generic are called as *Type Classes*

**Rule for Runtime Polymorphism**
Subclass object can be stored in superclass variable.

## Variance

**Variance define a rule by which parameterized type can be passed as an argument.**

### Types of Variance

* Invariant: 

 Type[A]  - Any object of only Type[A] can be passed as an argument.
* Covariant: 

Type[+A] - Any object of Type[A] and Type[Subclass of A] can be passed as an argument.

* Contravariant:

Type[-A] - Any object of Type[A] and Type[Supertype of A] can be Passed as an argument.

## Bounds

Bounds are used to restrict creation of object

**It has Two Types**
* Upper Bound Type[T<:A] -either A or subtype of A
* Lower Bound[T>:A] - either A or supertype of A
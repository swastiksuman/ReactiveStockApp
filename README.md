# Reactive Programming
- Non Blocking
- Asynchronous
- Functional & Declarative


## Issues with Imperative Programming
```java
int a = 2;
int b = a * 10;

System.out.println(b);

a = 3;

System.out.println(b);
```
 Even if we change the value of a, it's not reactive enough to change the b value.


```java
interface ShoppingCardService {
   Output calculate(Input value);
}

class OrdersService {
   private final ShoppingCardService scService;
   void process() {
      Input input = ...;
      Output output = scService.calculate(input);
      ...
   }                                                               
}  
```

# Question 9 (2 marks)
Consider the following code:

```java
class X {
    public void a() {}
}

class Y {
    public void b() {}
}

class Z extends X, Y {
    protected void a() {}

    public void b() {}

    public void b(String arg) {}
}
```

Now, consider the following statements about the code:

(1) The code doesn’t compile because there is more than one class in the same file;\
(2) The code doesn’t compile because double inheritance is not possible in Java;\
(3) The code doesn’t compile because the methods a and b are not marked with @Override\
(4) The code doesn't compile because you cannot overload a method that is overriding a method in a superclass;\
(5) The code doesn’t compile because a cannot have its visibility reduced from the superclass to the subclass.\
(6) The code does compile.

Which of the following sets of statements about the code are true?

A) (1), (2)\
B) (1), (3), (5)\
C) (2), (3), (4), (5)\
**D) (2), (5)**\
E) (2), (4), (5)\
F) (6)

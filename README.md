# SetterAndConstructorInjection
Implementation of constructor and setter injection using Spring in Java

## Constructor Injection
Go in `src/main/java/dal/tp1/ex1/constructor_injection`, and you can run `QuizProgram.java`

In `src/main/ressouces/constructorBeans.xml` you can modify the QuizMaster class, by modifing:
```xml
<bean id="quizMasterBean" class="dal.tp1.ex1.constructor_injection.CMMQuiz"/>
```

With: 
```xml
<bean id="quizMasterBean" class="dal.tp1.ex1.constructor_injection.UMLQuiz"/>
```

## Setter Injection
Go in `src/main/java/dal/tp1/ex1/setter_injection`, and you can run `QuizProgram.java`

In `src/main/ressouces/setterBeans.xml` you can modify the QuizMaster class, by modifing:
```xml
<bean id="quizMasterClass" class="dal.tp1.ex1.setter_injection.CMMQuiz"/>
```

With: 
```xml
<bean id="quizMasterClass" class="dal.tp1.ex1.setter_injection.UMLQuiz"/>
```

## Built With
- [Spring](https://spring.io/) - The Spring Framework is an application framework and inversion of control container for the Java platform.

## Author
- [MaximeNrb](https://github.com/maximenrb)

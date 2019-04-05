## Reference
- Unit Testing and Coverage in IntelliJ IDEA
- Using Maven in IntelliJ IDEA
- [practical-test-driven-development-for-java-programmers] (https://www.linkedin.com/learning/practical-test-driven-development-for-java-programmers/)


## Rules of TDD
- Test the expected outcome of an example

- Don't pre-judge design... let your tests drive it.

- Write the minimum code required to get your tests to pass

- Each test should validate one single piece of logic


## Stubs an Mock
    Mock a service
    
```
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-all</artifactId>
    <version>1.8.4</version>
    <scope>test</scope>
</dependency>
``` 
With mock, it creates a bare-bone shell instance for you.
```
List<String> mockList = Mockito.mock(ArrayList.class);
```
With spy you can **partially** mock on an existing instance
```
List<String> spyList = Mockito.spy(new ArrayList<String>());
doReturn().when(spyList).get(1);
```
# 패스트캠퍼스 스프링부트 강의

패스트캠퍼스 스프링부트 강의 관련 코드

## 프로젝트 구성 

- Gradle
- Spring Boot
- Spring Boot Web
- Thymeleaf
- Lombok


## 3일차
- Spring Boot 2는 Spring Framework 5 버전으로 구성되어 있다.
- Get 방식은 바디에 값이 없고 Post, Put 등의 방식에는 바디가 있다.


### Http Header
- Accept : 클라이언트가 원하는 컨텐츠 타입
- Content Type : 클라이언트가 보내는 메시지 타입


### Form Data 와 Query String 처리 
- `@RequestParam`
- `@ModelAttribute`


### MessageConverter
- 요청의 바디를 Content Type 헤더에 따라 자바 객체로 변환해준다.
- 응답에 바디를 Accept 헤더에 따라 자바 객체를 변환해준다. ex) json


### Controller 가 리턴하는 데이터
- View name
- 컴포넌트
- 응답 데이터 (자바 객체를 Content Type 에 따라 변환) : `@ResponseBody`


### `@ConditionalOnMissingBean`
- 사용자가 해당 빈을 생성하지 않았으면 자동으로 생성해준다.


### `ObjectMapper`
- 객체 -> json
- json -> 객체


### `ContentNegotiatingViewResolver`
- 스프링부트가 기본으로 제공하는 ViewResolver : 요청되는 컨텐츠 형식에 기반을 두어 선택한 하나 이상의 뷰리졸버... 어쩌구 쩌쩌구 책자에서 참고


### Thymeleaf 템플릿 디렉토리 변경 예시 (`application.properties`)
- spring.thymeleaf.prefix=classpath:/thymeleaf/



## 4일차

### JDBC


#### SQL Mapper
- SQL 중심의 쿼리 개발
- Spring JDBC, MyBatis


#### ORM
- 객체 중심의 데이터베이스 개발
- JPA(Java 표준), Spring Data JPA 


#### Spring Data JPA
- 테이블과 매핑하는 객체를 생성 (`@Entity`)
- `@Entity` 클래스에 해당하는 테이블을 자동으로 생성할 수 있음
- 1:1, 1:N, N:M 관계에 대해 고민이 필요
- 비즈니스 로직에 대한 고민이 필요

##### 개발 순서
1. `Entity` 클래스 작성 
2. `Repository` 작성하여 JPQL, QueryDSL 등을 사용하여 조회를 어떻게 할지 고민
3. `Repository` 테스트 작성. (SQL을 잘 확인하여야 한다.)

##### 복합키 사용하기
- 복합키 정보를 가지고 있는데 `@Embeddable` 객체를 만들어주고 Entity 에서 `@EmbeddableId` 로 키를 지정해준다.

```java
@Embeddable
@Data // lombok
public class ModelId extends Serializable {
    private Long aId;
    private Long bId;
    private Long cId;
}  

@Entity
public class Model {
    @EmbeddedId
    private ModelId modelId;
}
```

##### JPQL
- N + 1 쿼리 해결하기 (fetch join)
```java
@Query("SELECT e FROM Employee e INNER JOIN fetch e.department")
``` 

- 특정 컬럼만 SELECT 하고 싶을때
```java
@Query("SELECT new Dto(e.name, e.salary) from Employee e")
```


### Test

- `@RunWith(SpringRunner.class)` : 스프링 설정을 읽어서 빈을 등록해준다.
- `@DataJpaTest` : JPA 관련 bean만 등록한다. (기본적으로 Embedded Database를 사용하여 테스트를 진행.)
- `@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)` : Embedded DB 를 사용하지 않는다.

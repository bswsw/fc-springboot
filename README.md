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

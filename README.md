# Spring Boot Basic

유튜브 : 홍팍 - 스피링 부트, 입문!

https://user-images.githubusercontent.com/99054659/184531513-041f64c1-9844-4615-bdf0-95a4349c0157.mov

<br/>


## MVC 패턴

MVC란 Model-View-Controller의 약자로 애플리케이션을 세 가지 역할로 구분한 개발 방법론입니다. 

1. 모델(Model) - 어플리케이션의 정보, 데이터베이스, 상수, 초기화 값, 변수 등을 의미한다. 비즈니스 로직을 처리한 후 모델의 변경사항을 컨트롤러와 뷰에 전달한다.

2. 뷰(View) - 사용자에게 보여지는 부분, 즉 유저 인터페이스(User Interface)를 의미한다.

3. 컨트롤러(Controller) - 모델과 뷰 사이를 이어주는 브릿지 역할을 으미한다.

<br/>
<img width="1473" alt="mvc" src="https://user-images.githubusercontent.com/99054659/184531506-0b4832f0-cd72-4c3d-ad61-f50e92adf24a.png">


<br/>

## Structure

1. 개체(Entity) - 저장되고 관리되어야하는 데이터의 집합

2. DTO(Data Transfer Object) - 계층 간 데이터 교환을 하기 위해 사용하는 객체로, 로직을 가지지 않는 순수 데이터 객체

3. JSON - 자바 스크립트 객체 표기법, 테이터를 쉽게 교환하고 저장하기 위한 텍스트 기반의 데이터 교환 표준

4. Repository - 개체(Entity)에 의해 생성된 DB에 접근하는 메서드(findAll ..등)들을 사용하기 위한 인터페이스이다.

5. ORM(Object-Relational Mapping) - 애플리케이션 Class와 RDB(Relational DataBase)의 테이블을 매핑(연결)한다는 뜻이며, 기술적으로는 애플리케이션의 객체를 RDB 테이블에 자동으로 영속화 해주는 것

6. JPA(Java Persistence API) - Java 진영에서 ORM(Object-Relational Mapping) 기술 표준으로 사용하는 인터페이스 모음

<br/>
<img width="1726" alt="structure" src="https://user-images.githubusercontent.com/99054659/184531505-f6a7616d-e4b1-4d8d-89ac-a6bbd92aab4f.png">

<br/>

## Rest API

```
REST(Representational State Transfer)의 약자로 자원을 이름으로 구분하여 해당 자원의 상태를 주고받는 모든 것을 의미

즉 REST란
HTTP URL를 통해 자원(Resource)을 명시하고,
HTTP Method(POST, GET, PUT, DELETE)를 통해
해당 자원(URL)에 대한 CRUD Operation을 적용하는 것을 의미한다.
```
<br/>

<img width="1700" alt="rest_api" src="https://user-images.githubusercontent.com/99054659/184531503-f1db32eb-a8c9-4f7a-84f6-e2d011545ce4.png">

<br/>

## IoC, DI

1. IoC(Inversion of Control) - 객체의 의존성을 역전시켜 객체 간의 결합도를 줄이고 유연한 코드를 작성하게 하여 가독성 및 코드의 중복, 유지보수를 편하게 할 수 있게 한다.

2. DI(Dependency Injection) - 객체를 직접 생성하는 것이 아니라 외부에서 생성한 후 주입을 시켜주는 방식

<br/>

<img width="1640" alt="IOC, DI" src="https://user-images.githubusercontent.com/99054659/184531497-47f31e27-2621-40fe-8efc-44282be1bf4c.png">

<br/>

## AOP

```
AOP(Aspect Oriented Programming)는 주 비즈니스 로직 앞, 뒤로 부가적인 기능을 추가하고 싶을떄 사용한다 - ex) 로그, 보안, DB 트랜잭션

AOP를 사용하는 이유
1. 코드의 중복을 줄일 수 있다.
2. 주 업무 로직과 부가적인 로직을 분리할 수 있다.
```

<br/>

<img width="1675" alt="AOP" src="https://user-images.githubusercontent.com/99054659/184531511-b400863a-1856-417c-bc39-445a91cd131d.png">

<br/>

## Annotation

```
Annotation은 클래스와 메서드에 추가하여 다양한 기능을 부여하는 역할을 합니다.
Spring Framework에 해당 클래스가 어떤 역할인지 정하기도 하고, Bean을 주입하기도 하며, 자동으로 getter나 setter를 생성하기도 한다.

Annotation을 사용하는 이유
1. 코드량이 감소하고 유지보수하기 쉽다.
2. 생산성이 증가된다.
```

<br/>

## 대표적인 Annotation

<br/>

@Component
```
생성한 class를 spring의 Bean으로 등록할 떄 사용하는 Annotation이며, Spring은 해당 Annotation을 보고 Spring의 Bean으로 등록한다.

Bean : Spring IoC가 관리하는 자바 객체
```


@Bean
```
개발자에 제어가 불가능한 외부 라이브러리와 같은 것들을 Bean으로 만들 떄 사용한다.
```

@Controller
```
Spring에게 해당 Class가 Controller의 역할을 한다고 명시하기 위한 Annotation
```

@RequestHeader
```
Request의 header값을 가져올 수 있으며, 해당 Annotation을 쓴 메서드의 파라미터에 사용한다. 
```

@RequestMapping
```
요청 들어온 URL요청과 Annotation value 값이 일치하면 해당 클래스나 메서드가 실행된다.
```

@RequestParam
```
URL에 전달되는 파라미터를 메서드의 인자와 매칭시켜, 파라미터를 받아서 처리할 수 있다.
```

@RequestBody
```
Body에 전달되는 데이터를 메서드의 인자와 매칭시켜, 데이터를 받아서 처리 할 수 있도록 해준다.
```

@ModelAttribute
```
클라이언트가 전송하는 HTTP parameter, Body 내용을 Setter함수를 통해 1:1로 객체에 데이터를 연결(바인딩)한다.
```

@ResponseBody
```
메서드에서 리턴되는 값이 view로 출력되지 않고 HTTP Response Body에 직접 쓰여지며 JSON, XML과 같은 데이터를 return한다.
```

@Autowired
```
Bean 객체를 주입받기 위한 방법은 크게 3가지방식이 있으며, 어노테이션으로 Bean을 주입받기 위하여 @Autowired 를 사용합니다
```

@Setter
```
Class 모든 필드의 Setter Method를 생성
```

@Getter
```
Class 모든 필드의 Getter Method를 생성
```

@AllArgsConstructor
```
Class 모든 필드 값을 파라미터로 받는 생성자를 추가
```

@NoArgsConstructor
```
Class 기본 생성자를 자동으로 추가
```

@ToString
```
Class 모든 필드의 toString method를 생성
```

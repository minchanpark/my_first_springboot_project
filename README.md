# 저의 첫 번째 스프링 부트 프로젝트입니다. #

## 아주 간단한 프로젝트이지만, 여기에서 restful api를 만들어서 클라이언트로 넘기는 과정을 공부하였습니다. ##

### 1. DefaultRestController.java ###
#### 이 파일은 restfulapi로 클라이언트가 request를 주면 response를 주는 역할을 합니다. 
클라이언트가 요청하는 여러 가지 데이터 타입에 대한 response를 연습하기 위해서 이 파일에서 hashmap, list 등등 여러 가지 데이터 타입으로 response를 주도록 작성하였습니다.
####

### 2. themeleaf ###
####
**themeleaf**란, 서버 사이드 렌더링을 해서 클라이언트로 보내는 것입니다. 
이게 어떤 의미인지 더 자세히 설명해보겠습니다. 

기본적으로, 클라이언트는 서버에 원하는 데이터를 요청하고 그 데이터를 받아서 화면에 표시합니다. 이런 방식으로 "클라이언트 사이트 렌더링"이라고 합니다.

반면에 "서버 사이트 렌더링"이라는 방식이 있는데, 이 방식은 서버에서 html에 대한 모든 작업을 완료하고 클라이언트에게 html파일을 보냅니다.
즉, 서버가 html파일까지 모두 만들어서 클라이언트로 보내는 것입니다. 

각각의 차이가 있지만 서버 사이드 렌더링 방식을 사용하면 클라이언트 사이트 렌더링 방식보다 더 빠르게 페이지를 띄울 수 있습니다.

**즉!!! 서버 사이트 렌더링을 스프링에서 가능하게 만드는 것을 themeleaf라고 합니다. themeleaf를 사욜하면 스프링에서 html을 렌더링하여서 바로 클라이언트로 전달할 수 있습니다.**
####

### 3. themeleaf를 사용한 html파일 예제 ###
####

<img width="481" alt="스크린샷 2024-09-04 오전 1 23 09" src="https://github.com/user-attachments/assets/860b8611-bff6-41e5-9404-b096b3eaa2de">


위에 있는 html파일은 themeleaf를 사용하여 만든 파일입니다. 
<html xmlns:th="http://www.thymeleaf.org" lang="ko">를 적어서 themeleaf를 사용할 것이라고 알려주고, 서버에서 보내주는 데이터를 서버단에서 바로 렌더링하여서 
  클라이언트에게 전달할 수 있습니다.
####

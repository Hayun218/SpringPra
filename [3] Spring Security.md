**강의일시 - 24-06-04(화)**



## Spring Security



### Spring Security

- Authorization: 문지기 역할
  - refresh token으로 access token을 발급
  - access token을 통해 user 객체 정보를 받아올 수 있음
    - 유저 엔티디 모든 정보 혹은 아이디 등 유저에 관한 정보를 다양한 형태로 지닐 수 있음
  - 교수님은 authentication에서 바로 access token 발급 ⇒ 그러면 안돼요!
- Authentication: 로그인
  - refresh token 을 헤더에 담아서 전달
  - access token보다 길게 유지됨



### **Access Token**

- 유저 ID를 지니고 있다고 가정 ⇒ ID 유효성 판단 및 해당 사용자의 권한 확인
- 5분-N분마다 바뀜
- `SecurityContextHolder` 로 Controller에서,,
- 토큰 발급 자체는 스스로 진행함
  - 토큰은 따로 Redis 혹은 DB에 저장
  - refresh token은 저장하는 게 일반적!
    - 카카오는 Redis에 저장
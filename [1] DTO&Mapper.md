**강의일시 - 24-05-21(화)**

## DTO

DTO → 엄격하게 관리하기 위해서 데이터 박스로 만든 것!

Entity 는 Repository에서만 활용된다 그 외는 무조건 DTO로 만들어서 전달하기

## Mybatis-Mapper

마이바티스 → Mapper: Repository와 동일한 역할이지만, 실제 DB와 연결하여 SQL문 직접 작성

- 복잡한 쿼리문 일 때 활용
- 파라미터 여러개 넣어서 조회까지 완성하면 마이바티스 개념 완료!

Repository: JPA 활용하여 Entity 수정 / 간단한 DB 수정문 진행!

### 차후일정

- 데이터가 클수록 ⇒ 2가지 방안:
  1. Paging: JPA에서 제공하지만, 한계로 인해 우리는 직접 개발할 예정 글이 몇개인지에 대한 정보를 위해 가끔 내부 함수를 쓴다,,
  2. Scroll: 커서방식 ⇒ offset 문제점 해결
- 파일첨부
- 파일 URL & 파일을 리스트로 받아서 보드에 찍는 것
- 스프링 시큐리티
- AWS 서버로 올리기, ⇒ 도메인에 올리는 거 확인!
  - light sale 사용예정(EC2 or light sale)
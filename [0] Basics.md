**작성일시 - 24-05-20(월)**

## myspring 실전

### 개념 숙지 필요

1. `@RequestMapping` 개념 (Class 외부에 사용)

2. `@GetMapping` , `@PostMapping`, `@PutMapping` 개념 (Class 내부 사용)

3. `@PathVariable` , `@RequestBody`

   ```jsx
   @GetMapping("/{page}")
   public String page(@PathVariable("page") String page){    
   	return "user/" + page;
   }
   ```

4. `@PrePersist` from Jakarta.persistence



### 전체구조

![Spring 전체구조](https://user-images.githubusercontent.com/96133075/217034315-b60125ed-3500-44d2-8c7b-836b54b7fbfb.png)



### myspring 실전 따라가기 순서

1. build.gradle 수정
2. Controller 셋팅 page 폴더로 RestController & Controller 구분
3. 폴더 셋팅 (순서대도 진행 추천) domain → yaml 파일 수정(DB 등록) → repository → service
4. resources 폴더내 html 예시 웹 만들기
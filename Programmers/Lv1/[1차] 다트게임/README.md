# [level 1] [1차]다트 게임 - 17682 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/17682) 

## 풀이1

### Point 1 : String > String[] 로 변환

dartReuslt 문자열에서 문자 하나씩 확인 하기 위하여 배열로 변환이 필요 하였는데
charAt 과 for 문을 활용하여 char 배열을 생성 할 수도 있었지만 
String 클래스의 spilt 매서드(.split(""))를 활용 하여 손쉽게 String 배열을 얻을 수 있었다.
예시 코드
```java
String[] dart = dartResult.split("");
```
### Point 2 : switch - case 의 문법 실수

실수 문법
```java
case : "D"
// 해당 case 코드 
```
올바른 문법
```java
case "D" :
// 해당 case 코드
```
### Point 3 : case 문에 break 를 걸지 않으면 다음 case에 해당하는 코드도 동작하게 됨을 주의

해당 case 코드 끝에 
```java break;``` 를 넣어주지 않으면 다음 case 코드도 동작하게 된다.

### Point 4 : 불필요한 else를 제거하여 가독성 높이기

기존 코드
```java
case "*" :
  if(index != 0){
    score[index-1] *= 2;
    score[index] *= 2;
  }
  else
    score[index] *= 2;
  break;
```
else 제거 코드
```java
case "*" :
  if(index != 0)
    score[index-1] *= 2;
  score[index] *= 2;
  break;
```











 



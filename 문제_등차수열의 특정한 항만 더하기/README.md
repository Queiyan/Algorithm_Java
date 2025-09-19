# 📘 등차수열의 특정한 항만 더하기

## 📌 문제 설명
두 정수 `a`, `d`와 길이가 `n`인 boolean 배열 `included`가 주어집니다.  
첫째항이 `a`, 공차가 `d`인 등차수열에서 `included[i]`가 `i + 1`항을 의미할 때,  
이 등차수열의 **1항부터 n항까지** `included`가 `true`인 항들만 더한 값을 `return` 하는 `solution` 함수를 작성해 주세요.

---

## 📏 제한사항
- `1 ≤ a ≤ 100`  
- `1 ≤ d ≤ 100`  
- `1 ≤ included`의 길이 `≤ 100`  
- `included`에는 `true`가 적어도 하나 존재합니다.

---

## 💡 입출력 예시

| a | d | included | result |
|---|---|----------|--------|
| 3 | 4 | `[true, false, false, true, true]` | 37 |
| 7 | 1 | `[false, false, false, true, false, false, false]` | 10 |

---

## 📝 입출력 예 설명

### 예제 1
- `a = 3`, `d = 4`, `included.length = 5`  
- 표로 나타내면 다음과 같습니다.

| 1항 | 2항 | 3항 | 4항 | 5항 |
|-----|-----|-----|-----|-----|
| 등차수열 | 3 | 7 | 11 | 15 | 19 |
| included | true | false | false | true | true |

따라서 `true`에 해당하는 1항, 4항, 5항을 더한 `3 + 15 + 19 = 37`을 `return` 합니다.

### 예제 2
- `a = 7`, `d = 1`, `included.length = 7`  
- 표로 나타내면 다음과 같습니다.

| 1항 | 2항 | 3항 | 4항 | 5항 | 6항 | 7항 |
|-----|-----|-----|-----|-----|-----|-----|
| 등차수열 | 7 | 8 | 9 | 10 | 11 | 12 | 13 |
| included | false | false | false | true | false | false | false |

따라서 4항만 `true`이므로 `10`을 `return` 합니다.

---

# 🖊️ 풀이 소감
- boolean 배열을 보고 바로 for문을 사용하여 제시한 결과는 이뤄냈으나
 다른사람이 푼 정답이 한줄인걸 보고 벽을 느겼다.
 Stream 과 map 을 사용한다는 생각을 못해봤었는데 다음에 한번 사용해봐야겠다.


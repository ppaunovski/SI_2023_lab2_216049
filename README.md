# Pavel Paunovski 216049

## 2. CFG slika

![CFG.png](CFG.png)

## 3. Цикломатската комплексност

Цикломатска комплексност преку број на региони е 11. Кога ќе се избројат
сите региони, вклучувајќи го и надворешниот има 11.

Според број на гранки минус број на јазли плус 2:
39 - 30 + 2 = 11

Според бројот на предикатни јазли + 1: <br />
if - јазел 2 <br />
if - 4 <br />
if - 7  <br />
for циклусот има предикатен јазел - 9.2 <br />
if - 11 <br />
if - 13 <br />
if - 18 <br />
if - 21 <br />
for циклусот има предикатен јазел - 22.2 <br />
if - 23 <br />

Ова се 10 предикатни јазли па според формулата -> 10 + 1 = 11

## 4. Every Branch Criteria


| Branch / Test | User=null, allUsers=any | User = User(username=null, password=password*, email=email@email.com), allUsers = {user1=User(username=pavel, password=password!, email=email@email.com), user2=User(username=email@email.com,password=password!, email=test@test.com)} | User=User(Username=username, Password=username123, Email=emailemail.com), allUsers=any | User=User(username=username, password=pass word*, email=email@emailcom), allUsers=any | User=User(Username=username, password=password, Email=email), allUsers=any |
|---------------|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| 1-2           | *                       | *                                                                                                                                                                                                                                       | *                                                                                      | *                                                                                     | *                                                                          |
| 2-3           | *                       |                                                                                                                                                                                                                                         |                                                                                        |                                                                                       |                                                                            |
| 2-4           |                         | *                                                                                                                                                                                                                                       | *                                                                                      | *                                                                                     | *                                                                          |
| 3-26          | *                       |                                                                                                                                                                                                                                         |                                                                                        |                                                                                       |                                                                            |
| 4-5           |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 4-6           |                         |                                                                                                                                                                                                                                         | *                                                                                      | *                                                                                     | *                                                                          |
| 5-6           |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 6-7           |                         | *                                                                                                                                                                                                                                       | *                                                                                      | *                                                                                     | *                                                                          |
| 7-8           |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 7-15          |                         |                                                                                                                                                                                                                                         | *                                                                                      | *                                                                                     | *                                                                          |
| 8-9.1         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 9.1-9.2       |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 9.2-10        |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 9.2-15        |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 10-11         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 11-12         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 11-13         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 12-13         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 13-14         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 13-9.3        |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 14-9.3        |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 9.3-9.2       |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 15-16         |                         | *                                                                                                                                                                                                                                       | *                                                                                      | *                                                                                     | *                                                                          |
| 16-17         |                         | *                                                                                                                                                                                                                                       | *                                                                                      | *                                                                                     | *                                                                          |
| 17-18         |                         | *                                                                                                                                                                                                                                       | *                                                                                      | *                                                                                     | *                                                                          |
| 18-19         |                         |                                                                                                                                                                                                                                         | *                                                                                      |                                                                                       |                                                                            |
| 18-20         |                         | *                                                                                                                                                                                                                                       |                                                                                        | *                                                                                     | *                                                                          |
| 19-26         |                         |                                                                                                                                                                                                                                         | *                                                                                      |                                                                                       |                                                                            |
| 20-21         |                         | *                                                                                                                                                                                                                                       |                                                                                        | *                                                                                     | *                                                                          |
| 21-22.1       |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       | *                                                                          |
| 21-25         |                         |                                                                                                                                                                                                                                         |                                                                                        | *                                                                                     |                                                                            |
| 22.1-22.2     |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       | *                                                                          |
| 22.2-23       |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       | *                                                                          |
| 22.2-25       |                         |                                                                                                                                                                                                                                         |                                                                                        |                                                                                       | *                                                                          |
| 23-24         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 23-22.3       |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       | *                                                                          |
| 24-26         |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       |                                                                            |
| 22.3-22.2     |                         | *                                                                                                                                                                                                                                       |                                                                                        |                                                                                       | *                                                                          |
| 25-26         |                         |                                                                                                                                                                                                                                         |                                                                                        | *                                                                                     | *                                                                          |


### Тест 1.
#### User=null, allUsers=any
Доколку user е null тогаш ќе се влезе во делот со exception и ќе заврши така програмата.

allUsers може да има било каква вредност исходот ќе биде ист.

Ќе се поминат гранките:
1-2, 2-3, 3-26

### Тест 2.
#### User = User(username=null, password=password*, email=email@email.com), allUsers = {user1=User(username=pavel, password=password!, email=email@email.com), user2=User(username=email@email.com,password=password!, email=test@test.com)}

Овде username на user е null па затоа ја поминува гранката 2-4 и го сетира username-от како што е и email-от на user (username = email@email.com).
allUsers има два елементи, user1 кој има различен username од user и ист email со user, и user2 кој има ист username а различен email од user.
Со овие два елементи се поминува целосно for циклусот.

За user1 ќе се изминат гранките: 11-12, 12-13, 13-9.3

За user2 ќе се изминат гранките: 11-13, 13-14, 14-9.3

Потоа бидејќи password-от е валиден се изминува и следниот for циклус, а бидејќи специјалниот карактер
не е првиот (односно не е !) ќе се изминат гранките 23-22.3, 23-24, 24-26

### Тест 3.
#### User=User(Username=username, Password=username123, Email=emailemail.com), allUsers=any

Со овој тест сакам да ја иминам гранката 18-19 а потоа и 19-26 односно да имам password во кој се содржи username-от.
allUsers го ставам на било пто поради тоа што не е важно за овој случај.
email-от на user е невалиден за да се измине гранката 7-15.

### Тест 4.
#### User=User(username=username, password=pass word*, email=email@emailcom), allUsers=any

allUsers е повторно any бидејќи не е важно за овој тест.

Овде сакам да се измине гранката 21-25 а потоа и 25-26.

Поради тоа password-от на user има " " (празно место).

email-от на user е невалиден (не содржи карактер .) со цел да се скрати во чекорите на тестот бидејќи тој дел од кодот е изминат веќе со друг тест.

### Тест 5.
#### User=User(Username=username, password=password, Email=email), allUsers=any

allUsers е повторно any бидејќи не е важно за овој тест.

Овде сакам да се измине гранката 22.2-25, тоа се постигнува со тоа што user има валиден password но нема специјален крактер,
па ќе се измине целиот for loop и на крај кога нема да се најде специјален карактер ќе се измине гранката 22.2-25.
email-от е повторно невалиден од истата причина

## 5. Multiple Condition Criteria 
###  _if (user==null || user.getPassword()==null || user.getEmail()==null)_


| Test                                                                       | user == null | user.getPassword() == null | user.getEmail() == null |
|----------------------------------------------------------------------------|--------------|----------------------------|-------------------------|
| User = null, allUsers = any                                                | T            | any                        | any                     |
| User = User(username=any, password=null, email=any), allUsers=any          | F            | T                          | any                     |
| User = User(username=any, password=password, email = null), allUsers = any | F            | F                          | T                       |
| User = User(username=any, password=password, email=email@email.com)        | F            | F                          | F                       |

Целта е да се поминат сите исходи на if-от, за три променливи тоа се вкупно 2^3 исходи, но 
поради тоа што има услов или кај сите променливи if-от ќе врати TRUE при првата појава на TRUE. <br />
Поради тоа успеваме да скратиме на тестови и наместо да испишеме вкупно 8 тестови, доволно се само 4.
(TRUE X X) = {(TRUE, TRUE, TRUE), (TRUE, TRUE, FALSE), (TRUE, FALSE, TRUE), (TRUE, FALSE, FALSE)}
(FALSE TRUE X) = {(FALSE, TRUE, TRUE), (FALSE TRUE FALSE)}
(FALSE FALSE TRUE)
(FALSE FALSE FALSE)

# 6. Unit tests

Во тестовите испишани во код имам две функции:

### _void everyBranch()_

Во овој метод испишав по еден едноставен тест за секоја од колоните во погорната табела. 
Во листата allUsers додавам два user-и кои соодветствуваат на тие од Тест 2. а за сите останати тестови 
поради тоа што не зависат од променливата allUsers (освен да не е null) праќам празна листа.
Тестовите ги вклучив заедно со:

```java
    List<User> allUsers = new ArrayList<>();
    allUsers.add(new User("pavel", "password!", "email@email.com"));
    allUsers.add(new User("email@email.com", "password!", "test@test.com"));
    assertAll();
```

Која како аргументи прима ламбда изрази од останати assertions.

#### За Тест 1.

Проверува дали успешно се фрла исклучок од типот RuntimeException при аргументи user=null и allUsers=null

```java

() -> assertThrows(RuntimeException.class, () -> SILab2.function(null, null))

```

#### За Тест 2.

Според овој тест пример функцијата треба да врати False како повратен одговор, поради тоа што 
и покрај валидниот пасворд и емаил во листата allUsers веќе постојат корисници со исто корисничко име и ист емаил.
```java

() -> assertFalse(SILab2.function(new User(null, "password*", "email@email.com"), allUsers)),
```

#### За Тест 3.

Според овој тест функцијата пак треба да врати False бидејќи во password-от се содржи корисничкото име
```java

() -> assertFalse(SILab2.function(new User("username", "username123", "emailemail.com"), allUsers))

```


#### За Тест 4.

Според овој тест функцијата пак треба да врати False бидејќи во password-от има празно место
```java

() -> assertFalse(SILab2.function(new User("username", "pass word*", "email@emailcom"), allUsers))

```

#### За Тест 5.

Според овој тест функцијата пак треба да врати False бидејќи корисникот има невалиден емаил и пасвордот не содржи специјални карактери
```java

() -> assertFalse(SILab2.function(new User("username", "password", "email"), allUsers))

```

### _void multipleConditionTest()_

Во оваа функција има 4 тестови за секој од редовите на погорната табела.

Овде се тестира дали се фрла исклучок или не. Потребно е сите тестови да фрлат исклучок 
освен тестот кој одговара на (FALSE FALSE FALSE).

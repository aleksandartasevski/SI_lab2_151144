# Втора лабораториска вежба по Софтверско инженерство

## Александар Тасевски, бр. на индекс 151144

### Група на код: 

Ја добив групата на код 6

###  Control Flow Graph

![ControlFlowDiagram](https://github.com/aleksandartasevski/SI_lab2_151144/blob/master/ControlFlowDiagram.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 6, истата ја добив преку формулата C=E-N+2, каде што E е бројот на предикатни јазли, a Е е бројот на рабови.
Со соодветна замена се добива:      
C=25-21+2=6.

### Тест случаи според критериумот  Every statement 

##### 1. [ (10˚, 20’, 30”), (360˚, 0’, 0”) ]
###### Изминати јазли:
1, 2.1, 2.2, 3, 4, 5, 6, 7, 9, 11, 17, 2.3, 2.2, 3, 4, 5, 6, 12, 13, 14, 17, 2.3, 2.2, 18, 19

##### 2.	[(10˚, 20’, 70”)]
###### Изминати јазли:
1, 2.1, 2.2, 3, 4, 5, 6, 7, 9, 10, 19   (+10)

##### 3.	[(10˚, 70’, 0”)]
###### Изминати јазли:
1, 2.1, 2.2, 3, 4, 5, 6, 7, 8, 19   (+8)

##### 4.	[(360˚, 10’, 0”)]
###### Изминати јазли:
1, 2.1, 2.2, 3, 4, 5, 6, 12, 13, 15, 19   (+15)

##### 5.	[(720˚, 0’, 0”)]
###### Изминати јазли:
1, 2.1, 2.2, 3, 4, 5, 6, 12, 16, 19   (+16)


### Тест случаи според критериумот Multiple condtition

##### 1.	deg >=  0  &&  deg < 360

###### T:  T  &&  T		[(10˚, 0’, 0”)]
###### F:  T  &&  F		[(370˚, 0’, 0”)]
###### F:  F  &&  X		[(-10˚, 0’, 0”)]

##### 2.	min < 0  || min > 59	(Треба 1. да е T)

###### T:  T  ||  X		[(10˚,-10’, 0”)]
###### T:  F  ||  T		[(10˚, 70’, 0”)]
###### F:  F  ||  F		[(10˚, 50’, 0”)]

##### 3.	sec < 0  || sec > 59	(Треба 1. да е T и 2. да е F)

###### T:  T  ||  X		[(10˚,20’, -10”)]
###### T:  F  ||  T		[(10˚, 20’, 70”)]
###### :  F  ||  F		[(10˚, 20’, 50”)]

##### 4.	min == 0  && sec == 0	(Треба 1. да е F,  односно deg = 360 ˚)

###### T:  T  &&  T		[(360˚, 0’, 0”)]
###### F:  T  &&  F		[(360˚, 0’, 20”)]
###### F:  F  &&  X		[(360˚, 20’, 0”)]


### Објаснување на напишаните unit tests

Кога функцијата завршува успешно, го враќа истиот број на агли во листата, како и во аргиментот кој го добива, 
додека пак кога функцијата има Error, таа фрла RuntimeException.

Затоа кога успешно враќа резултат, го проверуваме бројот на елементи во листите со assertEquals.
Кога очекува да фрли exception, проверуваме со assertThrows.

пр.

List<Angle> testCaseOneAngles = new ArrayList<>();
        testCaseOneAngles.add(new Angle(10, 20, 30));
        testCaseOneAngles.add(new Angle(360, 0, 0));
        assertEquals(testCaseOneAngles.size(), siLab2.function(testCaseOneAngles).size());

List<Angle> testCaseTwoAngles = new ArrayList<>();
testCaseTwoAngles.add(new Angle(10, 20, 70));
assertThrows(RuntimeException.class, () -> siLab2.function(testCaseTwoAngles));
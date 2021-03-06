# fancontrol

## Contents:

1) Instructions on how to run the code
2) Sample screenshots
3) System diagram / Low level design

   ( [View System Diagram / Low level design](https://github.com/namrithakumar/fancontrol/blob/master/instructions/UML/FanControl-UML.png) )

    ( [View State Diagram](https://github.com/namrithakumar/fancontrol/blob/master/instructions/UML/FanControl%20State%20Diagram.png) )

4) Assumptions
5) Unit tests using JUnit
  ([View JUnit here](https://github.com/namrithakumar/fancontrol/blob/master/src/test/java/FanTest.java))
6) Base code for the problem statement
7) Design patterns used and potential improvements

## INSTRUCTIONS

## 1) Check java version on your system
Open cmd and type ```java -version.```

Check whether it shows atleast 1.8.0_xxx

## 2) Running the code - you have 2 options:
**Option 1** - Download the jar directly from https://github.com/namrithakumar/fancontrol/tree/master/jar

Run the jar using the command ```java -jar fancontrol.jar```

**Option 2** - Download the code, do: ```mvn clean install -U```

Run the jar from /FanControl/target/fancontrol.jar

**Suggested IDE** : IntellIJ

## 3) When you run the jar, you will see text asking you to select an option.

Type either **SPEED** or **DIRECTION** or **EXIT** and **press enter**.

**SPEED** will change the speed of the fan

**DIRECTION** will change direction of the fan

**EXIT** will exit the program.

![Sample Screenshot](https://github.com/namrithakumar/fancontrol/blob/master/instructions/Example.png)

**Location of main class** : org.example.fancontrol.base.FanControlMain.java

**Location of test class** : https://github.com/namrithakumar/fancontrol/blob/master/src/test/java/FanTest.java

## System Diagram / Low level design

![System Diagram / Low level design](https://github.com/namrithakumar/fancontrol/blob/master/instructions/UML/FanControl-UML.png)
![State Diagram](https://github.com/namrithakumar/fancontrol/blob/master/instructions/UML/FanControl%20State%20Diagram.png)

## **Note that the below points are assumed,**

* Speed Setting is ```["OFF", "LOW", "MEDIUM", "HIGH"]```

* Inital Speed is ```OFF```

* Direction Setting is ```["CLOCKWISE", "COUNTER CLOCKWISE"]```

* Initial Direction is ```CLOCKWISE```

* User enters either ```SPEED``` or ```DIRECTION``` or ```EXIT``` as input

## Design patterns used:
* State design pattern
* Factory pattern
* Composite pattern (coding to interface instead of classes)

Use of these design patterns make the system highly extensible.

## Potential improvements:
* Change Speed/Direction interface to abstract class
* Add gitignore file (to remove .idea folder)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Fan Test Problem Statement:**

Using Core Java, Implement a simple ceiling fan with these characteristics:

??         The unit has 2 pull cords:

o   One increases the speed each time it is pulled.  There are 3 speed settings, and an ???off??? (speed 0) setting. 

??  If the cord is pulled on speed 3, the fan returns to the ???off??? setting.

o   One reverses the direction of the fan at the current speed setting.

??  Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.

??         You can assume the unit is always powered (no wall switch)

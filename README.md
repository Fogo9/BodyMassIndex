# **BODY MASS INDEX**

## INFORMATION

* **You can find out your body mass index by entering height and weight information.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables weight was defined as **int**, height and body mass index as **double**.

* Height and weight information was obtained from the user.

* Scanner scan class is defined.

## CODES

```Java

public class bodymassindex{

        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int weight;

        double height, bmi;

```

```Java

        System.out.print("Please enter your height (in meters) :");

        height = scan.nextDouble();

        System.out.print("Please enter your weight :");

        weight = scan.nextInt();


        bmi = weight / (height * height);

        System.out.print("Your Body Mass Index :" + bmi);

```

```bash

        Please enter your height (in meters) :1,72
        Please enter your weight :105
        Your Body Mass Index :35.49215792320173

```
<br />

## LINK

* Click here https://github.com/Fogo9/BodyMassIndex.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.


<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |

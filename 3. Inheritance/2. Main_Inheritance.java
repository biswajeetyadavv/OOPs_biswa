package Inheritance;

import java.sql.SQLOutput;

public class Main_Inheritance {

    public static void main(String args[]){
        bahubali p1 = new bahubali();
        p1.name = " vikash";
        p1.age = 32;
        p1.sealed = 43;
//        as you can see age and sealed are not in bahubali.
//        As bahubali is inhertanced from vikings.
//        therefore, we can use age and sealed fields also.

//        loved and figth() methods are new features.
//        therefore, if we try to call them it will go to bahubali for the funtion not vikings.

        p1.fight();
//        as you can see as p1 is a obeject made from bahubali.
//        therefore the output of p1.fight() method is "vikash dance as much as you can. do not stop. untill i tell to you to stop."
//        so, this is why we use inheritance.
//        helped in code reuseibility witho'ut making dublicate.
//        also, we added new feature to it. as per our intrest.

        System.out.println("from here below are all of vikings objet");

//        creating an object made from vikings
        vikings biswa = new vikings();
        biswa.name = "biswajeet";
        biswa.age = 12;
        biswa.sealed = 43;

        biswa.fight();
//        in this method as you can run and  see the output is different
//        from the output in bahubali. so, this is how inheritance works.

//        when you make an extended object and you add an similar method but with different action.
//        its override the methods in exteded class.
//        object from extended class wont go to fecth the fuction to the parent class.
//        it will fetch the method in extended class itself. as method is alredy present there.

//        but when you try to fetch method for a parent class object. it wont go to extended class
//        it directly deals with the parent class only.
//        therefore, it gives output as per parens class.




    }
}

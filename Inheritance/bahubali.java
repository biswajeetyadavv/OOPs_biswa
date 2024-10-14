package Inheritance;

public class bahubali extends vikings{
//    this is the class where we will use inhertance
//    we already have a class called vikings

//    as we want to build a similar type of viking.
//    why to make duplicate or to write code againg
//    simply inhertance it.

//    when a make a new class from the existing class with or without
//    new features it is known as inheritance.

//    that new class is known as
//    1.sub class 2.Extended class 3.child class

//    and the existing class from where the new class got derive is known as
//    1.super class 2.parent class 3.base class

//    let do inheritance.
//    as you can see in the line 3 where the bahubali is declared
//    where there are some extra words as "extends vikings"
//    that is the main thing. it means this class is a Extended or child class of vikings
//    it will work as exactly as vikings does. untill we provide some new feature.

//    i can create a object using bahubali class but i can ask it to work like vikings.
//    and it will work.
//    this is what inheritance make possible.

//    what if i want some more new feature for bahubali that vikings doesn't have.
//    for that case simply add new features.

//    like
    String name;
    String loved;

    void propose(){
        System.out.println(name + " propose to "+ loved);
    }

//    this is a new feature which is not in vikings but is there in bahubali.


//    now, what to do if there is some action in both the class like danceing and figting.
//    but there mehtod name is same.

//    it means as we already have a method (function in java) fight() method in vikings whose
//    output is to make fight the object .


//    but we want bahubali to dance. when we call method fight()

//    to do that simply declare a method fight() with action dance in it.

    void fight(){
        System.out.println(name + " dance as much as you can. do not stop. untill i tell to you to stop.");
    }

//    here, we have made an method figth() whose name is similar to a method in vikings
//    here, a question arise if we call the method figth() whose method is gona called?

//    if we made an object from bahubali then the mathod fight() it will give output as Dance.
//    in other hade if object is made from class vikings it will give output as fight.

//    it happens because the parent class is vikings and extended class is bahubali.
//    as we have declared a method fight() with different action in bahubali itslef.
//    therefore, it will not go to vikings anymore because the class bahubali already has
//    the method fight(). so, it will act in the way we have instructed in it. which is different from vikings.
//    this is known as OVERRIDING.

//    if the object is made from vikings and we call fight() method. here it will directly go to vikings class.
//    and it will give the output fight.
//    as its the parent class.



}

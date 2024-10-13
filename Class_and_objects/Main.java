package Class_and_objects;

public class Main {
    public static void main(String[] args) {


//        using ragnar(class) we have created an object called viking1
//        then decalred the name and age of object
//        which is features for object we have made in class

//              syntax to creat an object
//        ClassName object_name = new ClassName();

        ragnar viking1 = new ragnar();
        viking1.name = "biswa";
        viking1.Age = 21;

//        as we had also made an method or work to do for object
//        i.e fighting so in last line we gave instruction to fight.

        viking1.fight();
    }
}
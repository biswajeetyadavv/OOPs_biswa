package Abstraction;

public class Main_Abstraction {
//    first go through main_Abstractionj.java
//    then go to joe.java

    public static void main(String args[]){

//    here we will creat an object from class joe(stocker)

//    class syntax
//    classname object_name = new classname();

        joe stoker1 = new joe();
        stoker1.name = "biswa";
        stoker1.age = 19;

        stoker1.find("pratima");

//        here, as the fuction find runs perfectly and gives output.
//        but we dont know the things are going behind the find() funtion.
//        those behind work which are hiding are not important for use know even,
//        as we only need the output.

//        Hiding of such non important codes and showing only necessary codes are known as
//        ABSTRACTION.

//        the backend or Abstraction code is running in joe.java 
//        go to joe.java to see the backend (Abstraction).

    }


}

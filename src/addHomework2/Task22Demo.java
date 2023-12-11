package addHomework2;

import lesson04.BooksUtil;

public class Task22Demo {

    public static void main(String[] args) {

        Task22 myDog = new Task22("Kit", "Black");

        myDog.dog();

        System.out.println("=============== change color ====================");

        Task22Util util = new Task22Util();
        util.changeTask22Color("Rad", myDog);

        myDog.dog();

}}

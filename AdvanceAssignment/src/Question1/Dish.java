package Question1;

public class Dish {
    int dishID;
    static String dishName;
    int creationTime;
    Dish(int dishID,String dishName,int creationTime)
    {
        super();
        this.dishID=dishID;
        this.dishName=dishName;
        this.creationTime=creationTime;
    }


    void show()
    {
        System.out.println("Dish id is "+dishID);
        System.out.println("Dish name is "+dishName);
        System.out.println("creation time : "+creationTime+" minutes");
    }
}

package Adv_1;

import java.util.ArrayList;

/**
 * public class created DishDesignImplementation to use different type of Dishes designing
 */
public class DishDesignImplementation {

     /**
     * public variable declared as dishId,dName and creationTime for a dish
     */
    public int dishId;
    public String dName;
    public double creationTime;   
   
    /**
     * Creates a DishDesignImplementation with the given below parameters.
     * @param dishId this associated with  new dish ID
     * @param dName this associated with  new dish name
     * @param creationTime this associated with  new dish creation time in minutes
     */
    public DishDesignImplementation(int dishId, String dName, double creationTime) {

        // 3-arguments parameterized constructor
        
        super();
        this.dishId = dishId;
        this.dName = dName;
        this.creationTime = creationTime;

    }
    
     /**
     * override toString() method
     * @return this associated to return new Dish with their id, name and preparation time
     */
    @Override
    public String toString() {
        return "dish_prepared[dishId=" + dishId
                + ", dishName=" + dName
                + ", dishPreparation_Time =" + creationTime
                + "]";
    }
    // main class called
    public static void main(String[] args) {

        // create ArrayList object to store dish records
        ArrayList<DishDesignImplementation> dish_Records = new ArrayList<DishDesignImplementation>();

        // add dish records to AL object
        dish_Records.add(new DishDesignImplementation(141, "korma", 15));
        dish_Records.add(new DishDesignImplementation(152, "rajma", 20.50 ));
        dish_Records.add(new DishDesignImplementation(103, "Crisp-papadum", 50));
        dish_Records.add(new DishDesignImplementation(104, "Palak-paneer", 25));
        dish_Records.add(new DishDesignImplementation(105, "Aloo gobi", 45.15 ));


        // retrieving employee records using enhanced forEach loop
        for (DishDesignImplementation dish : dish_Records) {
            System.out.println(dish);
        }
    }
}


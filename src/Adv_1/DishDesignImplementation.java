package Adv_1;

import java.util.ArrayList;

// public class created as name DishDesignImplementation
public class DishDesignImplementation {

    // member variables
    public int dishId;
    public String dName;
    public double creationTime;                                       // taken preparation time of dish in minutes

    public DishDesignImplementation(int dishId, String dName, double creationTime) {



        // 3-arguments parameterized constructor


        super();
        this.dishId = dishId;
        this.dName = dName;
        this.creationTime = creationTime;

    }

    // override toString() method

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


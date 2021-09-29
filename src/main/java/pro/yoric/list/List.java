package pro.yoric.list;

import java.util.ArrayList;
import java.util.Iterator;

public class List
{
    public static void main(String... args)
    {
        ArrayList<CarID> car = new ArrayList<>();

        // first method for adding objects to ArrayList
        CarID car1 = new CarID("5612AA-7");
        CarID car2 = new CarID("1375MP-5");
        car.add(car1);
        car.add(car2);

        // second method, use anonymous object
        car.add(new CarID("9945MC-7"));
        car.add(new CarID("3425TC-2"));

        System.out.println(
            "ArryaList have a size: " +
            car.size()
        );

        System.out.println(
            "Is ArryaList contains car1 object?: " +
            car.contains(car1)
        );

        int index = car.indexOf(car2);
        System.out.println(
                "Car2 have a following Index: " +
                index
        );

        CarID chosenNumber = car.get(3);
        System.out.println(
                "Get an object by the Index 3: " +
                chosenNumber
        );

        Iterator<CarID> iterator = car.iterator();
        while (iterator.hasNext())
        {
            System.out.println(
                iterator
                    .next()
                    .getCarId()
            );
        }

        car.clear();
        System.out.println(
            "Is ArrayList Empty? " +
            car.isEmpty()
        );

        // Here an ERROR: IndexOutOFBounds course ArrayList is empty
        //chosenNumber = car.get(2);
    }
}

class CarID
{
    private String carId;

    public CarID(String cars)
    {
        this.carId = cars;
    }

    String getCarId()
    {
        return carId;
    }
}

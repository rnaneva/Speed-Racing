package DefiningClasses.Exc.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();

        while (number-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelCost = Double.parseDouble(data[2]);
            Car car = new Car(name, fuelAmount, fuelCost);
            cars.put(name, car);
        }

        String command = scanner.nextLine();

        while(!command.equals("End")){
            String[] driveCommand = command.split("\\s+");
            String model = driveCommand[1];
            double distance = Double.parseDouble(driveCommand[2]);
            Car thisCar = cars.get(model);
            if (thisCar.hasEnoughFuel(thisCar.getFuelCost(), distance, thisCar.getFuelAmount())){
                thisCar.drive(thisCar.getFuelCost(), distance);
            } else {
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }


        cars.values().forEach(System.out::println);
    }
}

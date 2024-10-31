public class Odometer {
    static int odometer_number;
    static double gallons_of_gasoline;
    static double the_efficiency;
    public static void reset_the_odometer()
    {
        odometer_number =0;
    }
    public static void set_the_fuel_efficiency(double fuel_efficiency_number)
    {
        the_efficiency = fuel_efficiency_number;
    }
    public static void adds_to_the_odometers_total(int num_of_add)
    {
        odometer_number = odometer_number + num_of_add;
    }
    public static double returns_number_of_gallons_of_gasoline()
    {
        if(the_efficiency!=0||odometer_number!=0)
        {
            gallons_of_gasoline = odometer_number / the_efficiency;
            return gallons_of_gasoline;
        }
        return 0;
    }

    public static void main(String[] args) {
        reset_the_odometer();
        set_the_fuel_efficiency(5);
        adds_to_the_odometers_total(15);
        adds_to_the_odometers_total(25);
        adds_to_the_odometers_total(35);
        System.out.println("the gallons of gasoline is " +returns_number_of_gallons_of_gasoline());
    }
}

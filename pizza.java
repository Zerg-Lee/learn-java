
public class pizza {
    private static int size = 0;
    private static int cheese =0;
    private static int pepperoni=0;
    private static int ham =0;

    public static void choose_size(int size_num)
    {
        size=size_num;
    }
    public static void choose_cheese(int cheese_num)
    {
        cheese=cheese_num;
    }
    public static void choose_pepperoni(int pepperoni_num)
    {
        pepperoni=pepperoni_num;
    }
    public static void choose_ham(int ham_num)
    {
        ham=ham_num;
    }
    public static double calcCost()
    {
        double prize = 0;
        if(size==1)
        {
            prize=prize+10;
        }
        if(size==2)
        {
            prize=prize+12;
        }
        if(size==3)
        {
            prize=prize+14;
        }
        prize=prize+cheese*2+pepperoni*2+ham*2;
        return prize;
    }
    public static String getDescription()
    {
        String size_st ="";
        if(size==1)
        {
            size_st="SMALL";
        }
        if(size==2)
        {
            size_st="MED";
        }
        if(size==3)
        {
            size_st="LARGE";
        }
        return "This "+size_st+" Pizza have "+cheese+" CHEESE topping " +pepperoni+" PEPPERONI topping " +ham+" HAM topping, and you should pay "+calcCost()+" $";
    }

    public static void main(String[] args) {

        choose_size(1);
        choose_cheese(3);
        choose_pepperoni(5);
        choose_ham(7);
        System.out.println(getDescription());
    }
}

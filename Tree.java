public class Tree {
    //
    // instance data
    private String type;
    private int height;

    //
    // class data
    private static int NumTrees;

    //
    //  constructor
    public Tree()
    {
        numtrees++;
        System.out.printf("There are %s tree in the forest \n");
    }

    public Tree(String type, int height)
    {
        this.type = type;
        this.height = height;
    }

    public static int getNumTrees() {
        return NumTrees;
    }


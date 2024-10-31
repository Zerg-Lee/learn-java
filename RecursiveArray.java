public class RecursiveArray {
    String[][] data = {
            {"A"},
            {"1"},
            {"2"},
            {"XX","YY"}
    };
    public void combinations() {
        helperMethod("",0, 0);
    }

    private void helperMethod(String oldCombination, int row, int col) {
        String newCombination = oldCombination + data[row][col];

        if (row == data.length - 1) {
            System.out.println(newCombination);
        }

        if (row < data.length - 1) {
            helperMethod(newCombination, row + 1, 0);
        }

        if (col < data[row].length - 1) {
            helperMethod(oldCombination, row, col + 1);
        }
    }
}

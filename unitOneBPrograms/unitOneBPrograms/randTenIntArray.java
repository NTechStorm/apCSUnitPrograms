public class randTenIntArray
{
    public static void main(String args[]) {
        int posValues = 0;
        int[ ] values = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i<10; i++) {
            int val = (int) (Math.random() * 100);
            int negatize = (int) (Math.random() * 2);
            if (negatize == 1) {
                val = val * -1;
            } else {
                val = val * 1;
                posValues ++;
            }
            values[i] = val;
        }
        int i = 0;
        while (i<10){
            System.out.println(values[i]);
            i++;
        }
        System.out.println("There are "+posValues+" postitive integers");
    }
}

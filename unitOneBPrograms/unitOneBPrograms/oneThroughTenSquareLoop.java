public class oneThroughTenSquareLoop
{
    public static void main(String args[]) {
        for (int num=1; num<11; num++){
            int randNum = (int)(Math.random()* Math.pow(num, 2)) + num;
            System.out.println(num + "\t" + Math.pow(num, 2) + "\t" + randNum);
        }
    }
}

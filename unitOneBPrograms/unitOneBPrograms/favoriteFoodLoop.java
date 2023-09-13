public class favoriteFoodLoop
{
    public static void main(String args[]) {
        String[ ] favoriteFoods = {"Adobo", "Lo Mein", "Chicken Noodle Soup", "Potato Pizza", "Onigiri"};
        for (int i=0; i<favoriteFoods.length; i++){
            System.out.println(favoriteFoods[i]);
        } 
        System.out.println("Exchanging Vegetables...");
        int veggieExchange = (int)(Math.random()*5);
        favoriteFoods[veggieExchange] = "Veggies!";
        for (int i=0; i<favoriteFoods.length; i++){
            System.out.println(favoriteFoods[i]);
        }
    }
}

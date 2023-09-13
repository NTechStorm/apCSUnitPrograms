public class favoriteMusicArtists
{
    public static void main(String[] args)
    {
        String[ ] favArtists = {"Salem Ilese", "Conan Grey", "Stella Cole"};
        int artistLenght = favArtists.length;
        for (int i=0; i<artistLenght; i++) {
            System.out.println(favArtists[i]);
        }
        int rnd = (int)(Math.random()*artistLenght+1);
        String michael = "Michael Jackson";
        favArtists[rnd] = michael;
        
        System.out.println("");
        
        for (int i=0; i<artistLenght; i++) {
                boolean testIfMichael = favArtists[i].equals(michael);
                if (testIfMichael == true) {
                    System.out.println("We found Michael.");
                } else {
                    System.out.println("No Michael in music: " + i);
                }
        }
    }
}

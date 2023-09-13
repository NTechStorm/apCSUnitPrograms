public class favMoviesAndSongs
{
    public static void main(String args[]) {
        String[ ] movies = {"Harry Potter", "Ten Things I Hate About You", "Indiana Jones"};
        String[ ] songs = {"A Thousand Years by Christina Perri", "Mamma Mia by ABBA", "Dandelions by Ruth B."};
        
        System.out.println("Favorite Movies:");
        for (int i = 0; i<3; i++) {
            System.out.println(movies[i]);
        }
        System.out.println("");
        System.out.println("Favorite Songs:");
        int i = 0;
        while (i < 3) {
            if (i==2) {
                System.out.print(songs[i]);
                i++;
            } else {
                System.out.print(songs[i] + ", ");
                i++;
            }
        }
    }
}
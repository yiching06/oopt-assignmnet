public class Test {
    public static void main(String[] args) {
        Movie [] movies = {new Movie ("A Minecraft Movie", "Action, Adventure, Family" ,100, 24.00),
                new Movie("Ne Zha", "Animation, Action, Drama", 144,24.00),
                new Movie("The Lion King", "Animation, Adventure, Drama", 118, 24.00),
                new Movie("Howl's Moving Castle", "Animation, Adventure, Fantasy", 120, 22.00),};

                System.out.println("\nMovie: ");
			for (int i = 0; i < movies.length; ++i) {
				System.out.println((i + 1) + ". " + movies[i] + "\n");
			}

            
    }

}

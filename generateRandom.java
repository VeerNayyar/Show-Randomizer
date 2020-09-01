import java.util.Random;

public class generateRandom{
    public static void main(String[] args){

        String[] shows = new String[4];
        shows[0] = "Leverage";
        shows[1] = "Psych";
        shows[2] = "House";
        shows[3] = "Monk";

        Random rand = new Random();
        int rand_int = rand.nextInt(4);

        int randSeason = rand.nextInt(6);
        int episodeAmount;
        int randEpisode;
        if (shows[rand_int].equalsIgnoreCase("Leverage")) {
            if (randSeason == 1){
                episodeAmount = 13;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Leverage");
                System.out.println("Season: 1");
                System.out.println("Episode: " + randEpisode);
            }       
            else if (randSeason == 2) {
                episodeAmount = 15;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Leverage");
                System.out.println("Season: 2");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 3){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Leverage");
                System.out.println("Season: 3");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 4){
                episodeAmount = 18;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Leverage");
                System.out.println("Season: 4");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 5){
                episodeAmount = 15;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Leverage");
                System.out.println("Season: 5");
                System.out.println("Episode: " + randEpisode);
            }
        }

        randSeason = rand.nextInt(9);
        if (shows[rand_int].equalsIgnoreCase("Psych")) {
            if (randSeason == 1){
                episodeAmount = 15;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 1");
                System.out.println("Episode: " + randEpisode);
            }       
            else if (randSeason == 2) {
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 2");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 3){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 3");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 4){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 4");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 5){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 5");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 6){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 6");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 7){
                episodeAmount = 14;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 7");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 8){
                episodeAmount = 10;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Psych");
                System.out.println("Season: 8");
                System.out.println("Episode: " + randEpisode);
            }
        }
        
        if (shows[rand_int].equalsIgnoreCase("House")) {
            if (randSeason == 1){
                episodeAmount = 22;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 1");
                System.out.println("Episode: " + randEpisode);
            }  		
            else if (randSeason == 2) {
                episodeAmount = 24;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 2");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 3){
                episodeAmount = 24;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 3");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 4){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 4");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 5){
                episodeAmount = 24;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 5");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 6){
                episodeAmount = 22;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 6");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 7){
                episodeAmount = 23;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 7");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 8){
                episodeAmount = 22;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: House");
                System.out.println("Season: 8");
                System.out.println("Episode: " + randEpisode);
            }
        }
       
        if (shows[rand_int].equalsIgnoreCase("Monk")) {
            if (randSeason == 1){
                episodeAmount = 13;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 1");
                System.out.println("Episode: " + randEpisode);
            }  		
            else if (randSeason == 2) {
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 2");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 3){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 3");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 4){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 4");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 5){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 5");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 6){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 6");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 7){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 7");
                System.out.println("Episode: " + randEpisode);
            }
            else if (randSeason == 8){
                episodeAmount = 16;
                randEpisode = rand.nextInt(episodeAmount + 1);
                System.out.println("Please choose: Monk");
                System.out.println("Season: 8");
                System.out.println("Episode: " + randEpisode);
            }
        }
        
    }
}




public class YouTubeMain {
    public static void main(String[] args) {
        
        // Creating YouTube channel
        Channel techChannel = new YouTubeChannel("OOP-Design-Pattern");

        // Creating followers
        Follower follower1 = new Follower("Daniel");
        Follower follower2 = new Follower("Hilina");

        // Subscribing followers to the channel
        techChannel.addObserver(follower1);
        techChannel.addObserver(follower2);

        // Uploading a new video
        techChannel.setStatus("Java Observer Pattern");

        // Unsubscribing a follower
        techChannel.removeObserver(follower1);
    }
}
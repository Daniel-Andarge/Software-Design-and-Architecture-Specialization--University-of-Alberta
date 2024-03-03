public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        System.out.println(followerName + " received an update: " + status);
    }

    public void play(){
        System.out.printl("Playing video");
    }
}

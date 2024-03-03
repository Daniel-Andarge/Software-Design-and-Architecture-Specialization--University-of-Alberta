import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String channelName;
    private String status;
    private List<Observer> followers;


    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.followers = new ArrayList<>();
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
    @Override
    public void registerObserver(Observer follower) {
        followers.add(follower);
    }

    @Override
    public void removeObserver(Observer follower) {
        followers.remove(follower);
    }

    @Override
    public void notifyObservers(String status) {
        for (Observer follower : followers) {
            follower.update(status);
        }
    }
}

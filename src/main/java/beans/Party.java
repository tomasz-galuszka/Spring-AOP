package beans;

/**
 * Created by tomasz on 30.10.14.
 */
public class Party implements BaseParty {

    public Party() {
    }

    @Override
    public void start() {
        System.out.println("-- Party started");
    }
}

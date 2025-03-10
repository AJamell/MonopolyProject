package Model;

public class GoSpace extends BoardSpace {
    private static final int GO_MONEY = 200;
    public GoSpace() {
        super("Go", 0);
    }
    @Override
    public void onLanding(Player player) {
        player.addMoney(GO_MONEY);
    }
    @Override
    public void onPassing(Player player) {
        player.addMoney(GO_MONEY);
    }
}

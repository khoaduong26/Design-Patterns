
public class LightSwitch {
    private State state;

    public LightSwitch() {
        state = new OffState(); // ban đầu tắt
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press() {
        state.press(this);
    }
}

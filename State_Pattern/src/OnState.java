
public class OnState implements State {
    @Override
    public void press(LightSwitch context) {
        System.out.println("Turn off the light");
        context.setState(new OffState());
    }
}

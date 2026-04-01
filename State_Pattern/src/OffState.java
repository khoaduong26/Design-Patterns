public class OffState implements State{
    @Override
    public void press(LightSwitch context) {
        System.out.println("Turn on the light");
        context.setState(new OnState());
    }
 
}

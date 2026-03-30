public class OffState implements State{
    @Override
    public void press(LightSwitch context) {
        // TODO Auto-generated method stub
        System.out.println("Turn on the light");
        context.setState(new OnState());
    }
    
}

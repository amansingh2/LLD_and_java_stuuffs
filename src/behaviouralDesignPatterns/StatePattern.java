package behaviouralDesignPatterns;

/*
Allows an object to alter its behaviour when it's internal state changes,
the object will appear to change its class.
 */

//interface PhoneState{
//    void pressPowerButton(PhoneContext context);
//}

/*
Advantages:
    Open/Close Principle: You can add new states without changing existing state classes
                            or the context.

 */

interface LightState{
    void pressSwitch(LightSwitchContext context);
}

class OffState implements LightState{
    @Override
    public void pressSwitch(LightSwitchContext context) {
        System.out.println("Turning on Light!");
        context.setState(new OnState());
    }
}

class OnState implements LightState{
    @Override
    public void pressSwitch(LightSwitchContext context) {
        System.out.println("Turning off Light! ");
        context.setState(new OffState());
    }
}
class LightSwitchContext{
    private LightState state;

    public LightSwitchContext(){
        state = new OffState(); // start with light off
    }
    public void setState(LightState state){
        this.state = state;
    }
    public void pressSwitch(){
        state.pressSwitch(this);
    }
}
public class StatePattern {
    public static void main(String[] args) {
        LightSwitchContext lightSwitch = new LightSwitchContext();

        lightSwitch.pressSwitch();
        lightSwitch.pressSwitch();
        lightSwitch.pressSwitch();
    }
}

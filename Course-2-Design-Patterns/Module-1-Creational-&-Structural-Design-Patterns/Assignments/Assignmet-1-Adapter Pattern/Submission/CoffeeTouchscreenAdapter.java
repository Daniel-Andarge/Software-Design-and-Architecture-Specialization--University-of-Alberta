package CoffeeMachine;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

private OldCoffeeMachine oldVendingMachine;


public void connect(OldCoffeeMachine oldVendingMachine) {

this.oldVendingMachine = oldVendingMachine;

@Override
public void ChooseFirstSelection (){

oldVendingMachine.selectA();
}

@Override
public void ChooseSecondSelection ()
{

oldVendingMachine.selectB();

}
}
}

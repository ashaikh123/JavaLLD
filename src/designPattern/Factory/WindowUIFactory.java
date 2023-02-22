package designPattern.Factory;

import designPattern.Factory.Component.Button.WindowButton;
import designPattern.Factory.Component.Button.Button;
import designPattern.Factory.Component.Menu.WindowMenu;
import designPattern.Factory.Component.Menu.Menu;

public class WindowUIFactory implements UIFactory{

    @Override
    public Button creatButton() {
        return new WindowButton();
    }

    @Override
    public Menu creatMenu() {
        return new WindowMenu();
    }
}

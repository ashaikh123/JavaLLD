package designPattern.Factory;

import designPattern.Factory.Component.Button.Button;
import designPattern.Factory.Component.Button.IosButton;
import designPattern.Factory.Component.Menu.IosMenu;
import designPattern.Factory.Component.Menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button creatButton() {
        return new IosButton();
    }

    @Override
    public Menu creatMenu() {
        return new IosMenu();
    }
}

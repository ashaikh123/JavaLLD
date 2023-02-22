package designPattern.Factory;

import designPattern.Factory.Component.Button.MacButton;
import designPattern.Factory.Component.Button.Button;
import designPattern.Factory.Component.Menu.MacMenu;
import designPattern.Factory.Component.Menu.Menu;

public class MacUIFactory implements UIFactory{

    @Override
    public Button creatButton() {
        return new MacButton();
    }

    @Override
    public Menu creatMenu() {
        return new MacMenu();
    }
}

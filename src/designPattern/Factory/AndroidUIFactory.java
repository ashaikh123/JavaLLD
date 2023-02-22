package designPattern.Factory;

import designPattern.Factory.Component.Button.AndroidButton;
import designPattern.Factory.Component.Button.Button;
import designPattern.Factory.Component.Menu.AndroidMenu;
import designPattern.Factory.Component.Menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button creatButton() {
        return new AndroidButton();
    }

    @Override
    public Menu creatMenu() {
        return new AndroidMenu();
    }
}

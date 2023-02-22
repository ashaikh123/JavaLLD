package designPattern.Factory;

import designPattern.Factory.Component.Button.Button;
import designPattern.Factory.Component.Menu.Menu;

public interface UIFactory {
    Button creatButton();
    Menu creatMenu();
}

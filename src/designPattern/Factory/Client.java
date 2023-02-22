package designPattern.Factory;

import designPattern.Factory.Component.Button.Button;
import designPattern.Factory.Component.Menu.Menu;

public class Client {
    public static void main(String[] args){

        Flutter f= new Flutter(SupportedPlatforms.WINDOWS);
        UIFactory UF=f.creatUIFactory();
        Menu m= UF.creatMenu();
        Button b= UF.creatButton();
    }
}

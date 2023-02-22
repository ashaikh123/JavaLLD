package designPattern.Factory;

public class UIFactoryFactory{

    public static UIFactory createUIFactory(SupportedPlatforms p){
        return switch (p){
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            case WINDOWS -> new WindowUIFactory();
            case MAC -> new MacUIFactory();
        };
    }
}

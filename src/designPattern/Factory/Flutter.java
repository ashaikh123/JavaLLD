package designPattern.Factory;

public class Flutter
{
    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting Theme...");
    }

    public UIFactory creatUIFactory(){

        return  UIFactoryFactory.createUIFactory(platform);
    }

}

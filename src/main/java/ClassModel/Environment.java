package ClassModel;

public class Environment {

    private String deviceName ;
    private String app ;
    private String platformName ;
    private String appPackage;
    private String version ;
    private String udid ;
    private String reset ;

    public Environment(String deviceName, String app, String platformName, String appPackage, String version, String udid, String reset) {
        this.deviceName = deviceName;
        this.app = app;
        this.platformName = platformName;
        this.appPackage = appPackage;
        this.version = version;
        this.udid = udid;
        this.reset = reset;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getApp() {
        return app;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getVersion() {
        return version;
    }

    public String getUdid() {
        return udid;
    }

    public String getReset() {
        return reset;
    }
}

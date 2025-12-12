package com.training.SamMasterProject.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

    @Value("SamMasterApp")
    String myAppName;

    @Value("${myapp.version}")
    double myAppVersion;

    @Value("${myapp.author}")
    String myAppAuthor;

    public String getMyAppName() {
        return myAppName;
    }

    public void setMyAppName(String myAppName) {
        this.myAppName = myAppName;
    }

    public double getMyAppVersion() {
        return myAppVersion;
    }

    public void setMyAppVersion(double myAppVersion) {
        this.myAppVersion = myAppVersion;
    }

    public String getMyAppAuthor() {
        return myAppAuthor;
    }

    public void setMyAppAuthor(String myAppAuthor) {
        this.myAppAuthor = myAppAuthor;
    }

    public MyApp(String myAppName, double myAppVersion, String myAppAuthor) {
        this.myAppName = myAppName;
        this.myAppVersion = myAppVersion;
        this.myAppAuthor = myAppAuthor;
    }

    public MyApp() {
    }

    @Override
    public String toString() {
        return "MyApp{" +
                "myAppName='" + myAppName + '\'' +
                ", myAppVersion=" + myAppVersion +
                ", myAppAuthor='" + myAppAuthor + '\'' +
                '}';
    }
}

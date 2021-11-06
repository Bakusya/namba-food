package utilities;

public class EnvironmentManager {

    //dev,qa,prod

    public static String baseUrl;
    public static String userName;
    public static String password;



    public static void setUpEnvironment(){
        switch (ConfigReader.getProperty("environment").toLowerCase()){
            case "dev":
                break;
            case "qa":
                break;
            case "prod":
                break;
        }
    }



    private static void DEV(){

        baseUrl = "https://nambafood.kg/";
        userName = "DevUserName";
        password = "somePassword";
    }

    public static void QA(){
        baseUrl = "https://nambafood.kg/";
        userName = "QAUserName";
        password = "somePassword";
    }

    public static void Prod(){
        baseUrl = "https://nambafood.kg/";
        userName = "ProdUserName";
        password = "somePassword";

    }
}

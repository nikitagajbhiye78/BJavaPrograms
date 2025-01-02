package Nov_OOPs_Concepts.Static_Keyword;

public enum Enum_ex2_1 {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private String name;

    Enum_ex2_1 (String name) {
            this.name = name;
        }

     String getValue(){
            return name;
     }

}

package Nov_OOPs_Concepts.Static_Keyword;

public enum Enum_Ex2 {

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    //Step 1- Create enum class
    //Step 2- Create instaces
    //Step 3- Create a function
    // normal function


    private String hexacode;

    Enum_Ex2 (String hexacode){
        this.hexacode = hexacode;
    }

    String getValue() {
        return hexacode;
    }
}

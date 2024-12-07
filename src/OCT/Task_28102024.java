package OCT;

public class Task_28102024 {
    public static void main(String[] args) {
        // 1. charAt
        String SS = "Nikita Gajbhiye";
       System.out.println(SS.charAt(7));

       // 2. Contains
        String SS1 = "Nikita Gajbhiye";
        System.out.println(SS1.contains("ki"));
        System.out.println(SS1.contains("rit"));

        // 3. index
        String SS2 = "Nikita12Gajbhiye";
        System.out.println(SS2.indexOf("a"));

        // 4. lastIndex
        String SS3 = "Nikita12Gajbhiye";
        System.out.println(SS3.lastIndexOf("y"));

        // 5. Replace function
        String SS4 = "NikitaGajbhiye";
        System.out.println(SS4.replace("ta","iy"));

        // 6. ReplaceAll
        String SS5 = "Nikita12Gajbhiye";
        System.out.println(SS5.replaceAll("\\d+" , ""));

        // 7. Splitting string
        String SS6 = "Nikita,gajbhiye";
        String[] split_value = SS6.split(",");
        System.out.println(split_value[0]);
        System.out.println(split_value[1]);

    }
}

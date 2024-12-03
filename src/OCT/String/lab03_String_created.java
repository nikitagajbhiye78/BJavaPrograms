package OCT.String;

public class lab03_String_created {
    public static void main(String[] args) {

     // This will be created in String Constant Pool (IMP: "=" Assigment operator always created string in SCP)

        String name = "Nikita";
           name = "Rony";
           name = "Nik";
           name = "Rony";

        System.out.println(name);

    // Another way to create string (this will be created in heap area)

    String name2 = new String("Nik");
    String name3 = new String("Nik");
    String name4 = new String("Nik");

    }
}

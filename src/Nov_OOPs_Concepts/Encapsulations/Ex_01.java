package Nov_OOPs_Concepts.Encapsulations;

public class Ex_01 {
    public static void main(String[] args) {
       person p1 = new person();
        p1.getName();
        p1.setName("Nikita");
    }
}
class person {
    // Step 1: Declare private fields (data hiding)
   private String name;
   private String phone_no;

    // Step 2: Create a public getter method to access the name
    public String getName() {
        return name;
    }

    // Step 3: Create a public setter method to access the name
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public person() {
        this.name = name;
        this.phone_no = phone_no;

    }
}


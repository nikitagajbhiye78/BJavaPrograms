package Nov_OOPs_Concepts.Encapsulations_part2.Criminal;

import Nov_OOPs_Concepts.Encapsulations_part2.Police.cops;

public class theife {
    public static void main(String[] args) {
        cops c = new cops(5);
        c.canIShoot(); // if i used protected modifier in cops function theife will not have access to shoot
    }
}

package lotr;
import kick.StrongKick;
import java.util.Random;
public class VIP extends Character{
    public  VIP(int max_hp, int min_hp, int max_power, int min_power){
//        We use this class to reduce repitition of code for knight and king character
        super(new Random().nextInt(max_hp-min_hp) + min_hp, new Random().nextInt(max_power-min_power) + min_power, new StrongKick());
    }
}
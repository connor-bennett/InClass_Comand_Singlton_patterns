/**
 * @ author: Connor Bennett
 * 3/1/23
 * Command Interface
 * example of singlton design pattern
 */

public class PowerStone implements IStone{

    private final Double powerMultiplier = 1.5;
    private static PowerStone powerStone = null;

    private PowerStone(){};             // Controls instance os power stone to make sure only one instance exists

    public static PowerStone getInstance(){
        if(powerStone == null){
            powerStone = new PowerStone();
        }
        return powerStone;
    }


    @Override
    public void special(Person person) {
        Double temp = person.getPower();
        System.out.println(person.getName() + "'s power is " + temp);
        person.setPower(temp+powerMultiplier);
        System.out.println(person.getName() + "'s power is now " + person.getPower());
    }
}


/**
 * @ author : Connor Bennett
 * 3/1/23
 * Decription: Concrete implementation os IsStone
 */
public class SpaceStone implements IStone {
    String location = "here";
    private static SpaceStone spaceStone = null;
    private SpaceStone(){
        System.out.println("Instantiating Space Stone");
    };

    public static SpaceStone getInstance(){
        if(spaceStone == null){
            spaceStone = new SpaceStone();
        }
        return spaceStone;
    }
    @Override
    public void special(Person person) {
        System.out.println(person.getLocation() + " is at " + getLocation());
        person.setLocation("hehe");
        System.out.println(person.getName() + "  now at " + person.getLocation());
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

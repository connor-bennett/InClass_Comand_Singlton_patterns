import java.util.HashMap;

/**
 * Author: Connor Bennett
 * 3/1/23
 * Builds Thanos
 */
public class Titan extends Person{
    HashMap<String, IStone> gauntlet = new HashMap<>();

    public void addStone(IStone stone){
        if(stone instanceof PowerStone){
            gauntlet.put("Power ", stone);
        }
        if(stone instanceof SpaceStone){
            gauntlet.put("Space stone", stone);
        }
    }

    public void snap(){
        for(String stone: gauntlet.keySet()){
            System.out.println("Activating the " + stone + " Stone");
            gauntlet.get(stone).special(this);
        }
    }

    public Titan() {
        super(500.0, "Thanos", "Titan");
    }


}

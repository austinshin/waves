import java.awt.Graphics;
import java.util.LinkedList;
/**
 * Created by Link on 2/27/2016.
 */
public class Handler {

    LinkedList<GameObject> object = new LinkedList<GameObject>();

    public void tick() {
        // this will loop through each of the objects and tick it.
        for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i); //allows us to get the id of which object we are at.
            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        // this will loop through each of the objects and render it.
        for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);
            tempObject.render(g);
        }
    }

    public void addObject(GameObject object) {
        this.object.add(object);
    }

    public void removeObject(GameObject object) {
        this.object.remove(object);
    }
}

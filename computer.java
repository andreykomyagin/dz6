import java.util.ArrayList;

/**
 * computer
 */
public class computer {

    String marka;
    int weight;
    ArrayList<String> color;
    int size;
    int memory;

    public computer(String marka, int weight, ArrayList<String> color, int size, int memory){
        this.marka = marka;
        this.weight = weight;
        this.color = color;
        this.size = size;
        this.memory = memory;
    }
    public String getMarka(){
        return marka;
    }
    public int getWeight(){
        return weight;
    }
    public ArrayList<String> getColor(){
        return color;
    }
    public int getSize(){
        return size;
    }
    public int getMemory(){
        return memory;
    }
    
    @Override
    public String toString() {
        return "Марка: " + marka + "\n"
        + "Цвет: " + color + "\n";
    }

}
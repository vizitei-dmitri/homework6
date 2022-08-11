package other;

public class niscshe {

    private String size;
    private String shape;
    private int count;
    private float radius;
    private char letter;


    public niscshe(String size, String shape, int count, float radius, char letter){
        this.shape = shape;
        this.size = size;
        this.count = count;
        this.radius = radius;
        this.letter = letter;

    }
    public niscshe(){}

    public String getSize(){
        return size;
    }
    public String getShape(){
        return shape;
    }
    public int getCount(){
        return count;
    }
    public float getRadius(){
        return radius;
    }
    public char getLetter(){
        return letter;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
}

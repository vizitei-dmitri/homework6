package other;

public class Parent {
    public static void main(String[] args){
        niscshe dpd = new niscshe("big","round",4,3.14f,'0');
        String size = dpd.getSize();
        String shape = dpd.getShape();
        dpd.setCount(-22);
        dpd.setRadius(22.1f);
        dpd.setLetter('G');
        System.out.println(dpd.getCount() +" "+ dpd.getLetter() +" "+ dpd.getRadius());

    }
}

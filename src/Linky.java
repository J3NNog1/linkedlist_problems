import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void main(String[] args){
//        LinkedList<String> linky = new LinkedList<String>();
//
//        linky.add("Robert");
//        linky.add("Jennifer");
//        linky.add("Luna");
//
////        linky.remove();// this removes from the front
//        //[Jennifer, Luna]
//        linky.clear();//this clears the whole list

        LinkedList<Integer> linky = new LinkedList<Integer>();
        linky.add(6);
        linky.add(78);
        linky.add(1);


        System.out.println(linky.get(1));
        Iterator it = linky.iterator();
        while(it.hasNext()) {
            if((int) it.next() == 78) {
                System.out.println("We found 78");
            }

        }


    }

}

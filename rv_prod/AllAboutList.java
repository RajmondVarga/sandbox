package rv_prod;

import java.util.ArrayList;
import java.util.List;

public class AllAboutList {
    void allAbout(){
        List<Integer> list = new ArrayList<>();
        list.add( 19 );
        list.add( 43 );
        list.add( 78 );

        System.out.println( list );
        //
        list.add( 2 , 52);
    }

    public static void main(String[] args) {
        AllAboutList allAboutList = new AllAboutList();
        allAboutList.allAbout();
    }
}

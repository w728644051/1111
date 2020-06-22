package shipList;
import java.util.ArrayList;


public class Text1 {
    public static void main(String[] args) {
         Drink kele = new Drink(); //可乐
         kele.setId(1);

         Drink xuebi =new Drink();//雪碧
         xuebi.setId(2);

         Drink baijiu=new Drink();//白酒
         baijiu.setId(3);




        Relation tansuan =new Relation();//关系1；碳酸饮料
        tansuan.setId(1);
        tansuan.setDrinkA(kele.getId());
        tansuan.setDrinkB(xuebi.getId());

        Relation toumingde=new Relation();//关系2；透明的
        toumingde.setId(2);
        toumingde.setDrinkA(xuebi.getId());
        toumingde.setDrinkB(baijiu.getId());

        //添加到集合
        ArrayList<Relation> DrinkList=new ArrayList<>();
        DrinkList.add(tansuan);//关系1
        DrinkList.add(toumingde);//关系2

        System.out.println(DrinkList);



    }
}

package actionsList;

import bean.ListWork;

import java.util.List;

/**
 * Created by Olga on 19.03.2017.
 */
public class FindTheSecondByLengthString {
    public String findSecondStringInList(ListWork listWork){
    List<String> list = listWork.getList();
   int maxSize = 0;
       for(String line : list){
       int lineLength = line.length();

       if(lineLength>maxSize){
           maxSize = lineLength;

       }


    }
        int preMaxSize = 0;
        for(String line : list){
            int lineLength = line.length();

            if(lineLength>preMaxSize && lineLength!=maxSize){
                preMaxSize = lineLength;

            }


        }
        System.out.println("Вторая по величине строка в листе содержит символов:" + preMaxSize);
        return list.get(preMaxSize-1);
    }
}

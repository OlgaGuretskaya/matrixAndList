package bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga on 19.03.2017.
 */
public class ListWork {
    List<String> list = new ArrayList<>();

    public ListWork(List<String> list) {
        this.list = list;
    }

    public ListWork() {
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ListWork{" +
                "list=" + list +
                '}';
    }
}

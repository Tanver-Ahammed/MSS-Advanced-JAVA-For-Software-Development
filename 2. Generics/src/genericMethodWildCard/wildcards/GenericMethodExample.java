package genericMethodWildCard.wildcards;

import java.util.List;

public class GenericMethodExample {
    //------------------Generic Method--------------------------------
    public <T extends Object> void addElementToList(T element, List<T> list) {
        list.add(element);
    }
}

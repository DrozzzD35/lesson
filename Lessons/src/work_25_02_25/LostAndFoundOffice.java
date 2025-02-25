package work_25_02_25;

import java.util.ArrayList;
import java.util.List;

public class LostAndFoundOffice {
    // создайте список things
    private List<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public void put(Object object) {
        things.add(object);
    }

    // реализуйте метод check()
    public boolean check(Object target) {
        if (target==null){
            System.out.println("Вещь не существует");
            return false;
        }
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }


    public List<Object> getThings() {
        return things;
    }

    public void setThings(List<Object> things) {
        this.things = things;
    }
}
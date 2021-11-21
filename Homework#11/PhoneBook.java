package avdeev.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, ArrayList<String>> innerData;

    public PhoneBook() {
        this.innerData = new HashMap<>();
    }

    public void add(String name, String phone) {

        if (!this.innerData.containsKey(name)) {
            ArrayList<String> phoneArr = new ArrayList<>();
            phoneArr.add(phone);
            this.innerData.put(name, phoneArr);
        } else {
            ArrayList<String> phones = this.innerData.get(name);
            if (!phones.contains(phones)) {
                phones.add(phone);
            }

        }

    }

    public ArrayList<String> get(String name) {

        return this.innerData.get(name);

    }




}

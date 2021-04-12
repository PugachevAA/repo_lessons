package ru.geekbrains.qr_1.level_2.lesson_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class YellowPages {
    private HashMap<String, HashSet> directory;
    private HashSet<String> phones;

    public YellowPages() {
        directory = new HashMap<>();
    }

    public void add(String name, String phone) {
        boolean writed = false;
        if (directory.size() == 0) {
            phones = new HashSet<>();
            phones.add(phone);
            directory.put(name, phones);
        } else {
            for (Map.Entry<String, HashSet> o : directory.entrySet()) {
                if (name.equals(o.getKey())) {
                    o.getValue().add(phone);
                    writed = true;
                    break;
                }
            }
            if (!writed) {
                phones = new HashSet<>();
                phones.add(phone);
                directory.put(name, phones);
            }
        }
    }

    public String get(String name) {
        return directory.get(name).toString();
    }
}

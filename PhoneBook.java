// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public PhoneBook(Map<String, List<String>> data) {
        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            phoneBook.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
    }

    public List<String> getPhoneNumbers(String name) {
        return phoneBook.get(name);
    }
    public static void main(String[] args) {
        Map<String, List<String>> data = new HashMap<>();
        data.put("Сергей Алексеевич", List.of("+1234567890", "+7777777777"));
        data.put("Лилия Владимировна", List.of("+1111111111", "+2222222222", "+3333333333"));
        PhoneBook phoneBook = new PhoneBook(data);

        List<String> johnPhones = phoneBook.getPhoneNumbers("Сергей Алексеевич");
        if (johnPhones != null) {
            System.out.println("Номера Сергея Алексеевича:");
            for (String phone : johnPhones) {
                System.out.println(phone);
            }
        }

        List<String> janePhones = phoneBook.getPhoneNumbers("Лилия Владимировна");
        if (janePhones != null) {
            System.out.println("Номера Лилии Владимировны:");
            for (String phone : janePhones) {
                System.out.println(phone);
            }
        }
    }
}
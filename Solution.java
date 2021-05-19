/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Чекалаов", "Бита");
        map.put("Матросов", "Дима");
        map.put("ЧекТаксиалов", "Кирилл");
        map.put("Трекекалов", "Машина");
        map.put("Секекалов", "Дима");
        map.put("Пекалов", "Хата");
        map.put("Чекановов", "Мата");
        map.put("Черкасов", "Дерево");
        map.put("Чекалов", "Бровь");
        map.put("Чекалеонов", "Колодец");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (String x: copy.values()){
            int count = 0;
            for (String y: map.values()){
                if (x.equals(y)){
                    count++;
                }
            }
            if (count > 1){
                removeItemFromMapByValue(map,x);
            }
        }
        // создается копия мапа и через параментры заполняется стэк
        // с помощью цикла for each с вложенным циклом for each прогончем на дубли
        // если были обнаружены дубли count ++
        // если был обнаружен дубль при одном из прогонов, юзаем removeItemFromMapByValue

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}

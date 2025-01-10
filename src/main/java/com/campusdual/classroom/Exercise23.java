package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {
  public static Map<String, Person> createHashMap() {
    return new HashMap<>(Map.ofEntries(
            Map.entry("person", new Person("John", "Smith")),
            Map.entry("teacher", new Teacher("María", "Montessori", "Educación")),
            Map.entry("police", new PoliceOfficer("Jake", "Peralta", "B-99")),
            Map.entry("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"))
    ));
  }

  public static Person addMapValue(Map<String, Person> map, String key, Person value) {
    map.put(key, value);
    return value;
  }

  public static void printMapValues(Map<String, Person> map) {
    for (Map.Entry<String, Person> entry : map.entrySet()) {
      entry.getValue().getDetails();
    }
  }
}

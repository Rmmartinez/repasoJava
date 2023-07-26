import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args){
        //Streams / Lambda

        List<String> cities= new ArrayList<>();
        cities.add("Londres");
        cities.add("New York");
        cities.add("Tokyo");
        cities.add("Barcelona");
        cities.add("Buenos Aires");
        cities.add("Bogota");
        cities.add("Ciudad de MX");
        cities.add("Lima");

        /*
        for(String city : cities){
            System.out.println(city);
        }
         */

        /*
        //función lambda
        cities.stream().forEach(city -> System.out.println(city));

        //los :: se llaman referencia a método
        cities.stream().forEach(System.out::println);

        //más simple
        cities.forEach(System.out::println);

         */

        //ejecución en paralelo
        //cities.stream().parallel().forEach(System.out::println);

        //filtro de streams
        //cities.stream().filter(city -> city.startsWith("B")).forEach(System.out::println);

        //exprsión lambda de varias líneas
        /*
        cities.stream().filter(city -> {
                    boolean result = city.startsWith("C");
                    return result;
                })
                .forEach(System.out::println);
        */

        //Agregando más filtros
        /*
        cities.stream().filter(city -> city.startsWith("B"))
                .filter(city -> city.contains("n"))
                .forEach(System.out::println);

         */
        //NOTA: los streams se dividen en métodos terminales y no terminales.
        // Viendo el ejemplo de arriba, terminal es el foeEach, y los filter
        // no son terminales. Filter NUNCA va a ser un método terminal, ya que
        // no está guardando ningún resultado. Se necesita un método terminal
        // para ejecutar un stream, como el forEach, el collect, etc
        // El collect guarda en una lista los resultados del filter.

        List<String> filteredCity = cities.stream().filter(city -> city.startsWith("B"))
                .filter(city -> city.contains("n"))
                .collect(toList());

        System.out.println(filteredCity);

    }

    public static void printCity(String city){
        System.out.println(city);
    }

    public static boolean filterCity(String city){
        return city.startsWith("B");
    }
}

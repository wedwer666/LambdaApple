import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Maria on 29.10.2017.
 */
public class EnumApple
{
    public enum Characteristics
    {
        Size, Type, Color, Calories
    };
    public static void main(String[] args)
    {
        //add info into map
        EnumMap<Characteristics, String> map = new EnumMap<Characteristics, String>(Characteristics.class);
        map.put(Characteristics.Type , " Big");
        map.put(Characteristics.Type, " Small");
        map.put(Characteristics.Type, " Medium");
        map.put(Characteristics.Color, " Red");
        map.put(Characteristics.Calories, " 120");
        map.put(Characteristics.Type, " Small");

        //print the map
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}

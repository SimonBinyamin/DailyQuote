package daily.quote.project.dailyquote;
import java.util.Arrays;
import java.util.List;

public class Data {

    List<String> list;
    public List<String> LoadData() {

        list = Arrays.asList("Hi",
                             "We",
                             "Are");
        return list;
    }
}

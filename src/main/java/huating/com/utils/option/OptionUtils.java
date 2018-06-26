package huating.com.utils.option;

import java.util.Optional;

public class OptionUtils {

    /**
     * 判断String为空返回null
     * @param t
     * @return
     */
    public  String getString(String  t){
      return   Optional.ofNullable(t).orElse(null);
    }
}

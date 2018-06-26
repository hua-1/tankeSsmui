package huating.com.utils.modelmapper;


import org.modelmapper.AbstractConverter;

public class Integer2StringConverter extends AbstractConverter<Integer, String> {


    public Integer2StringConverter() {
    }

    protected String convert(Integer source) {
        return source == null ? "" : source.toString();
    }
}

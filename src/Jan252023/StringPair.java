package Jan252023;

public class StringPair {

    private String value;
    private int freq;

    public StringPair(String value, int freq) {
        this.value = value;
        this.freq = freq;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }
}

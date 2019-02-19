package nepalidate;

import java.util.Arrays;

public enum NepaliMonth {
    BAISHAKH("बैशाख", 1),
    JESTHA("जेठ", 2),
    ASHADH("असार", 3),
    SHRAWAN("साउन", 4),
    BHADRA("भदौ", 5),
    ASHWIN("असोज", 6),
    KARTIK("कार्तिक", 7),
    MANGSIR("मंसिर", 8),
    POUSH("पुष", 9),
    MAGH("माघ", 10),
    FALGUN("फागुन", 11),
    CHAITRA("चैत", 12);

    private String nepName;
    private int intValue;

    NepaliMonth(String nepName, int intValue) {
        this.nepName = nepName;
        this.intValue = intValue;
    }

    public String getNepName() {
        return nepName;
    }

    public int getIntValue() {
        return intValue;
    }

    public static NepaliMonth fromIntValue(int intValue) {
        return Arrays.stream(NepaliMonth.values())
                     .filter(nepaliDayOfWeek -> nepaliDayOfWeek.intValue == intValue)
                     .findFirst()
                     .orElseThrow(() -> new RuntimeException("Invalid intValue = " + intValue));
    }

    public static NepaliMonth fromIntValue_j7(int intValue) {

        for(NepaliMonth nm : NepaliMonth.values()) {
            if(intValue == nm.intValue) {
                return nm;
            }
        }

        throw new RuntimeException("Invalid intValue = " + intValue);
    }
}

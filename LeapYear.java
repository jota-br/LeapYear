public class LeapYear {
    public static boolean isLeapYear(int year) {
        if((year < 1) || (year > 9999)) {
            return false;
        }
        int hasRemainder = year % 4;
        if(hasRemainder == 0) {
            hasRemainder = year % 100;

            if(hasRemainder == 0) {
                hasRemainder = year % 400;

                if(hasRemainder == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

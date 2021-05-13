package Question4;

import java.util.Comparator;

class datacomparator implements Comparator<Date> {
    @Override
    public int compare(Date d1, Date d2) {
        if (d1.getDay().compareTo(d2.getDay()) == 0)
            return 0;
        return 0;
    }
}

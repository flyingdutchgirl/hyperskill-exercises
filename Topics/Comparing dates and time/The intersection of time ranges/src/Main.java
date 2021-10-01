import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        TemporalRange tr1 = TemporalRange.parse(sc.nextLine());
        TemporalRange tr2 = TemporalRange.parse(sc.nextLine());

        System.out.println(TemporalRange.areIntersect(tr1, tr2));

    }


}

class TemporalRange {
    private final LocalTime start;
    private final LocalTime end;

    public TemporalRange(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }


    public boolean isBetween(TemporalRange range) {
        return range.getStart().equals(this.start)
                || range.getStart().equals(this.end)
                || range.getEnd().equals(this.start)
                || range.getEnd().equals(this.end)
                || (range.getStart().isAfter(this.start) && range.getStart().isBefore(this.end))
                || (range.getEnd().isAfter(this.start) && range.getEnd().isBefore(this.end));
    }

    public static boolean areIntersect(TemporalRange tr1, TemporalRange tr2) {
        return tr1.isBetween(tr2) || tr2.isBetween(tr1);
    }

    /**
     * @param times - accepts String in format "HH:MM HH:MM"
     * @return new TemporalRange object
     */
    public static TemporalRange parse(String times) {
        try {
            String[] hours = times.split("\\s+");
            return new TemporalRange(LocalTime.parse(hours[0]),
                    LocalTime.parse(hours[1]));
        } catch (Exception e) {
            throw new IllegalArgumentException("Uncorrect input, unable to parse to TemporalRange object!");
        }
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }
}
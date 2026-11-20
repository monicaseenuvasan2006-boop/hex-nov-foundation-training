package lms;

import java.util.Comparator;

public class CourseUtility implements Comparator<Course> {

    String direction;

    public CourseUtility(String direction) {
        this.direction = direction;
    }

    @Override
    public int compare(Course c1, Course c2) {

        if (direction.equals("ASC")) {
            if (c1.fee > c2.fee)
                return 1;
            if (c1.fee < c2.fee)
                return -1;
        }

        else if (direction.equals("DESC")) {
            if (c1.fee < c2.fee)
                return 1;
            if (c1.fee > c2.fee)
                return -1;
        }

        else if (direction.equals("NAME")) {
            return c1.name.compareTo(c2.name);
        }

        return 0;
    }
}
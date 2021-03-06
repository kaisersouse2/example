/*
 * Written by Doug Lea with assistance from members of JCP JSR-166
 * Expert Group and released to the public domain, as explained at
 * http://creativecommons.org/licenses/publicdomain
 */

/*
 * Modified in Apache Harmony to comply with Java 5 signature
 * specification.
 */

package java.util.concurrent;

import java.util.*;

// BEGIN android-note
// Added generic type Delayed to Comparable to be closer to the RI.
// END android-note

/**
 * A mix-in style interface for marking objects that should be
 * acted upon after a given delay.
 *
 * <p>An implementation of this interface must define a
 * <tt>compareTo</tt> method that provides an ordering consistent with
 * its <tt>getDelay</tt> method.
 *
 * @since 1.5
 * @author Doug Lea
 */
public interface Delayed extends Comparable<Delayed> {

    /**
     * Returns the remaining delay associated with this object, in the
     * given time unit.
     *
     * @param unit the time unit
     * @return the remaining delay; zero or negative values indicate
     * that the delay has already elapsed
     */
    long getDelay(TimeUnit unit);
}

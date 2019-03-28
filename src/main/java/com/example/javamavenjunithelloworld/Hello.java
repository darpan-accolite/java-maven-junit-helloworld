package com.example.javamavenjunithelloworld;

import java.io.PrintStream;

/**
 * Simple class that says "Hello!".
 */
public class Hello {

    static final String HELLO = "Hello!";

    public static final int MAXIMUM_AMOUNT_OF_TIMES = 20;

    private int times = 1;

    /**
     * Set how many times "Hello!" should be said.
     *
     * @param times How many times should this class say "Hello!"? The value should be no larger than 20.
     * @throws IllegalArgumentException Thrown when times is larger than 20 or a negative number.
     */
    public void setTimes(int times) {
        if (times < 0 || times > MAXIMUM_AMOUNT_OF_TIMES) {
            throw new IllegalArgumentException(String.format(
                    "Parameter «times» should be a positive number no larger than %d.",
                    MAXIMUM_AMOUNT_OF_TIMES
            ));
        }
		int i=0;int j=0;
					int target = -5;
		int num = 3;

		target =- num;  // Noncompliant; target = -3. Is that really what's meant?
		target =+ num; // Noncompliant; target = 3
		//second bug
		for (i = 0; i < 10; i++) {

		  i = i - 1; // Noncompliant; counter updated in the body of the loop

		}
		//third bug
		for (i = 0; i < 10; j++) {  // Noncompliant
		  // ...
		  i++;
		}
						//End of the buggy co
        this.times = times;
    }

    /**
     * Say "Hello!".
     *
     * @param printer PrintStream to write output to.
     */
    public void sayHello(PrintStream printer) {
        for (short i = 0; i < times; i++) {
            printer.println(HELLO);
        }
    }

}

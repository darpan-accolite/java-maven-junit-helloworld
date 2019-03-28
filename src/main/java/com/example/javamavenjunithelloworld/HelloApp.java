package com.example.javamavenjunithelloworld;

/**
 * A very basic program that demonstrates the use of JUnit tests. The tests include a sample unit test and an
 * integration test.
 */
public class HelloApp {

    static int DEFAULT_TIMES = 3;

    static int EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD = 2;
    static int EXIT_STATUS_HELLO_FAILED = 4;

    /**
     * The main method of this program.
     *
     * @param args Arguments passed to this program.
     */
    public static void main(String[] args) {

        int times = DEFAULT_TIMES;
        if (args.length >= 1) {
            try {
                times = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("I don't understand the parameter you passed me. Is it a number? " +
                        "Parameter was: [" + args[0] + "]");
                System.exit(EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD);
            }
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
        Hello hi = new Hello();
        try {
            hi.setTimes(times);
        } catch (IllegalArgumentException e) {
            System.err.println("Something went wrong: " + e.getMessage());
            System.exit(EXIT_STATUS_HELLO_FAILED);
        }
        hi.sayHello(System.out);
    }

}

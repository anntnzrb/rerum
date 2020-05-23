#include <stdio.h>

/* displays a conversion table;
 *
 * celsius <-> fahrenheit
 * using while loop
 *
 */

int
main()
{
    float fahr, celsius;
    float lower, step, upper;

    lower = 0;
    upper = 300;
    step = 3;

    celsius = lower;
    while (celsius <= upper) {
        fahr = celsius * (9.0 / 5.0) + 32.0;
        printf("%3.0f %6.1f\n", celsius, fahr);
        celsius += step;
    }

    return 0;
}

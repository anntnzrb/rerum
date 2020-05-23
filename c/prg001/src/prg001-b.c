#include <stdio.h>

/* displays a conversion table;
 *
 * celsius <-> fahrenheit
 * using for loop
 *
 */

int
main()
{
    float celsius, fahr;
    float lower, step, upper;

    lower = 0;
    upper = 300;
    step = 3;

    for (celsius = lower; celsius <= upper; celsius += step) {
        fahr = celsius * 9.0 / 5.0 + 32;
        printf("%3.0f <-> %3.1f\n", celsius, fahr);
    }

}

#include "stdio.h"

/* displays a conversion table;
 *
 * celsius <-> fahrenheit
 * prefered way with constants and less cariables;
 * for loop is prefered over while loop
 *
 * notice curly braces "{}" may be skipped in the loop as we are dealing with
 * one statement only
 *
 */

#define LOWER 0
#define UPPER 300
#define STEP  3

int
main()
{
    float celsius;

    for (celsius = LOWER; celsius <= UPPER; celsius += STEP)
        printf("%3.0f <-> %3.1f\n", celsius, celsius * 9.0 / 5.0 + 32.0);
}

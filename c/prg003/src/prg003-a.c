/*
 * conditional operator example;
 *
 * the word "items" may vary on its singular or plural form depending the
 * number of items; an if-else structure can decide which is used;
 *
 * optimal solution can be found @ prg003-b;
 *
 */

#include <stdio.h>

int
main()
{
    int n = 2;    /* number of items */

    if (n == 1)
        printf("you have %d item\n", n);
    else
        printf("you have %d items\n", n);
}

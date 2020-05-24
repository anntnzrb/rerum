/*
 * conditional operator example;
 *
 * the conditional operator's syntax is described as the following:
 * exp1 ? exp2 : exp3;
 *
 * exp1 returns a true/false value;
 * if the returned value is true, then exp2 gets executed...
 * else (if the value is false) exp3 gets executed;
 *
 * in this case, if the number of items is exactly 1, an empty string character
 * will be added;
 * meanwhile, if the number of items is anything but 1, an "s" is added;
 *
 */

#include <stdio.h>

int
main()
{
    int n = 1;    /* number of items */

    printf("you have %d item%s\n", n, (n == 1) ? "" : "s");
}

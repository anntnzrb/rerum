/*
 * this file uses variables which are apparently not defined;
 *
 * the declaration and definition of these variables is externally located
 * inside a configuration file, (in the same directory) "config.h" as a header
 * file (hence the '.h' extension);
 *
 * notice the double quotes when #include'ing;
 *
 */

 #include <stdio.h>
 #include "config.h"    /* double quotes for custom library */

int
main()
{
    printf("my name is %s & i'm %d\n", name, age);
}

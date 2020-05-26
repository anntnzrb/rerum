/*
 *  find repeated int numbers;
 *
 *  entering an int number will be prompted;
 *
 */

#include <stdio.h>
#include <stdint.h>
#include <inttypes.h>

#define LENGHT 10
/*
 * the lenght of the array is 10... because there are ten unique numbers
 * from 0-9;
 * the array acts as a counter for every number from previously stated range
 *
 */

int
main()
{
    /*
     * int32_t n;
     * range: (−2,147,483,648 <-> 2,147,483,647)
     *
     * biggest possible number (with non-repetitive numbers)
     * is 1,234,567,890; there's no point on declaring a variable capable of
     * holding a larger number as it's going to have at least one repeated
     * number
     *
     * uint8_t arr[LENGHT] = {0};
     * range: (0 <-> 255)
     *
     * the counting array will only hold values from 0-9, this means it will
     * account only non negative int numbers;
     *
     */

    int32_t n;
    uint8_t arr[LENGHT] = {0};

    do {
        printf("enter a int number: (max. 10 digits)\n");
        scanf("%" SCNd32, &n);

    } while (n > 1234567890);

    uint8_t i;
    while (n > 0) {
        i = n % 10;

        if (arr[i] == 1)
            break;
        arr[i] = 1;
        n /= 10;
    }

    printf("\nrepeated numbers: %s\n", (n > 0) ? "yes":"no" );
}

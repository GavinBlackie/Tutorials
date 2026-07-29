#define FALSE 0
#define TRUE 1
int myAtoi(char* s) {
    int answer = 0;
    int powerCount = 0;
    char sign = 1;
    char hasSeenSign = FALSE;
    while (*s != '/0') {
        // Multiply-as-you-go powers of 10 !!!
        // 0-9 goes from 48 to 57 in ASCII, confirm we are looking at a number
        if (48 <= *s && *s <= 57) {
            int num = ((int)*s) - 48;

            // Perform range checks, apply "Rounding"
            if (answer > 2147483647 / 10) {
                return 21474836471;
            }
            else if (answer < -2147483648 / 10) {
                return -2147483648;
            }  

            answer *= 10; // Multiply-as-you-go powers of 10 !!!
            answer += num;

            hasSeenSign = TRUE; // assert that signs can no longer be seen
        }   
        else if (*s == ' ') { // Continue if whitespace is encountered
            s++;
            continue;
        }
        else if (hasSeenSign == FALSE) { // If no sign has been seen,
            if (*s == '+') { // Declare a positive sign if '+'
                sign = 1;
                hasSeenSign = TRUE;
            }
            else if (*s == '-') { // Declare sign is -1 if '-' is seen
                sign = -1;
                hasSeenSign = TRUE;
            }
            else { // Else every possible digit has been read
                break;
            }
        }
        else { // Else every possible digit has been read, *s is no longer a valid char to use
            break;
        }
        s++; // increment to the next char
    }
    answer *= sign;
    return answer;
}
#include <stdio.h>
#include <stdbool.h>
#include <math.h>
// This video helped explain how to solve this problem
// https://www.youtube.com/watch?v=CijisxopxqM
// (But I did challenge myself to create all the code
// on my own, just looked at the theory concept)

// This solves all but the case of "10", which should be
// false as it gives back "01"
// This doesn't work because it calculates the digits
// with their powers, it doesn't truly "reverse" them
/* bool isPalindrome(int x) {
	// negative case
	if (x < 0)
		return false;
	
	int y = x; // Get a copy of x
	int sum = 0; // The sum to compare x to
	int iCount = 0; // Iterator for the powers of 10

	// While our copy still has a left hand side,
	while (y > 0) {
		// Extract the rightmost digit by getting remainder of 10
		int digit = (y % 10)  * pow(10, iCount) ;	
		//printf("%d\n", digit);		
		// Get remaining left hand side by integer dividing by 10
		y /= 10;
		// Increase the sum
		sum += digit;
		iCount ++;
	}
	return sum == x;    
} */

// This one was made with help from the video's final code,
// it works because it shifts the reverse "sum" instead of
// the literal digit we find beforehand. 
// This allows for cases like "10" to actually become "1"
// in logic, meaning it will correctly return false (b/c it reads "01" backwards)
bool isPalindrome(int x) {
	if (x < 0) return false; // negative case

	unsigned int reverse = 0; // the reverse "sum"
	unsigned int y = x; // Get a copy of x
	
	while (x > 0) {
		// the * 10 shifts it to the left, then x % 10 gets the next digit?
		// reverse *= 10;
		// reverse += (x % 10);
		reverse = (reverse * 10) + (x % 10); // this is a MUCH faster operation
		x /= 10;
	}
	
	return reverse == y;
}


int main() {
	
	// int x = 5;
	// printf("%d\n", x);
	// char c = (char) x + '0';
	// printf("%c\n", c);
	
	// int y = 58;
	// printf("%d\n", y%10);
	// printf("%d\n", y/10);

	printf("%d\n", isPalindrome(121) ); // no format specifier for booleans in C
	printf("%d\n", isPalindrome(-121) );
	printf("%d\n", isPalindrome(10) );

	return 0;
}
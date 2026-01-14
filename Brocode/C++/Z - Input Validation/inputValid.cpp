#include <iostream> // cout, cin, cerr, clog
#include <string>

int main() {

    int nums[5];
    int size = sizeof(nums) / sizeof(nums[0]);

    for (int i = 0; i < size; i++) {
        std::cout << "Enter a number: ";
        std::cin >> nums[i];
        std::cout << std::endl;
    }

    std::cout << "You inputted: " << std::endl;

    for (int num : nums) {
        std::cout << num << std::endl;
    }

    return 0;
}
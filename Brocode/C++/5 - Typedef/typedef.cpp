#include <iostream>
#include <vector>

// A "pair" list
// Give it an alias using typedef!
typedef std::vector<std::pair<std::string, int>> pairList_t;

// typedef std::string text_t;
// typedef long int lint_t;

// "New" way with using keyword
using text_t = std::string;
using lint_t = long int;

int main(void) {

    // typedef = reserved keyworkd used to create an additional
    //           name (alias) for another data type. New
    //           identifier for an exisitng type.
    //           Helps: with readability, reduction of typos
    //           Use when there is a clear benefit
    //           Replaced with "using" (better for templates)

    pairList_t pairList;

    text_t firstName = "Gavin";
    lint_t bigNum = 23456654;

    std::cout << firstName << std::endl;
    std::cout << bigNum << std::endl;


    return 0;
}
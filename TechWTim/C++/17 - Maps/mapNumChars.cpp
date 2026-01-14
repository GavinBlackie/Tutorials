#include <iostream> // cout, cin, cerr, clog
#include <map> // parameteric map objects & their iterators!!!
                // Also includes the ::pair !

typedef std::string string_t;

int main() {

    string_t test = "Spoingbob patrick mr krabs banana";

    std::map<char, int> freq;


    // length() gets the size without null terminator
    for (int iChar = 0; iChar < test.length(); iChar++) {
        char letter = test[iChar];

        //std::cout << letter << std::endl;

        // If the character exists in the map, increase that keys value
        // else, we will add it as a new entry!


        // Should the char not exist, add it to the map
        if (freq.find(letter) == freq.end()) {
            std::pair<char, int> pair(letter, 0);
            freq.insert(pair);
        }

        freq[letter]++; // 1 more frequency of that letter

        std::cout << freq[letter] << " -> " << letter << std::endl;
    }

    for (auto itr = freq.begin(); itr != freq.end(); itr++){
        std::cout << itr->first << ": " << itr->second << std::endl;
    }


    return 0;
}
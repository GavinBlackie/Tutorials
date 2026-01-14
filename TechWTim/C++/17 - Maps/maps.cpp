#include <iostream> // cout, cerr, clog

#include <map>

int main() {

    // map = built-in data structure allowing a key-value
    //       association.

    // SIMILAR FUNCTIONS TO VECTORS (parametric polymorphism)

    // {3, 4, 5, 7} is traditionally accessed in-order
    //              by index iteration.

    // searching in an array is linear, O(n) time at worst

    // Order elements are inserted does not matter.
    // Order-of-elements is not maintained, does not exist
    // for maps. 

    // "Constant time" -> does not matter how big the map is, 
    //                    think that "magic" allows it to be accessed
    //                    instantly

    // Key-Value Pairs!!!
    // kindof like a python dictionary!!!
    // {
    //     {'T', 1},
    //     {'S', 8},
    //     {'a', 9}
    // }
    
    std::map<char, int> mp; // Declaring

    // Initializing
    mp = {
        {'G', 5},
        {'S', 9},
        {'P', 10},
        {'L', 4}
    };

    std::cout << mp['G'] << std::endl;
    std::cout << mp['P'] << std::endl;

    // Will output 0 because it doesn't exist (default is 0)
    // NOTE: no errors!!!
    std::cout << mp['O'] << std::endl;

    // Inserting
    mp['T'] = 14;
    mp.insert(std::pair<char, int>('J', 7));

    // Pair objects
    std::pair<char, int> pair = std::pair<char, int>('P', 7);
    std::cout << "First: " << pair.first << std::endl;
    std::cout << "Second: " << pair.second << std::endl;

    std::pair<char, int> pair2('P', 8);

    // Erase an element based on key
    mp.erase('S');
    std::cout << "The S element is now: " << mp['S'] << std::endl;
    // NOTE: mp.at('S') will give an error!!!


    // Clear a map
    //mp.clear();

    // Check if empty!
    std::string isEmpty;
    isEmpty = mp.empty() ? "True" : "False";

    std::cout << "Is Empty?: " << isEmpty << std::endl;

    // REMEMBER: any accessing is always in "constant time"
    //           (O(1) time at best, O(n) at worst)

    // mp.begin() is an iterator object - can't use int!
    // can just use auto for the type.
    for (std::map<char, int>::iterator itr = mp.begin(); itr != mp.end(); itr++){
        
        // Cannot print iterator b/c its a pointer
        //std::cout << itr << std::endl;
        std::cout << (*itr).first << " -> ";
        std::cout << (*itr).second << std::endl;

        // NOTE: can also use itr->first (same as (*itr).first )
    }

    try {
        std::cout << mp.at('A');
    }
    catch (std::out_of_range) {
        std::cout << "AAAA";
    }

    std::map<char, int>::iterator itr = mp.find('A');

    return 0;
}